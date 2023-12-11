// Напишите функцию printPrimeNums, которая выведет на экран все простые числа от 1 до 1000, каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.
// Пример
// 1 // 2 // 3 // 5 // 7 // 11 // ...
// 1е решение задачи

class Answer { public void printPrimeNums(){

    int min = 1;
    int max = 1001;
    Answer random = new Answer();
    for (int i = 1; i < 1001; i++) {

    System.out.println(i);
    }
}
}

class Printer{ public static void main(String[] args) {

    Answer ans = new Answer();
    ans.printPrimeNums();
}
}