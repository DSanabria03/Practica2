package uva.ipc.practica1.vista;

import javax.swing.JFrame;
/**
 *
 * @author Daniel
 */
public class GestorVistas {
    private JFrame vistaActual;

    public void mostrarVistaBuscador(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaBuscador();
        vistaActual.setVisible(true);
    }

    public void mostrarVistaMenu(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaMenu();
        vistaActual.setVisible(true);
    }
    
    public void mostrarVistaEdicionManual(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaEdicionManual();
        vistaActual.setVisible(true);
    }
}