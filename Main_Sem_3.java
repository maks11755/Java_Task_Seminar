// package lesson3.seminar;

/*
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */

public class Main_Sem_3 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        String s6 = new String(arr);
        arr[0] = '5';

        System.out.println(s6);
    }
}