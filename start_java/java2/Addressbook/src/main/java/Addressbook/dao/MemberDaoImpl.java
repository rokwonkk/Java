package Addressbook.dao;

import Addressbook.dto.MemberDto;
import Addressbook.member.AddressMember;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberDaoImpl implements MemberDao{
     Scanner sc = new Scanner(System.in);
    @Override
    public void insert() {
        System.out.println("주소록 정보 입력입니다");

        System.out.print("이름 >> ");
        String name = sc.next();

        System.out.print("나이 >> ");
        int age = sc.nextInt();

        System.out.print("전화번호 >> ");
        String phone = sc.next();

        System.out.print("생년월일 >> ");
        String birth = sc.next();

        System.out.print("메모 >> ");
        sc.nextLine();
        String memo = sc.nextLine();

        MemberDto dto = new MemberDto(name, age, phone, birth, memo);
        AddressMember am = AddressMember.getInstance();

        am.list.add(dto);
    }

    @Override
    public void delete() {
        System.out.print("삭제할 사람의 이름을 입력하세요 >> ");
        String name = sc.next();

        AddressMember am = AddressMember.getInstance();

        int findindex = -1;
        List<MemberDto> findMembers = new ArrayList<>();
        for (int i = 0; i < am.list.size(); i++) {
            MemberDto dto = am.list.get(i);

            if (dto.getName().equals(name)){
                findMembers.add(dto);
                findindex = i;
            }
        }

        if(findMembers.isEmpty()){
            System.out.println("사람을 찾을 수 없습니다.");
            return;
        }

        System.out.println("일치하는 이름을 가진 사람:");
        for (int i = 0; i < findMembers.size(); i++) {
            System.out.println((i + 1) + ". " + findMembers.get(i));
        }

        System.out.print("삭제할 번호를 입력하세요 >> ");
        int selectMember = sc.nextInt();

        if (selectMember >= 1 && selectMember <= findMembers.size()) {
            am.list.remove(selectMember);
            System.out.println("선택한 사람이 삭제되었습니다.");
        } else {
            System.out.println("올바르지 않은 번호를 입력했습니다.");
        }
    }

    @Override
    public void select() {
        System.out.print("이름검색은(1), 생년월일검색은(2), 메모검색은(3)을 입력해주세요 >> ");
        int select = sc.nextInt();

        AddressMember am = AddressMember.getInstance();

        if (select == 1){
            System.out.println("이름 검색입니다.");
            System.out.print("검색할 사람의 이름을 입력하세요 >> ");
            String name = sc.next();
            System.out.println();

            int findindex = -1;
            List<MemberDto> findMembers = new ArrayList<>();
            for (int i = 0; i < am.list.size(); i++) {
                MemberDto dto = am.list.get(i);

                if (dto.getName().equals(name)){
                    findMembers.add(dto);
                    findindex = i;
                }
            }

            if(findMembers.isEmpty()){
                System.out.println("사람을 찾을 수 없습니다.");
                return;
            } else if (findMembers.size() == 1) {
                //System.out.println("여기 타니?");
                for (int i= 0; i < findMembers.size(); i++){
                   MemberDto findMember = findMembers.get(i);

                    System.out.print("이사람의 정보는 >> "
                            + "이름 : " + findMember.getName()
                            + " 나이 :"  + findMember.getAge()
                            + " 전화번호 : " + findMember.getPhone()
                            + " 생년월일 : " + findMember.getBirth()
                            + " 메모 : " + findMember.getMemo() + " 입니다. ");
                }
            }

            if (findMembers.size() > 1){
                System.out.println("일치하는 이름을 가진 사람들.");
                for (int i= 0; i < findMembers.size(); i++){
                    System.out.println((i+1) +". "+ findMembers.get(i).getName());
                }

                System.out.print("확인하시고싶은 동명이인의 번호를 입력해주세요 >> ");
                int selectMember = sc.nextInt();

                if (selectMember >= 1 && selectMember <= findMembers.size()) {
                    //System.out.println("너도 타는거지?");
                    MemberDto selectedMember = findMembers.get(selectMember - 1);

                    System.out.print("이사람의 정보는 >> "
                            + "이름 : " + selectedMember.getName()
                            + " 나이 :"  + selectedMember.getAge()
                            + " 전화번호 : " + selectedMember.getPhone()
                            + " 생년월일 : " + selectedMember.getBirth()
                            + " 메모 : " + selectedMember.getMemo() + " 입니다. ");

                } else {
                    System.out.println("올바르지 않은 번호를 입력했습니다.");
                }
            }
        } else if (select == 2){
            System.out.println("생년월일 검색입니다.");
            System.out.print("검색할 사람의 생년월일을 입력하세요 >> ");
            String birth = sc.next();
            System.out.println();

            List<MemberDto> findMembers = new ArrayList<>();
            for (int i = 0; i < am.list.size(); i++) {
                MemberDto dto = am.list.get(i);

                if (dto.getBirth().contains(birth)){
                    findMembers.add(dto);
                }
            }

            if(findMembers.isEmpty()){
                System.out.println("사람을 찾을 수 없습니다.");
                return;
            }

            System.out.println("검색하신 정보는 다음과 같습니다.");
            for (MemberDto dto : findMembers) {
                System.out.println(dto.inFo());
            }

        } else if (select == 3){

            System.out.println("메모 검색입니다.");
            System.out.print("검색할 메모를 입력하세요 >> ");
            String memo = sc.next();
            System.out.println();

            List<MemberDto> findMembers = new ArrayList<>();
            for (int i = 0; i < am.list.size(); i++) {
                MemberDto dto = am.list.get(i);

                if (dto.getMemo().contains(memo)){
                    findMembers.add(dto);
                }
            }

            if(findMembers.isEmpty()){
                System.out.println("사람을 찾을 수 없습니다.");
                return;
            }

            System.out.println("검색하신 정보는 다음과 같습니다.");
            for (MemberDto dto : findMembers) {
                System.out.println(dto.inFo());
            }
        }
    }
    @Override
    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 사람의 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();

        AddressMember am = AddressMember.getInstance();

        int findindex = -1;
        List<MemberDto> findMembers = new ArrayList<>();
        for (int i = 0; i < am.list.size(); i++) {
            MemberDto dto = am.list.get(i);
            if (dto.getName().equals(name)){
                findMembers.add(dto);
                findindex = i;
            }
        }

        if(findMembers.isEmpty()){
            System.out.println("사람을 찾을 수 없습니다.");
            return;
        }

        System.out.println("일치하는 이름을 가진 사람:");
        for (int i = 0; i < findMembers.size(); i++) {
            System.out.println((i + 1) + ". " + findMembers.get(i));
        }

        System.out.print("수정할 번호를 입력하세요 >> ");
        int selectMember = sc.nextInt();

        if (selectMember >= 1 && selectMember <= findMembers.size()) {
            MemberDto updateMember = am.list.get(selectMember);

            System.out.println("나이는 : " + updateMember.getAge() +"입니다" );
            System.out.print("수정할 나이를 입력하세요 >> ");
            int updateAge = sc.nextInt();
            updateMember.setAge(updateAge);

            System.out.println("전화번호는 : " + updateMember.getPhone() +"입니다" );
            System.out.print("수정할 전화번호를 입력하세요 >> ");
            String updatePhone = sc.next();
            updateMember.setPhone(updatePhone);

            System.out.println("현재 메모는 : " + updateMember.getMemo() + "입니다");
            System.out.print("수정할 메모를 입력하세요 >> ");
            sc.nextLine();
            String updateMemo = sc.nextLine();
            updateMember.setMemo(updateMemo);

            System.out.println("수정이 끝났습니다.");

        } else {
            System.out.println("올바르지 않은 번호를 입력했습니다.");
        }

        for (MemberDto s : am.list) {
            System.out.println(s.inFo());
        }
    }
    public void allData() {
        AddressMember am = AddressMember.getInstance();

        for (int i = 0; i < am.list.size(); i++) {
            MemberDto s = am.list.get(i);
            System.out.println(s.inFo());
        }
    }
}
