/**Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces, 
sucos e refrigerantes. O algoritmo deve calcular o menor número de notas que deve 
ser dado de troco para um pagamento efetuado. 
O algoritmo deve ler o valor da compra e o valor pago. Se o valor pago for menor que 
o valor da compra, a máquina deve apresentar uma mensagem, informando que a 
quantia paga é insuficiente para realizar a compra. A máquina aceita apenas notas de 
R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorCompra;
        double valorPago;

        System.out.print("Valor da compra é: R$ ");
            valorCompra = input.nextDouble();
                
        System.out.print("O valor a ser pago é: R$ ");
            valorPago = input.nextDouble();
                
             double troco = valorPago - valorCompra;
                
                if (troco < 0)
                    System.out.println("Quantia paga é insuficiente para realizar a compra.");
                else
                    System.out.println("Troco: R$ " + troco);



        input.close();
    }
}
