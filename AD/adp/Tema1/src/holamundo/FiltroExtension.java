package holamundo;

import java.io.File;
import java.io.FilenameFilter;

public class FiltroExtension implements FilenameFilter {
	
	 String extension;
	 public FiltroExtension(String extension) {
		
		 this.extension = extension;
		 
	}

	@Override
	public boolean accept(File dir, String name) {
		
		return name.endsWith(extension);
	}

}
