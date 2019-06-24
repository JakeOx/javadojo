package my.springboot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.stereotype.Service;

@Service
public class DataService {
	static final String FILE_NAME = "SpringBootUploadFile.txt";
	static final String FILE_PATH = "/Users/Jacob/";
	
	public InputStreamResource getData() throws FileNotFoundException{

        
        String fullFilePath = FILE_PATH + FILE_NAME;
		File upLoadFile = new File(fullFilePath);
		
        InputStreamResource resource = new InputStreamResource(new FileInputStream(upLoadFile));
        return resource;
	}

	public String write(Long id, String data) throws IOException{
		
	
		String fullFilePath = FILE_PATH + FILE_NAME;
		File upLoadFile = new File(fullFilePath);
		FileOutputStream fout =null;
		
		if (! upLoadFile.exists()){
    		upLoadFile.createNewFile();
    		fout = new FileOutputStream(upLoadFile);			
		}else{
			fout = new FileOutputStream(upLoadFile, true);
		}
		String enhData = appendIdtoInfo(id, data);
		
    	try{
    		fout.write(enhData.getBytes());
    		fout.close();
    	}finally{
    		fout.close();
    	}

    	return "File is upload successfully";	
	}

	
	private String appendIdtoInfo(Long id, String data) {
		String enhData = String.format("{ \"id\" :  \"%s\", \"_data\" : %s } " , id.toString(), data); 
		return enhData;
	}
	
}
