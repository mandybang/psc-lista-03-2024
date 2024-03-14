/**Escreva um algoritmo que resolva uma equação de segundo grau, realizando a 
verificação de consistência dos valores dos coeficientes ("a", "b" e "c") e do 
discriminante (delta).
a. Se os coeficientes "a" e "b" forem iguais a zero e o coeficiente "c" for diferente de 
zero, apresentar a mensagem "Coeficientes informados incorretamente.".
b. Caso o coeficiente "a" seja igual a zero e o coeficiente "b" for diferente de zero, 
deverá ser impressa a mensagem: "Essa é uma equação de primeiro grau" e deverá 
ser informado o valor da raiz real da equação.
c. Caso o discriminante seja negativo, deverá ser impressa a mensagem: "Esta 
equação não possui raízes reais".
d. Caso o discriminante seja zero, apresentar a mensagem "Esta equação possui duas 
raízes reais iguais. " e informar o valor das raízes da equação.
e. Caso o discriminante seja maior que zero, apresentar a mensagem "Esta equação 
possui duas raízes reais diferentes. " e informar o valor das raízes da equação.
Equação do segundo grau: ax² + bx + c = 0
Discriminante: delta = b² – 4ac
*/


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;

            System.out.println("Digite o primeiro coeficiente da equação de segundo grau:");
                a = input.nextDouble();
            System.out.println("Digite o segundo coeficiente da equação de segundo grau:");
                b = input.nextDouble();
            System.out.println("Digite o terceiro coeficiente da equação de segundo grau:");
                c = input.nextDouble();
        
        double delta = b * b - 4 * a * c;
        
           if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double raiz = -c / b;
            System.out.println("Valor da raiz real: " + raiz);
        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Esta equação possui duas raízes reais iguais: " + raiz1);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Esta equação possui duas raízes reais diferentes:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

        input.close();
    }
    
}
