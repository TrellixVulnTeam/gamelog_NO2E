package gamelog.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "games")
@Entity
public class TopGames {
	
	@Id
	@Column(name="gameid")
	private int gameid;
	
	@Column
	private String gamename;
	@Column
	private double playtime;

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	public double getPlaytime() {
		return playtime;
	}

	public void setPlaytime(double playtime) {
		this.playtime = playtime;
	}

}
