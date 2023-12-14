import db.DBConnection;
import dto.UserDto;
import jdbc.SelectTest;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DBConnection.initConnection();

        String id = "aaa";

        SelectTest st = new SelectTest();

//        UserDto user = st.getUser(id);
//        if (user != null) {
//            System.out.println(user);
//        } else {
//            System.out.println("등록되지 않은 id 입니다.");
//        }2

        List<UserDto> list = st.getUserList();
        if(!list.isEmpty()){
            for (UserDto dto : list) {
                System.out.println(dto);
            }
        } else {
            System.out.println("등록된 id가 없습니다.");
        }
    }
}