// Задание №3
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
import java.util.ArrayList;
import java.util.List;

public class Main3_Sem_3 {
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "adventure", "LORT");
        addBook(shopBook, "Roman", "Master and Margarita");
        addBook(shopBook, "Politic", "Boss");
        addBook(shopBook, "adventure", "Hobbit");
        addBook(shopBook, "Politic", "Magadan");
        addBook(shopBook, "Roman", "Loh and Shmara");

        System.out.println(shopBook);
    }

    private static void addBook(List<List<String>> shopBook, String genre, String nameBook) {
        for (List<String> bookshelf : shopBook) {
            if (bookshelf.get(0).equalsIgnoreCase(genre)) {
                bookshelf.add(nameBook);
                return;
            }
        }
        List<String> newBookshelf = new ArrayList<>();
        newBookshelf.add(genre);
        newBookshelf.add(nameBook);
        shopBook.add(newBookshelf);
    }
}