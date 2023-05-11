import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Calculo de Média Bimestral");
       Scanner teclado = new Scanner(System.in);

    System.out.println("Insira a primeira nota do bimestre");
    double nota1 = teclado.nextDouble();
    
    System.out.println("Insira a sua segunda nota do bimestre");
    double nota2 = teclado.nextDouble();
    
    System.out.println("Insira sua terceira nota do bimestre");
    double nota3 = teclado.nextDouble();
    
    System.out.println("Insira sua quarta nota do bimestre ");
    double nota4 = teclado.nextDouble();
    
    teclado.close();

    double mediaBimestral = (nota1 + nota2 + nota3 + nota4)  / 4;
   
    System.out.println(mediaBimestral);


    }
}
