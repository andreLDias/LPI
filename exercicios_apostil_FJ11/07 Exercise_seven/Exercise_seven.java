//  Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
// novo x de acordo com a seguinte regra:
// se x é par, x = x / 2
// se x é impar, x = 3 * x + 1
// imprime x
// O programa deve parar quando x tiver o valor final de 1.
import java.util.*;
public class Exercise_seven {

    static int Even(int n) {
        return (n / 2);
    }

    static int Odd(int n) {
        return ((3 * n) + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number != 1) {
            if ((number%2) == 0) {
                number = Even(number);
            }
            else {
                number = Odd(number);
            }
            if (number == 1) {
                System.out.print(number + ".");
            }
            else {
                System.out.print(number + "->");
            }
        }
    }

}
