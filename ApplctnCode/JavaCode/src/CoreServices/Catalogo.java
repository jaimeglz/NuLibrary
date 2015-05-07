package CoreServices;


/**
 * @author JaimeGonzalez
 * @version 1.0
 * @created 07-may-2015 12:43:24 p.m.
 */
public abstract class Catalog {

	private String descripcion;
	private String nombreAbrev;



	public void finalize() throws Throwable {

	}
	public Catalog(){

	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getdescripcion()
	  throws java.rmi.RemoteException{
		return descripcion;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getnombreAbrev()
	  throws java.rmi.RemoteException{
		return nombreAbrev;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setdescripcion(String newVal)
	  throws java.rmi.RemoteException{
		descripcion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setnombreAbrev(String newVal)
	  throws java.rmi.RemoteException{
		nombreAbrev = newVal;
	}
}//end Catalog