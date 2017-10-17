package bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookBean {

	private String bookName = "";
	private int bookNum = 1;

	public BookBean() {
	}

	// 将lombok架包复制粘贴至WEBContent-(WEB-INF)-lib文件夹中，即可产生作用
	/*
	 * public void setBookName(String BookName) { this.BookName=BookName; } public
	 * String getBookName() { return this.BookName; } public void setBookNum(int
	 * BookNum) { this.BookNum=BookNum; } public int getBookNum() { return
	 * this.BookNum; }
	 */
	public BookBean(String bookName, int bookNum) {
		this.bookName = bookName;
		this.bookNum = bookNum;
	}
}
