package br.com.testeorder.main;

import java.util.List;

import br.com.testeorder.main.mock.MockListaPessoas;
import br.com.testeorder.main.model.Pessoa;
import br.com.testeorder.main.sort.InsertionSort;
import br.com.testeorder.main.util.PrintUtils;

public class TesteInsertionSort {
	public static final void main(String... args) {
		InsertionSort insertionsort = new InsertionSort();
		List<Pessoa> pessoas = MockListaPessoas.getListaPessoas();

		PrintUtils.imprimir(pessoas);
		insertionsort.ordenar(pessoas, 0, pessoas.size()-1);
		PrintUtils.imprimir(pessoas);
	}
}
