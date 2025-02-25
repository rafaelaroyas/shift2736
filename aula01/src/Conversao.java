import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        /*Ocasionalmente a ONG para qual você trabalha recebe doações
         * * em dólar e precisa saber qual é o valor em reais. Crie um programa
         * que permita que o usuário digite o valor da doação e converta
         * esse valor para reais e exiba o resultado na tela.*/

        Scanner leitor = new Scanner(System.in);
        double doacaoEmDolar, valorEmReais;
        System.out.println("Qual o valor da doação em dólar: $ ");
        doacaoEmDolar = leitor.nextDouble();
        valorEmReais = doacaoEmDolar * 5.98;
        System.out.println("Valor recebido em reais R$ " + valorEmReais +
                "\nObrigada(o) pela sua doação!");
    }
}