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
															// olu�turduk

		yaz.write("B�R G�ZEL �UHA DED�M �K� G�Z� S�RMEL�D�R..\n");// write fonk.
																	// ile
																	// dosyaya
																	// veri
																	// yaz�yoruz
		yaz.write("DED� SEN� VALLAH� H�NT'E KADAR S�RMEL�D�R..\n");
		yaz.write("DED�M ATE�LER YAKTI Y�RE��M OLDU KEBAP..\n");
		yaz.write("DED� S�ND�RMEK ���N PAH�YEME Y�Z S�RMEL�D�R..\n");
		yaz.write("DED�M EY MEHL�KA AL BU GECE BEN� BEZMEMEN..\n");
		yaz.write("DED� BEYHUDE U�RA�MA KAPILAR S�RMEL�D�R..\n");
		yaz.write("DED�M A�IKLARA CEVR�N NE CEFADIR G�ZEL�M..\n");
		yaz.write("DED� A�IK OLANIN �ST�NE AT S�RMEL�D�R..\n");
		yaz.close();// acilan dosyayi kapatmak icin kullanilir..
	}

}
