package pio.daw.stats;

import java.util.List;

public class Estadistica {

    /**
     * Calcula la media de una muestra
     * @param nums Muestra de numeros
     * @return media
     */
    public static Double media(List<Double> nums){
        Double suma = 0.;
        if (nums.size()==0){//para que la lista no sea 0
            return suma;
        }
        for (Double i :nums){
            suma +=i;
        }
        return suma/nums.size();
        
    }

    /**
     * Calcula el maximo de una muestra
     * @param nums Muestra de numeros
     * @return maximo
     */
     public static Double max(List<Double> nums){
        Double Maxnum= nums.get(0);
         for (Double i: nums){
            if (i > Maxnum){
                Maxnum = i;
            }
         }
         return Maxnum;
    }

    /** 
     * Calcula el minimo de una muestra
     * @param nums muestra de numeros
     * @return minimo
     */
     public static Double min(List<Double> nums){
      double minNum= nums.get(0);
         for (Double i: nums){
            if (i < minNum){
                minNum = i;
            }
         }
         return minNum;
    }

    //varianza: calcular media de la secuencia. coger un numero, restar la media y elevar al cuadrado. Dividir entre total de numeros-1
    public static Double var(List<Double> nums){
        Double media = media (nums);
        Double suma=0.;
        for (Double i:nums){
           suma+= (i-media)*(i-media);//Math.pow (n-media,2);
        }
        return suma/nums.size();
    }


}

    