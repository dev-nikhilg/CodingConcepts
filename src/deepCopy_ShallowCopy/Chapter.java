package deepCopy_ShallowCopy;

public class Chapter implements Cloneable {

	private int number;
	private String name;
	
	public Chapter(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public String getChapterDetails() {
		String details = "";
		details = details + "[number : " + number + ", name : " + name + "]";
		return details;
	}
}
