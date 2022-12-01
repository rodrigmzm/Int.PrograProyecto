package proyecto;
 
public class Proyectos {
    private String nomProyecto, lenguaje, desarrollo;
    private int presupuesto;
    private double aumento;

    public Proyectos(String nomProyecto, String lenguaje, String desarrollo,
	    int presupuesto, double aumento) {
	this.nomProyecto = nomProyecto;
	this.lenguaje = lenguaje;
	this.desarrollo = desarrollo;
	this.presupuesto = presupuesto;
	this.aumento = aumento;
    }

    public Proyectos() {
	this.nomProyecto = "";
	this.lenguaje = "";
	this.desarrollo = "";
	this.presupuesto = 0;
	this.aumento = 0.0;
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

    public int getPresupuesto() {
	return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
	this.presupuesto = presupuesto;
    }

    public double getAumento() {
	return aumento;
    }

    public void setAumento(double aumento) {
	this.aumento = aumento;
    }

    
    
}
