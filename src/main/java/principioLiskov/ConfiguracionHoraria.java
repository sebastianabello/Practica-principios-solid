package principioLiskov;

public class ConfiguracionHoraria implements RecursoPersistente{
    @Override
    public void load() {
        System.out.println("Configuracion horari cargada");
    }

    @Override
    public void save() {
        System.out.println("ERROR, la hora no se puede almacenar, es solo de lectura");
    }
}
