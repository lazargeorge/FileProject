import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientStructure {

	protected String root;
//	protected String [] filesByName;
	protected static List<String> filesByName = new ArrayList<String>();
	protected static List<String> folders = new ArrayList<String>();
	protected static List<File> files = new ArrayList<File>();

//	protected String [] folders;
//	protected File[] files;
	
	ClientStructure(String path) {

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
		
		/*
		for (String fileName : args) {
			String filePath=root+"/"+fileName;
			File dir = new File(filePath);
			dir.mkdir();
			System.out.println("Folder is created at " + filePath);  
	    }	
	    */	
	}

	public void addFiles(File... args) throws IOException
	{
		for (File fileName : args) {	
			files.add(fileName);
		 }
		
		/*
		for (File f : args) {	
			String path = f.getPath();
			String filePath=root+"/"+path;
			File dir = new File(filePath);
			dir.getParentFile().mkdirs(); 
			dir.createNewFile();	
			System.out.println("File is created at " + filePath);
	    }		
	    */
		
		
	}
	
	public void addFilesByName(String... args) throws IOException
	{
		for (String fileName : args) {	
			filesByName.add(fileName);
		 }
		
		/*
		for (String fileName : args) {
			String filePath=root+"/"+fileName;
			File dir = new File(filePath);
			dir.getParentFile().mkdirs(); 
			dir.createNewFile();
			System.out.println("File is created at " + filePath);
	    }		
	    */
		
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
	
	
	public static void main(String[] args) throws IOException {
	
	   ClientStructure structure =  new ClientStructure("C:/file1");
		
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

	}
	
	
}
