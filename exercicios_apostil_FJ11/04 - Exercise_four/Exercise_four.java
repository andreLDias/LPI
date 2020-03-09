//Imprima os fatoriais de 1 a 10.
public class Exercise_four {

  public static long FatorialCalculation(int i) {
	  int n = (i - 1);
	  while (n > 0){
		  i *= n;
		  n--;
	  }
    return i;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 10 ; i++) {
  	  System.out.println("O resultado do fatorial do numero " + i + " é: " + FatorialCalculation(i));;
    } 
  }
}
