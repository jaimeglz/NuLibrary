package CoreServices;

import UserServices.frmFicha;
import UserServices.frmListaObras;

/**
 * @author JaimeGonzalez
 * @version 1.0
 * @created 07-may-2015 12:56:55 p.m.
 */
public class BibliographicRecord {

	private int autorID;
	private String descripcion;
	private String edicion;
	/**
	 * An ISBN is assigned to each edition and variation (except reprintings) of a
	 * book. For example, an ebook, a paperback, and a hardcover edition of the same
	 * book would each have a different ISBN. The ISBN is 13 digits long if assigned
	 * on or after 1 January 2007, and 10 digits long if assigned before 2007. The
	 * method of assigning an ISBN is nation based, and varies from state to state
	 * often depending on how large the publishing industry is within a state.
	 * 
	 * An International Standard Book Number consists of 4 parts (if it is a 10 digit
	 * ISBN) or 5 parts (for a 13 digit ISBN):
	 * 
	 * The parts of a 10-digit ISBN and the corresponding EAN-13 and barcode. Note the
	 * different check digits in each. The part of the EAN-13 labeled "EAN" is the
	 * Bookland country code.
	 * 
	 * For a 13-digit ISBN, a prefix element - a GS1 prefix: so far 978 or 979 have
	 * been made available by GS1,[10]
	 *    the registration group element, (language-sharing country group, individual
	 * country or territory)[11]
	 *    the registrant element,
	 *    the publication element,[10] and
	 *    a checksum character or check digit.[10]
	 * 
	 * El ISBN está compuesto por 10 dígitos de longitud, y dividido en cuatro partes:
	 * 
	 * <ol>
	 * 	<li>el código de país o lengua de origen, </li>
	 * 	<li>el editor, </li>
	 * 	<li>el número del artículo, y </li>
	 * 	<li>un dígito de control </li>
	 * </ol>
	 */
	private String ISBN;
	private String lugarDeEdicion;
	private int numControl;
	private int orgEditoraID;
	private String tipoMaterial;
	private String titulo;
	private Item copiaFisica;



	public void finalize() throws Throwable {

	}
	public BibliographicRecord(){

	}

	/**
	 * 
	 * @exception java.rmi.RemoteException
	 */
	public Integer getautorID()
	  throws java.rmi.RemoteException{
		return autorID;
	}

	public Item getcopiaFisica(){
		return copiaFisica;
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
	public Integer getorgEditoraID()
	  throws java.rmi.RemoteException{
		return orgEditoraID;
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

	/**
	 * 
	 * @param autor
	 */
	public String obtenerObras(String autor){
		return "";
	}

	/**
	 * 
	 * @param newVal
	 * @exception java.rmi.RemoteException
	 */
	public void setautorID(Integer newVal)
	  throws java.rmi.RemoteException{
		autorID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcopiaFisica(Item newVal){
		copiaFisica = newVal;
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
	public void setorgEditoraID(Integer newVal)
	  throws java.rmi.RemoteException{
		orgEditoraID = newVal;
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
}//end BibliographicRecord