package test;
public class Asiento {
    String color;
    int precio;
    int registro;

public void cambiarColor(String colorAuto){
if (colorAuto.equalsIgnoreCase("rojo") || colorAuto.equalsIgnoreCase("verde") || colorAuto.equalsIgnoreCase("amarillo") || colorAuto.equalsIgnoreCase("negro") || colorAuto.equalsIgnoreCase("blanco")){
    this.color = colorAuto;
}
}
}
/// rojo, verde, amarillo, negro y blanco,