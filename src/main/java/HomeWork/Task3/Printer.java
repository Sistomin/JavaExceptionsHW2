package HomeWork.Task3;

//Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
//При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
//Если b равен нулю, программа должна вывести сообщение о невозможности выполнения операции и вернуть результат равный нулю.
//После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
//Если аргументы не переданы через командную строку, используйте значения по умолчанию.
//На входе: '12' & '5'
//На выходе: 17  & 2.4
class Expr {

    public static double expr(int a, int b) throws Exception {
        // Введите свое решение ниже
        double c = 0.0;

        if(b == 0){
            //return c;

        } else {
            c = (double) a / b;
        }
      return c;
    }

    public static void printSum(int a, int b) {
        // Введите свое решение ниже
        System.out.println(a + b);

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 12;
            b = 0; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        Expr.printSum(a, b);
        double result = 0;
        try {
            result = Expr.expr(a, b);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);

    }
}

// ЭТОЛОННОЕ РЕШЕНИЕ GeekBrains
//Деление
//
//class Expr {
//
//    public static double expr(int a, int b) {
//        double result = 0.0; // Initialize the result
//        if (b != 0) {
//            result = (double) a / b; // Perform the division and store the result
//        }
//        printSum(a, b);
//        return result; // Return the result
//    }
//
//    public static void printSum(int a, int b) {
//        System.out.println(a + b);
//    }
//}
//
//public class Printer {
//    public static void main(String[] args) {
//        int a;
//        int b;
//
//        if (args.length == 0) {
//            a = 90;
//            b = 3; // Default values if no arguments are provided
//        } else {
//            a = Integer.parseInt(args[0]);
//            b = Integer.parseInt(args[1]);
//        }
//
//        double result = Expr.expr(a, b);
//        System.out.println(result);
//    }
//}

