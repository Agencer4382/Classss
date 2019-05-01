package com.April20;

public class BankTest {

	public static void main(String[] args) {
		Bank dep;
		dep=new BankA();
		System.out.println(dep.getBalance());
		dep=new BankB();
		System.out.println(dep.getBalance());
		dep=new BankC();
		System.out.println(dep.getBalance());
		

	}

}
