package CoreServices;

import ExternalServices.User;

/**
 * @author JaimeGonzalez
 * @version 001
 * @created 07-may-2015 12:56:56 p.m.
 */
public class Movement {

	private int fechaEntrega;
	private int fechaInicio;
	private int fechaRealDevolucion;
	private int numCuentaUsuario;
	private int tipoMovimiento;



	public void finalize() throws Throwable {

	}
	public Movement(){

	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer getfechaEntrega()
	  throws java.rmi.RemoteException{
		return fechaEntrega;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer getfechaInicio()
	  throws java.rmi.RemoteException{
		return fechaInicio;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer getfechaRealDevolucion()
	  throws java.rmi.RemoteException{
		return fechaRealDevolucion;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer getnumCuentaUsuario()
	  throws java.rmi.RemoteException{
		return numCuentaUsuario;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer gettipoMovimiento()
	  throws java.rmi.RemoteException{
		return tipoMovimiento;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setfechaEntrega(Integer newVal)
	  throws java.rmi.RemoteException{
		fechaEntrega = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setfechaInicio(Integer newVal)
	  throws java.rmi.RemoteException{
		fechaInicio = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setfechaRealDevolucion(Integer newVal)
	  throws java.rmi.RemoteException{
		fechaRealDevolucion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setnumCuentaUsuario(Integer newVal)
	  throws java.rmi.RemoteException{
		numCuentaUsuario = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void settipoMovimiento(Integer newVal)
	  throws java.rmi.RemoteException{
		tipoMovimiento = newVal;
	}
}//end Movement