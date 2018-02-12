package database;


import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;



public class CallTest {
	public static void main(String[] args) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		
		// Get Text
		System.out.println(service.path("ViewStudentResultBYScore").path("getlist").path("t09").accept(MediaType.TEXT_PLAIN).get(String.class));
//		/rest/PersonalStats/getname/" + studentID 

	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri(
				"http://localhost:8080/ExaminationSystem/rest/").build();
	}

}
