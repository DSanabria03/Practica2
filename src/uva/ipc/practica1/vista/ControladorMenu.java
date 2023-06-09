package uva.ipc.practica1.vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import uva.ipc.practica1.main.Main;
import uva.ipc.practica1.modelo.Libro;
import uva.ipc.practica1.modelo.Biblioteca;
/**
 *
 * @author saant
 */
public class ControladorMenu {
    private VistaMenu miVistaMenu;
    private Biblioteca miBiblioteca;
    
    public ControladorMenu(VistaMenu v){
        this.miVistaMenu = v;
    }

    void procesaEventoIrABuscador() {
        Main.getGestorVistas().mostrarVistaBuscador();
    }

    void procesaEventoIrAEdicionManual() {
        Main.getGestorVistas().mostrarVistaEdicionManual();
    }
    
    
}
