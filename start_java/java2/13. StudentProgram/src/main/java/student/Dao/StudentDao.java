package student.Dao;

import student.Dto.StudentDto;

import java.util.Scanner;

/* Data Access Object : 데이터를 취급하는 클래스 */
public class StudentDao {
    Scanner sc = new Scanner(System.in);

    // 학생 데이터 관리 배열
    private StudentDto student[];

    private int count;

    /* 생성자는 호출할 때 딱 한번만 들어옴.*/
    public StudentDao() {

        count = 0;

        // 변수만 10개 생성 (객체생성아님)
        student = new StudentDto[10];

        //dto를 생성 미리 생성해놓으면 불편함. 그러니까 메서드에서 생성해서 추가하는게 좋다.
//        for (int i = 0; i < student.length; i++) {
//            student[i] = new StudentDto();
//        }
    }

    // 추가, 삭제, 검색, 수정 ( CRUD -> create, read, update, delete )
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

        student[count] = new StudentDto(name,age,height,address,kor,eng,math);
        //배열의 다음으로 이동
        count++;
    }
    public void delete(){
        System.out.print("삭제할 학생 이름을 입력하세요 >> ");
        String name = sc.next();
        try {
            for (int i = 0; i < student.length; i++) {
                String findName = student[i].getName();

//                System.out.println("findName : "+findName);
//                System.out.println("name : "+name);

                if (name.equals(findName)){
                    for(int j = i; j < student.length - 1; j++){
                        student[j] = student[j + 1];
                    }
                    System.out.println("정상적으로 삭제됐습니다.");
                    count--;
                    break;
                }
            }
        } catch (NullPointerException e){
            System.out.println("학생명단에 없습니다.");
        }
    }
    public void select(){
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 학생 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();
        try {
            for (int i = 0; i < student.length; i++) {
                String findName = student[i].getName();

                if (name.equals(findName)){
                    System.out.println("데이터를 찾았습니다");
                    System.out.println("이름은 : " + student[i].getName() +"입니다" );
                    System.out.println("나이는 : " + student[i].getAge() +"입니다" );
                    System.out.println("신장은 : " + student[i].getHeight() +"입니다" );
                    System.out.println("주소는 : " + student[i].getAddress() +"입니다" );
                    System.out.println("국어점수는 : " + student[i].getKor() +"입니다" );
                    System.out.println("영어점수는 : " + student[i].getEng() +"입니다" );
                    System.out.println("수학점수는 : " + student[i].getMath() +"입니다" );

                    break;
                }
            }
        } catch (NullPointerException e){
            System.out.println("학생명단에 없습니다.");
        }
    }
    public void update(){
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 학생 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();
        try {
            for (int i = 0; i < student.length; i++) {
                String findName = student[i].getName();

                if (name.equals(findName)){
                    System.out.println("데이터를 찾았습니다");
                    System.out.println("이름은 : " + student[i].getName() +"입니다" );

                    System.out.println("국어점수는 : " + student[i].getKor() +"입니다" );
                    System.out.print("수정할 국어 점수를 입력하세요 >> ");
                    int updateKor = sc.nextInt();
                    student[i].setKor(updateKor);

                    System.out.println("영어점수는 : " + student[i].getEng() +"입니다" );
                    System.out.print("수정할 영어 점수를 입력하세요 >> ");
                    int updateEng = sc.nextInt();
                    student[i].setEng(updateEng);

                    System.out.println("수학점수는 : " + student[i].getMath() + "입니다");
                    System.out.print("수정할 수학 점수를 입력하세요 >> ");
                    int updateMath = sc.nextInt();
                    student[i].setMath(updateMath);

                    System.out.println("수정이 끝났습니다.");
                    break;
                }
            }
        } catch (NullPointerException e){
            System.out.println("학생명단에 없습니다.");
        }
    }

    public void allData(){
        for (int i = 0; i < student.length; i++) {
            StudentDto dto = student[i];
            if (dto != null){
                System.out.println(dto.toString());
            }
        }
    }
}
