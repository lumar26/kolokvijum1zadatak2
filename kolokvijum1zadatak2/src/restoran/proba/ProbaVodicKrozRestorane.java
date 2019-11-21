package restoran.proba;

import java.util.GregorianCalendar;
import restoran.vrsta.VrstaHrane;
import restoran.Restoran;
import restoran.vodic.VodicKrozRestorane;

public class ProbaVodicKrozRestorane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VodicKrozRestorane vodic = new VodicKrozRestorane(4);
		Restoran r1 = new Restoran();
		Restoran r2 = new Restoran();
		Restoran r3 = new Restoran();
		r1.setNaziv("Makao");
		r1.setOcena(5);
		r1.setHrana(VrstaHrane.KINESKA);
		r1.setDatumProcene(new GregorianCalendar(2012, 10, 26));
		r2.setNaziv("Kuhinja");
		r2.setOcena(4);
		r2.setHrana(VrstaHrane.DOMACA);
		r2.setDatumProcene(new GregorianCalendar(2019, 11, 1));
		r3.setNaziv("Stara Kuca");
		r3.setOcena(5);
		r3.setHrana(VrstaHrane.DOMACA);
		r3.setDatumProcene(new GregorianCalendar(2019, 10, 2));

		vodic.unesiRestoran(r1);
		vodic.unesiRestoran(r2);
		vodic.unesiRestoran(r3);
		
		vodic.napraviTopListuVrstaHraneInt(VrstaHrane.DOMACA, 2017);
		System.out.println();
		vodic.napraviTopListuVrstaHrane(VrstaHrane.DOMACA);

	}

}
