import java.util.Scanner;

public class ExercicioRodizio {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int placa; //5897
            System.out.println("Digite os dígitos da placa do veículo: ");
            placa = leitor.nextInt();
            int digito = placa % 10;
            switch (digito){
                case 1:
                case 2:
                    System.out.println("Rodízio na Segunda-feira");break;
                case 3:
                case 4:
                    System.out.println("Rodízio na Terça-feira");break;
                case 5:
                case 6:
                    System.out.println("Rodízio na Quarta-feita");break;
                case 7:
                case 8:
                    System.out.println("Rodízio na Quinta-feira");break;
                case 9:
                case 0:
                    System.out.println("Rodízio na Sexta-feira");break;
        }
}
