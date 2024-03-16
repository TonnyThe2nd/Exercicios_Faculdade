import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamanho da lista: ");
        int qtd = sc.nextInt();
        int[] list = new int[qtd];
        for(int i=0; i<list.length; i++){
            list[i] = i+1;
        }
        sc.nextLine();
        System.out.println("Vezes de rotação: ");
        int rot = sc.nextInt();
        int aux;
        for(int i=0; i<rot; i++){
            aux = list[qtd-1];
            for(int j=list.length-1;j>=1;j--){
                list[j] = list[j-1];
            }
            list[0] = aux;
        }
        System.out.println("Resultado ");
        for(int x : list){
            System.out.print(" " + x);
        }
        sc.close();
    }
}
