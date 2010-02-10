/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autolib;


public class Book {
	private String ISBN;
	private String Title;
	private String Description;
	private String Author;
	private String Publisher;
	private String Date;

	public Book(){

	}

	public String getISBN(){
		return ISBN;
	}

	public void setISBN(String str){
		this.ISBN = str;
	}

	public String getTitle(){
		return Title;
	}

	public void setTitle(String str){
		this.Title = str;
	}

	public String getDescription(){
		return Description;
	}

	public void setDescription(String str){
		this.Description = str;
	}

	public String getAuthor(){
		return Author;
	}

	public void setAuthor(String str){
		this.Author = str;
	}

	public String getPublisher(){
		return Publisher;
	}

	public void setPublisher(String str){
		this.Publisher = str;
	}

	public String getDate(){
		return Date;
	}

	public void setDate(String str){
		this.Date = str;
	}
}
