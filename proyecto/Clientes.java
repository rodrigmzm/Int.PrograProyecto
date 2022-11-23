package proyecto;
 
public class Clientes {
    private String nombre, tipo;

    public Clientes(String nombre, String tipo) {
	this.nombre = nombre;
	this.tipo = tipo;
    }
    
    public Clientes() {
	this.nombre = "";
	this.tipo = "";
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getTipo() {
	return tipo;
    }

    public void setTipo(String tipo) {
	this.tipo = tipo;
    }
    
}
