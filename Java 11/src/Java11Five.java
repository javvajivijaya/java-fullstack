import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Java11Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uri="https://httpbin.org/get";
		HttpRequest req=HttpRequest.newBuilder().uri(URI.create(uri)).GET().build();
		
		HttpClient cli= HttpClient.newBuilder().build();
		try {
			HttpResponse<String> resp =cli.send(req,BodyHandlers.ofString());
			System.out.println(resp.statusCode());
			System.out.println(resp.headers());
			System.out.println(resp.body());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
