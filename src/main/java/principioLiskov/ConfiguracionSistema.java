package principioLiskov;

public class ConfiguracionSistema implements RecursoPersistente {
    @Override
    public void load() {
        System.out.println("Configuracion sistema cargado");
    }
    @Override
    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }
}
