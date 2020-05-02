
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MyImage {
	public static void main(String args[]) throws IOException {
        // we place the picture, cat.jpeg, under C:\java
		BufferedImage bimg = ImageIO.read(new File("C:\\java\\cat.jpg"));
		// the BufferedImage object provide the methods to get image width and height 
		int width = bimg.getWidth();
		int height = bimg.getHeight();
		// now we go through all pixels
		for (int ii = 0; ii < width; ii++)
			for (int jj = 0; jj < height; jj++) {
				// get color of one pixel
				int rgb = bimg.getRGB(ii, jj);
				// get the revert color
				rgb = 0xffffff - rgb;
				// set the new color for this pixel 
				bimg.setRGB(ii, jj, rgb);
			}
		// define an output file
		File output_file = new File("c:\\java\\out.jpg");
		// write all pixels with new color into this file 
		ImageIO.write(bimg, "jpg", output_file);
		System.out.println("Writing complete.");
	}
}