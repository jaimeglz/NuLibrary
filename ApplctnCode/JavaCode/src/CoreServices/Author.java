package CoreServices;

import UserServices.frmListaAutores;

/**
 * @author JaimeGonzalez
 * @version 1.0
 * @created 07-may-2015 12:56:55 p.m.
 */
public class Author extends Catalog {

	private BibliographicRecord obraAutor;



	public void finalize() throws Throwable {
		super.finalize();
	}
	public Author(){

	}

	public BibliographicRecord getobraAutor(){
		return obraAutor;
	}

	/**
	 * 
	 * @param Autor
	 */
	public String obtenerAutor(String Autor){
		return "";
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setobraAutor(BibliographicRecord newVal){
		obraAutor = newVal;
	}
}//end Author