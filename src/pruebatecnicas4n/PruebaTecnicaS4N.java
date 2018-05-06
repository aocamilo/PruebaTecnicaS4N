package pruebatecnicas4n;

/**
 *
 * @author Camilo Arango Ochoa
 */
public class PruebaTecnicaS4N {
    
    public static void main(String[] args) {
        String resultado[]= new String [100]; //Array para guardar los resultados obtenidos luego de validar el numero
        for(int i=0; i<100; i++){ 
            Numeros numeros= new Numeros(i+1); //Se envian los valores de 1-100 al constructor
            resultado[i]= numeros.devolverValor(); // Se valida el numero actual y se guarda en la posición i del array resultados.
        }
        
        for(int i=0; i<resultado.length; i++){ //Recorre el array para imprimir el valor en cada posición
            System.out.println(resultado[i]);
        }
    }
    
}
