package ExercicioCompras;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class CarrinhoCompra_ExVenda {
    static Produto_ExVenda pd = new Produto_ExVenda();
    public static void main(String[] args) {
        addProduto();
        comprarProduto();
    } 
    private static void comprarProduto(){
        for(ArrayList<String> produtos : pd.getLista()){
            System.out.println(produtos);
        }
        ArrayList<ArrayList<String>> lista = pd.getLista();
        
        System.out.print("Escolha um item de sua compra: ");
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        for(int i  = 0; i<pd.getLista().size();i++){
            int itemEscolhido =lista.get(i).indexOf(item);
            if(itemEscolhido != -1){
                System.out.print("Informações do item escolhido: " + pd.getLista().get(i));
                System.out.println("");
                System.out.print("Deseja comprar o produto? ");
                String escolha = sc.nextLine();
                if(escolha.equalsIgnoreCase("Sim")){
                    System.out.println("Quantidade: ");
                    int qtdItem = sc.nextInt();
                    int val = Integer.parseInt(pd.getLista().get(i).get(3)) - qtdItem;
                    if(val<=-1){
                        System.out.println("Estoque insuficiente! ");
                    }else{
                        String valFim = String.valueOf(val);
                        ArrayList<String> lista2= lista.get(i);
                        lista2.set(3, valFim);
                        System.out.print("Informações do item escolhido pós compra: " + pd.getLista().get(i));
                    }
                }

            }
        }
        sc.close();
    }
    private static void addProduto() {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens serão cadastrados?"));
        for(int i=0; i<choice; i++){
            String descr = JOptionPane.showInputDialog("Descrição: ");
            String cod = JOptionPane.showInputDialog("Codigo: ");
            String preco = JOptionPane.showInputDialog("Preço: ");
            String qtd = JOptionPane.showInputDialog("Estoque: ");  
        pd.addProduto(descr, cod, preco, qtd);
        }
    }
}
