import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CarrinhoDeCompras {
    private List<Item> itensList;

    public CarrinhoDeCompras(){
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade){
        itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itensList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itensList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valor = 0d;
        if(!itensList.isEmpty()){
            for(Item item : itensList){
                valor += item.getPreco()*item.getQuantidade();
            }
            return valor;
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){
        System.out.println(itensList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("banana", 5.00, 5);
        carrinhoDeCompras.adicionarItem("tucunare", 5.00, 5);
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
