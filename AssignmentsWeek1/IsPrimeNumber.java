package AssignmentsWeek1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int count=0;
		for (int i = 2; i <=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
     if(count<=2) {
    	 System.out.println("Prime");
     }else if(count>2) {
    	 System.out.println("Non-prime");
     }
	}

}
