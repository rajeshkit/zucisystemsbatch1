package zuci.demo;

public class Team {
	
	public Player player; //byType
	
	
	
	public Team(Player pla) {
		super();
		this.player = pla;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public void showTeam() {
		System.out.println("show team method");
		player.showPlayer();
	}
}
