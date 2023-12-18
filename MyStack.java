// Реализовать алгоритм перевода из инфиксной записи в постфиксную для
// арифметического выражения.
// http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181
// Вычислить запись если это возможно.
//size(), empty(), push(), peek(), pop().
public class MyStack {
    private int[] arr = new int[10];
    private int size = 0;

    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    void push(int elem){
        if (size >= arr.length){
            int[] arr2 = new int[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = elem;
    }

    int peek(){
        return arr[size - 1];
    }

    int pop(){
        return arr[--size];
    }
}