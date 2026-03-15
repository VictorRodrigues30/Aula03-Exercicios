// Nome: Victor Guimarães Rodrigues
// Matricula: 1261946761
import java.util.Scanner;
public class Exercicio03 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final double COTACAO = 4.95;
    System.out.print("Digite o valor em dólar: ");
    double dolar = scanner.nextDouble();
    double reais = dolar * COTACAO;
    System.out.println("Valor convertido: R$ " + reais);
    scanner.close();
    }
    }
     