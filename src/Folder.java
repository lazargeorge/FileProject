import java.io.File;
import java.io.IOException;

public class Folder extends AbstractFile {
	
	Folder(String path) {
		super(path);	
	}
	
	public void add(String... args) {
		
		for (String fileName : args) {	
			folders.add(fileName);
		 }	
	}

	public void create() throws IOException{
		
		//adding folders
		for (String fileName : folders) {
			String filePath=root+"/"+fileName;
			File dir = new File(filePath);
			dir.mkdir();
			System.out.println("Folder is created at " + filePath);  
	    }	
	}

}
