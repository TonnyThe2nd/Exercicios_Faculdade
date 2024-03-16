import java.util.Scanner;
public class ExercicioQuatro {

    public static void main(String[] args) {
        int soma = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=20;i++){
            System.out.println("Escolha um valor: ");
            int val = sc.nextInt();
            sc.nextLine();
            soma+=val;
        }
        System.out.println("Resultado da soma: " + soma);
    }
}
