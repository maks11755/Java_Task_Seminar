// package lesson3.seminar;

import java.util.ArrayList;
import java.util.List;

public class Test_Sem_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int a = 5;
        String s = "War and Mir";

        test(list, a, s);

        System.out.println(list);
        System.out.println(a);
        System.out.println(s);
    }

    static void test(List<Integer> list, int a, String s){
        a++;
        list.add(a);
        s = "12 stuliev";
    }
}