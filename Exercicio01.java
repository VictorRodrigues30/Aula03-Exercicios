// Nome: Victor Guimaraes Rodrigues
  // Matricula: 1261946761
    import java.util.Scanner;
    public class Exercicio01 {
        public static void main(String [] args) {
            Scanner Scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            double numero01 = Scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double numero02 = Scanner.nextDouble();
            double adicao = numero01 + numero02;
            double subtracao = numero01 - numero02;
            double multiplicacao = numero01 * numero02;
            double divisao = numero01 / numero02;
            System.out.println("Adição: " + adicao);
            System.out.println("Subtração: " + subtracao);
            System.out.println("Multiplicação: " + multiplicacao);
            System.out.println("Divisão: " + divisao); 
            Scanner.close();
        }
    }       
