package CoreServices;


/**
 * Physical (individual) book, journal, thesis, media.
 * @author JaimeGonzalez
 * @version 1.0
 * @created 07-may-2015 12:56:56 p.m.
 */
public class Item {

	private String estado;
	private String fechaAdquisicion;
	private int numero;
	private Movement movimiento;



	public void finalize() throws Throwable {

	}
	public Item(){

	}

	public int devolverEjemplar(){
		return 0;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getestado()
	  throws java.rmi.RemoteException{
		return estado;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getfechaAdquisicion()
	  throws java.rmi.RemoteException{
		return fechaAdquisicion;
	}

	public Movement getmovimiento(){
		return movimiento;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer getnumero()
	  throws java.rmi.RemoteException{
		return numero;
	}

	public int prestarEjemplar(){
		return 0;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setestado(String newVal)
	  throws java.rmi.RemoteException{
		estado = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setfechaAdquisicion(String newVal)
	  throws java.rmi.RemoteException{
		fechaAdquisicion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setmovimiento(Movement newVal){
		movimiento = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setnumero(Integer newVal)
	  throws java.rmi.RemoteException{
		numero = newVal;
	}
}//end Item