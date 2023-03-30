package api.io;
//File 클래스의 API에 대해서 살펴보기
//=> File과 Directory를 자바에서 제어하기 위해 제공되는 클래스
import java.io.File;

public class FileTest01 {

	public static void main(String[] args) {
		File f = new File("src/data/test.txt");
		File f2 = new File("src/data");
		System.out.println(f);
		System.out.println("canRead:"+f.canRead());
		System.out.println("canWrite:"+f.canWrite());
		System.out.println("getAbsoulutePath:"+f.getAbsolutePath());
		System.out.println("getName:"+f.getName());
		System.out.println("getParent:"+f.getParent());
		System.out.println("getPath:"+f.getPath());
		
		System.out.println("f1 isDirectory:"+f.isDirectory());
		System.out.println("f1 isFile:"+f.isFile());
		System.out.println("f2 is:"+f2.isDirectory());
		System.out.println("f2 isFile:"+f2.isFile());
		
		System.out.println("f lastModified:"+f.lastModified());
		System.out.println("f length:"+f.length());
		//f.setReadOnly();
		
		
		
		
	}

}
