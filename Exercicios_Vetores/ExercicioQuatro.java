import java.util.Scanner;
public class ExercicioQuatro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho da Matriz(Linha): ");
        int linha = sc.nextInt();
        sc.nextLine();
        System.out.print("Tamanho da Matriz(Coluna): ");
        int coluna = sc.nextInt();
        int[][] matriz = new int[linha][coluna];
        boolean principal = false;
        for(int i = 0 ; i<linha ;i++){
           for(int j =0; j<coluna; j++){
                sc.nextLine();
                System.out.print("Valor para: [" + (i+1) + "/ " + (j+1)+"] ");
                int valor = sc.nextInt();
                matriz[i][j] = valor;
                if(i==j){
                    if (matriz[i][j]==1) {
                        principal = true;
                    }else{
                        principal = true;
                    }
                }
           }
        }
        if (principal == true) {
            System.out.println("A matriz fornecida é quadrada!");
        }else{
            System.out.println("A matriz fornecida não é quadrada!");
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
