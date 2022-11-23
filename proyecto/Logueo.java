package proyecto;
import javax.swing.JOptionPane;

public class Logueo {
    private int opcion;
    private String u, c, usuario, clave;
   
    public Logueo() {
	this.opcion = 0;
	this.u = "";
	this.c = "";
	this.usuario = ".";
	this.clave = ".";
    }

    public Logueo(int opcion, String u, String c, String usuario, String clave) {
	this.opcion = opcion;
	this.u = u;
	this.c = c;
	this.usuario = usuario;
	this.clave = clave;
    }
    
    public void loguear(){

	while(opcion != 1){
	    opcion = Integer.parseInt(JOptionPane.showInputDialog
	    ("Bienvenido\n¿Cuenta con usuario y clave para iniciar sesión?"
		+ "\n[1] Si \n[2] No"));
	    if (opcion == 2) {
		u = JOptionPane.showInputDialog("Usuario: ");
		c = JOptionPane.showInputDialog("Contraseña: ");
		JOptionPane.showMessageDialog(null,
			"-Usuario: "+u+"\n-Contraseña: "+c+"\nAhora inicie sesion");
		
	    } else if (opcion == 1) {
		    while(!usuario.equals(u) || !clave.equals(c)){
			usuario = JOptionPane.showInputDialog("Usuario: ");
			clave = JOptionPane.showInputDialog("Clave: ");
			if (usuario.equals(u) && clave.equals(c)) {
			    JOptionPane.showMessageDialog(null,
				    "Bienvenido, "+usuario);
			} else if (!usuario.equals(u) || !clave.equals(c)) {
			    JOptionPane.showMessageDialog(null,
				    "Los datos no coinciden. \nIntente de nuevo");
			}
		    }
		    
		}
	}
    }
    
}
