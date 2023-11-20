package sortingOOP;

import sort.Sorting;

public class Main {
    public static void main(String[] args) {
        Sorting st = new Sorting();

        // 입력처리
        st.input();
        // 정렬처리
        st.sorting();
        // 결과출력
        st.print();

    }
}