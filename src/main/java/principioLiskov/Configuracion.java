package principioLiskov;

import java.util.Iterator;
import java.util.Vector;

public class Configuracion {
    Vector<ILoadRecursosPersistente> lrp = new Vector<ILoadRecursosPersistente>();
    Vector<ISaveRecursoPersistente> srp = new Vector<ISaveRecursoPersistente>();
    public void cargarConfiguracion(){
        lrp.add(new ConfiguracionHoraria());
        lrp.add(new ConfiguracionUsuario());
        lrp.add(new ConfiguracionSistema());

        for (ILoadRecursosPersistente irp:lrp)
            irp.load();
    }
    public void salvarConfiguracion(){
        for (ISaveRecursoPersistente isrp:srp)
            i.save();
    }
}

