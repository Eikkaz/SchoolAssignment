package app;

import java.io.FileOutputStream;
import java.io.IOException;


public class HardDrive {
	
	public byte[] read(long lba, int size) throws IOException {
		
		byte data = 24;
		FileOutputStream out = new FileOutputStream("src/app/testfile.txt");
		out.write(data);
		out.close();
		
		byte[] b = new byte[size];
		
		b[data] = (byte) ((byte) size + lba );
		
		return b;

	}
	
}
