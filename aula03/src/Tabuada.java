import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        int num, i = 1, tab;
        String opcao = "s";

        while(opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")){
            i = 1;
            System.out.println("Digite o número da tabuada que deseja visualizar:");
            num = leitor.nextInt();
            System.out.println("Tabuada do " + num);
            while (i <= 10) { //condição => repetir enquanto a condição for verdadeira
                tab = num * i;
                System.out.println(num + "x" + i + " = " + tab);
                i++;
            }

            System.out.println("Deseja ver outra tabuada? [s,n]");
            opcao = leitorTexto.next();
        }
    }
}
