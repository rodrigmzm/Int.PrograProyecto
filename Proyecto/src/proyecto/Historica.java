package proyecto;

// @author Rodrigo
 
public class Historica {
    private int dia, mes, year, conclusion, nuevoMes, newYear; // Conclusion en meses

    public Historica(int dia, int mes, int year, int conclusion, int nuevoMes
    ,int newYear) {
	this.dia = dia;
	this.mes = mes;
	this.year = year;
	this.conclusion = conclusion;
	this.nuevoMes = nuevoMes;
	this.newYear = newYear;
    }
    
    public Historica(){
	this.dia = 0;
	this.mes = 0;
	this.year = 0;
	this.conclusion = 0;
	this.nuevoMes = 0;
	this.newYear = 0;
    }

    public int getDia() {
	return dia;
    }

    public void setDia(int dia) {
	this.dia = dia;
    }

    public int getMes() {
	return mes;
    }

    public void setMes(int mes) {
	this.mes = mes;
    }

    public int getYear() {
	return year;
    }

    public void setYear(int year) {
	this.year = year;
    }

    public int getConclusion() {
	return conclusion;
    }

    public void setConclusion(int conclusion) {
	this.conclusion = conclusion;
    }

    public int getNuevoMes() {
	return nuevoMes;
    }

    public void setNuevaMes(int nuevoMes) {
	this.nuevoMes = nuevoMes;
    }

    public int getNewYear() {
	return newYear;
    }

    public void setNuevoYear(int newYear) {
	this.newYear = newYear;
    }
    
}
