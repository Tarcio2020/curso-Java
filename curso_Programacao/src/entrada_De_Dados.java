//SCANNER 
//Para fazer a entrada de dados, nós vamos criar um objeto do tipo Scanner da seguinte forma:

	//Scanner sc = new Scanner (System.in);
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class entrada_De_Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String x;
		x = sc.next();
		int y;
		y = sc.nextInt();
		double z;
		z = sc.nextDouble();
		
		
		char h;
		h = sc.next().charAt(0);
		
		
		
		System.out.println("Nome: " + x);
		System.out.println("Idade: " + y);
		System.out.printf("Salário: " + z);
		
		//Suponha que uma variávek tipo char declara:
		
		System.out.printf("%nhabilidade: " + z);

		
		
		
		sc.close();
		
		Locale.setDefault(new Locale("pt", "BR"));
		DecimalFormat df = new java.text.DecimalFormat("###,####,##");

	}

}
