/**Escreva um algoritmo que leia dois valores: o primeiro servindo de indicador de 
operação e o segundo correspondendo ao raio de um círculo ou esfera. Caso o 
primeiro valor lido seja:
a. 1: calcular e imprimir o perímetro do círculo.
b. 2: calcular e imprimir a área do círculo.
c. 3: calcular e imprimir o volume da esfera.
Se o primeiro valor lido for diferente desses três valores possíveis, imprimir uma 
mensagem de erro, informando que o código da operação é inválido.
OBS:
Perímetro de um círculo: 2 π r
Área de um círculo: π r²
Volume de uma esfera: 4/3 π r³
em que π = 3,141592 e r é o raio da circunferência.*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código da operação (1 para perímetro, 2 para área, 3 para volume):");
        int codigoOperacao = input.nextInt();

        System.out.println("Digite o raio:");
        double raio = input.nextDouble();

        if (codigoOperacao == 1) {
            double perimetro = 2 * Math.PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
        } else if (codigoOperacao == 2) {
            double area = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do círculo: " + area);
        } else if (codigoOperacao == 3) {
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
                System.out.println("Volume da esfera: " + volume);
        } else {
                System.out.println("Código de operação inválido. Por favor, escolha 1, 2 ou 3.");
        }

        input.close();
    }
}
