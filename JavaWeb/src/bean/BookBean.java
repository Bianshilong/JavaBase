package bean;


public class BookBean {
	
	private String BookName="";
	private int BookNum=1;
	
	public BookBean() {
	}
	public  void setBookName(String BookName) {
		this.BookName=BookName;
	}
	public  String getBookName() {
		return this.BookName;
	}
	public  void setBookNum(int BookNum) {
		this.BookNum=BookNum;
	}
	public  int getBookNum() {
		return this.BookNum;
	}
}
