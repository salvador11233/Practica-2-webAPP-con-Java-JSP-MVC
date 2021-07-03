package mx.edu.itspa.bo;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.edu.itspa.dao.ClienteDAO;
import mx.edu.itspa.dto.Cliente;
import mx.edu.itspa.general.DAOException;


@ManagedBean(name="clienteBO")
@SessionScoped
public class ClienteBO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private ClienteDAO clienteDAO;
	
	public ClienteBO() {
		cliente = new Cliente();
		clienteDAO = new ClienteDAO();
	}
	
	public List<Cliente> getClientes(){
		try {
			return clienteDAO.obtenerTodos();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String edit(String codigo) {
		try {
			cliente = clienteDAO.obtener(codigo);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "anadirC";
	}
	
	public String save() {
		try {
			System.out.println("Entro a save");
			if(cliente.getNumCliente() == null || cliente.getNumCliente()==0) {
				System.out.println("Entro a insertar");
				clienteDAO.insertar(cliente);
			}else {
				System.out.println("Entro a modi");
				clienteDAO.modificar(cliente);
			}
			cliente = new Cliente();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "saveC";
	}
	
	public String eliminar(String codigo) {
		try {
			cliente = clienteDAO.obtener(codigo);
			clienteDAO.eliminar(cliente);
			cliente = new Cliente();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		return "deleteC";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
}
