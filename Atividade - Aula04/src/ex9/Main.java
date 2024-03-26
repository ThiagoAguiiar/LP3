package ex9;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		
		Cliente cliente = new Cliente("341", "Thiago Aguiar");
		Quarto quarto = new Quarto(2);
		
		Quarto quarto2 = new Quarto(3);
		
        LocalDate dataInicio1 = LocalDate.of(2023, 2, 12);
        LocalDate dataFim1 = LocalDate.of(2023, 3, 12);
        
        LocalDate dataInicio2 = LocalDate.of(2024, 2, 12);
        LocalDate dataFim2 = LocalDate.of(2024, 3, 12);
        
		Reserva reserva1 = new Reserva(cliente, quarto, dataInicio1, dataFim1);
		Reserva reserva2 = new Reserva(cliente, quarto2, dataInicio2, dataFim2);
		
		hotel.adicionarReserva(reserva1);
		hotel.adicionarReserva(reserva2);
		hotel.adicionarReserva(reserva1);

		hotel.listarReservas();
	}

}
