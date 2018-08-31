package by.it.nikolaiivanouski.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {

    public static void main(String [] arg){
       // Scanner scanner=new Scanner(System.in);
        ArrayList<String>array=new ArrayList<>();
        array.add("qq");
        array.add("ww");
        array.add("ee");
        array.add("rr");
        array.add("tt");
        System.out.println(array.size());
        for (int i = 0; i < array.size() ; i++) {
            System.out.println(array.get(i));
            
        }






    }


}
