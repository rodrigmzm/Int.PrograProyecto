package proyecto;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Logueo l = new Logueo();
	
	
	
	Clientes c[] = new Clientes[1];
	Proyectos p[] = new Proyectos[1];
	int opcion = 0;
	
	while(opcion != 5){
	    opcion = Integer.parseInt(JOptionPane.showInputDialog(
		    "¿Qué desea hacer?\n"+"[1] Módulo de gestion del cliente.\n"
		    +"[2] Módulo de gestion del proyecto.\n"
		    +"[3] Módulo de administracion historica.\n"
		    +"[4] Módulo de informe.\n"
		    +"[5] Salir."));
	    
	    if (opcion == 1) {
		for (int i = 0; i < c.length; i++) {
		    String nombre = JOptionPane.showInputDialog(null,
			    "Nombre del cliente: ","Módulo de gestion del cliente",
			    JOptionPane.QUESTION_MESSAGE);
		    int opt = Integer.parseInt(JOptionPane.showInputDialog(null,
			     "Digite el tipo de cliente."
			    + " \n[1] Público\n[2] Privado\n[3] Mixto",
			     "Módulo de gestion del cliente",
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
			    "Nombre del proyecto: ","Módulo de gestion del proyecto",
			    JOptionPane.QUESTION_MESSAGE);
		    String lenguaje = JOptionPane.showInputDialog(null,
			    "Lenguaje de programación"
			+" a utilizar: ","Módulo de gestion del proyecto",
			JOptionPane.QUESTION_MESSAGE);
		    int des= Integer.parseInt(JOptionPane.showInputDialog(null,
			    "¿Qué tipo de desarrollo"
			+" aplicará en el proyecto?\n[1] CVCDS\n[2]Prototipos\n[3]Scrum",
			    "Módulo de gestion del proyecto",
			JOptionPane.QUESTION_MESSAGE));
		    String desarrollo = "";
		    /*Se podria agregar mas informacion dependiendo de la opcion
		    que se escoja*/
		    if (des == 1) {
			desarrollo = "CVCDS";
		    }
		    if (des == 2) {
			desarrollo = "Prototipos";
		    }
		    if (des == 3) {
			desarrollo = "Scrum";
		    }
		    
		    p[i] = new Proyectos (nomProyecto, lenguaje, desarrollo);
		}
	    
	    if (opcion == 3) {
		    
		}
		
	    }
	}
    }

}
