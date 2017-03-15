package day14;

import java.io.File;

import javax.naming.directory.DirContext;

public class FileDemo1 {

	public static void main(String[] args) {
		File dir = new File("/Users/txgcwm/Desktop/wm/demo/ll/ly/test.txt");
		if(!dir.exists()) {
			dir.mkdirs();
		}

	}

}
