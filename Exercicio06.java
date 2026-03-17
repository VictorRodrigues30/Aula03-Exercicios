//Nome: Victor Guimarães Rodrigues
//Matricula: 1261946761

import java.util.Scanner;
public class Exercicio06 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite a base (em cm): ");
Double base = scanner.nextDouble();
System.out.print("Digite a altura (em cm): ");
Double altura = scanner.nextDouble();
double area = base * altura;
System.out.println("Área do retângulo: " + area + "cm²");
scanner.close();

}    
}
