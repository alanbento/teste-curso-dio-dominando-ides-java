package FPDio;

import FPDio.teste.Cat;

public class firstProgramDIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat(null, null, null);
		Livros books = new Livros();
		
		
		System.out.println(cat);
		System.out.println(books);
		
		
		
		/*
		int a = 2;
		int b = 3;
		System.out.println("Hello World! How you doing?");
*/
		
	}

}


class Livros {
	
	private String nome;
	private String pag;
}