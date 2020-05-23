package wsPub;


import javax.xml.ws.Endpoint;

public class mainE {

	public static void main(String[] args) {
		
	
	Endpoint.publish("http://localhost:1212/ws",new demandes());		
	System.out.println("bene");
				
		
	}
	
}
