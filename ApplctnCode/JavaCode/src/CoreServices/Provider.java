package CoreServices;


/**
 * @author JaimeGonzalez
 * @version 1.0
 * @created 07-may-2015 12:56:56 p.m.
 */
public class Provider extends Catalog {

	private BibliographicRecord obraEditora;



	public void finalize() throws Throwable {
		super.finalize();
	}
	public Provider(){

	}

	public BibliographicRecord getobraEditora(){
		return obraEditora;
	}

	/**
	 * 
	 * @param OrgEdit
	 */
	public String obtenerEditora(String OrgEdit){
		return "";
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setobraEditora(BibliographicRecord newVal){
		obraEditora = newVal;
	}
}//end Provider