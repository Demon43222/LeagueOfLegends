package pl.leagueoflegends.cmd.engine;

import java.util.List;

public class RCommandPermissionsException extends RCommandException {
	private static final long serialVersionUID = 4960749400702123410L;
	
	private String[] permissions;
	
	public RCommandPermissionsException(String... permissions){this.permissions = permissions;}
	public RCommandPermissionsException(List<String> permissions){this.permissions = permissions.toArray(new String[permissions.size()]);}
	
	public String[] getPermissions() {
		return permissions;
	}
}
