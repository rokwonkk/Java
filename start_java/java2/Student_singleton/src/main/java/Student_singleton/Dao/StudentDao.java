package Student_singleton.Dao;

import Student_singleton.Dto.StudentDto;
import Student_singleton.Singleton.Singleton;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Data Access Object : 데이터를 취급하는 클래스 */
public class StudentDao {

    Scanner sc = new Scanner(System.in);

    public StudentDao() {

    }
    public void insert(){
        System.out.println("학생 정보 입력입니다");

        System.out.print("이름 >> ");
        String name = sc.next();

        System.out.print("나이 >> ");
        int age = sc.nextInt();

        System.out.print("신장 >> ");
        double height = sc.nextDouble();

        System.out.print("주소 >> ");
        String address = sc.next();

        System.out.print("국어 >> ");
        int kor = sc.nextInt();

        System.out.print("영어 >> ");
        int eng = sc.nextInt();

        System.out.print("수학 >> ");
        int math = sc.nextInt();

        StudentDto dto = new StudentDto(name, age, height, address, kor, eng, math);

        Singleton sl = Singleton.getInstance();
        sl.list.add(dto);
    }
    public void delete(){
        System.out.print("삭제할 학생 이름을 입력하세요 >> ");
        String name = sc.next();

        Singleton sl = Singleton.getInstance();

        int findindex = -1;
        for (int i = 0; i < sl.list.size(); i++) {

            StudentDto h = sl.list.get(i);
            if (h.getName().equals(name)){
                findindex = i;
                break;
            }
        }
        if (findindex != -1){
            sl.list.remove(findindex);
        }
    }
    public void select(){
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 학생 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();

        Singleton sl = Singleton.getInstance();

        List<StudentDto> findList = new ArrayList<StudentDto>();
        for (int i = 0; i < sl.list.size(); i++) {
            StudentDto findStudent = sl.list.get(i);

            if (findStudent.getName().equals(name)){
                findList.add(findStudent);
            }
        }

        if(findList.isEmpty()){
            System.out.println("학생정보를 찾을 수 없습니다.");
            return;
        }

        System.out.println("검색하신 정보는 다음과 같습니다.");
        for (StudentDto dto : findList) {
            System.out.println(dto.toString());
        }
    }
    public void update(){
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 학생 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();

        Singleton sl = Singleton.getInstance();

        int findindex = -1;
        for (int i = 0; i < sl.list.size(); i++) {
            StudentDto findStudent = sl.list.get(i);
            if (findStudent.getName().equals(name)){
                findindex = i;
                break;
            }
        }

        if (findindex != -1){
            StudentDto updateStudent = sl.list.get(findindex);

            System.out.println("국어점수는 : " + updateStudent.getKor() +"입니다" );
            System.out.print("수정할 국어 점수를 입력하세요 >> ");
            int updateKor = sc.nextInt();
            updateStudent.setKor(updateKor);

            System.out.println("영어점수는 : " + updateStudent.getEng() +"입니다" );
            System.out.print("수정할 영어 점수를 입력하세요 >> ");
            int updateEng = sc.nextInt();
            updateStudent.setEng(updateEng);

            System.out.println("수학점수는 : " + updateStudent.getMath() + "입니다");
            System.out.print("수정할 수학 점수를 입력하세요 >> ");
            int updateMath = sc.nextInt();
            updateStudent.setMath(updateMath);

            System.out.println("수정이 끝났습니다.");
        }

        for (StudentDto s : sl.list) {
            System.out.println(s.toString());
        }
    }

    public void allData(){
        Singleton sl = Singleton.getInstance();

        for (int i = 0; i < sl.list.size(); i++) {

            StudentDto s = sl.list.get(i);
            System.out.println(s.toString());

        }
    }
}
