package restoran;

import java.util.GregorianCalendar;

import restoran.vrsta.VrstaHrane;

public class Restoran {
	private String naziv;
	private VrstaHrane hrana;
	private int ocena;
	private GregorianCalendar datumProcene;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv == null || naziv.equals("")) {
			System.out.println("GRESKA");
			return;
		}
		this.naziv = naziv;
	}
	public VrstaHrane getHrana() {
		return hrana;
	}
	public void setHrana(VrstaHrane hrana) {
		this.hrana = hrana;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		if (ocena < 1 || ocena > 5) {
			System.out.println("GRESKA");
			return;
		}
		this.ocena = ocena;
	}
	public GregorianCalendar getDatumProcene() {
		return datumProcene;
	}
	public void setDatumProcene(GregorianCalendar datumProcene) {
		if (datumProcene == null) {
			System.out.println("GRESKA");
			return;
		}
		this.datumProcene = datumProcene;
	}
	
	@Override
	public String toString() {
		return "Ime restorana: " + naziv + ", vrsta hrane: " + hrana + ", ocena: " + ocena + ", datum procene: " + datumProcene;
	}
	
}
