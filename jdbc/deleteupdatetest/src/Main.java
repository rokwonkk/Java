import db.DBConnection;
import jdbc.myClass;

public class Main {
    public static void main(String[] args) {

        DBConnection.initConnection();
        myClass mycls = new myClass();

//        String id = "abd";
//
//        int count = mycls.userDelete(id);
//        if (count > 0){
//            System.out.println("삭제되었습니다.");
//        }

        String id = "aaa";
        String name = "안녕";
        int count = mycls.userUpdate(id, name);
        if (count > 0){
            System.out.println("수정되었습니다.");
        }
    }
}