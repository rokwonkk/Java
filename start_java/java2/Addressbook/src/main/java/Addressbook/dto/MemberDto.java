package Addressbook.dto;

public class MemberDto {

    private String name;
    private int age;
    private String phone;
    private String birth;
    private String memo;

    public MemberDto() {
    }

    public MemberDto(String name, int age, String phone, String birth, String memo) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.birth = birth;
        this.memo = memo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return name+","+
                age+","+
                phone+","+
                birth+","+
                memo;
    }

    public String inFo(){
        return "이름 : " + name + " 나이 : " + age + " 휴대번호 : " + phone + " 생년월일 : " + birth + " { 메모 : " + memo + " }";
    }
}
