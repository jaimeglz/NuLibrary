package UserServices;


/**
 * @author JaimeGonzalez
 * @version 001
 * @created 07-may-2015 12:43:24 p.m.
 */
public class frmListaObras {

	private String titulo;



	public void finalize() throws Throwable {

	}
	public frmListaObras(){

	}

	/**
	 * 
	 * @param Autor
	 */
	public int abrir(String Autor){
		return 0;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String gettitulo()
	  throws java.rmi.RemoteException{
		return titulo;
	}

	/**
	 * 
	 * @param ISBN
	 */
	public void seleccionaObra(String ISBN){

	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void settitulo(String newVal)
	  throws java.rmi.RemoteException{
		titulo = newVal;
	}
}//end frmListaObras