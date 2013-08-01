package pl.leagueoflegends.cmd.engine;

public class RCommandPlayerOfflineException extends RCommandException {
	private static final long serialVersionUID = -8835097457369485810L;
	
	private String playerName;
	
	public RCommandPlayerOfflineException(String playerName){
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}
}
