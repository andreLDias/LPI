// Imprima sequencia de Fibonacci de 1 até passar de 100. 
public class Exercise_six {
  
    static long Fibonacci(int n) {
        return (n < 2) ? n : Fibonacci(n - 1) + Fibonacci(n - 2);
    }
  
  
    public static void main(String[] args) {
     
     // teste do programa. Imprime os 30 primeiros termos
        for (int i = 0; i <= 20; i++) {
            System.out.println("Termo (" + i + "): " + Fibonacci(i) + "\t");
        }
    }
}
