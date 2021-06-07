package br.com.testeorder.main;

import java.util.List;

import br.com.testeorder.main.mock.MockListaPessoas;
import br.com.testeorder.main.model.Pessoa;
import br.com.testeorder.main.sort.QuickSort;
import br.com.testeorder.main.util.PrintUtils;

public class TesteQuickSort {
	public static final void main(String... args) {
		QuickSort quicksort = new QuickSort();
		List<Pessoa> pessoas = MockListaPessoas.getListaPessoas();

		PrintUtils.imprimir(pessoas);
		quicksort.ordenar(pessoas, 0, pessoas.size()-1);
		PrintUtils.imprimir(pessoas);
	}
}
