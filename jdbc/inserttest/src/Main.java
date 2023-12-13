import jdbc.JdbcConnect;

public class Main {
    public static void main(String[] args) {
        // JDBC : Java DataBase Connectivity
        JdbcConnect jc = new JdbcConnect();

        jc.getConnection();

        String id = "abd";
        String name = "홍길동";
        int age = 24;

        int count = jc.userInsert(id, name, age);
        if(count > 0){
            System.out.println("정상적으로 추가 되었습니다.");
        }
    }
}