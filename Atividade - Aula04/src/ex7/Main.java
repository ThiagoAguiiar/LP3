package ex7;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Compromisso c = new Compromisso(LocalDate.of(2023, 10, 20), LocalTime.of(13, 0, 2), "Teste Agenda");
		Agenda agenda = new Agenda();
		
		agenda.adicionarCompromisso(c);
		agenda.adicionarCompromisso(c);

		agenda.listarCompromissos();
	}

}
