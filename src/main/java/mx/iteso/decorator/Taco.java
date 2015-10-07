package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Any Taco";
    protected String size= "REGULAR";
    //CONSTANTES
    public static String MINI= "Mini";
    public static String REGULAR= "Regular";
    public static String MEGA= "Mega";

    public String getSize(){
        return size;
    }
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
