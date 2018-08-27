package by.it.nikolaiivanouski.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
import java.util.Scanner;
class TaskC1 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = k.nextInt();
        System.out.println("Введите второе число:");
        int number2 = k.nextInt();
        int q = number1+number2;
        System.out.println( "Sum" + " " + "=" + " " + q);

    }

}
