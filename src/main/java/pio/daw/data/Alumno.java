package pio.daw.data;

import java.util.List;

public class Alumno extends AlumnoABC {

    //TODO
	public static Alumno fromLine(String line){//pasa de string "Pepe 5,7.5,8" a objeto Alumno
        return new Alumno(null,null);
        //HashMap(nombre, notas)
    }
    public Alumno (String nombre, List<Double> notas){
        super(nombre, notas);
    }
    
}
