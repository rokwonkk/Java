package student;

public class Student {
    public String name;
    public int ban;
    public int no;
    public int kor;
    public int eng;
    public int math;

    public int getTotal(int k, int e, int m){
        kor = k;
        eng = e;
        math = m;
        return kor + eng + math;
    }

    public double getAverage(){
        //return (double) kor + eng + math / 3;
        return (double) getTotal(kor, eng, math) / 3;
    }
}