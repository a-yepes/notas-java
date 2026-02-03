package pio.daw.stats;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EstadisticaTest {

    //para testear decimales necesitamos un intervalo: (np -nreal)<0.0001
    public static boolean checkDouble(Double resultado,Double esperado,Double precision){
        return Math.abs (resultado - esperado) < precision;    
    }

    @Test
    public void mediaTest(){// test para comprobar la media
        List <Double> nums = List.of(1.,3.,5.);//creo un lista en la que sepa la respuesta
        List <Double> nums2 = List.of(10., 20., 30., 40.);
        Double media = Estadistica.media(nums);//como media es estatica necesito el nombre de la clase
        Double media2 = Estadistica.media(nums2);
        assertTrue(checkDouble(media, 3., 0.000000001));
        assertTrue(checkDouble(media2, 25., 0.000000001));
        
    }
    @Test
    public void MaxTest(){
        List <Double> nums = List.of(1.,3.,5.);
        Double maxNum = Estadistica.max(nums);
        assertTrue(checkDouble(maxNum, 5., 0.000000001));
    }

    @Test
    public void MinTest(){
        List <Double> nums = List.of(1.,3.,5.);
        Double minNum = Estadistica.min(nums);
        assertTrue(checkDouble(minNum, 1., 0.000000001));
    }

    @Test
    public void varianzaTest(){
        List<Double> nums = List.of(1.,3.,5.);
        Double varianza = Estadistica.media(nums);
        assertTrue(checkDouble(varianza, 2.67,0.1 ));

    }

    
}
//mvn compile 
//mvn package

