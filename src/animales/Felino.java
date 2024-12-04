package animales;

public abstract class Felino extends Animal{

    protected String sonido;
    protected String alimentos;
    protected String habitad;
    protected String nombreCientifico;

    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitad();
}


