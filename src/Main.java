import java.time.LocalDate;
import java.util.Scanner;

import blog.Articolo;
import blog.Autore;
import blog.Blog;
import sottoclassi.ArticoloFantasy;
import sottoclassi.ArticoloNoir;
import blog.Tags;






public class Main {

	public static void main(String[] args) {
		
        String[] tagSport = {"calcio", "squadra", "risultato", "tifosi"};
        String[] tagCronaca = {"guerra", "ucraina", "russia", "putin"};
        String[] tagFantasy = {"fantasy", "anello", "elfo", "potere"};
        String[] tagNoir = {"thriller", "serialkiller", "omicidi", "splatter"};
        Tags tagsSport = new Tags(tagSport);
        Tags tagsCronaca = new Tags(tagCronaca);
        Tags tagsFantasy = new Tags(tagFantasy);
        Tags tagsNoir = new Tags(tagNoir);

        
        Autore carlozampa = new Autore(1,"Carlo","Zampa");
        Autore giorgiacardinaletti = new Autore(2,"Giorgia","Cardinaletti");
        Autore peterjackson = new Autore(3,"Peter","Jackson");
        Autore davidfincher = new Autore(4,"David","Fincher");


        Articolo RomaHaVinto = new Articolo(1,"La Roma ha vinto", LocalDate.of(2022,5,25),"Calcio","La Roma ha vinto la conference league", tagsSport);
        Articolo GuerrainRussia = new Articolo(2,"La Guerra non si ferma", LocalDate.of(2020,6,17),"Cronaca","Gli ultimi aggiornamenti sulla guerra in Ucraina", tagsCronaca);
        Articolo IlSignoredegliAnelli = new ArticoloFantasy(3,"Il Signore degli Anelli il ritorno del Re", LocalDate.of(2008,3,20),"Fantasy","L'ultimo film della saga", peterjackson, tagsFantasy,"L'anello viene distrutto");
        Articolo Seven = new ArticoloNoir(4,"Seven", LocalDate.of(2010,1,11),"Noir","Film bellissimo", davidfincher, tagsNoir, "Cosa c'è nella scatola?");

        RomaHaVinto.setAutoreArticolo(carlozampa);
        GuerrainRussia.setAutoreArticolo(giorgiacardinaletti);

        Articolo[] articoliBlog = {RomaHaVinto, GuerrainRussia, IlSignoredegliAnelli, Seven};


   
        Blog blog = new Blog(articoliBlog);

        executeBlog(blog);

    }

    public static void executeBlog(Blog blog){
        System.out.println("\n CIAO!\n Inserisci 1 per visualizzare gli Articoli altrimenti premi 2 per effettuare la ricerca per ID!\n1) Mostra tutti gli articoli\n2) Ricerca Articolo per ID");
       
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        switch (x){

            case 1: blog.stampaArticoli();
                break;

            case 2: System.out.println("Selezione l'ID del tuo Articolo: "); int y = scan.nextInt(); if(y > blog.getArticoli().length || y <= 0){ System.out.println("Articolo inesistente!"); }
            else{
                blog.stampaArticoloPerId(y);
            }
                break;

            default: System.out.println("Opzione non valida!");
        }
    }
}
