package AssignmentsWeek1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int firstnum=0;
		int secondnum=1;
		int nextnum;
		
		for (int i = 1; i <=range; i++) {
			System.out.print(firstnum +",");
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			
			
		}

	}

}
