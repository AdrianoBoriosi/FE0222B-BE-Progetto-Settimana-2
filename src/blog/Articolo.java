package blog;

import java.time.LocalDate;

public class Articolo {
	
	private int idArticolo;
	private String titoloArticolo;
	private LocalDate data = LocalDate.now();
	private String categoriaArticolo;
	private String testoArticolo;
	private Autore autoreArticolo;
	private Tags tagsArticolo;
	
	
	public Articolo(int idArticolo, String titoloArticolo, LocalDate data, String categoriaArticolo,
			String testoArticolo, Autore autoreArticolo, Tags tagsArticolo) {
		this.idArticolo = idArticolo;
		this.titoloArticolo = titoloArticolo;
		this.data = data;
		this.categoriaArticolo = categoriaArticolo;
		this.testoArticolo = testoArticolo;
		this.autoreArticolo = autoreArticolo;
		this.tagsArticolo = tagsArticolo;
	}

	

	public Articolo(int idArticolo, String titoloArticolo, LocalDate data, String categoriaArticolo,
			String testoArticolo, Tags tagsArticolo) {
		this.idArticolo = idArticolo;
		this.titoloArticolo = titoloArticolo;
		this.data = data;
		this.categoriaArticolo = categoriaArticolo;
		this.testoArticolo = testoArticolo;
		this.tagsArticolo = tagsArticolo;
	}



	public int getIdArticolo() {
		return idArticolo;
	}


	public void setIdArticolo(int idArticolo) {
		this.idArticolo = idArticolo;
	}


	public String getTitoloArticolo() {
		return titoloArticolo;
	}


	public void setTitoloArticolo(String titoloArticolo) {
		this.titoloArticolo = titoloArticolo;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public String getCategoriaArticolo() {
		return categoriaArticolo;
	}


	public void setCategoriaArticolo(String categoriaArticolo) {
		this.categoriaArticolo = categoriaArticolo;
	}


	public String getTestoArticolo() {
		return testoArticolo;
	}


	public void setTestoArticolo(String testoArticolo) {
		this.testoArticolo = testoArticolo;
	}


	public Autore getAutoreArticolo() {
		return autoreArticolo;
	}


	public void setAutoreArticolo(Autore autoreArticolo) {
		this.autoreArticolo = autoreArticolo;
	}


	public Tags getTagsArticolo() {
		return tagsArticolo;
	}


	public void setTagsArticolo(Tags tagsArticolo) {
		this.tagsArticolo = tagsArticolo;
	}


	@Override
	public String toString() {
		return "Articolo: " + titoloArticolo + "\n" +
                "Data: " + data + "\n" +
                "Categoria: " + categoriaArticolo + "\n" +
                "Testo: " + testoArticolo + "\n" +
                "Autore: " + autoreArticolo + "\n" +
                "Tags: " + tagsArticolo;
	}

	
	
}
