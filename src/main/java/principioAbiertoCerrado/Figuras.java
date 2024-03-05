package principioAbiertoCerrado;

import java.util.Vector;
import java.util.Enumeration;

public class Figuras {
    Vector<Figura> figuras = new Vector<Figura>();

    public void addFigura(Figura f) {
        figuras.add(f);
    }

    public void dibujarFiguras() {
        Enumeration<Figura> enumeracion = figuras.elements();
        while (enumeracion.hasMoreElements()) {
            Figura figura = enumeracion.nextElement();
            figura.dibujar();
        }
    }

}
