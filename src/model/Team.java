package model;

public class Team
{
	int id;
	String name;
	String coach;
	City city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	int captain;
	
	public int getCaptain() {
		return captain;
	}
	public void setCaptain(int captain) {
		this.captain = captain;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Team(int teamid, String name, String coach, City city,int captainnumber) {
		super();
		this.id = teamid;
		this.name = name;
		this.coach = coach;
		this.city = city;
		this.captain=captainnumber;
	}
	
	
	
}
