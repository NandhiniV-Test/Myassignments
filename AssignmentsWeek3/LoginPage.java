package AssignmentsWeek3;

public class LoginPage extends BasePage {
   @Override
	public void performCommonTasks() {
		System.out.println("close the window");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LoginPage lp=new LoginPage();
     lp.performCommonTasks();
	}

}
