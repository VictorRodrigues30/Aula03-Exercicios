// Nome: Victor Guimarães Rodrigues
// Matricula: 1261946761
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite x: ");
    int  x = scanner.nextInt();
    System.out.print("Digite Y: ");
    int y = scanner.nextInt();
    int resto = x % y;
    System.out.println("O resto da divisão de " + x + " por " + y + " é: " + resto);
    scanner.close();
}
}
