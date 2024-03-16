import java.util.Scanner;
import java.util.Random;
public class ExercicioNove {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
       Random val = new Random();
       int choice;
       int rand;
    do{
        rand = val.nextInt(100)+1;
        System.out.println("Escolha um valor: ");
         choice = sc.nextInt();
        if(choice != rand){
            System.out.println("Não foi dessa vez!! Tente Novamente.");
        }

       } while(choice != rand);
       System.out.println("Parabéns!!!, era o número: " + choice);
    }

}
