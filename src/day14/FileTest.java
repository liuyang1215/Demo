package day14;

import java.io.File;

public class FileTest {
	public static void RemoveAllFiles(String dir) {
		File file = new File(dir);
//		String name = file.getName();
//		System.out.println(name);
		
		File[] subs = file.listFiles();
		for(File subfile: subs) {
			System.out.println(subfile);
			
			if(subfile.isDirectory()) {
				RemoveAllFiles(subfile.getAbsolutePath());
			} else {
				subfile.delete();
			}
		}
		
		file.deleteOnExit();
	}
	
	public static void main(String[] args) {
		RemoveAllFiles("/Users/txgcwm/Desktop/wm");
	}
}
