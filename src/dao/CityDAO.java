package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO
{
	public City getCityByName(String name) throws Exception
	{
	Connection con = ConnectionManager.getConnection();
	
	Statement stmt=  con.createStatement();
	
	ResultSet rs =stmt.executeQuery("select * from citynames ");
	
	while(rs.next()) {
		if(rs.getString("name").equals(name)) {
			System.out.println(rs.getInt("id"));
		}
	}	
	return null;
	
}

}
