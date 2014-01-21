import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadOrnek {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final String DosyaAdi = "siir.txt";// dosya adi tanimi
		String satir;
		try {
			final BufferedReader oku = new BufferedReader(new FileReader(
					DosyaAdi));// BuffReader ile dosyadan okuma iþlemi yapmak
			satir = oku.readLine();// satir satir okuma yapma
			while (satir != null) // dosya sonuna KADAR OKUMA
			{
				System.out.println(satir);
				satir = oku.readLine();
			}
			oku.close();// acilan dosyayý kapatmak bizi hatalardan kurtarir..
		} catch (final IOException iox) {
			System.out.println(DosyaAdi + "adli dosya okunamiyor");
		}
	}
}
