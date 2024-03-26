package ex7;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Compromisso> compromissos;
	
	public Agenda() {
		compromissos = new ArrayList<Compromisso>();
	}
	
	public void adicionarCompromisso(Compromisso compromisso) {
		compromissos.add(compromisso);
	}
	
	public void listarCompromissos() {
		System.out.println("--- COMPROMISSOS ---");

		for(Compromisso c: compromissos) {
			System.out.println("Data: " + c.getData());
			System.out.println("Horário: " + c.getHora());
			System.out.println("Descrição: " + c.getDescricao());
			
			System.out.println("------");
		}
	}
}
