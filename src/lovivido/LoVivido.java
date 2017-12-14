/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;
/**
 * Esta clase se encarga de pedir el nombre y la edad para así hacer los calculos. 
 * @author jborrajorodriguez
 */
public class LoVivido {
/**
 * Este metodo se encarga de hacer las llamadas a los metodos.
 *
 */
    public static void main(String[] args) {
        
        String a=añadirNombre();
        String c=añadirAño();
        calcularTiempo(a,c);
        

    }

    /**
     * Metodo añadirNombre Este medtodo se encarga de introducir un nombre.
     *
     * @return devuelve un valor string en la variable nombre
     */
    public static String añadirNombre() {
        String nombre=JOptionPane.showInputDialog("Escriba su nombre: ");//Recoger el nombre
        return nombre;
    }
    /**
     * Metodo añadirAño Este medtodo se encarga de introducir un año.
     * @return  devuelve un valor string en la variable edad
     */
     public static String añadirAño() {
        String edad=JOptionPane.showInputDialog("Escriba su edad: ");//Recoger la edad
        return edad;
    }
     /**
      * Método calcularTiempo Este metodo se encarga de hacer las operaciones necesarias para caluclar meses,dias,horas de la vida de una persona
      * 
      * @param nombre Es el nombre de la persona.
      * @param edad Es la edad de la persona.
      */
     public static void calcularTiempo(String nombre,String edad) {
        int m, d, h, a;
        a=Integer.parseInt(edad);
        m=(a*12);
        d=(a*365);
        h=(d*24);
        JOptionPane.showMessageDialog(null,"Meses: "+m,"Numero de meses vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"D\u00edas: "+d,"Numero de d\u00edas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Horas: "+h,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

}
