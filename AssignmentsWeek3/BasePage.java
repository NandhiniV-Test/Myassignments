package AssignmentsWeek3;

public class BasePage {

	public void findElement() {
		System.out.println("Element is found");
	}

	public void clickElement() {
		System.out.println("Click the element");
	}

	public void enterText() {
		System.out.println("Enter the text");
	}

	public void performCommonTasks() {
		System.out.println("Wait for the page to load");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BasePage b=new BasePage();
    b.findElement();
    b.clickElement();
    b.enterText();
    b.performCommonTasks();
    
	}

}
