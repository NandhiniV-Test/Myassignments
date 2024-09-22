package AssignmentsWeek3;

public class LoginTestData extends TestData{

	
	public void enterUsername() {
		System.out.println("Enter username");
	}
    public void password() {
		System.out.println("enter password");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LoginTestData l=new LoginTestData();
      l.enterCredentials();
      l.navigateToHomePage();
      l.enterUsername();
      l.password();
	}

}
