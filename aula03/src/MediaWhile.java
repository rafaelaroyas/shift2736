import java.util.Scanner;

public class MediaWhile {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            double somaAlturas=0.0, media;
            int contador = 1; //inicialização
            while (contador <= 6) {
                System.out.println("Digite a altura do " + contador + "º aluno");
                somaAlturas = somaAlturas + leitor.nextDouble();
                contador++; //incremento | contador = contador +1;
            }

            media = somaAlturas/6;
            System.out.println("A media de altura dos alunos é de " + media);
            leitor.close();

        }
}
