//Imprima todos os múltiplos de 3, entre 1 e 100.
public class Exercise_three {

    public static void main(String[] args) {
          
        for (int i = 1; i <= 1000 ; i++) {
            double div_rest;
            div_rest = i % 3;
            if (div_rest == 0) {
                System.out.println(i);
            }
        }
         
    }
}