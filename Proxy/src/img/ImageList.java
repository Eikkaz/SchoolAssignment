package img;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImageList {
	
	List<Image> images = new ArrayList<>();
	boolean browse = true;
	String input = "";
	int count = 0;
	Scanner scan = new Scanner(System.in);
	
	public void addImages() {
		for(int i = 1; i <= 5; i++) {
			images.add(new ProxyImage("Image " + i));
		}
	}
	
	public void printImage() {
		images.forEach(Image::showData);
	}
	
	public void browser() {
		System.out.println("a<-- -->d, q=quit \n");
		while(browse) {
			Image image = images.get(count);
			image.displayImage();
			input = scan.nextLine();
		
			switch(input){
				case "d":
					if(count == 4) {
						count = 0;
					}
					else {
						count++;
					}
					break;
				case "a":
					if(count == 0) {
						count = 4;
					}
					else {
						count--;
					}
					break;
				case "q":
					browse = false;
					break;
				default:
					System.out.println(" Try browsing with a and d");
					break;
			
			}
		}
	}

}
