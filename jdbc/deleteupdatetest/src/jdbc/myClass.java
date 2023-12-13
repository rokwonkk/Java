package jdbc;

import db.DBClose;
import db.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class myClass {
    // delete
    public int userDelete(String id){
        String sql = " delete from user " +
                "where id = '" + id + "'";

        Connection conn = DBConnection.getConnection();
        Statement stmt = null;

        int count = 0;

        try {
            stmt = conn.createStatement();      //상태 초기화
            count = stmt.executeUpdate(sql);    //Query문 실행
            System.out.println("정상적으로 처리되었습니다.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBClose.close(conn,stmt,null);
        }
        return count;
    }

    // update

}
