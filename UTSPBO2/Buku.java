package UTSPBO2;

public class Buku {
	protected String judul;
	protected String genre;
	
	public Buku(String judul, String genre) {
		this.judul = judul;
		this.genre = genre;
	}
	
	public String toString(){
		return "Judul: "+judul+", Genre: "+genre;
	}
}