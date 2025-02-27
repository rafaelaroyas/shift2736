import java.util.Scanner;

public class VerificarPermissao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String perfilUsuario;
        System.out.println("Digite o perfil do seu usuário: ");
        perfilUsuario = leitor.nextLine();

        //equals = compara textos incluindo letras maiusculas e minusculas
        if (!(perfilUsuario.equals("administrador"))){
            System.out.println("Atenção esta permissão não tem acesso a areas administrativas");
        }

        String nome = ("Eliane");
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();

        //equalsIgnoreCase = ignora letras maiusculas ou minusculas - usados para textos
        if(nome.equalsIgnoreCase("eliane")){
            System.out.println("Bem vinda(o) " + nome);
        }
    }
}
