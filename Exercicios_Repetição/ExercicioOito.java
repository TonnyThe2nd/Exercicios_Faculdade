import java.util.Scanner;
public class ExercicioOito {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número para a tabuada: ");
        int val = sc.nextInt();
        int contr = 0;
        while(contr<val){
            contr+=1;
            System.out.println(contr + " X " + val +  "= " + contr*val );
        }
    }
}
