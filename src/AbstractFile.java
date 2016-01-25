import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AbstractFile {
	protected String root;
	protected static List<File> files = new ArrayList<File>();
	protected static List<String> filesByName = new ArrayList<String>();
	protected static List<String> folders = new ArrayList<String>();
	
	AbstractFile(String path){
		File dir = new File(path);
		if (!dir.exists()){
		root=path;
		dir.mkdir();
		System.out.println("File is created at " + path);
		}
	}
	
	public void add(String... args) {	}
	public void addFiles(File... args) {	}
	public void create() throws IOException {	}
} 
