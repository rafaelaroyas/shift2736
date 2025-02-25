import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor do saque: R$ ");
        int quantia = leitor.nextInt();
        int nota50, nota20, nota10;
        nota50 = quantia / 50;
        quantia = quantia % 50;
        nota20 = quantia / 20;
        quantia = quantia % 20;
        nota10 = quantia / 10;
        System.out.println("Notas de R$ 50: " + nota50 +
                "\nNotas de R$ 20: " + nota20 +
                "\nNotas de R$ 10: " + nota10);
    }
}