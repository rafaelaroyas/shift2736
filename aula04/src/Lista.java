import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Eliane");
        nomes.add(1,"Daniel");
        nomes.add("Rafaela");
        //System.out.println(nomes);

        //for (inicialização; condição; incremento){}
        /*for (int i=0; i<nomes.size(); i++){
            System.out.println(nomes.get(i);
        }*/

        //para cada nome do tipo string da coleção de nomes faça
        for (String nome : nomes){
            if (nome.equalsIgnoreCase("Rafaela")){ //para achar um nome especifico
                System.out.println(nome);
                break;
            }
        }

        ArrayList<Integer> numeros = new ArrayList<>();
        for (Integer num : numeros){
            System.out.println(num);
        }
    }
}