package principioLiskov;

public class ConfiguracionHoraria implements ILoadRecursosPersistente {
    @Override
    public void load() {
        System.out.println("Configuracion horari cargada");
    }

}
