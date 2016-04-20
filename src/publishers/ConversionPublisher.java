package publishers;

import javax.xml.ws.Endpoint;

import endpoints.ConversionService;

public class ConversionPublisher {
	public static void main(String[] args){
		final String url = "http://localhost:8888/rs";
		System.out.println("Publishing RandService at endpoint "+ url);
		Endpoint.publish(url, new ConversionService());
	}
}
