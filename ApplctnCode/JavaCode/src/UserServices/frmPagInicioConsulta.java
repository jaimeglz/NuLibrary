package UserServices;


/**
 * @author JaimeGonzalez
 * @version 001
 * @created 07-may-2015 12:43:25 p.m.
 */
public class frmPagInicioConsulta {

	private String texto;
	private String tipoConsulta;



	public void finalize() throws Throwable {

	}
	public frmPagInicioConsulta(){

	}

	public int abrir(){
		return 0;
	}

	/**
	 * 
	 * @param Autor
	 */
	public int buscarAutor(String Autor){
		return 0;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String gettexto()
	  throws java.rmi.RemoteException{
		return texto;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String gettipoConsulta()
	  throws java.rmi.RemoteException{
		return tipoConsulta;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void settexto(String newVal)
	  throws java.rmi.RemoteException{
		texto = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void settipoConsulta(String newVal)
	  throws java.rmi.RemoteException{
		tipoConsulta = newVal;
	}
}//end frmPagInicioConsulta