// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
// приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.


import java.util.HashSet;
import java.util.Set;


public class Main2_Sem_6 {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();

        Cat cat1 = new Cat();
        cat1.name = "  ";
        cat1.age = 10;
        cat1.poroda = "  ";
        cat1.ownerName = "  ";

        Cat cat2 = new Cat();
        cat2.name = "   ";
        cat2.age = 9;
        cat2.poroda = "   ";
        cat2.ownerName = "   ";

        Cat cat3 = new Cat();
        cat3.name = "  ";
        cat3.age = 8;
        cat3.poroda = "   ";
        cat3.ownerName = "  ";

        Cat cat4 = new Cat();
        cat4.name = "   ";
        cat4.age = 9;
        cat4.poroda = "   ";
        cat4.ownerName = "   ";

        Cat cat5 = new Cat();
        cat5.name = "  ";
        cat5.age = 9;
        cat5.poroda = "    ";
        cat5.ownerName = "   ";

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        printSet(findByAge(cats, 9));
    }

    static Set<Cat> findByAge(Set<Cat> cats, int minAge){
        Set<Cat> res = new HashSet<>();
        for (Cat cat: cats){
            if (cat.age >= minAge){
                res.add(cat);
            }
        }
        return res;
    }

    static void printSet(Set<Cat> cats){
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
}