import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefalist;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefalist){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefalist.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefalist);
    }
}
