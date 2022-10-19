package deepCopy_ShallowCopy;

import java.util.*;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		// Creating copy of primitive variables
		createCopyOfPrimitiveVariable();
		
		// Creating copy of custom java class
		createCopyOfCustomJavaClass();
	}
	
	private static void createCopyOfCustomJavaClass() throws CloneNotSupportedException {
		Book b1 = new Book();
		b1.setId(1001);
		b1.setName("HP Part 1");
		
		List<Chapter> chapters = new ArrayList<>();
		chapters.add(new Chapter(1, "Chapter 1"));
		chapters.add(new Chapter(2, "Chapter 2"));
		chapters.add(new Chapter(3, "Chapter 3"));
		
		b1.setChapters(chapters);
		
		System.out.println("Printing initial value of b1");
		System.out.println(b1.getBookDetails());
		System.out.println(b1);
		
		// Creating copy
		
		// Creating copy using assignment operator
		// Book b2 = b1;
		
		// Creating copy using clone method
		// Book b2 = b1.clone();
		
		// Creating copy manually
		Book b2 = new Book();
		b2.setId(b1.getId());
		b2.setName(b1.getName());
		
		List<Chapter> newChaptersList = new ArrayList<>();
		for (Chapter chapter: b1.getChapters()) {
			Chapter newChapter = new Chapter(chapter.getNumber(), chapter.getName());
			newChaptersList.add(newChapter);
		}
		b2.setChapters(newChaptersList);
		
		System.out.println("Printing initial value of b2");
		System.out.println(b2.getBookDetails());
		System.out.println(b2);
		
		// Changing values
		b1.setId(1111);
		b1.getChapters().get(0).setNumber(9);
		
		// Print updated values
		
		System.out.println("######################################################################");
		System.out.println("######################################################################");
		System.out.println("######################################################################");
		
		System.out.println("Printing changed value of b1");
		System.out.println(b1.getBookDetails());
		System.out.println(b1);
		
		System.out.println("Printing value of b2");
		System.out.println(b2.getBookDetails());
		System.out.println(b2);
		
		// Print references for the chapters
		System.out.println("######################################################################");
		System.out.println("######################################################################");
		System.out.println("######################################################################");
		System.out.println(b1.getChapters());
		System.out.println(b2.getChapters());
	}
	
	private static void createCopyOfPrimitiveVariable() {
		int a = 10;
		
		int b = a;
		
		// Lets print the values
		System.out.println(a);
		System.out.println(b);
		
		// Lets try and change the value
		a = 11;
		
		// Lets print the values after change
		System.out.println(a);
		System.out.println(b);
	}
}
