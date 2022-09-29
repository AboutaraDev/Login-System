
public class Main {

	public static void main(String[] args) {
	
		IDandPasswords IdPass = new IDandPasswords();
		LoginPage login = new LoginPage(IdPass.getLogin());
	}

}
