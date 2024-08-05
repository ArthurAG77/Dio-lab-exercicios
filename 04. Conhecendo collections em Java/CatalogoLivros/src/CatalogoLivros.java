import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroslist;

    CatalogoLivros(){
        this.livroslist = new ArrayList<>();
    }

    public void adicionarItem(String titulo, String autor, int anoDePublicacao ){
        livroslist.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroslist.isEmpty()){
            for(Livro l: livroslist){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroslist.isEmpty()){
            for(Livro l : livroslist){
                if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroportitulo = null;
        if(!livroslist.isEmpty()){
            for(Livro l: livroslist){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroportitulo = l;
                    break;
                }
            }
        }
        return livroportitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarItem(null, null, 0);
    }

}
