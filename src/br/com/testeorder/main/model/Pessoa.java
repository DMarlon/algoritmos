package br.com.testeorder.main.model;

public class Pessoa {
	private String name;
	private int age;

	public Pessoa(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String toString() {
		return this.getAge() + "-" + this.getName();
	}
}
