package Task3;

// Запишите в файл следующие строки:
//Анна=4
//Елена=5
//Марина=6
//Владимир=?
//Константин=?
//Иван=4
//Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
// (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
// если сохранено значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ,
// отличный от числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Desktop\\Java Исключения\\lesson2\\HW2\\Tasks\\HW\\untitled\\src\\main\\java\\Task3\\names.txt";
        try {
            List<String[]> namesList = readTextFile(path);
            setNameSize(namesList);
            writeToFile(namesList, path);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static List<String[]> readTextFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        List<String[]> namesList = new ArrayList<String[]>();
        while((line = reader.readLine()) != null){
            namesList.add(line.split("="));
        }
        return namesList;
    }

    public static void setNameSize(List<String[]> names){
        for (String[] item: names) {
            if(!item[1].equals("?") && !isDigit(item[1])){
                throw new RuntimeException("Элемент не равен знаку '?' и не равен числу");
            }
            if(item[1].equals("?")){
                item[1] = String.valueOf(item[0].length());
            }
        }
    }

    public static boolean isDigit(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public static void writeToFile(List<String[]> names, String path){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (String[] name : names) {
                String line = name[0] + "=" + name[1];
                writer.write(line + "\n");
            }
            writer.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
