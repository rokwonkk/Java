package cls;

public class MyClass {

    /** 멤버변수 대부분 private **/
    private int number; // 외부 접근 차단
    //public String name; // <- oop 규칙에 위해됨.
    private String name; // 외부 접근 얼마든지 허용
    protected double height; // 외부 접근 차단

    /* 멤버 메소드는 거의 public인 경우가 많다. */

    /* getter, setter함수 */
    /** 외부에서 값을 얻어 오는 것 getter **/
    public int getNumber(){
        return number;
    }

    /** 외부에서 값을 넘겨 받아서 셋팅 setter **/
    public void setNumber(int num){
        number = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}