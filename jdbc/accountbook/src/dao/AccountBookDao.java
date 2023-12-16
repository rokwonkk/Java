package dao;

import db.DBClose;
import db.DBConnection;
import dto.AccountBookDto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountBookDao {

    private static AccountBookDao abd = null;

    private AccountBookDao() {
    }

    public static AccountBookDao getInstance(){
        if (abd == null) {
            abd = new AccountBookDao();
        }
        return abd;
    }

    public boolean insert(AccountBookDto dto){
        String sql = "insert into accountbook(inprokind, amount, title, comment, date) values "
                + "('"
                + dto.getInProKind() + "',"
                + dto.getAmount() + ",'"
                + dto.getTitle() + "','"
                + dto.getComment() + "','"
                + dto.getDate()
                + "') ";

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
    public boolean delete(int seq){
        String sql = "delete from accountbook where seq = " + seq;

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
    public boolean update(int seq, String updateKeyword, int sn){

        String sql = "update accountbook ";

        if (sn == 1){
            sql += "set amount = '" + updateKeyword +  "' ";
        } else if (sn == 2){
            sql += "set title = '" + updateKeyword +  "' ";
        } else if (sn == 3){
            sql +=  "set comment = '" + updateKeyword +  "' ";
        } else if (sn == 4){
            sql +=  "set date = '" + updateKeyword +  "' ";
        }

        sql += "where seq = " + seq;

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

    public List<AccountBookDto> allSearch() {
                String sql = "select seq, inprokind, amount, title, comment, date_format(date, '%Y-%m-%d') as date from accountbook";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<AccountBookDto> list = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                int seq = rs.getInt("seq");
                String inProKind = rs.getString("inProKind");
                int amount = rs.getInt("amount");
                String title = rs.getString("title");
                String comment = rs.getString("comment");
                String date = rs.getString("date");

                AccountBookDto dto = new AccountBookDto(seq, inProKind, date, amount, title, comment);

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
    public List<AccountBookDto> dateSearch(String keyword){
        String sql = "select seq, inprokind, amount, title, comment, date_format(date, '%Y-%m-%d') as date "
                + "from accountbook "
                + "where date like '" + keyword + "%'";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<AccountBookDto> list = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                int seq = rs.getInt("seq");
                String inprokind = rs.getString("inprokind");
                int amount = rs.getInt("amount");
                String title = rs.getString("title");
                String comment = rs.getString("comment");
                String date = rs.getString("date");

                AccountBookDto dto = new AccountBookDto(seq, inprokind, date, amount, title, comment);

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
    public List<AccountBookDto> titleSearch(String keyword){
        String sql = "select seq, inprokind, amount, title, comment, date_format(date, '%Y-%m-%d') as date "
                + "from accountbook "
                + "where title like '%" + keyword + "%'";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<AccountBookDto> list = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                int seq = rs.getInt("seq");
                String inProKind = rs.getString("inProKind");
                int amount = rs.getInt("amount");
                String title = rs.getString("title");
                String comment = rs.getString("comment");
                String date = rs.getString("date");

                AccountBookDto dto = new AccountBookDto(seq, inProKind, date, amount, title, comment);

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

    public List<AccountBookDto> commentSearch(String keyword){
        String sql = "select seq, inprokind, amount, title, comment, date_format(date, '%Y-%m-%d') as date "
                + "from accountbook "
                + "where comment like '%" + keyword + "%'";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<AccountBookDto> list = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                int seq = rs.getInt("seq");
                String inprokind = rs.getString("inprokind");
                int amount = rs.getInt("amount");
                String title = rs.getString("title");
                String comment = rs.getString("comment");
                String date = rs.getString("date");

                AccountBookDto dto = new AccountBookDto(seq, inprokind, date, amount, title, comment);

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

    public List<AccountBookDto> dateRangeSearch(String first, String end){
        String sql = "select seq, inprokind, amount, title, comment, date_format(date, '%Y-%m-%d') as date "
                + "from accountbook "
                + "where date between " + first + " and " + end;

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<AccountBookDto> list = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                int seq = rs.getInt("seq");
                String inprokind = rs.getString("inprokind");
                int amount = rs.getInt("amount");
                String title = rs.getString("title");
                String comment = rs.getString("comment");
                String date = rs.getString("date");

                AccountBookDto dto = new AccountBookDto(seq, inprokind, date, amount, title, comment);

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
    public List<AccountBookDto> monthSet(){
        String sql = "select date_format(date, '%Y-%m') as date, sum(amount) as money from accountbook "
                    + "group by date_format(date, '%Y-%m') ";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<AccountBookDto> list = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                int money = rs.getInt("money");
                String date = rs.getString("date");

                AccountBookDto dto = new AccountBookDto(money, date);

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

    public List<AccountBookDto> totalSet(){
        String sql = "select sum(amount) as total from accountbook";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<AccountBookDto> list = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                int total = rs.getInt("total");

                AccountBookDto dto = new AccountBookDto(total);

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
}