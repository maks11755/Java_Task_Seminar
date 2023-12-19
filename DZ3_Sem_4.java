// Task3. Sem 4  В обычный калькулятор без логирования добавьте возможность отменить
// последнюю операцию. // Отмена последней операции должна быть реализована
// следующим образом: // если передан оператор '<' калькулятор должен вывести
// результат предпоследней операции.

// calculate('+', 3, 7) // calculate('+', 4, 7) // calculate('<', 0, 0)

// // 10 // // 11 // // 10

// calculate('*', 3, 2) // calculate('-', 7, 4) // calculate('<', 0, 0)

// // 6 // // 3 // // 6

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {

private ArrayDeque<Integer> results;

public Calculator() {
    results = new ArrayDeque<Integer>();
}

public int calculate(char op, int a, int b) {

    int result = 0;
    if (op == '+')
        result = a + b;
    else if (op == '-')
        result =  a - b;
    else if (op == '*')
        result =  a * b;
    else if (op == '/')
        result =  a / b;

    if (op == '<') {
        results.removeLast();
        result = results.removeLast();

        /* Вариант без удаления элементов
        Integer beforeLast = null;
        Integer last = null;
        for (Integer item : results) {
            beforeLast = last;
            last = item;
        }
        result = beforeLast;
         */
    } else
        results.add(result);


    return result;
}
}

class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {

            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}

// Эталонное решение от автора

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    public Deque resultsStack = new ArrayDeque<>();
    public Deque operationsStack = new ArrayDeque<>();
    public int prevResult;

    public int calculate(char op, int a, int b) {
        if (op == '<') {
            if (resultsStack.size() >= 2) {
                resultsStack.pop();
                prevResult = resultsStack.peek();
            }
            return prevResult;
        } else {
            int result = performOperation(op, a, b);
            resultsStack.push(result);
            operationsStack.push(op);
            prevResult = result;
            return result;
        }
    }

    private int performOperation(char op, int a, int b) {
        switch (op) {
            case '+':
                return add(a, b);
            case '-':
                return minus(a, b);
            case '*':
                return mult(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Некорректный оператор: " + op);
        }
    }

    private int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Деление на ноль");
        }
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }
}

class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}

class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {

            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}