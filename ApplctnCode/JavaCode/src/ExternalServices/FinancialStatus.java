package ExternalServices;


/**
 * @author JaimeGonzalez
 * @version 001
 * @created 07-may-2015 12:43:24 p.m.
 */
public class FinancialStatus {

	private String estatus;
	private int monto;
	private int tipoPartida;



	public void finalize() throws Throwable {

	}
	public FinancialStatus(){

	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getestatus()
	  throws java.rmi.RemoteException{
		return estatus;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer getmonto()
	  throws java.rmi.RemoteException{
		return monto;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer gettipoPartida()
	  throws java.rmi.RemoteException{
		return tipoPartida;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setestatus(String newVal)
	  throws java.rmi.RemoteException{
		estatus = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setmonto(Integer newVal)
	  throws java.rmi.RemoteException{
		monto = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void settipoPartida(Integer newVal)
	  throws java.rmi.RemoteException{
		tipoPartida = newVal;
	}
}//end FinancialStatus