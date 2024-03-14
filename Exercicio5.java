/**Escrever um algoritmo que leia a partir do teclado dois números reais e um dos 
símbolos de operação: + , - , * , / ou ^ . 
O algoritmo deve retornar o resultado da operação. 
Caso o símbolo informado seja diferente dos símbolos preestabelecidos, o algoritmo 
deve apresentar uma mensagem de erro, informando que o símbolo da operação é 
inválido*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        char operacao;

        
        System.out.println("Digite o primeiro número:");
            num1 = input.nextDouble();

        System.out.println("Digite o segundo número:");
            num2 = input.nextDouble();

        System.out.println("Digite o símbolo da operação (+, -, *, / ou ^):");
            operacao = input.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Símbolo de operação inválido. Use +, -, *, / ou ^.");
        }


        input.close();
    }
}
