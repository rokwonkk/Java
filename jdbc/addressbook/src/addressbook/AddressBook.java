package addressbook;

import dao.AddressBookDao;
import dto.AddressBookDto;

import java.util.List;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);

    //input
    public void add(){
        System.out.println("주소록 등록입니다");

        System.out.print("이름 >> ");
        String name = sc.next();

        System.out.print("나이 >> ");
        int age = sc.nextInt();

        System.out.print("전화번호 >> ");
        String phone = sc.next();

        System.out.print("주소 >> ");
        String address = sc.next();

        System.out.print("메모 >> ");
        String memo = sc.next();

        AddressBookDao dao = AddressBookDao.getInstance();

        boolean b = dao.insert(new AddressBookDto(name, age, phone, address, memo));

        if(!b){
            System.out.println("주소록 등록이 실패했습니다.");
        } else {
            System.out.println("주소록 등록이 완료 되었습니다.");
        }
    }
    public void drop(){
        System.out.println("삭제시킬 주소록 이름을 입력하세요");

        System.out.print("이름 >> ");
        String name = sc.next();

        AddressBookDao dao = AddressBookDao.getInstance();

        boolean b = dao.delete(name);
        if(!b) {
            System.out.println("데이터가 없거나 삭제되지 않았습니다");
        }

        System.out.println("삭제되었습니다");
    }

    public void nameSearch(){
        System.out.println("검색할 사람의 이름을 입력하세요");

        System.out.print("입력 >> ");
        String nameKeyword = sc.next();

        List<AddressBookDto> list = AddressBookDao.getInstance().nameSearch(nameKeyword);

        if(list.isEmpty()){
            System.out.println("데이터를 찾을 수 없습니다.");
        }

        for (AddressBookDto dto : list) {
            System.out.println(dto.toString());
        }
    }

    public void addressSearch(){
        System.out.println("검색할 사람의 주소를 입력하세요");

        System.out.print("입력 >> ");
        String addressKeyword = sc.next();

        List<AddressBookDto> list = AddressBookDao.getInstance().addressSearch(addressKeyword);

        if(list.isEmpty()){
            System.out.println("데이터를 찾을 수 없습니다.");
        }

        for (AddressBookDto dto : list) {
            System.out.println(dto.toString());
        }
    }

    public void memoSearch(){
        System.out.println("검색할 주소록 메모를 입력하세요");

        System.out.print("입력 >> ");
        String memoKeyword = sc.next();

        List<AddressBookDto> list = AddressBookDao.getInstance().memoSearch(memoKeyword);

        if(list.isEmpty()){
            System.out.println("데이터를 찾을 수 없습니다.");
        }

        for (AddressBookDto dto : list) {
            System.out.println(dto.toString());
        }
    }

    public void upgrade(){
        System.out.println("수정할 대상의 이름을 입력하세요");
        System.out.print("입력 >> ");
        String name = sc.next();

        System.out.println("수정할 내용의 번호를 입력하세요.");
        System.out.println("1. 전화번호, 2. 주소, 3. 메모");
        System.out.print("입력 >> ");
        int sn = sc.nextInt();

        String updateKeyword = "";
        switch (sn){
            case 1 :
                System.out.println("수정할 전화번호를 입력하세요");
                System.out.print("입력 >> ");
                updateKeyword = sc.next();
                break;
            case 2 :
                System.out.println("수정할 주소를 입력하세요");
                System.out.print("입력 >> ");
                updateKeyword = sc.next();
                break;
            case 3 :
                System.out.println("수정할 메모를 입력하세요");
                System.out.print("입력 >> ");
                updateKeyword = sc.next();
                break;
        }
        boolean updateYn = AddressBookDao.getInstance().update(name, updateKeyword, sn);

        if(!updateYn){
            System.out.println("주소록 수정이 실패했습니다.");
        } else {
            System.out.println("주소록 수정이 완료 되었습니다.");
        }
    }
}