package deepCopy_ShallowCopy;

import java.util.*;

public class Book implements Cloneable {

	private int id;
	private String name;
	private List<Chapter> chapters;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	public String getBookDetails() {
		String bookDetails = "";
		bookDetails = bookDetails + "[id : " + id + ", name : " + name; 
		if (chapters != null && chapters.size() > 0) {
			List<String> chapterDetails = chapters.stream().map(chapter -> chapter.getChapterDetails()).toList();
			String chapterDetailsString = String.join(", ", chapterDetails);
			bookDetails = bookDetails + ", chapters : {" + chapterDetailsString + "}";
		}
		bookDetails = bookDetails + "]";
		return bookDetails;
	}

	@Override
	protected Book clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Book) super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}