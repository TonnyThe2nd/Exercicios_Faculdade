import java.util.Scanner;
import java.util.ArrayList;

public class ExercicioDois {
        public static void main(String[] args) {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> listUm = new ArrayList<>();
            int countUm = 0;
            int countDois = 0;
            int countTres = 0;
            int countQuatro = 0;
            int countCinco = 0;
            int total;
            for(int i=0;i<=50;i++){
                System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                listUm.add(idade);
            }              
            for(int i=0; i<=listUm.size();i++){
                if (0>listUm.indexOf(i) && listUm.indexOf(i)<=15){
                    countUm+=1;
                }else if (16>listUm.indexOf(i)&& listUm.indexOf(i)<=30){
                    countDois+=1;
                } else if (31>listUm.indexOf(i)&& listUm.indexOf(i)<=45){
                    countTres+=1;
                } else if (46>listUm.indexOf(i)&& listUm.indexOf(i)<=60){
                    countQuatro+=1;
                } else if (listUm.indexOf(i)>60){
                    countCinco+=1;
                }
            }
            total = countUm + countDois + countTres + countQuatro+countCinco;
            System.out.println("Pessoas entre 0 e 15 anos: " + (countUm/total)*100+"%");
            System.out.println("Pessoas entre 16 e 30 anos: " + (countDois/total)*100+"%");
            System.out.println("Pessoas entre 31 e 45 anos: " + (countTres/total)*100+"%");
            System.out.println("Pessoas entre 46 e 60 anos: " + (countQuatro/total)*100+"%");
            System.out.println("Pessoas com mais de 60 anos:  " + (countCinco/total)*100+"%");
        }
}
