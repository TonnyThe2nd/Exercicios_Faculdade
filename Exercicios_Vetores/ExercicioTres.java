import java.util.Scanner;
public class ExercicioTres{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho da Matriz(Linha): ");
        int linha = sc.nextInt();
        sc.nextLine();
        System.out.print("Tamanho da Matriz(Coluna): ");
        int coluna = sc.nextInt();
        int[][] matriz = new int[linha][coluna];
        for(int i = 0 ; i<linha ;i++){
           for(int j =0; j<coluna; j++){
                sc.nextLine();
                System.out.print("Valor para: [" + (i+1) + "/ " + (j+1)+"] ");
                int valor = sc.nextInt();
                matriz[i][j] = valor;
           }
        }
        for(int i = 0 ; i<linha ;i++){
            for(int j =0; j<coluna; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
