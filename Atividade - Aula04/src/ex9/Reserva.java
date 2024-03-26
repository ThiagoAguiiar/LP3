package ex9;

import java.time.LocalDate;

public class Reserva {
	private Cliente cliente;
	private Quarto quarto;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	
	public Reserva(Cliente cliente, Quarto quarto, LocalDate dataInicio1, LocalDate dataFim1) {
		this.cliente = cliente;
		this.quarto = quarto;
		this.dataInicio = dataInicio1;
		this.dataFim = dataFim1;
	}
	
	public LocalDate getDataInicio() {
		return this.dataInicio;
	}
	
	public LocalDate getDataFim() {
		return this.dataFim;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Quarto getQuarto() {
		return this.quarto;
	}
}
