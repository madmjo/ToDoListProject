package Model;

import java.sql.Date;

public class ToDoListLines {
	
	private ToDoList listId;
	private String task;
	private Date dueDate;
	
	
	public ToDoListLines() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ToDoListLines(ToDoList listId, String task, Date dueDate) {
		super();
		this.listId = listId;
		this.task = task;
		this.dueDate = dueDate;
	}


	public ToDoList getListId() {
		return listId;
	}


	public void setListId(ToDoList listId) {
		this.listId = listId;
	}


	public String getTask() {
		return task;
	}


	public void setTask(String task) {
		this.task = task;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}
