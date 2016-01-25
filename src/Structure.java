import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Structure {
	protected String root;

	protected static List<String> filesByName = new ArrayList<String>();
	protected static List<String> folders = new ArrayList<String>();
	protected static List<File> files = new ArrayList<File>();

	Structure(String path) {

		File dir = new File(path);
		root=path;
		dir.mkdir();
		System.out.println("File is created at " + path);
	}
	
	public void addFolders(String... args)
	{
		for (String fileName : args) {	
			folders.add(fileName);
		 }	
	}

	public void addFiles(File... args) throws IOException
	{
		for (File fileName : args) {	
			files.add(fileName);
		 }
		
	}
	
	public void addFilesByName(String... args) throws IOException
	{
		for (String fileName : args) {	
			filesByName.add(fileName);
		 }

	}
	
	public void create() throws IOException
	{
		//adding folders
		for (String fileName : folders) {
			String filePath=root+"/"+fileName;
			File dir = new File(filePath);
			dir.mkdir();
			System.out.println("Folder is created at " + filePath);  
	    }	
		
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
