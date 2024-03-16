import java.util.Scanner;
public class ExercicioSeis {
    public static void main(String[] args) {
        System.out.print("Quantos alunos serão cadastrados? ");
        Scanner sc = new Scanner(System.in);
        int quant = sc.nextInt();

        String[] nomes = new String[quant];
        double[][] notas = new double[quant][3];
        for(int i = 0; i<quant;i++){
            sc.nextLine();
            System.out.print("Insira o nome do aluno: ");
            String name = sc.nextLine();
            nomes[i] = name;

            for(int j=0;j<=2;j++){
                System.out.print("Insira a "+ j + "ª nota: ");
                double nota = sc.nextDouble();
                notas[i][j]= nota;

            }
        }
        System.out.println("Alunos aprovados: ");
        for(int i = 0; i<quant;i++){
            double media = 0;
            for(int j = 0; j<=2;j++){
                media+=notas[i][j];
            }
            media/=3;
            if(media>=7){
                System.out.println(nomes[i]+" Aprovado com: " + media);
            }
        }
        sc.close();
    }   
}
