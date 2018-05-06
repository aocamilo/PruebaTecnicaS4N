package pruebatecnicas4n;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Camilo Arango Ochoa
 */
public class NumerosTest {

    @Test
    public void testGetNumeros() {
        System.out.println("Prueba al metodo getNumeros");
        Numeros objetoPrueba= new Numeros(0); // Se envia el valor 0 al constructor de la clase
        int expResult = 0; //resultado esperado
        int result = objetoPrueba.getNumero(); //Solicita el numero al metodo getNumeros()
        assertEquals(expResult, result); //compara el resultado esperado y el resultado obtenido del metodo.
    }
    
    @Test
    public void testDevolverValor(){
        System.out.println("Prueba al metodo devolverValor");
        Numeros objetoPrueba= new Numeros(15); //creamos un objeto de la clase asignandole el valor 15
        String expResult= "FizzBuzz"; // Al ser el numero 15 divisible por ambos 3 y 5 debe devolver FizzBuzz
        String valorObtenido= objetoPrueba.devolverValor(); // asignamos el valor retornado por el metodo a la variable ValorObtenido
        assertEquals(expResult, valorObtenido); //Comparamos el valor obtenido y el esperado
        
        objetoPrueba.setNumero(7);//Prueba con un numero que no sea divisible por ninguno ni 5 ni 3
        expResult="7"; //el valor esperado debe ser el mismo numero.
        valorObtenido = objetoPrueba.devolverValor();
        assertEquals(expResult, valorObtenido);
        
        objetoPrueba.setNumero(12);//prueba con un numero divisible por 3
        expResult="Fizz";//se debe recibir el valor Fizz
        valorObtenido = objetoPrueba.devolverValor();
        assertEquals(expResult, valorObtenido);
        
        objetoPrueba.setNumero(20);//prueba con un numero divisible por 5
        expResult="Buzz";// se debe recibir el valor Buzz
        valorObtenido = objetoPrueba.devolverValor();
        assertEquals(expResult, valorObtenido);
    }
}
