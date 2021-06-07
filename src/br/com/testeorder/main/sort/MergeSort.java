package br.com.testeorder.main.sort;

import java.util.ArrayList;
import java.util.List;

import br.com.testeorder.main.model.Pessoa;

public class MergeSort {

	public void ordenar(List<Pessoa> pessoas, int inicio, int fim) {
		if (fim-inicio > 1) {
			int meio = (inicio+fim)/2;
			ordenar(pessoas, inicio, meio);
			ordenar(pessoas, meio, fim);
			merge(pessoas, inicio, meio, fim);
		}
	}

	private void merge(List<Pessoa> pessoas, int inicio, int meio, int fim) {
		int atualinicio = inicio;
		int atualfim = meio;
		List<Pessoa> novalista = new ArrayList<Pessoa>();
		while (atualinicio < meio && atualfim < fim) {
			if (pessoas.get(atualinicio).getAge() < pessoas.get(atualfim).getAge()) {
				novalista.add(pessoas.get(atualinicio));
				atualinicio++;
			} else {
				novalista.add(pessoas.get(atualfim));
				atualfim++;
			}
		}

		while (atualinicio < meio) {
			novalista.add(pessoas.get(atualinicio));
			atualinicio++;
		}

		while (atualfim < fim) {
			novalista.add(pessoas.get(atualfim));
			atualfim++;
		}

		for (int index = 0; index < (fim-inicio); index++)
			pessoas.set(inicio+index, novalista.get(index));
	}
}
