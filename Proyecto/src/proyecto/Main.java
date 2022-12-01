package proyecto;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Logueo l = new Logueo();
	//l.loguear();
	Clientes c[] = new Clientes[1];
	Proyectos p[] = new Proyectos[1];
	Historica h[] = new Historica[1];
	int opcion = 0;
	
	while(opcion != 5){
	    opcion = Integer.parseInt(JOptionPane.showInputDialog(
		    "¿Qué desea hacer?\n"+"[1] Módulo de gestión del cliente.\n"
		    +"[2] Módulo de gestión del proyecto.\n"
		    +"[3] Módulo de administración histórica.\n"
		    +"[4] Módulo de informe.\n"
		    +"[5] Salir."));
	    if (opcion == 1) {
		for (int i = 0; i < c.length; i++) {
		    String nombre = JOptionPane.showInputDialog(null,
			    "Nombre del cliente: ","Módulo de gestión del cliente",
			    JOptionPane.QUESTION_MESSAGE);
		    int opt = Integer.parseInt(JOptionPane.showInputDialog(null,
			     "Digite el tipo de cliente."
			    + " \n[1] Público\n[2] Privado\n[3] Mixto",
			     "Módulo de gestión del cliente",
			    JOptionPane.QUESTION_MESSAGE));
		    String tipo = "";
		    /*Se podria agregar mas informacion dependiendo de la opcion
		    que se escoja*/
		    if (opt == 1) { 
			tipo = "Público";
		    }
		    if (opt == 2) {
			tipo = "Privado";
		    }
		    if (opt == 3) {
			tipo = "Mixto";
		    }
		    
		    c[i] = new Clientes (nombre, tipo);
		}
	    }
	    if (opcion == 2){
		for (int i = 0; i < p.length; i++) {
		    String nomProyecto = JOptionPane.showInputDialog(null,
			    "Nombre del proyecto: ","Módulo de gestión del proyecto",
			    JOptionPane.QUESTION_MESSAGE);
		    int presupuesto = Integer.parseInt(JOptionPane.showInputDialog(null,
			    "Presupuesto inicial del proyecto: ",
			    "Módulo de gestión del proyecto", JOptionPane.QUESTION_MESSAGE));
		    String lenguaje = JOptionPane.showInputDialog(null,
			    "Lenguaje de programación"
			+" a utilizar: ","Módulo de gestión del proyecto",
			JOptionPane.QUESTION_MESSAGE);
		    int des= Integer.parseInt(JOptionPane.showInputDialog(null,
			    "¿Qué tipo de desarrollo"
			+" aplicará en el proyecto?\n[1] CVCDS (5% de aumento al presupuesto)"
			+ "\n[2]Prototipos (10% de aumento al presupuesto)"
			+ "\n[3]Scrum (7% de aumento al presupuesto)",
			    "Módulo de gestion del proyecto",
			JOptionPane.QUESTION_MESSAGE));
		    String desarrollo = "";
		    double aumento = 0;
		    /*Se podria agregar mas informacion dependiendo de la opcion
		    que se escoja*/
		    if (des == 1) {
			desarrollo = "CVCDS";
			aumento = presupuesto+(presupuesto*0.5);
		    }
		    if (des == 2) {
			desarrollo = "Prototipos";
			aumento = presupuesto+(presupuesto*0.10);
		    }
		    if (des == 3) {
			desarrollo = "Scrum";
			aumento = presupuesto+(presupuesto*0.7);
		    }
		    
		    p[i] = new Proyectos (nomProyecto, lenguaje, desarrollo,
		    presupuesto, aumento);
		}
	    }
	    if (opcion == 3) {
		for (int i = 0; i < h.length; i++) {
		    int dia = Integer.parseInt(JOptionPane.showInputDialog(null,
		     "Día: ","Admin. histórica || Inicialización del proyecto",
		     JOptionPane.QUESTION_MESSAGE));
		    int mes = Integer.parseInt(JOptionPane.showInputDialog(null,
		     "Mes: ","Admin. histórica || Inicializacion del proyecto",
		     JOptionPane.QUESTION_MESSAGE));
		    int year = Integer.parseInt(JOptionPane.showInputDialog(null,
		     "Año: ","Admin. histórica || Inicializacion del proyecto",
		     JOptionPane.QUESTION_MESSAGE));
		    int conclusion = Integer.parseInt(JOptionPane.showInputDialog(null,
		     "¿En cuántos meses se espera finalizar el proyecto?: ",
		     "Admin. histórica || Conclusión del proyecto",
		     JOptionPane.QUESTION_MESSAGE));
		    int suma = mes + conclusion;
		    int nuevoMes;
		    int newYear;
		    
		    if (suma > 12) {
			suma -= 12;
			nuevoMes = suma;
			newYear = year + 1;
		    } else {
			    nuevoMes = suma;
			    newYear = year;
			}
		    
		    h[i] = new Historica (dia, mes, year, conclusion, nuevoMes
		    ,newYear);
		}
	    }
	    if (opcion == 4) {
		for (int i = 0; i < c.length && i < p.length && i < h.length; i++) {
		    //Print con JOptioPane
		    JOptionPane.showMessageDialog(null,
			    "Nombre del cliente: "+c[i].getNombre()+"\nNombre del proyecto: "
			    +p[i].getNomProyecto()+"\nTipo de cliente: "+c[i].getTipo()
			    +"\nLenguaje de programación: "+p[i].getLenguaje()
			    +"\nPresupuesto inicial del proyecto: "+p[i].getPresupuesto()
			    +"\nPresupuesto final con el aumento: "+p[i].getAumento()
			    +"\nFecha de inicialización del proyecto: "+h[i].getDia()+"/"+h[i].getMes()
			    +"/"+h[i].getYear()+"\nTiempo de trabajo en meses: "+h[i].getConclusion()
			    +" meses"+"\nFecha de finalización del proyecto: "+h[i].getDia()
			    +"/"+h[i].getNuevoMes()+"/"+h[i].getNewYear(),"Informe del proyecto",
			    JOptionPane.INFORMATION_MESSAGE);
		    //Print con println
		    System.out.println("Informe del proyecto\n\nNombre del cliente: "
			    +c[i].getNombre()+"\nNombre del proyecto: "
			    +p[i].getNomProyecto()+"\nTipo de cliente: "+c[i].getTipo()
			    +"\nLenguaje de programación: "+p[i].getLenguaje()
			    +"\nFecha de inicialización del proyecto: "+h[i].getDia()+"/"+h[i].getMes()
			    +"/"+h[i].getYear()+"\nTiempo de trabajo en meses: "+h[i].getConclusion()
			    +" meses"+"\nFecha de finalización del proyecto: "+h[i].getDia()
			    +"/"+h[i].getNuevoMes()+"/"+h[i].getNewYear()+"\n");
		}
		
	    }
	}
    }

}
