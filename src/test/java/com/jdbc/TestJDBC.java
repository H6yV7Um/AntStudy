package com.jdbc;

import java.sql.*;

import org.junit.Test;

public class TestJDBC {
	// JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/ant_study";
 
    // 数据库的用户名与密码
    static final String USER = "root";
    static final String PASS = "root";
	@Test
	public void test() {

	 
	        Connection conn = null;
			Statement  stmt = null;
	        try{
	            // 注册 JDBC 驱动
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            System.out.println("成功加载MySQL驱动程序");
	        
	            // 打开链接
	            conn = DriverManager.getConnection(DB_URL,USER,PASS);
				// conn = DriverManager.getConnection("jdbc:mysql://gatehta.jed.jddb.com:3358/jupyter_db?" + "user=jupyter_db_rw&password=JXRxivXybFvVARRn");
	            System.out.println("连接数据库成功...");
	            stmt=conn.createStatement();
	            ResultSet rs=stmt.executeQuery("select * from user");
	            while(rs.next()){
	            	System.out.println(rs.getString("username")+"  "+rs.getString("password"));
	            }
	        
	            conn.close();
	        }catch(SQLException se){
	            se.printStackTrace();
	        }catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            try{
	                if(stmt!=null) stmt.close();
	            }catch(SQLException se2){
	            }
	            try{
	                if(conn!=null) conn.close();
	            }catch(SQLException se){
	                se.printStackTrace();
	            }
	        }
	        System.out.println("Goodbye!");

	}
}
