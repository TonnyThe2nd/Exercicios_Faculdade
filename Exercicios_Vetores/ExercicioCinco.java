import java.util.Scanner;
public class ExercicioCinco {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ordem da matriz: [Linha e [Coluna]]");
        int linha = sc.nextInt();
        int[][] matriz = new int[linha][linha];
        int dpSoma = 0;
        int dsSoma = 0;
        int tSoma = 0;
        int tsSoma = 0;
        for(int i = 0 ; i<linha ;i++){
           for(int j =0; j<linha; j++){
                sc.nextLine();
                System.out.print("Valor para: [" + (i+1) + "/ " + (j+1)+"] ");
                int valor = sc.nextInt();   
                matriz[i][j] = valor;
                if(i==j){
                    dpSoma+=matriz[i][j];
                    dsSoma+=matriz[i][linha+1-i];
                }else if(i>j){
                    tSoma+=matriz[i][j];
                }else if(j>i){
                    tsSoma+=matriz[i][j];
                }
           }
        }
        for(int i = 0 ; i<linha ;i++){
            for(int j =0; j<linha; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Soma da Diagonal Principal: " + dpSoma);
        System.out.println("Soma da Diagonal Secundária: " + dsSoma);
        System.out.println("Soma do Triângulo Inferior: " + tsSoma);
        System.out.println("Soma do Triângulo Superior: " + tSoma);
        sc.close();
   }    
}
