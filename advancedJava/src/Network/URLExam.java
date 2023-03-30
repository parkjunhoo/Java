package Network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

//////////////////////////////////////////////////////////////////////////////////////////
class DownloadThread extends Thread {
	String fileName;
	String path;
	byte[] content;
	
	FileOutputStream fos = null;

	public DownloadThread() {
		super();
	}

	public DownloadThread(String path ,String fileName, byte[] content) {
		super();
		this.path = path;
		this.fileName = fileName;
		this.content = content;
	}

	public void run() {
		writeByte();
	}
	
	private void writeByte() {
		try {
			/////////////////////////////////////////////////////
			fos = new FileOutputStream (path+"/"+fileName);
			fos.write(content);
			/////////////////////////////////////////////////////
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

//////////////////////////////////////////////////////////////////////////////////////////





//////////////////////////////////////////////////////////////////////////////////////////
class SearchThread extends Thread {
	String path;
	String fileName;
	String urlAddr;
	
	BufferedInputStream bis = null;
	
	public SearchThread() {
		super();
	}
	
	public SearchThread(String path, String fileName , String urlAddr) {
		super();
		this.path = path;
		this.fileName = fileName;
		this.urlAddr = urlAddr;
	}
	
	public void run() {
		
		new DownloadThread(this.path,"myIMG.jpg", getContent()).start();
	}
	
	private byte[] getContent() {
		byte[] content = null;
		
		try {
			//////////////////////////////////////////////////
			URL url = new URL(this.urlAddr);
			bis = new BufferedInputStream(url.openStream());
			content = bis.readAllBytes();
			//////////////////////////////////////////////////
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return content;
	}
	
	
}
//////////////////////////////////////////////////////////////////////////////////////////

public class URLExam {

	public static void main(String[] args) {
		String urlAddr = "https://i.ytimg.com/vi/5SJlgXa7fhM/maxresdefault.jpg";
		
		new SearchThread("src/images" , "myIMG.jpg" , urlAddr).start();
	}
}
