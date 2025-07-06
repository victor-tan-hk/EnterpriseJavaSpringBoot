package com.exercise.rest;

public class Hero {
	
	private String name;
	private int age;
	private String superPower;
	
	public Hero(String name, int age, String superPower) {
		super();
		this.name = name;
		this.age = age;
		this.superPower = superPower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", age=" + age + ", superPower=" + superPower + "]";
	}

	

}
