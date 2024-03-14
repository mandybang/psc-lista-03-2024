/**Crie um algoritmo que leia dois números inteiros e realize o sorteio de um número 
aleatório. O algoritmo deve validar qual é o menor e o maior número informado pelo 
teclado, para que independente da ordem que o usuário digite os números, consiga 
realizar o sorteio.
Se o algoritmo gerar um número par, escreva na tela o número gerado e informe que 
ele é par. Se o algoritmo gerar um número ímpar, escreva na tela o número gerado e 
que ele é um número ímpar.
*/

import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerar = new Random();

        int n1;
        int n2;


        System.out.println("Digite o primeiro número inteiro:");
            n1 = input.nextInt();

        System.out.println("Digite o segundo número inteiro:");
            n2 = input.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);
        int numeroSorteado = gerar.nextInt(maior);

        System.out.println("Número sorteado: " + numeroSorteado);

        if (numeroSorteado % 2 == 0) {
            System.out.println("É um número par.");
        } else {
            System.out.println("É um número ímpar.");
        }


        input.close();
    }
    
}
