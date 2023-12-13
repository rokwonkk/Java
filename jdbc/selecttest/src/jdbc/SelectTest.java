package jdbc;

import db.DBClose;
import db.DBConnection;
import dto.UserDto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectTest {
    // select

    // 1개의 데이터를 취득
    public UserDto getUser(String id){

        String sql = "select id, name, age, joindate "
                + "from user "
                + "where id = '" + id + "'";

        Connection conn = DBConnection.getConnection();     //DB정보 취득
        Statement stmt = null;                              //query문 실행
        ResultSet rs = null;                                //db로부터의 결과를 취득

        UserDto dto = null;
        try {
            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);

            if (rs.next()){ // 데이터가 있는 경우
                String userid = rs.getString("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String joindate = rs.getString("joindate");

                dto = new UserDto(userid, name, age, joindate);
            }
            System.out.println("정상처리 됐습니다.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBClose.close(conn,stmt,rs);
        }

        return dto;
    }

    // 다수의 데이터를 취득
    public List<UserDto> getUserList(){

        String sql = "select id, name, age, joindate from user";

        Connection conn = DBConnection.getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        List<UserDto> list = new ArrayList<>();
        try {
            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()){

                String id = rs.getString("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String joindate = rs.getString("joindate");

                UserDto dto = new UserDto(id, name, age, joindate);

                list.add(dto);
            }

            System.out.println("정상처리 됐습니다.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBClose.close(conn, stmt, rs);
        }

        return list;
    }
}