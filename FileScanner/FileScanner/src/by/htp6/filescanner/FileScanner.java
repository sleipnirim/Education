package by.htp6.filescanner;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileScanner implements Runnable{
	

	public volatile boolean stop = false;

	@Override
	public void run() {
		File fileScanner = new File("D://");
		String[] currentFileList = fileScanner.list();
		
		while(!stop){
			Date date = new Date();
			DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
			System.out.println(formatter.format(date));
		
			String[] newFileList = fileScanner.list();

			compareFiles(currentFileList, newFileList);
		
			currentFileList = newFileList;
		
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	}
	
	
	private void compareFiles(String[] oldFiles, String[] newFiles){
		for(int i =0; i < newFiles.length; i++){
			boolean isNewFile = true;
			for(int k = 0; k < oldFiles.length; k++){
				if (newFiles[i].equals(oldFiles[k])){
					isNewFile = false;
				}
			}
				
			if(isNewFile){
				System.out.println("File '" + newFiles[i] + "' was added");
			}
		}
		for(int i =0; i < oldFiles.length; i++){
			boolean isDeleted = true;
			for(int k = 0; k < newFiles.length; k++){
				if(oldFiles[i].equals(newFiles[k])){
					isDeleted = false;
				}	
			}
				
			if (isDeleted){
				System.out.println("File '" + oldFiles[i] + "' was deleted");
			}
		}
	}
	
}
