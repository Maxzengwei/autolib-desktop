/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autolib;

/**
 *
 * @author MAX
 */

import java.sql.*;

import java.util.*;


public class DataAccess {


	protected static String dbClassName = "com.microsoft.jdbc.sqlserver.SQLServerDriver";

	protected static String dbUrl = "jdbc:microsoft:sqlserver://localhost:1433;"+
	                                "DatabaseName=AutiLib;SelectMethod=Cursor";

	protected static String dbUser = "Max";

	protected static String  dbPwd = "";

	public static Connection conn = null;
	public static PreparedStatement sql = null;
	public static ResultSet res = null;
	static{
		try{
			if(conn == null){
				Class.forName(dbClassName).newInstance();
				System.out.println("Loading database success.");
				conn = DriverManager.getConnection(dbUrl,dbUser,dbPwd);
			}
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

	private DataAccess(){
	}

	public static boolean insertBook(Book book){
		try{
			boolean autoCommit = conn.getAutoCommit();
			conn.setAutoCommit(false);

			sql = conn.prepareStatement("insert into Book valuse('"+ book.getISBN()
					+"','" +book.getTitle()+"'7,'"+book.getDescription()
					+"','"+book.getAuthor()+"','"+book.getPublisher()
					+"','"+book.getDate()+"')");
			sql.executeUpdate();

		}catch(Exception ee){
			ee.printStackTrace();
		}
		return true;
	}




}

