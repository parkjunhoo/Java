package api.io;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FileExam {

	public static void main(String[] args) {
		File file = new File("src/data");
		File[] files = file.listFiles();
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		for(File f : files) {
			String name = f.getName();
			if(f.isFile()) {
				String dateStr = df.format(f.lastModified());
				System.out.printf("%s----[파일(%s:%s)]\n",name,f.length(), dateStr);
			}else {
				System.out.printf("%s----[폴더]\n",name);
			}
			
		}
	}

}
