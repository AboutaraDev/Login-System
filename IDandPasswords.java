import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> IDandPass = new HashMap<String, String>();
	
	IDandPasswords() {
		
		IDandPass.put("Mar", "123");
		IDandPass.put("Marou", "1425");
		IDandPass.put("Marouane", "marouane9");
	}
	
	HashMap<String, String> getLogin() {
		
		return IDandPass;
	}
}
