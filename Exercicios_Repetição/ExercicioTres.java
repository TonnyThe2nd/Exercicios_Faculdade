import java.util.Scanner;
public class ExercicioTres {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o ponto de partida: ");
        int start = sc.nextInt();
        sc.nextLine();
        System.out.println("Escolha o ponto de fim: ");
        int end = sc.nextInt();
        sc.nextLine();
        int soma=0;
        if(start >= end) {
            for(int i=end;i<=start;i++){
                soma+=i;
            }
        }else if (end >= start){
            for(int i=start;i<=end;i++){
                soma+=i;
            }
        }
        System.out.println("Resultado: "+soma);
    }
}
