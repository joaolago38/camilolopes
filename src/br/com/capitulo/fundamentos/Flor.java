package br.com.capitulo.fundamentos;

public class Flor {
	enum Floresta {
		LEAO, LEOA, TRIGRE
	}

	public static void main(String[] args) {
		Floresta f = Floresta.LEAO;
		System.out.println(f.toString());
	}
}
