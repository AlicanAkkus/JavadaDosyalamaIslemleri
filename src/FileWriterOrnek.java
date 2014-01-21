import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOrnek {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(final String[] args) throws IOException {
		// TODO Auto-generated method stub

		final String dosya_adi = "siir.txt";// dosya adi tanimi
		final FileWriter yaz = new FileWriter(dosya_adi);// yaz nesnemizi
															// oluþturduk

		yaz.write("BÝR GÜZEL ÞUHA DEDÝM ÝKÝ GÖZÜ SÜRMELÝDÝR..\n");// write fonk.
																	// ile
																	// dosyaya
																	// veri
																	// yazýyoruz
		yaz.write("DEDÝ SENÝ VALLAHÝ HÝNT'E KADAR SÜRMELÝDÝR..\n");
		yaz.write("DEDÝM ATEÞLER YAKTI YÜREÐÝM OLDU KEBAP..\n");
		yaz.write("DEDÝ SÖNDÜRMEK ÝÇÝN PAHÝYEME YÜZ SÜRMELÝDÝR..\n");
		yaz.write("DEDÝM EY MEHLÝKA AL BU GECE BENÝ BEZMEMEN..\n");
		yaz.write("DEDÝ BEYHUDE UÐRAÞMA KAPILAR SÜRMELÝDÝR..\n");
		yaz.write("DEDÝM AÞIKLARA CEVRÝN NE CEFADIR GÜZELÝM..\n");
		yaz.write("DEDÝ AÞIK OLANIN ÜSTÜNE AT SÜRMELÝDÝR..\n");
		yaz.close();// acilan dosyayi kapatmak icin kullanilir..
	}

}
