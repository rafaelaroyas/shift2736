import java.util.Scanner;

public class Juncao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //1. ler 2 vetores de inteiros com 4 posições
        //2. Criar um 3 vetor que é a junção dos dois
        //3. Criar um 4 vetor que será o vetA invertido

        /*vetA = 2,8,9,3;
        vetB = 9,5,6,7;
        vetC = 2,8,9,3,9,5,6,7;
        vetD = 3,9,8,2;*/

        int[] vetA = new int[4];
        int[] vetB = new int[4];
        int i;
        System.out.println("\nPreenchendo o vetor A");
        for (i=0; i<vetA.length; i++){
            System.out.println("Digite o " + (i+1) + "° valor: ");
            vetA[i] = leitor.nextInt();
        }

        System.out.println("\nPreenchendo o vetor B");
        for (i=0; i<vetB.length; i++){
            System.out.println("Digite o " + (i+1) + "° valor: ");
            vetB[i] = leitor.nextInt();
        }

        //2. Criar um 3 vetor que é a junção dos dois
        int[] vetC = new int[8];

        for (i=0; i < vetA.length; i++){
            vetC[i] = vetA[i];
            vetC[i+4] = vetB[i];
        }
        for (i=0; i < vetC.length; i++){
            System.out.println(vetC[i]);
        }

        //3. Criar um 4 vetor que será o vetA invertido
        int[] vetD = new int[4];
    }
}