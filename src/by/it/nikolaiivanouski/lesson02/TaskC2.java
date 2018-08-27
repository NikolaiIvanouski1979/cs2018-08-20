package by.it.nikolaiivanouski.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

      //  System.out.println(" Вот пример ввода с клавиатуры: " );
        int number1 = k.nextInt();
      //  System.out.println("Введите второе число:");
        int number2 = k.nextInt();
        int q = number1+number2;
        System.out.println( "DEC" + ":" + number1 + "+" + number2 + "=" + q);
        System.out.println( "BIN" + ":" +  Integer.toBinaryString(number1) + "+" + Integer.toBinaryString(number2) + "=" + Integer.toBinaryString(q));
        System.out.println( "HEX" + ":" + Integer.toHexString(number1) + "+" + Integer.toHexString(number2) + "=" +Integer.toHexString(q) );
        System.out.println( "OCT" + ":" + Integer.toOctalString(number1) + "+" + Integer.toOctalString(number2) + "=" + Integer.toOctalString(q));

    }
}