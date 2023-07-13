import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*println quebra linha*/
		System.out.print("Hello Word!!!");
		System.out.println("Hello Word!!!");
		/*print não quebra linha*/
		System.out.println("Hello Word!!!");
		System.out.println("Hello Word!!!");
		
		
		int y = 32;
		double x = 10.6448484;
		
		System.out.println(y);
		
		System.out.println(x);
		System.out.printf("%.1f%n", x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.3f%n", x);
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		Locale.setDefault(Locale.US);
		
		
		//Concatenação
		
		System.out.println("o Resultado é " +x+ " Metros");
		
		//Concatenar vários elementos em um mesmo comando de escrita
		
		
		System.out.printf("Nome da funcionária é %s, tem idade de %d e o salario dela é de %.2f reais%n", nome, idade, renda);
		
		
		
		System.out.printf("O resultado é %.2f", x);
		

		


	}

}
