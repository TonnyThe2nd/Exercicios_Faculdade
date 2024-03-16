import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String senha = "Antonio123";
        String senhaDigitada = "";
        while(!(senha.equals(senhaDigitada))){
            System.out.println("Digite a senha: ");
            senhaDigitada = sc.nextLine();
        }
        
    }
}
