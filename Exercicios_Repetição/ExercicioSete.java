import java.util.Scanner;
public class ExercicioSete{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int val = 0;
        int soma = 0;
        while(true){
            System.out.println("Escolha um valor: ");
            val = sc.nextInt();
            if(val<=-1){
                break;
            }else{
            soma+=val;
            }
        }
        System.out.println("Resultado da soma: " + soma);
    }
}