import java.util.Scanner;

public class Task1 {
    public static void main (String [ ] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите числа: ");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int d = num.nextInt();

        if (a < b & a < c & a < d ) {
           System.out.println(a);
        }
        if (b < a & b < c & b < d) {
            System.out.println(b);
        }
        if (c < a & c < b & c < d) {
            System.out.println(c);
        }
        if (d < a & d < b & d < c) {
            System.out.println(d);
        }
    }
}
//Пользователь вводит с клавиатуры 4 числа типа int.
//Сравнить их и вывести наименьшее на консоль.