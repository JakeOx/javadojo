package my.springboot;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	DataService dataService;

    @RequestMapping("/")
    public String heartBeat() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/post/upLoadData/{id}")
    public String addData(@RequestBody String data, @PathVariable Long id) throws IOException{
    	String status = dataService.write(id, data);
    	return status;
    }
    
    

    
    @GetMapping("/get/data")
    public ResponseEntity<Object> getData(){

    	InputStreamResource data = null;
		try {
			data = dataService.getData();
		} catch (FileNotFoundException e) {
			ResponseEntity<Object> response = (ResponseEntity<Object>) ResponseEntity.notFound();
			return response;
			
		}
    	HttpHeaders headers = new HttpHeaders();
    	headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
    	headers.add("Pragma", "no-cache");
    	headers.add("Expires", "0");

    	ResponseEntity<Object> response  = ResponseEntity.ok().headers(headers).contentType(
    			MediaType.parseMediaType("application/json")).body(data);

    	return response;
    }

}