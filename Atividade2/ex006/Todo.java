package ex006;

import java.util.ArrayList;
import java.util.List;

public class Todo {
	private List<String> tarefas = new ArrayList<String>();
	
	public Todo() {}
	
	public void adicionarTarefa(String tarefa) {
		tarefas.add(tarefa);
	}
	
	public void removerTarefa(int index) {
		tarefas.remove(index);
	}
	
	public void listarTarefas() {
		tarefas.forEach(el ->{
			System.out.println(el);
		});
	}
}
