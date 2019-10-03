package Model;

import java.sql.Date;
import java.util.ArrayList;

public class ToDoList {
	
	private int listId;
	private String title;
	private Date createDate;
	private ArrayList<ToDoListLines> listLines;
	
	public ToDoList() {
		setListLines(new ArrayList<ToDoListLines> ());
		
	}

	public ToDoList(int listId, String title, Date createDate, ArrayList<ToDoListLines> listLines) {
		super();
		this.listId = listId;
		this.title = title;
		this.createDate = createDate;
		this.listLines = listLines;
	}

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public ArrayList<ToDoListLines> getListLines() {
		return listLines;
	}

	public void setListLines(ArrayList<ToDoListLines> listLines) {
		this.listLines = listLines;
	}
	
	
	

}
