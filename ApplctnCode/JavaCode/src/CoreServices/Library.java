package CoreServices;

import UserServices.frmPagInicioConsulta;
import UserServices.frmInicioBiblioteca;

/**
 * @author JaimeGonzalez
 * @version 001
 * @created 07-may-2015 12:56:56 p.m.
 */
public class Library {

	private String nombre;
	private BibliographicRecord obraBiblioteca;



	public void finalize() throws Throwable {

	}
	public Library(){

	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getnombre()
	  throws java.rmi.RemoteException{
		return nombre;
	}

	public BibliographicRecord getobraBiblioteca(){
		return obraBiblioteca;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setnombre(String newVal)
	  throws java.rmi.RemoteException{
		nombre = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setobraBiblioteca(BibliographicRecord newVal){
		obraBiblioteca = newVal;
	}
}//end Library