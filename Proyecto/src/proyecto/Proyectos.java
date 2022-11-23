package proyecto;
 
public class Proyectos {
    private String nomProyecto, lenguaje, desarrollo;

    public Proyectos(String nomProyecto, String lenguaje, String desarrollo) {
	this.nomProyecto = nomProyecto;
	this.lenguaje = lenguaje;
	this.desarrollo = desarrollo;
    }

    public Proyectos() {
	this.nomProyecto = "";
	this.lenguaje = "";
	this.desarrollo = "";
    }

    public String getNomProyecto() {
	return nomProyecto;
    }

    public void setNomProyecto(String nomProyecto) {
	this.nomProyecto = nomProyecto;
    }

    public String getLenguaje() {
	return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
	this.lenguaje = lenguaje;
    }

    public String getDesarrollo() {
	return desarrollo;
    }

    public void setDesarrollo(String desarrollo) {
	this.desarrollo = desarrollo;
    }
    
    
}
