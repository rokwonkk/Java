package accountbook;

import dao.AccountBookDao;
import dto.AccountBookDto;

import java.util.List;
import java.util.Scanner;

public class AccountBook {

    Scanner sc = new Scanner(System.in);

    //input
    public void create(){
        System.out.println("가계부 등록입니다");

        String inprokind = "";

        System.out.print("수입이면 1, 지출이면 2 >> ");
        int kind = sc.nextInt();
        if(kind == 1){
            inprokind = "수입";
        } else if (kind == 2){
            inprokind = "지출";
        }

        System.out.print("날짜 >> ");
        String inputdate = sc.next();
        String date = inputdate.replaceAll("-", "");

        System.out.print("금액 >> ");
        int amount = sc.nextInt();
        if (kind == 2){
            amount = amount * -1;
        }

        System.out.print("제목 >> ");
        String title = sc.next();

        System.out.print("내용 >> ");
        String comment = sc.next();

        AccountBookDao dao = AccountBookDao.getInstance();

        boolean b = dao.insert(new AccountBookDto(inprokind, date, amount, title, comment));

        if(!b){
            System.out.println("가계부 등록이 실패했습니다.");
        } else {
            System.out.println("가계부 등록이 완료 되었습니다.");
        }
    }
    public void delete(){
        System.out.println("삭제하실 가계부의 타이틀을 입력해 주세요.");
        System.out.print("입력 >> ");
        String titleKeyword = sc.next();

        List<AccountBookDto> list = AccountBookDao.getInstance().titleSearch(titleKeyword);

        if(list.isEmpty()){
            System.out.println("데이터를 찾을 수 없습니다.");
        }

        for (AccountBookDto dto : list) {
            System.out.println(dto.seqToString());
        }

        System.out.print("입력 >> ");
        int seq = sc.nextInt();

        AccountBookDao dao = AccountBookDao.getInstance();

        boolean b = dao.delete(seq);
        if(!b) {
            System.out.println("데이터가 없거나 삭제되지 않았습니다");
        }
        System.out.println("삭제되었습니다");
    }

    public void update(){
        search();
        System.out.println("수정할 데이터 번호를 입력하세요");
        System.out.print("입력 >> ");
        int seq = sc.nextInt();

        System.out.println("수정할 내용의 번호를 입력하세요.");
        System.out.println("1. 금액, 2. 제목, 3. 내용, 4. 날짜");
        System.out.print("입력 >> ");
        int sn = sc.nextInt();

        String updateKeyword = "";
        switch (sn){
            case 1 :
                System.out.println("수정할 금액을 입력하세요");
                System.out.print("입력 >> ");
                updateKeyword = sc.next();
                break;
            case 2 :
                System.out.println("수정할 제목을 입력하세요");
                System.out.print("입력 >> ");
                updateKeyword = sc.next();
                break;
            case 3 :
                System.out.println("수정할 내용를 입력하세요");
                System.out.print("입력 >> ");
                updateKeyword = sc.next();
                break;
            case 4 :
                System.out.println("수정할 날짜를 입력하세요");
                System.out.print("입력 >> ");
                String inputdate = sc.next();
                updateKeyword = inputdate.replaceAll("-", "");
                break;
        }
        boolean updateYn = AccountBookDao.getInstance().update(seq, updateKeyword, sn);

        if(!updateYn){
            System.out.println("가계부 수정이 실패했습니다.");
        } else {
            System.out.println("가계부 수정이 완료 되었습니다.");
        }
    }

    public void search(){
        List<AccountBookDto> list = AccountBookDao.getInstance().allSearch();

        if(list.isEmpty()){
            System.out.println("가계부에 데이터가 없습니다.");
        }

        for (AccountBookDto dto : list) {
            System.out.println(dto.seqToString());
        }
    }

    public void dateSearch(){
        System.out.println("검색할 날짜를 입력하세요.");

        System.out.print("입력 >> ");
        String dateKeyword = sc.next();

        List<AccountBookDto> list = AccountBookDao.getInstance().dateSearch(dateKeyword);

        if(list.isEmpty()){
            System.out.println("데이터를 찾을 수 없습니다.");
        }

        for (AccountBookDto dto : list) {
            System.out.println(dto.seqToString());
        }
    }

    public void titleSearch(){
        System.out.println("검색할 제목을 입력하세요.");

        System.out.print("입력 >> ");
        String titleKeyword = sc.next();

        List<AccountBookDto> list = AccountBookDao.getInstance().titleSearch(titleKeyword);

        if(list.isEmpty()){
            System.out.println("데이터를 찾을 수 없습니다.");
        }

        for (AccountBookDto dto : list) {
            System.out.println(dto.seqToString());
        }
    }

    public void commentSearch(){
        System.out.println("검색할 제목을 입력하세요.");

        System.out.print("입력 >> ");
        String commentKeyword = sc.next();

        List<AccountBookDto> list = AccountBookDao.getInstance().commentSearch(commentKeyword);

        if(list.isEmpty()){
            System.out.println("데이터를 찾을 수 없습니다.");
        }

        for (AccountBookDto dto : list) {
            System.out.println(dto.seqToString());
        }
    }

    public void dateRangeSearch(){
        System.out.print("시작날짜를 입력해주세요. >> ");
        String start = sc.next();
        String firstDate = start.replaceAll("-", "");

        System.out.print("종료날짜를 입력해주세요. >> ");
        String end = sc.next();
        String endDate = end.replaceAll("-", "");

        List<AccountBookDto> list = AccountBookDao.getInstance().dateRangeSearch(firstDate, endDate);

        if(list.isEmpty()){
            System.out.println("데이터를 찾을 수 없습니다.");
        }

        for (AccountBookDto dto : list) {
            System.out.println(dto.seqToString());
        }
    }
    public void monthSet(){
        System.out.println("월별 결산입니다.");

        List<AccountBookDto> list = AccountBookDao.getInstance().monthSet();

        if(list.isEmpty()){
            System.out.println("데이터를 찾을 수 없습니다.");
        }

        for (AccountBookDto dto : list) {
            System.out.println(dto.monthToString());
        }
    }
    public void totalSet(){
        System.out.println("총 결산입니다.");
        List<AccountBookDto> list = AccountBookDao.getInstance().totalSet();

        if(list.isEmpty()){
            System.out.println("데이터를 찾을 수 없습니다.");
        }

        for (AccountBookDto dto : list) {
            System.out.println(dto.totalToString());
        }
    }
}
