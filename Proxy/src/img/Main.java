package img;

public class Main {

	public static void main(String[] args) {
		ImageList list = new ImageList();
		Image image = new ProxyImage("filename");
		image.showData();
		
		list.addImages();
		list.printImage();
		list.browser();

	}

}
