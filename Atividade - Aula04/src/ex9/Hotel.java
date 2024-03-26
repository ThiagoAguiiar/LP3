package ex9;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private List<Reserva> reservas;

	public Hotel() {
		reservas = new ArrayList<Reserva>();
	}

	public List<Reserva> getReservas() {
		return reservas;
	}
	
	public void adicionarReserva(Reserva reserva) {
		if (reservaDisponivel(reserva)) {
			reservas.add(reserva);
			
			System.out.println("Reserva adicionada com sucesso!");
		} else {
			System.out.println("Reserva indisponível. Este quarto foi reservado por outra pessoa");
		}
	}

	public boolean reservaDisponivel(Reserva reserva) {
	    if (reservas.isEmpty()) return true;
	    
	    for (Reserva r : reservas) {
	        if (r.getQuarto().getNumeroQuarto() == reserva.getQuarto().getNumeroQuarto()) {
	            if (!(reserva.getDataFim().isBefore(r.getDataInicio()) || reserva.getDataInicio().isAfter(r.getDataFim()))) {
	                r.getQuarto().setDisponivel(false);
	                return false; 
	            }
	        }
	    }
	    
	    return true; 
	}
	
	public void listarReservas() {
		for(Reserva r: reservas) {
			System.out.println("-------------- RESERVA " + (reservas.indexOf(r) + 1) + "--------------");
			System.out.println("Nome: " + r.getCliente().getNome());
			System.out.println("Quarto: " + r.getQuarto().getNumeroQuarto());
			System.out.println("Período: " + r.getDataInicio() + " a " + r.getDataFim());
			System.out.println("\n");
		}
	}
}
