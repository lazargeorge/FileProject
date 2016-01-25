import java.io.File;
import java.io.IOException;

public class ClientStructure {

	
	
	public static void main(String[] args) throws IOException {
	
	   Structure structure =  new Structure("C:/file1");
		
	 File[] files = {
	               new File("file.txt"), 
	               new File("file.docx")
	               };
		String[] folders = {"name1", "name2"};
	    
	   structure.addFiles(files);
       structure.addFolders(folders);
       
       structure.addFolders("name3");
       structure.addFolders("name4");
       structure.addFolders("name5");
       
       
       structure.create();
       
		
		    
		AbstractFile afiles = new MyFile("C:/file1");
		AbstractFile afolders = new Folder("C:/file1");
		
		afiles.add("a.txt");
		afiles.addFiles(files);
		afolders.add(folders);
		afiles.create();

	}
	
	
}
