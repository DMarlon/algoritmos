package br.com.testeorder.main.util;

import java.util.List;

import br.com.testeorder.main.model.Pessoa;

public class ListUtil {

	public static void troca(List<Pessoa> pessoas, int index1, int index2) {
		Pessoa pessoa1 = pessoas.get(index1);
		pessoas.set(index1, pessoas.get(index2));
		pessoas.set(index2, pessoa1);
	}
}
