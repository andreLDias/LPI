//Imprima os fatoriais de 1 a 40.
public class Exercise_five {

  public static long FatorialCalculation(long i) {
	  long n = i - 1;
	  while (n > 0){
		  i *= n;
		  n--;
	  }
    return i;
  }

  public static void main(String[] args) {
    for (long i = 1; i <= 40 ; i++) {
  	  System.out.println("O resultado do fatorial do numero " + i + " é: " + FatorialCalculation(i));;
    } 
  }
}