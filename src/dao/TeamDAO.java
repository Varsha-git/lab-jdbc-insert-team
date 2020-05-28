package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	Connection con;
	public void createTeam(Team team) throws Exception {
		con=ConnectionManager.getConnection();
		Statement statement=con.createStatement();
		statement.executeUpdate("INSERT INTO team VALUES("+team.getId()+
				",'"+team.getName()+"','"+team.getCoach()+"',"+team.getCity()+","+team.getCaptain()+")");
		System.out.println("Team Created");
	}
}
