// para compilar == javac HelloWord1.java == irá criar um arquivo .class
// para rodar o programa == java HelloWord1
//Nome do arquivo tem que ser o mesmo nome da classe
public class HelloWorld1 {
    // Método principal
    public static void main(String[] args) {
        //System.out.print("Hello World 1 1 1 1 1 1 1 1 1 1 1!!!");      
        //System.out.print("Olá " + args[0] + ", tudo bem..." + args[1]);

        //Se escrever todos caracteres ==
        String ambiente = args[0];
        if(ambiente.equals("DEV")) {
            System.out.print("Executando em DEV");
        }

        //Mesmo que os caracteres não sejam iguais
        String ambiente2 = args[1];
        if(ambiente2.equalsIgnoreCase("DEV")) {
            System.out.print("Executando em DEV2");
        }


    }
}
