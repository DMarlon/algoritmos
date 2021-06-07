package br.com.testeorder.main;

import java.util.List;

import br.com.testeorder.main.mock.MockListaPessoas;
import br.com.testeorder.main.model.Pessoa;
import br.com.testeorder.main.search.BinarySearch;
import br.com.testeorder.main.sort.QuickSort;
import br.com.testeorder.main.util.PrintUtils;

public class TesteBinarySearch {

	public static final void main(String... args){
		BinarySearch binarysearch = new BinarySearch();
		QuickSort quickSort = new QuickSort();
		List<Pessoa> pessoas = MockListaPessoas.getListaPessoas();

		quickSort.ordenar(pessoas, 0, pessoas.size()-1);
		PrintUtils.imprimir(pessoas);
		int local = binarysearch.search(pessoas, 0, pessoas.size()-1, 81);
		System.out.println(local >= 0 ? "Encontrado em: "+local : "Não encontrado");

	}
}
