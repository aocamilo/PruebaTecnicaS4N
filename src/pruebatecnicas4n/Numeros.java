package pruebatecnicas4n;
/**
 *
 * @author Camilo Arango Ochoa
 */
public class Numeros {
    int numero;

    public Numeros(int numero) { //Constructor
        this.numero = numero;
    }
    
    public int getNumero(){ //Getter del atributo numero
        return this.numero;
    }
    
    public void setNumero(int numero){ //Setter del atributo numero
        this.numero= numero;
    }
    
    public String devolverValor(){
        int comparador = this.getNumero();
        if((comparador % 15) == 0){ //Numeros divisibles por 3 y 5 (3*5)= 15
            return "FizzBuzz";
        }else if((comparador %3) == 0){ //Numeros divisibles por 3
            return "Fizz";
        }else if ((comparador %5) ==0){ //Numeros divisitbles por 5
            return "Buzz";
        }
        return String.valueOf(comparador); //Convierte a String el valor del entero y lo devuelve.
    }
    
}
