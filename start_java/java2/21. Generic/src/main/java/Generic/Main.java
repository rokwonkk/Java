package Generic;

public class Main {
    public static void main(String[] args) {

        /**
         *  Generic == template(형태)
         *  자료형 변수
         *  같은 클래스에서 다양한 자료형을 사용하고 싶은 경우에 설정하는 요소
         *
         *  제네릭은 여러개도 가능하다.
         */

//        Box box = new Box(10);
//        int temp = box.getTemp();

        //Object 자료형만 가능하다.
//        Box<Integer> iBox = new Box<Integer>(333);
//
//        Box<Double> dBox = new Box<Double>(0.111);
//
//        Box<String> sBox = new Box<String>("ㅋㅋㅋㅋ킄");
//
//        System.out.println(iBox.getTemp());
//        System.out.println(dBox.getTemp());
//        System.out.println(sBox.getTemp());

        BoxMap<Integer, String> bMap = new BoxMap<Integer, String>(111, "Hello");
        System.out.println(bMap.toString());

        BoxMap<Double, String> dMap = new BoxMap<Double, String>(0.111, "World");
        System.out.println(dMap.toString());

    }
}

//자료형같은 경우는 T를 쓰는게 보기 좋음 template에서 옴.
// 제네릭 '< >' 을 써서 사용한다, 자료형(int, double)을 변하는 수로 설정해놓는것이다.
class Box<T>{

    T temp;

    public Box(T temp){
        this.temp = temp;
    }

    public T getTemp() {
        return temp;
    }

    public void setTemp(T temp) {
        this.temp = temp;
    }
}

class BoxMap<Key, Value>{

    Key key;
    Value value;

    public BoxMap(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BoxMap {" +
                " key=" + key +
                ", value=" + value +
                " }";
    }
}