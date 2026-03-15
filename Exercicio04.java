// Nome: Victor Guimarães Rodrigues
// Matricula: 1261946761
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();
    double novoSalario = salario * 1.07;
System.out.println("Salário original: R$ " + salario);
System.out.println("Novo salário: R$ " + novoSalario);
scanner.close();
}
}

