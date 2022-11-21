package com.swapnil.web.dao;

import java.sql.*;
import com.swapnil.web.model.Alien;

public class AlienDao 
{

	//all the code about the jdbc connection in the DAO class, if you have the 5 table then you will be have the 5 dao classes 
	//each dao class will be have the 4 operations create, read, delete, update alian(object)
	   public Alien getAlien(int aid)
	{
		Alien a= new Alien();
		
		/*
		This was used for the without jdbc as a static data
     	a.setAid(2);
		a.setAname("Aarti");
		a.setTech(".Net");
		
		*/

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  //class name of the driver for the mysql db
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/swapnil", "root","root"); //url username passward
			//URL for Connection:- The connection URL for the mysql database is jdbc:mysql://localhost:3306/swapnil ('swapnil' is the name of database).
			
			Statement st= con.createStatement(); // to call with the database in the form of statement
			ResultSet rs=st.executeQuery("select * from alien where aid=" +aid);  // ResultSet is interface it will store in the form of table.
			
			if(rs.next())//to move to next line and check for the next line in the table.
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return a;
	}
		
}
