package br.com.testeorder.main.sort;

import java.util.List;

import br.com.testeorder.main.model.Pessoa;
import br.com.testeorder.main.util.ListUtil;

public class SelectionSort {

	public void ordenar(List<Pessoa> pessoas, int inicio, int fim) {
		for (int index = inicio; index < fim; index++)
			ListUtil.troca(pessoas, selecionarMenor(pessoas, index, fim), index);
	}

	private int selecionarMenor(List<Pessoa> pessoas, int inicio, int fim) {
		int indexmenor = inicio;
		for (int index = inicio; index <= fim; index++) {
			if (pessoas.get(indexmenor).getAge() > pessoas.get(index).getAge())
				indexmenor = index;
		}

		return indexmenor;
	}

}
