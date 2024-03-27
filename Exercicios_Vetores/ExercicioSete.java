import java.util.Scanner;
public class ExercicioSeteMelhorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ordem: ");
        int ordem = sc.nextInt();
        double matriz[][] = new double[ordem][ordem];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                double fati = 1, fatj = 1, fatij = 1;
                double cs =0;
                if(j==i){
                    cs = 1;
                }
                else if(j<i){
                    if(j==0){
                        cs = 1;
                    }
                    else{
                        for(int k =1; k<=i; k++){
                            fati*=k;
                            if(k<=j){
                                fatj*=k;
                            }
                            if(k<=(i-j)){
                                fatij*=k;
                            }
                        }
                        cs = fati/(fatj*fatij);
                        if(cs >2*fatij){
                        cs = 2*fatij;
                        }
                    }
                }
                matriz[i][j] = cs;
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
            }
            sc.close();
        }
}

