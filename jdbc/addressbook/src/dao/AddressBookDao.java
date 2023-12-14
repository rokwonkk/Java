package dao;

import db.DBClose;
import db.DBConnection;
import dto.AddressBookDto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressBookDao {

    private static AddressBookDao abd = null;

    private AddressBookDao() {
    }

    public static AddressBookDao getInstance(){
        if (abd == null) {
            abd = new AddressBookDao();
        }
        return abd;
    }

    public boolean insert(AddressBookDto dto){
        String sql = "insert into addressbook(name, age, phone, address, memo) " +
                "values('" + dto.getName() + "',"
                + dto.getAge() + ",'"
                + dto.getPhone() + "','"
                + dto.getAddress() + "','"
                + dto.getMemo() + "') ";

        Connection conn = null;
        Statement stmt = null;

        int count = 0;
        try {
            conn = DBConnection.getConnection();

            stmt = conn.createStatement();

            count = stmt.executeUpdate(sql);

            System.out.println("정상 처리 되었습니다.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBClose.close(conn, stmt, null);
        }

        return count > 0;
    }
    public boolean delete(String name){
        String sql = "delete from addressbook where name = '" + name + "'";

        Connection conn = null;
        Statement stmt = null;

        int count = 0;
        try {
            conn = DBConnection.getConnection();

            stmt = conn.createStatement();

            count = stmt.executeUpdate(sql);

            System.out.println("정상 처리 되었습니다.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBClose.close(conn, stmt, null);
        }

        return count > 0;
    }
    public List<AddressBookDto> nameSearch(String keyword){
        String sql = "select * from addressbook where name like '%" + keyword + "%'";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<AddressBookDto> list = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            if (rs.next()){ // 데이터가 있는 경우
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String memo = rs.getString("memo");

                AddressBookDto dto = new AddressBookDto(name, age, phone, address, memo);

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

    public List<AddressBookDto> addressSearch(String keyword){
        String sql = "select name, age, phone, address, memo "
                + "from addressbook "
                + "where address like '%" + keyword + "%'";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<AddressBookDto> list = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String memo = rs.getString("memo");

                AddressBookDto dto = new AddressBookDto(name, age, phone, address, memo);

                list.add(dto);
            }
            System.out.println("정상 처리 되었습니다.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBClose.close(conn, stmt, rs);
        }
        return list;
    }

    public List<AddressBookDto> memoSearch(String keyword){
        String sql = "select name, age, phone, address, memo "
                + "from addressbook "
                + "where memo like '%" + keyword + "%'";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<AddressBookDto> list = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String memo = rs.getString("memo");

                AddressBookDto dto = new AddressBookDto(name, age, phone, address, memo);

                list.add(dto);
            }
            System.out.println("정상 처리 되었습니다.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBClose.close(conn, stmt, rs);
        }
        return list;
    }

    public boolean update(String name, String updateKeyword, int sn){

        String sql;

        if (sn == 1){
            sql = "update addressbook "
                    + "set phone = '" + updateKeyword +  "' "
                    + "where name like '%" + name + "%' ";
        } else if (sn == 2){
            sql = "update addressbook "
                    + "set address = '" + updateKeyword +  "' "
                    + "where name like '%" + name + "%' ";
        } else {
            sql = "update addressbook "
                    + "set memo = '" + updateKeyword +  "' "
                    + "where name like '%" + name + "%' ";
        }

        Connection conn = null;
        Statement stmt = null;

        int count = 0;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            count = stmt.executeUpdate(sql);

            System.out.println("정상 처리 되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBClose.close(conn, stmt, null);
        }

        return count > 0;
    }
}