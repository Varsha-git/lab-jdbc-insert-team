package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;
import utility.ConnectionManager;

public class Main{
	
	public static void main(String[] args) throws Exception {
		
		Connection con = null;
		con = ConnectionManager.getConnection();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TeamDAO teamDAO=new TeamDAO();
		CityDAO cityDAO=new CityDAO();
		City city;
		Team team;
		
		System.out.println("Enter City Id");
		long id=Long.parseLong(br.readLine());
		
		System.out.println("Enter City Name");
		String cityName=br.readLine();
		city=new City(id,cityName);
		
		System.out.println("Enter Team ID");
		int teamid=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Team Name");
		String teamname=br.readLine();
		
		System.out.println("Enter Coach Name");
		String coachname=br.readLine();
		
		System.out.println("Enter Captain Number");
		int captainnumber=Integer.parseInt(br.readLine());
		team=new Team(teamid,teamname,coachname,city,captainnumber);
		
		teamDAO.createTeam(team);
		cityDAO.getCityByName(cityName);
		
		System.out.println("Team Details are:");
		System.out.println("NAME        COACH        CITY");
		System.out.println(team.getName()+"        "+team.getCoach()+"        "+team.getCity());
		
		con.close();
	}
}
