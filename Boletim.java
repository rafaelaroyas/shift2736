import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, frequencia, media;

        System.out.println("Digite sua primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        nota2 = leitor.nextDouble();
        System.out.println("Digite a frequência do aluno: ");
        frequencia = leitor.nextDouble();
        media = (nota1 + nota2) /2;
        if (media >= 7 && frequencia >= 75){
            System.out.println("Aluno aprovado com média "+ media);
        }else if (media >= 5 && frequencia >= 75){
            System.out.println("aluno em exame");
            System.out.println("Digite a nota do exame: ");
            double notaExame = leitor.nextDouble();
            double novaMedia = (media + notaExame) /2;
            if (novaMedia >= 7)
                System.out.println("Aluno aprovado em exame");
            else
                System.out.println("Aluno reprovado em exame");
        }
        else{
            System.out.println("Aluno reprovado com média " + media);
        }
    }
}
