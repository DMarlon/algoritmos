package br.com.testeorder.main;

import java.util.List;

import br.com.testeorder.main.mock.MockListaPessoas;
import br.com.testeorder.main.model.Pessoa;
import br.com.testeorder.main.sort.MergeSort;
import br.com.testeorder.main.util.PrintUtils;

public class TesteMergeSort {
	public static final void main(String... args) {
		MergeSort mergesort = new MergeSort();
		List<Pessoa> pessoas = MockListaPessoas.getListaPessoas();

		PrintUtils.imprimir(pessoas);
		mergesort.ordenar(pessoas, 0, pessoas.size());
		PrintUtils.imprimir(pessoas);
	}
}
