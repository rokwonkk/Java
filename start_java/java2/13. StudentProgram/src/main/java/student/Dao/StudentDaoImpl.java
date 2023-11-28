package student.Dao;

import student.Dto.StudentDto;
import student.file.FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Data Access Object : 데이터를 취급하는 클래스 */
public class StudentDaoImpl implements StudentDao {
    Scanner sc = new Scanner(System.in);

    // 학생 데이터 관리 배열
    //private StudentDto student[];

    //학생관리 목록
    private List<StudentDto> student;

    private int count;

    private FileIO fio;

    /* 생성자는 호출할 때 딱 한번만 들어옴.*/
    public StudentDaoImpl() {

        fio = new FileIO("student");
        fio.create();

        count = 0;

        student = new ArrayList<StudentDto>();

        // 변수만 10개 생성 (객체생성아님)
        //student = new StudentDto[10];

        //dto를 생성 미리 생성해놓으면 불편함. 그러니까 메서드에서 생성해서 추가하는게 좋다.
//        for (int i = 0; i < student.length; i++) {
//            student[i] = new StudentDto();
//        }
    }

    // 추가, 삭제, 검색, 수정 ( CRUD -> create, read, update, delete )

    @Override
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

        student.add(new StudentDto(name,age,height,address,kor,eng,math));
    }
    public void delete(){
        System.out.print("삭제할 학생 이름을 입력하세요 >> ");
        String name = sc.next();

        int findindex = -1;
        for (int i = 0; i < student.size(); i++) {

            StudentDto h = student.get(i);
            if (h.getName().equals(name)){
                findindex = i;
                break;
            }
        }
        if (findindex != -1){
            student.remove(findindex);
        }
    }
    public void select(){
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 학생 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();

        List<StudentDto> findList = new ArrayList<StudentDto>();
        for (int i = 0; i < student.size(); i++) {
            StudentDto findStudent = student.get(i);

            if (findStudent.getName().equals(name)){
                findList.add(findStudent);
            }
        }
        for (StudentDto s : findList) {
            System.out.println(s.toString());
        }
    }
    public void update(){
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 학생 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();

        int findindex = -1;
        for (int i = 0; i < student.size(); i++) {
            StudentDto findStudent = student.get(i);
            if (findStudent.getName().equals(name)){
                findindex = i;
                break;
            }
        }

        if (findindex != -1){
            StudentDto updateStudent = student.get(findindex);
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

        for (StudentDto s : student) {
            System.out.println(s.toString());
        }
    }
    public void save(){
        File f = new File("/Users/rokwon/fileforder/student.txt");

        String strLine[] = new String[student.size()];

        for (int i = 0; i < student.size(); i++) {
            StudentDto dto = student.get(i);

            if (dto != null){
                strLine[i] = dto.getName() + "-"
                        + dto.getAge() + "-"
                        + dto.getHeight() + "-"
                        + dto.getAddress() + "-"
                        + dto.getKor() + "-"
                        + dto.getEng() + "-"
                        + dto.getMath();
            } else {
                strLine[i] = "";
            }
        }
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            for (String s : strLine) {
                if(s != null && !s.equals("")) {
                    pw.println(s);
                }
            }
            pw.close();

        } catch (IOException e) {
            System.out.println("파일에 저장되지 않았습니다.");
            e.printStackTrace();
        }
        System.out.println("정상적으로 저장되었습니다.");
    }

    public void load() {

        student.clear();

        File f = new File("/Users/rokwon/fileforder/student.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            String str = "";
            while ((str = br.readLine()) != null){
                StudentDto loadData = new StudentDto();

                String data[] = str.split("-");

                loadData.setName(data[0]);
                loadData.setAge(Integer.parseInt(data[1]));
                loadData.setHeight(Double.parseDouble(data[2]));
                loadData.setAddress(data[3]);
                loadData.setKor(Integer.parseInt(data[4]));
                loadData.setEng(Integer.parseInt(data[5]));
                loadData.setMath(Integer.parseInt(data[6]));

                student.add(loadData);
            }
            br.close();

            System.out.println("모든 데이터를 불러왔습니다");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public void allData(){
        for (int i = 0; i < student.size(); i++) {
            StudentDto dto = student.get(i);
            System.out.println(dto.toString());
        }
    }

    public void save_teacher(){
        int ci = 0;
        for (int i = 0; i < student.size(); i++) {
            if(student.get(i) != null && student.get(i).getName().equals(" ")){
                ci++;
            }
        }

        //배열
        String arr[] = new String[ci];
        int j = 0;
        for (int i = 0; i < student.size(); i++) {
            if(student.get(i) != null && student.get(i).getName().equals(" ")){
                arr[j] = student.get(i).toString();
                j++;
            }
        }
        fio.dataSave(arr);
    }

    public void load_teacher(){
        String arr[] = fio.dataLoad();

        if(arr == null || arr.length == 0){
            count = 0;
            return;
        }


        count = arr.length;

        // string -> student[]
        for (int i = 0; i < arr.length; i++) {
            String split[] = arr[i].split("-");

            String name = split[0];
            int age = Integer.parseInt(split[1]);
            Double height = Double.parseDouble(split[2]);
            String address = split[3];
            int kor = Integer.parseInt(split[5]);
            int eng = Integer.parseInt(split[6]);
            int math = Integer.parseInt(split[7]);

            student.add(new StudentDto(name, age, height, address, kor, eng, math));
        }
        System.out.println("데이터로드 완료");
    }
}
