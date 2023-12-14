package dto;

public class AddressBookDto {
    //모델
    private String name;
    private int age;
    private String phone;
    private String address;
    private String memo;

    public AddressBookDto() {
    }

    public AddressBookDto(String name, int age, String phone, String address, String memo) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.memo = memo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getMemo() {
        return memo;
    }


    @Override
    public String toString() {
        return "AddressBookDto{" +
                "이름='" + name + '\'' +
                ", 나이=" + age +
                ", 전화번호='" + phone + '\'' +
                ", 주소='" + address + '\'' +
                ", 메모='" + memo + '\'' +
                '}';
    }
}
