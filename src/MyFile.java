import java.io.File;
import java.io.IOException;

public class MyFile extends AbstractFile {
		MyFile(String path) {
		super(path);
	}

	public void add(String... args){
		//adding files by name(which is a string)
		for (String fileName : args) {	
			filesByName.add(fileName);
		 }
	}
	
	public void addFiles(java.io.File... args) {	
		for (File fileName : args) {	
			files.add(fileName);
		 }
	}
	
	public void create() throws IOException{
		
		//adding files by name
		for (String fileName : filesByName) {
			String filePath=root+"/"+fileName;
			File dir = new File(filePath);
			dir.getParentFile().mkdirs(); 
			dir.createNewFile();
			System.out.println("File is created at " + filePath);
	    }	
		
		//adding files
		for (File f : files) {	
			String path = f.getPath();
			String filePath=root+"/"+path;
			File dir = new File(filePath);
			dir.getParentFile().mkdirs(); 
			dir.createNewFile();	
			System.out.println("File is created at " + filePath);
	    }	
	}

}
