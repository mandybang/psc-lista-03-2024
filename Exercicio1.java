/** 1- Escreva um algoritmo que leia 3 números a partir do teclado. 
O algoritmo deve apresentar:
a. O maior número.
b. O menor número.
c. A média aritmética dos três números */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n1;
        int n2;
        int n3;

        System.out.println("Digite um número: ");
            n1 = input.nextInt();

        System.out.println("Digite outro número: ");
            n2 = input.nextInt();

        System.out.println("Digite o último número: ");
            n3 = input.nextInt();

        if (n1>=n2 && n1>=n3)
            System.out.println("\nO maior número é: " +n1);
        else if (n2>=n3)
            System.out.println("\nO maior número é: " +n2);
        else 
            System.out.println("\nO maior número é: "+ n3);
        
        if (n1 <= n2 && n1 <= n3)
            System.out.println("O menor número é: " + n1);
        else if (n2 <= n3)
            System.out.println("O menor número é: " + n2);
        else
            System.out.println("O menor número é: " + n3);


        double mediaA = (n1+n2+n3)/3;

            System.out.println("A média aritmética dos três números digitados é: " + mediaA);


        input.close();
    }
    
}