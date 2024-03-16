package ExercicioCompras;

import java.util.ArrayList;
public class Produto_ExVenda{
    private ArrayList<String> sup = new ArrayList<>();
    private ArrayList<ArrayList<String>> list = new ArrayList<>();
    public void addProduto(String descr, String codigo, String preco, String quantidade){
        sup.add(descr);
        sup.add(codigo);
        sup.add("R$ " +preco);
        sup.add(quantidade);
        list.add(sup);

    }
    public ArrayList<ArrayList<String>> getLista(){
        return list;
    }
}