package sottoclassi;

import java.time.LocalDate;

import blog.Articolo;
import blog.Autore;
import blog.Tags;



public class ArticoloFantasy extends Articolo {
	
	private String descrizione;

	public ArticoloFantasy(int idArticolo, String titoloArticolo, LocalDate data, String categoriaArticolo,
			String testoArticolo, Autore autoreArticolo, Tags tagsArticolo, String descrizione) {
		super(idArticolo, titoloArticolo, data, categoriaArticolo, testoArticolo, autoreArticolo, tagsArticolo);
		this.descrizione = descrizione;
	}
	
	
	

}
