package br.com.testeorder.main.sort;

import java.util.List;

import br.com.testeorder.main.model.Pessoa;
import br.com.testeorder.main.util.ListUtil;

public class QuickSort {

	public void ordenar(List<Pessoa> pessoas, int inicio, int fim) {
		if (fim-inicio > 0) {
			int pivo = particionar(pessoas, inicio, fim);
			ordenar(pessoas, inicio, pivo-1);
			ordenar(pessoas, pivo+1, fim);
		}
	}

	private int particionar(List<Pessoa> pessoas, int inicio, int fim) {
		Pessoa pivo = pessoas.get(fim);
		int menosidade = 0;
		for (int index = 0; index < fim; index++) {
			if (pessoas.get(index).getAge() <= pivo.getAge()) {
				ListUtil.troca(pessoas, index, menosidade);
				menosidade++;
			}
		}
		ListUtil.troca(pessoas, menosidade, fim);

		return menosidade;
	}
}
