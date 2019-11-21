package restoran.vodic;

import java.util.Calendar;
import java.util.GregorianCalendar;

import restoran.Restoran;
import restoran.vrsta.VrstaHrane;

public class VodicKrozRestorane {
	private Restoran[] restorani;

	public VodicKrozRestorane(int n) {
		super();
		if (n <= 0) {
			n = 20;
		}
		this.restorani = new Restoran[n];
	}

	public void unesiRestoran(Restoran restoran) {
		boolean pun = true;
		for (int i = 0; i < restorani.length; i++)
			if (restorani[i] == null) {
				pun = false;
				break;
			}
		if (pun == false && restoran != null) {
			for (int i = restorani.length - 1; i >= 0; i--) {
				if (restorani[i] == null) {
					restorani[i] = restoran;
					break;
				}
			}
		} else
			System.out.println("GRESKA");

	}

	public void napraviTopListuVrstaHraneInt(VrstaHrane hrana, int godina) {
		for (int i = 0; i < restorani.length; i++) {
			if (restorani[i] != null && restorani[i].getHrana().equals(hrana) && restorani[i].getOcena() == 5
					&& restorani[i].getDatumProcene().get(Calendar.YEAR) == godina) {
				System.out.println(restorani[i]);
			}
		}
	}

	public void napraviTopListuVrstaHrane(VrstaHrane hrana) {
		GregorianCalendar datum = new GregorianCalendar();
		int godina = datum.get(Calendar.YEAR);
		Restoran[] pomNiz = new Restoran[restorani.length];
		int j = 0;
		for (int i = 0; i < restorani.length; i++) {
			if (restorani[i] != null && restorani[i].getHrana().equals(hrana) && restorani[i].getDatumProcene().get(Calendar.YEAR) == godina) {
				//System.out.println(restorani[i]);
				// ubacivanje u pomocni niz
				pomNiz[j] = restorani[i];
				j++;

			}
		}
//		int br = 10;
//		if (pomNiz.length < 10) br = pomNiz.length;
		for (int i = 0; i < pomNiz.length; i++) {
			for (int k = 0; k < pomNiz.length; k++) {
				if (pomNiz[i] != null && pomNiz[i].getOcena() == 5) {
					System.out.println(pomNiz[i]);
					i++;
				}
					
			}
			for (int k = 0; k < pomNiz.length; k++) {
				if (pomNiz[i] != null && pomNiz[i].getOcena() == 4) {
					System.out.println(pomNiz[i]);
					i++;
				}
					
			}
		}
	}
}
