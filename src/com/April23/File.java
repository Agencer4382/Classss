package com.April23;

public abstract class File{ 
	public abstract void open();
	
	public void close() {
		
	}
	public void edit() {	
	}
}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open .java file we need notepad++");	
	}	
}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open .doc file we need microsoft word to be installed");	
	}	
}
class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("To open .pdf we need adobe pdf reader");
		
	}
	
}
