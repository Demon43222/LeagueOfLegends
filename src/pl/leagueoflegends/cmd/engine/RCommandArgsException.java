package pl.leagueoflegends.cmd.engine;

public class RCommandArgsException extends RCommandException {
	private static final long serialVersionUID = -3566603725221660729L;
	
	private String syntax;
	
	public RCommandArgsException(String syntax){this.syntax = syntax;}

	public String getSyntax() {
		return syntax;
	}
}