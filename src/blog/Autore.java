package blog;

import interfaccia.Scrittore;

public class Autore implements Scrittore  {

	private int idAutore;
	private String nomeAutore;
	private String cognomeAutore;
	
	
	public Autore(int idAutore, String nomeAutore, String cognomeAutore) {
		super();
		this.idAutore = idAutore;
		this.nomeAutore = nomeAutore;
		this.cognomeAutore = cognomeAutore;
	}


	public int getIdAutore() {
		return idAutore;
	}


	public void setIdAutore(int idAutore) {
		this.idAutore = idAutore;
	}


	public String getNomeAutore() {
		return nomeAutore;
	}


	public void setNomeAutore(String nomeAutore) {
		this.nomeAutore = nomeAutore;
	}


	public String getCognomeAutore() {
		return cognomeAutore;
	}


	public void setCognomeAutore(String cognomeAutore) {
		this.cognomeAutore = cognomeAutore;
	}


	@Override
	public Articolo scriviArticolo(Articolo articolo) {
		return null;
	}


	@Override
	public String toString() {
		return nomeAutore + " " + cognomeAutore;
	}
	
	
	
}
