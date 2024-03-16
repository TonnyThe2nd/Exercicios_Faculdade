import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor para a linha: ");
        int linha = sc.nextInt();
        sc.nextLine();
        System.out.print("Valor para a coluna: ");
        int coluna = sc.nextInt();
        double[][] matriz = new double[linha][coluna];
        
        for(int i = 0; i < linha; i++) {
            int n = fat(i);
            for(int j = 0; j < coluna; j++) {
                int p = fat(j);
                int val = fat(i - j);
                double c = (double)n / (p * (double)val);
                if (c > 2 * fat(i + j)) {
                    c = 2 * fat(j + i);
                }
                matriz[i][j] = c;
            }
        } 
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
    private static int fat(int valor) {
        if (valor == 0) {
            return 1;
        }
        int fatorial = 1;
        for (int i = valor; i >= 2; i--) {
            fatorial *= i;
        }
        return fatorial;
    }
}
