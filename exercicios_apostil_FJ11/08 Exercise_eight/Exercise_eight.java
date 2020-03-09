//  Imprima a seguinte tabela, usando for s encadeados:
// 1
// 2 4
// 3 6 9
// 4 8 12 16
// n n*2 n*3 ... n*n
import java.util.*;
public class Exercise_eight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int final_number = sc.nextInt();

        System.out.println("---------------------");
        for (int line = 1; line <= final_number; line++) {
            System.out.print("- ");
            for (int column = 1; column <= line; column++) {
                System.out.print((line*column) + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------");
    }
}
