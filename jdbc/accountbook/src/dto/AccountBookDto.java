package dto;

public class AccountBookDto {
    private int seq;
    private String inProKind;
    private int amount;
    private String title;
    private String comment;
    private String date;

    public AccountBookDto() {
    }
    public AccountBookDto(String inProKind, String date, int amount, String title, String comment) {
        this.inProKind = inProKind;
        this.amount = amount;
        this.title = title;
        this.comment = comment;
        this.date = date;
    }

    public AccountBookDto(int seq, String inProKind, String date, int amount, String title, String comment) {
        this.seq = seq;
        this.inProKind = inProKind;
        this.amount = amount;
        this.title = title;
        this.comment = comment;
        this.date = date;
    }

    public AccountBookDto(int amount, String date) {
        this.amount = amount;
        this.date = date;
    }

    public AccountBookDto(int amount) {
        this.amount = amount;
    }

    public String getInProKind() {
        return inProKind;
    }

    public int getAmount() {
        return amount;
    }

    public String getTitle() {
        return title;
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {
        return date;
    }

    public int getSeq() {
        return seq;
    }

    @Override
    public String toString() {
        return "AccountBookDto{" +
                "수입/지출='" + inProKind + '\'' +
                ", 금액=" + amount +
                ", 제목='" + title + '\'' +
                ", 내용(상세)='" + comment + '\'' +
                ", 날짜=" + date +
                '}';
    }
    public String monthToString() {
        return  "날짜=" + date +
                ", 금액=" + amount;
    }

    public String seqToString() {
        return  "번호='" + seq + '\'' +
                ", 날짜=" + date +
                ", 수입/지출='" + inProKind + '\'' +
                ", 금액=" + amount +
                ", 제목='" + title + '\'' +
                ", 내용(상세)='" + comment + '\'';
    }
    public String totalToString() {
        return  "총 결산 금액=" + amount;
    }
}
