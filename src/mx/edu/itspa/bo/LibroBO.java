package mx.edu.itspa.bo;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.edu.itspa.dao.LibroDAO;
import mx.edu.itspa.dto.Libro;
import mx.edu.itspa.general.DAOException;

@ManagedBean(name="libroBO")
@SessionScoped
public class LibroBO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Libro libro;
	private LibroDAO libroDAO;
	
	
	public LibroBO() {
		libro = new Libro();
		libroDAO = new LibroDAO();
	}
	
	public List<Libro> getLibros(){
		try {
			return libroDAO.obtenerTodos();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String edit(String codigo) {
		try {
			libro = libroDAO.obtener(codigo);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "anadirL";
	}
	
	public String save() {
		try {
			System.out.println("Entro a save");
			if(libro.getCodLibro() == null || libro.getCodLibro()==0) {
				System.out.println("Entro a insertar");
				libroDAO.insertar(libro);
			}else {
				System.out.println("Entro a modi");
				libroDAO.modificar(libro);
			}
			libro = new Libro();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "saveL";
	}
	
	public String eliminar(String codigo) {
		try {
			libro = libroDAO.obtener(codigo);
			libroDAO.eliminar(libro);
			libro = new Libro();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		return "deleteL";
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}	
	
}
