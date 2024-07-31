package ex005;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex002 {
	private String data;
	private int qtdDias;
	
	public Ex002(String data, int qtdDias) {
		this.data = data;
		this.qtdDias = qtdDias;
	}
	
	public void adicionarDiasData() {
        LocalDate date = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate newDate = date.plusDays(qtdDias);

        System.out.println("A nova data é: " + newDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
}
