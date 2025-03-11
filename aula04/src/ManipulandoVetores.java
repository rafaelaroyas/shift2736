import java.lang.reflect.Array;
import java.util.Arrays;

public class ManipulandoVetores {
    public static void main(String[] args) {
        String[] alunos = {"Anderson", "William", "Roberto", "Pedro", "Matheus",
                "Gabriela", "Joao", "Rafael", "Gabriela" };
        System.out.println("Exibindo os elementos do vetor: ");
        for (int i=0; i < alunos.length; i++){
            System.out.println(alunos[i]);
        }

        System.out.println("------------\nOrdenando o vetor");
        Arrays.sort(alunos); //organiza em ordem alfabetica
        for (int i=0; i<alunos.length; i++){
            System.out.println(alunos[i]);
        }
    }
}