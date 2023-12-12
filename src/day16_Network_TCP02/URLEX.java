package day16_Network_TCP02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEX {
	public static void main(String[] args) throws IOException {
		URL google = new URL("https://www.en-core.com/");

		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
		
		String inputLine;
		while((inputLine = br.readLine()) !=null) {
			System.out.println(inputLine);
		}
		br.close();
	}

}
