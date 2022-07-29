package RestApiStudy;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import com.google.gson.*;


public class RESTAPIProject {

	public static void main(String[] args) {
	
	Transcript transcript = new Transcript();
	transcript.setAudio_url("https://github.com/JustinMcLain1/Java/blob/main/restApi/preamble.wav");
	Gson gson = new Gson();
	String jsonRequest = gson.toJson(transcript);
	HttpRequest postRequest = HttpRequest.newBuilder()
			.uri(new URI("https://api.assemblyai.com/v2/transcript"))
			.header("Authorization", "API_KEY")
			.POST(BodyPublishers.ofString(jsonRequest))
			.build();
	
	HttpClient httpClient = HttpClient.newHttpClient();
	
	HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());
	//postResponse.body();
	
	transcript = gson.fromJson(postResponse.body(), Transcript.class);
	
	//System.out.print(transcript.getId());
	
	HttpRequest getRequest = HttpRequest.newBuilder()
			.uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
			.header("Authorization", "881acba1780646e2a56465944bcbdc04" )
			.GET()
			.build();
	while(true) {
		HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
		transcript = gson.fromJson(getResponse.body(), Transcript.class);	
		
		System.out.print(transcript.getStatus());
		if("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus())){
			break;
		}
	}; 
	
	
	
	System.out.println("transcript completed");
	System.out.println(transcript.getText());
	}
}


