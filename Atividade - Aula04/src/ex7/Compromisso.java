package ex7;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Compromisso {
	private LocalDate data;
	private LocalTime hora;
	private String descricao;
	
	public Compromisso(LocalDate data, LocalTime hora, String descricao) {
		this.data = data;
		this.hora = hora;
		this.descricao = descricao;
	}

	public String getData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return data.format(formatter);
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
