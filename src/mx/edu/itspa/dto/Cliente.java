package mx.edu.itspa.dto;

public class Cliente {
	private Integer numCliente = null;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String codCiudad;
    private Integer cp;
    private String telefono;
    private String email;
    
	public Integer getNumCliente() {
		return numCliente;
	}
	
	public void setNumCliente(Integer numCliente) {
		this.numCliente = numCliente;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getCodCiudad() {
		return codCiudad;
	}
	
	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}
	
	public Integer getCp() {
		return cp;
	}
	
	public void setCp(Integer cp) {
		this.cp = cp;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
