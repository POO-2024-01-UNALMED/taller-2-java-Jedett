package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados = 0;

/// constructor
public Auto(){
    cantidadCreados++;
}

public int cantidadAsientos(){
    int cont = 0;
    for(int i = 0; i < this.asientos.length; i++){
        if (this.asientos[i] != null){
            cont++;
        }
    }
    return cont;
}
public String verificarIntegridad(){
    if (this.registro != this.motor.registro){
        return "Las piezas no son originales";
    }
    /// Cada registro de cada asiento de la lista asientos es igual a this.registro
    for(int i = 0; i < this.asientos.length; i++){
        if (this.asientos[i] != null){
            if (this.registro != this.asientos[i].registro){
            return "Las piezas no son originales";
        }
        }
        
    }
    return "Auto original";
}
 

}

