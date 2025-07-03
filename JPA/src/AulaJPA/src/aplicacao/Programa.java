package AulaJPA.src.aplicacao;

import AulaJPA.src.dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Filipe Cutri", "filipe@gmail.com");
		Pessoa p2 = new Pessoa(2, "Maria José", "maria@gmail.com");
		Pessoa p3 = new Pessoa(3, "Antonio", "antonio@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
