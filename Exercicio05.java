// Nome: Victor Guimarães Rodrigues
// Matricula: 1261946761

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a nota 1: ");
    double nota1 = scanner.nextDouble();
    System.out.print("Digite a nota 2: ");
    Double nota2 = scanner.nextDouble();
    System.out.print("Digite a nota 3: ");
    Double nota3 = scanner.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
    System.out.printf("Média: %.2f", media);
    scanner.close();
    }
}