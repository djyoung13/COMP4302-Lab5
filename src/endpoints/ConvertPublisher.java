package endpoints;

import javax.xml.ws.Endpoint;
import ws.ConvertImpl;

public class ConvertPublisher {

	public static void main(String[] args){
		Endpoint.publish("http://localhost:8888/ws/hello", new ConvertImpl());
	}
}
