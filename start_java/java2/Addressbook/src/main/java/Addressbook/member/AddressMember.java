package Addressbook.member;

import Addressbook.dto.MemberDto;

import java.util.ArrayList;
import java.util.List;

public class AddressMember {

    private static AddressMember am;

    public List<MemberDto> list;

    private AddressMember(){
        list = new ArrayList<>();
    }

    public static AddressMember getInstance() {
        if(am == null){
            am = new AddressMember();
        }
        return am;
    }
}
