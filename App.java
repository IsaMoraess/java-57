import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
Entrada: Saída:
25
100
5.50
NUMBER = 25
SALARY = U$ 550.00
Entrada: Saída:
1
200
20.50
NUMBER = 1
SALARY = U$ 4100.00
Entrada: Saída:
6
145
15.55
NUMBER = 6
SALARY = U$ 2254.75 */
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o número do funcionário:");
        int numeroFuncionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas:");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor por hora:");
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("Numero = " + numeroFuncionario);
        System.out.printf("Salario = R$ %.2f%n", salario);
    }
}
