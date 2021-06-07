package br.com.testeorder.main.search;

import java.util.List;

import br.com.testeorder.main.model.Pessoa;

public class BinarySearch {

	public int search(List<Pessoa> pessoas, int de, int ate, int idade) {
		System.out.println("Pesquisando de "+de+" até "+ate);
		int meio = (ate+de)/2;
		Pessoa pessoa = pessoas.get(meio);

		if (pessoa.getAge() == idade)
			return meio;
		else if (de >= ate)
			return -1;
		else if (pessoa.getAge() > idade)
			return search(pessoas, de, meio-1, idade);
		else
			return search(pessoas, meio+1, ate, idade);

	}
}
