package ex003;

import java.util.Random;

public class Ex002 {
	public static int gerarAleatorio() {
		int random = new Random().nextInt((100 - 0) + 1) + 1;
		return random;
	}
}
