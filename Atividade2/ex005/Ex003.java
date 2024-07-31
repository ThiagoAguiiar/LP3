package ex005;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex003 {
	private String data1;
	private String data2;
	
	public Ex003(String data1, String data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public void mostrarProxAntData() {
        LocalDate date1 = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate date2 = LocalDate.parse(data2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        if (date1.isBefore(date2)) {
            System.out.println("A primeira data " + data1 + " é antes da segunda data " + data2);
        } else if (date1.isAfter(date2)) {
            System.out.println("A primeira data " + data1 + " é depois da segunda data " + data2);
        } else {
            System.out.println("As duas datas são iguais.");
        }
	}
}
