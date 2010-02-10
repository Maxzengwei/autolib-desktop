/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autolib;

/**
 *
 * @author MAX
 */
public class Test {
	public static void main(String[] args){
		Book b = new Book();
		b.setISBN("111");
		b.setAuthor("eee");
		b.setDate("3333");
		b.setDescription("good");
		b.setTitle("NEW");
		b.setPublisher("guangdian");
		System.out.print("TTTTTT");
		DataAccess.insertBook(b);

	}
}

