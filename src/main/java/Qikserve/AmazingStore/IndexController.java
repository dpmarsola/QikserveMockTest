package Qikserve.AmazingStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.json.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/listProducts")
	public String listProducts()  {
		
		URL url;
		HttpURLConnection con;
		String correctJson = "";

		try {
			url = new URL("http://localhost:8081/products");
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuffer content = new StringBuffer();
			
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
			    content.append(inputLine);
			}
			
			JsonRectfier jrect = new JsonRectfier();
			correctJson = jrect.jrectfier(content.toString());
			
			in.close();
			con.disconnect();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch ( ProtocolException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
        return correctJson;
    }

	@GetMapping("/listProducts/{id}")
	public String listProductsById(@PathVariable(value="id") String id)  {
		
		URL url;
		HttpURLConnection con;
		String correctJson = "";

		try {
			url = new URL("http://localhost:8081/products/" + id);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuffer content = new StringBuffer();
			
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
			    content.append(inputLine);
			}
			
			//JsonRectfier jrect = new JsonRectfier();
			//correctJson = jrect.jrectfier(content.toString());
			
			correctJson = content.toString();
			
			in.close();
			con.disconnect();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch ( ProtocolException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
        return correctJson;
    }

}
