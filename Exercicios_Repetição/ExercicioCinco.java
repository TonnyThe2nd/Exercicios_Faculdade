import java.util.Scanner;
public class ExercicioCinco {
    public static void main(String[] args) {
        System.out.println("Escolha um limite: ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int limite = sc.nextInt();
        int i =0;
        while(i<=limite){
            System.out.println(" Valor: " + i);
        }
    }
}
