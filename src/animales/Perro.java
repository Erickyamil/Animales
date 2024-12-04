package animales;

public class Perro extends Canido{

    @Override
    public String getNombreCientifico(){
        return "Perro: Canis Lupus Familiaris";
    }
    
    @Override
    public String getSonido(){
        return "Perro: Su sonido es ladrar";
    }
    
    @Override
    public String getAlimentos(){
        return "Perro: Su alimentación es Carnivora";
    }
     
    @Override
    public String getHabitad(){
        return "Perro: Su habitad es domestico";
    }
}

