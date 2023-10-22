package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элимента массива, в который хотите записать значение 1");
        int index = scanner.nextInt();
        // не верно, нужно использовать в данном случае "if"
//        try {
//            arr[index] = 1;
//        } catch (Exception e){
//            System.out.println("Указан индекс за приделами маассива");
//        }
        if (index >= arr.length) System.out.println("Указан индекс за приделами маассива");
        else arr[index] = 1;
        System.out.println(Arrays.toString(arr));

    }
}
