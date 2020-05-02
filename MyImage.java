
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MyImage {
	public static void main(String args[]) throws IOException {

		BufferedImage bimg = ImageIO.read(new File("C:\\java\\cat.jpg"));
		int width = bimg.getWidth();
		int height = bimg.getHeight();
		for (int ii = 0; ii < width; ii++)
			for (int jj = 0; jj < height; jj++) {
				int rgb = bimg.getRGB(ii, jj);
				rgb = 0xffffff - rgb;
				bimg.setRGB(ii, jj, rgb);
			}
		File output_file = new File("c:\\java\\out.jpg");
		ImageIO.write(bimg, "jpg", output_file);
		System.out.println("Writing complete.");
	}
}