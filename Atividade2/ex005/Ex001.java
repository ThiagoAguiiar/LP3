package ex005;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex001 {
	private String data1;
	private String data2;
	
	public Ex001(String data1, String data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	
	public void calcularVariacaoData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate startDate = LocalDate.parse(this.data1, formatter);
        LocalDate endDate = LocalDate.parse(this.data2, formatter);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Diferença em dias: " + daysBetween);
	}
}
