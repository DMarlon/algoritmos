package br.com.testeorder.main.util;

import java.util.List;

import br.com.testeorder.main.model.Pessoa;

public class PrintUtils {
	public static void imprimir(List<Pessoa> pessoas) {
		System.out.println("--------------INICIO--------------");
		for (Pessoa pessoa : pessoas)
			System.out.println("Idade:"+pessoa.getAge() +" Nome:"+pessoa.getName());

		System.out.println("--------------FIM--------------");
		System.out.println("");
	}
}
