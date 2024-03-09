package principioLiskov;

public class ConfiguracionUsuario implements ILoadRecursosPersistente, ISaveRecursoPersistente {
    @Override
    public void load() {
        System.out.println("Configuracion usuario cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion usuario almacenada");
    }
}
