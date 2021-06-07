package br.com.testeorder.main.sort;

import java.util.List;

import br.com.testeorder.main.model.Pessoa;
import br.com.testeorder.main.util.ListUtil;

public class InsertionSort {

	public void ordenar(List<Pessoa> pessoas, int inicio, int fim) {
		for (int index = inicio; index <= fim; index++) {
			int analisando = index;
			while (analisando > 0 && pessoas.get(analisando).getAge() < pessoas.get(analisando-1).getAge()) {
				ListUtil.troca(pessoas, analisando, analisando-1);
				analisando--;
			}
		}
	}
}
