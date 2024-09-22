package AssignmentsWeek3;

public class APIClient {

	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
public void sendRequest(String endPoint, String requestBody,boolean requestStatus) {
		System.out.println(endPoint+" "+requestBody+ " "+requestStatus );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      APIClient api=new APIClient();
      api.sendRequest("www.facebook.com");
      api.sendRequest("www.facebook.com", "username", true);
	}

}
