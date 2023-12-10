// task04.Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке.
public class Main5 {
    public static void main(String[] args) {
        String phrase = "Добро пожаловать на курс по Java";
        String[] arr = phrase.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = arr.length - 1; i >= 0 ; i--) {
            result.append(arr[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}

