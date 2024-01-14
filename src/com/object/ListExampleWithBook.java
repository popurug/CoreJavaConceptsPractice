package com.object;

import java.util.ArrayList;
import java.util.List;

public class ListExampleWithBook {

	public static void main(String[] args) {

		//Creating list of books
		List<Book> list = new ArrayList<Book>();
		
		//Creating Books
		Book b1 = new Book(101, " C programming ", " Gopinath Popuru ", " DC publishers ", 8);
		Book b2 = new Book(102, " Java programming ", " Nishanth Bandala ", " Marvell publishers ", 4);
		Book b3 = new Book(103, " Python programming ", " ManiRam Pulipati ", " Mc Graw Hill ", 6);
		Book b4 = new Book(104, " C++ programming ", " Naveen Pathuri ", " KKR publishers ", 12);
		
		//Adding books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		//Traversing the list
		for(Book b : list)
			System.out.println(b.id + "" + b.name + "" + b.author + "" + b.publisher + "" + b.quantity);
	}

}
