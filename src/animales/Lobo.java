package animales;

public class Lobo extends Canido{

    @Override
    public String getNombreCientifico(){
        return "Lobo: Canis lupus";
    }
    
    @Override
    public String getSonido(){
        return "Lobo: Su sonido es aullar";
    }
    
    @Override
    public String getAlimentos(){
        return "Lobo: Su alimentación es Carnivora";
    }
        
    @Override
    public String getHabitad(){
        return "Lobo: Su habitad es el bosque";
    }
}
