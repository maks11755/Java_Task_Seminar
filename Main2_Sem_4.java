//  Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.*;

public class Main2_Sem_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> list = new LinkedList<>();
            boolean work = true;
            while (work){
                String line = scanner.nextLine();
                switch (line){
                    case "print":
                        for (String s: list){
                            System.out.println(s);
                        }
//                    ListIterator<String> iterator = list.listIterator(list.size());
//                    while (iterator.hasPrevious()){
//                        System.out.println(iterator.previous());
//                    }
//                    for (int i = list.size()-1; i >= 0; i--) {
//                        System.out.println(list.get(i));
//                    }
                        break;
                    case "revert":
                        list.remove(0);
                        break;
                    case "finish":
                        work = false;
                        break;
                    default:
                        list.add(0, line);
                }
            }
        }
    }
}