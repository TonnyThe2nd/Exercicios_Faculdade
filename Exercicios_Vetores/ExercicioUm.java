import java.util.Scanner;
public class ExercicioUm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números deseja inserir? ");
        int num = sc.nextInt();
        int[] list = new int[num];
        for(int i=0; i<num; i++){
            System.out.print("Digite um valor: ");
            int choice = sc.nextInt();
            list[i] = choice;
            sc.nextLine();
        }
        int aux;
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if(list[i]<list[j]){
                    aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }
        System.out.println("Lista ordenada: ");
        for (int i : list) {
            System.out.print(" " + i);
        }
        sc.close();
    }
}