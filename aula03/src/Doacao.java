import java.util.Scanner;

public class Doacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doacao = 1, valor = 0, valortotal; //i=
        System.out.println("Digite o número de doações recebidas no mês: ");
        doacao = leitor.nextInt();
        for (int i = doacao; i >= 1; i--) {
            System.out.println("Qual o valor da doação número " + i);
            valor = valor + leitor.nextInt();
        }
        System.out.println("Valor total de doações neste mês foi de R$ " + valor);
        if (valor >= 10000)
            System.out.println("Parabéns! O valor das doações é significativo para a ONG.");
        else
            System.out.println("O valor das doações precisa ser aumentado para garantir a continuidade dos projetos da ONG.");
        double projetos, media;
        System.out.println("Quantos projetos a ONG realizou este mês? ");
        projetos = leitor.nextInt();
        if (projetos >= 3)
            System.out.println("A ONG está realizando um excelente trabalho! Parabéns a toda a equipe.");
        else
            System.out.println("É importante realizar mais projetos para impactar ainda mais vidas.");
        media = valor / projetos;
        System.out.printf("\nA média de doações por projeto é de R$ %.2f", media);
        System.out.println("\nTivemos " + doacao + " doações este mês.");
        System.out.println("O total de doações foi de R$ " + valor);
        System.out.println("\nObrigada por colaborar com a ONG, contamos com você para continuar este lindo trabalho!");
    }
}
