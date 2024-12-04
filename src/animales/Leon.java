package animales;

public class Leon extends Felino{

    @Override
    public String getNombreCientifico(){
        return "Leon: Panthera leo";
    }
    
    @Override
    public String getSonido(){
        return "Leon: Su sonido es Rugir";
    }
    
    @Override
    public String getAlimentos(){
        return "Leon: Su alimentación es Carnivora";
    }
        
    @Override
    public String getHabitad(){
        return "Leon: Su habitad es la sabana";
    }
}
