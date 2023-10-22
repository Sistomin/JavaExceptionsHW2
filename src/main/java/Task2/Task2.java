package Task2;

import java.lang.reflect.Array;

public class Task2 {
    public static void main(String[] args) {
//        String[][] arr =
//                sum2d(arr);
//        System.out.println(sum);
    }
    public static int sum2d(String[][]arr){
        // нужен try-catch на проверку типа хронящегося в массиве
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
