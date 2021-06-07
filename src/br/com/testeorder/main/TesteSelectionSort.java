package br.com.testeorder.main;

import java.util.List;

import br.com.testeorder.main.mock.MockListaPessoas;
import br.com.testeorder.main.model.Pessoa;
import br.com.testeorder.main.sort.SelectionSort;
import br.com.testeorder.main.util.PrintUtils;

public class TesteSelectionSort {
	public static final void main(String... args) {
		SelectionSort selectionsort = new SelectionSort();
		List<Pessoa> pessoas = MockListaPessoas.getListaPessoas();

		PrintUtils.imprimir(pessoas);
		selectionsort.ordenar(pessoas, 0, pessoas.size()-1);
		PrintUtils.imprimir(pessoas);
	}
}
