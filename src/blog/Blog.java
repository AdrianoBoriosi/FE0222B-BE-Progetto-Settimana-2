package blog;

public class Blog {

	private Articolo[] articoli;

	public Blog(Articolo[] articoli) {
		super();
		this.articoli = articoli;
	}

	public Articolo[] getArticoli() {
		return articoli;
	}

	public void setArticoli(Articolo[] articoli) {
		this.articoli = articoli;
	}
	

	
	public void stampaArticoloPerId(int id){
        for (int i =0; i < articoli.length; i++){
            if (articoli[i].getIdArticolo() == id){
                System.out.println("\n -- Articolo " + (i+1) + " --" + "\nTitolo: " + articoli[i].getTitoloArticolo() + "\nCategoria: " + articoli[i].getCategoriaArticolo() + "\nAutore: " + articoli[i].getAutoreArticolo() + "\nCategoria: " + articoli[i].getCategoriaArticolo() + "\nDescrizione: " + articoli[i].getTestoArticolo());

	
            }
        }
    }

	  public void stampaArticoli(){
	        for (int i = 0; i < articoli.length; i++){
	            System.out.println("\n -- Articolo " + (i+1) + " --" + "\nTitolo: " + articoli[i].getTitoloArticolo() + "\nCategoria: " + articoli[i].getCategoriaArticolo() + "\nAutore: " + articoli[i].getAutoreArticolo() + "\nCategoria: " + articoli[i].getCategoriaArticolo() + "\nDescrizione: " + articoli[i].getTestoArticolo());
	        }
	    }
	}
	
	
	
	
