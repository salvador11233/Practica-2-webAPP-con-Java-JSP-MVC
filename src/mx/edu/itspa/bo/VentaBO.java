package mx.edu.itspa.bo;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.edu.itspa.dao.VentasDAO;
import mx.edu.itspa.dto.Venta;
import mx.edu.itspa.general.DAOException;

@ManagedBean(name="ventaBO")
@SessionScoped
public class VentaBO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Venta venta;
	private VentasDAO ventasDAO;
	
	public VentaBO() {
		venta = new Venta();
		ventasDAO = new VentasDAO();
	}
	
	public List<Venta> getVentas(){
		try {
			return ventasDAO.obtenerTodos();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String edit(String codigo) {
		try {
			venta = ventasDAO.obtener(codigo);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "anadirV";
	}
	
	public String save() {
		try {
			System.out.println("Entro a save");
			if(venta.getNumFacturas() == null || venta.getNumFacturas()==0) {
				System.out.println("Entro a insertar");
				ventasDAO.insertar(venta);
			}else {
				System.out.println("Entro a modi");
				ventasDAO.modificar(venta);
			}
			venta = new Venta();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "saveV";
	}
	
	public String eliminar(String codigo) {
		try {
			venta = ventasDAO.obtener(codigo);
			ventasDAO.eliminar(venta);
			venta = new Venta();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		return "deleteV";
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}	
}
