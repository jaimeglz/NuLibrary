package ExternalServices;


/**
 * @author JaimeGonzalez
 * @version 001
 * @created 07-may-2015 12:43:25 p.m.
 */
public class User {

	private String carrera;
	private String correoElectronico;
	private String estatus;
	private String facultadEscuela;
	private String nombre;
	private int numCuenta;
	private int semestre;
	private FinancialStatus m_FinancialStatus;



	public void finalize() throws Throwable {

	}
	public User(){

	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getcarrera()
	  throws java.rmi.RemoteException{
		return carrera;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getcorreoElectronico()
	  throws java.rmi.RemoteException{
		return correoElectronico;
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
	public String getfacultadEscuela()
	  throws java.rmi.RemoteException{
		return facultadEscuela;
	}

	public FinancialStatus getFinancialStatus(){
		return m_FinancialStatus;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getnombre()
	  throws java.rmi.RemoteException{
		return nombre;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer getnumCuenta()
	  throws java.rmi.RemoteException{
		return numCuenta;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer getsemestre()
	  throws java.rmi.RemoteException{
		return semestre;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setcarrera(String newVal)
	  throws java.rmi.RemoteException{
		carrera = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setcorreoElectronico(String newVal)
	  throws java.rmi.RemoteException{
		correoElectronico = newVal;
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
	public void setfacultadEscuela(String newVal)
	  throws java.rmi.RemoteException{
		facultadEscuela = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFinancialStatus(FinancialStatus newVal){
		m_FinancialStatus = newVal;
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
	 * @exception java.rmi.RemoteException
	 */
	public void setnumCuenta(Integer newVal)
	  throws java.rmi.RemoteException{
		numCuenta = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setsemestre(Integer newVal)
	  throws java.rmi.RemoteException{
		semestre = newVal;
	}
}//end User