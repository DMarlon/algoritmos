package br.com.testeorder.main.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.testeorder.main.model.Pessoa;

public final class MockListaPessoas {
	private static final List<Pessoa> pessoas = new ArrayList<Pessoa>(
					List.of(
							new Pessoa("Marlon", 31),
							new Pessoa("Paulo", 36),
							new Pessoa("Alisson", 28),
							new Pessoa("Adri", 26),
							new Pessoa("Cintia", 32),
							new Pessoa("Milton", 51),
							new Pessoa("Rejane", 49),
							new Pessoa("Anisia", 81),
							new Pessoa("Mauro", 35),
							new Pessoa("Rafa", 33),
							new Pessoa("Rosane", 25),
							new Pessoa("Rodrigo", 27),
							new Pessoa("Moacir", 52),
							new Pessoa("Sissi", 50),
							new Pessoa("Miro", 71),
							new Pessoa("Vish", 73),
							new Pessoa("Ilga", 61),
							new Pessoa("Felipe", 29),
							new Pessoa("Celio", 76),
							new Pessoa("Bruna", 38)
							)
					);

	public static List<Pessoa> getListaPessoas() {
		return pessoas;
	}
}
