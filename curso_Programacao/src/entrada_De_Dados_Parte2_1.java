import java.util.Scanner;

public class entrada_De_Dados_Parte2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Quando você usa um comando de leitura diferente do nextLine() e
	dá alguma quebra de linha, essa	quebra de linha fica "pendente"
	na entrada padrão. 
	
		Se você então fizer um nextLine(), aquela quebra de linha pendente
	será absorvida pelo nextLine(
	
	*/
	Scanner sc = new Scanner(System.in);

	
	int x;
	
	String s4, s5, s6;
	x = sc.nextInt();
	//para resolver o problema:
	sc.nextLine();
	s4 = sc.nextLine();
	s5 = sc.nextLine();
	s6 = sc.nextLine();
	
	System.out.println("Incluindo outro inteiro sem o uso do "
			+ "nextLine o valor armazenado em s4 foi a quebra de linha");

	System.out.println("Dados Digitados");
	System.out.println(x);
	System.out.println(s4);
	System.out.println(s5);
	System.out.println(s6);
		
	}

}
