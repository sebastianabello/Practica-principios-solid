package principioLiskov;

public class ConfiguracionSistema implements ILoadRecursosPersistente, ISaveRecursoPersistente {
    @Override
    public void load() {
        System.out.println("Configuracion sistema cargado");
    }
    @Override
    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }
}
