import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> intList;

    public OrdenacaoNumeros() {
        this.intList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        intList.add(numero);
    }

    public List<Integer> ordenacaoAscendente(){
        List<Integer> ordenadoAscendente = new ArrayList<>(this.intList);
        if(!intList.isEmpty()){
            Collections.sort(ordenadoAscendente);
            return ordenadoAscendente;
        }
        else{
            throw new IllegalArgumentException("A lista está vazia");
        }
    }

    public List<Integer> ordenacaoDescendente(){
        List<Integer> ordenadoDescente = new ArrayList<>(this.intList);
        if(!intList.isEmpty()){
            Collections.sort(ordenadoDescente, Comparator.reverseOrder());
            return ordenadoDescente;
        }
        else{
            throw new IllegalArgumentException("A lista está vazia");
        }

    }

    @Override
    public String toString() {
        return intList.toString();
    }


    public static void main(String[] args) {
        OrdenacaoNumeros ordenar = new OrdenacaoNumeros();

        ordenar.adicionarNumero(25);
        ordenar.adicionarNumero(5);
        ordenar.adicionarNumero(8);
        System.out.println(ordenar);
        System.out.println("---------------");
        System.out.println(ordenar.ordenacaoAscendente());
        System.out.println("---------------");
        System.out.println(ordenar.ordenacaoDescendente());

        
    }

}
