package ex004;

import java.util.ArrayList;
import java.util.List;

public class Ex003 {
	private String[] arr;
	
	public Ex003(String[] arr) {
		this.arr = arr;
	}
	
    public void converterStringNum() {
        List<Integer> arrayInt = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++) {
            try {
                arrayInt.add(Integer.parseInt(arr[i]));
            } catch(Exception ex) {
                System.out.println("Não foi possível converter: " + arr[i]);
            }
        }

        System.out.println(arrayInt.toString());
    }
}
