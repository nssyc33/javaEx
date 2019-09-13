package javaEx.io.Service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileTranferControll {
	
	public void fileTransfer() throws IOException {
		String inPosition = "C://in//music.mp4";
		String outPosition = "C://in//out//music.mp4";
		
		try(FileInputStream inputStream = new FileInputStream(inPosition);
			FileOutputStream outputStream = new FileOutputStream(outPosition);){
			int data=0;
			while ((data= inputStream.read()) != -1)
			{
				outputStream.write(data);
			}
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
	}
	
	public void fileTransfer_useBuffer() throws IOException {
		String inPosition = "C://in//pd.mp4";
		String outPosition = "C://in//out//pd.mp4";
		
		try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(inPosition));
			BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outPosition));){
			long startTime = System.currentTimeMillis();
			int data=0;
			while ((data= inputStream.read()) != -1)
			{
				outputStream.write(data);
			}
			long stopTime = System.currentTimeMillis();
			System.out.println((stopTime - startTime)/1000);//99
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
	}
	
	public void fileTransferNio() throws IOException {
		String inPosition = "C://in//pd.mp4";
		String outPosition = "C://in//out//pd.mp4";
		
		
		try {
			FileInputStream inputStream = new FileInputStream(inPosition);
			FileOutputStream outputStream = new FileOutputStream(outPosition);
			long startTime = System.currentTimeMillis();
			FileChannel fis = inputStream.getChannel();
			FileChannel fos = outputStream.getChannel();
			fis.transferTo(0, (int)fis.size(), fos);
			long stopTime = System.currentTimeMillis();
			System.out.println((stopTime - startTime)/1000);//
			
			
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
		
	}

}
