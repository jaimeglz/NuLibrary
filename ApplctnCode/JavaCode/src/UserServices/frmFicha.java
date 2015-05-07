package UserServices;

import CoreServices.BibliographicRecord;

/**
 * @author JaimeGonzalez
 * @version 001
 * @created 07-may-2015 12:43:24 p.m.
 */
public class frmFicha {

	private String autor;
	private String descripcion;
	private String edicion;
	/**
	 * El <b><i>International Standard Book Number</i></b>  (&lsquo;número estándar
	 * internacional de libro&rsquo;), abreviado <b>ISBN</b>, es un <font
	 * color="#0000ff"><u>identificador</u></font> único para libros, previsto para
	 * uso comercial. Fue creado en el <font color="#0000ff"><u>Reino Unido</u></font>
	 * en<font color="#0000ff"><u>1966</u></font> por las librerías y papelerías y
	 * llamado originalmente <i>Standard Book Numbering</i>.
	 * 
	 * El ISBN está compuesto por 10 dígitos de longitud, y dividido en cuatro partes:
	 * 
	 * <ol>
	 * 	<li>el código de país o lengua de origen,</li>
	 * 	<li>el editor,</li>
	 * 	<li>el número del artículo, y</li>
	 * 	<li>un <font color="#0000ff"><u>dígito de control</u></font></li>
	 * </ol>
	 */
	private String ISBN;
	private String lugarDeEdicion;
	private int numControl;
	private String orgEditora;
	private String tipoMaterial;
	private String titulo;



	public void finalize() throws Throwable {

	}
	public frmFicha(){

	}

	/**
	 * 
	 * @param obra
	 */
	public int abrir(BibliographicRecord obra){
		return 0;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getautor()
	  throws java.rmi.RemoteException{
		return autor;
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
	public String getedicion()
	  throws java.rmi.RemoteException{
		return edicion;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getISBN()
	  throws java.rmi.RemoteException{
		return ISBN;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getlugarDeEdicion()
	  throws java.rmi.RemoteException{
		return lugarDeEdicion;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer getnumControl()
	  throws java.rmi.RemoteException{
		return numControl;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String getorgEditora()
	  throws java.rmi.RemoteException{
		return orgEditora;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String gettipoMaterial()
	  throws java.rmi.RemoteException{
		return tipoMaterial;
	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public String gettitulo()
	  throws java.rmi.RemoteException{
		return titulo;
	}

	public int salir(){
		return 0;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setautor(String newVal)
	  throws java.rmi.RemoteException{
		autor = newVal;
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
	public void setedicion(String newVal)
	  throws java.rmi.RemoteException{
		edicion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setISBN(String newVal)
	  throws java.rmi.RemoteException{
		ISBN = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setlugarDeEdicion(String newVal)
	  throws java.rmi.RemoteException{
		lugarDeEdicion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setnumControl(Integer newVal)
	  throws java.rmi.RemoteException{
		numControl = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setorgEditora(String newVal)
	  throws java.rmi.RemoteException{
		orgEditora = newVal;
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void settipoMaterial(String newVal)
	  throws java.rmi.RemoteException{
		tipoMaterial = newVal;
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
}//end frmFicha