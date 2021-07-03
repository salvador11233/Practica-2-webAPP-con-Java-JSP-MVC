package mx.edu.itspa.dto;

public class Venta {
	private Integer numFacturas = null;
    private String fecha;
    private Integer numCliente;
    private Integer codLibro;
    
	public Integer getNumFacturas() {
		return numFacturas;
	}
	
	public void setNumFacturas(Integer numFacturas) {
		this.numFacturas = numFacturas;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public Integer getNumCliente() {
		return numCliente;
	}
	
	public void setNumCliente(Integer numCliente) {
		this.numCliente = numCliente;
	}
	
	public Integer getCodLibro() {
		return codLibro;
	}
	
	public void setCodLibro(Integer codLibro) {
		this.codLibro = codLibro;
	}
}
