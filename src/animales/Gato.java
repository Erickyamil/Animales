package animales;

public class Gato extends Felino{

    @Override
    public String getNombreCientifico(){
        return "Gato: Felis catus";
    }
    
    @Override
    public String getSonido(){
        return "Gato: Su sonido es maullar";
    }
    
    @Override
    public String getAlimentos(){
        return "Gato: Su alimentación es Carnivora";
    }
        
    @Override
    public String getHabitad(){
        return "Gato: Su habitad es el domestico";
    }
}

