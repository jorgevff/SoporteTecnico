import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        //al dividir con split la cadena se crea un array de cadenas y por eso se indica por ultimo la posicion de elemento a devolver, en este caso el primero
        //String inputLine = reader.nextLine().split(" ")[0];
        String inputLine = reader.nextLine();
        String[] arrayPalabras = inputLine.split(" ");
        
        HashSet<String> palabrasSeparadas = new HashSet<>();
        for(String palabraActual : arrayPalabras){
            palabrasSeparadas.add(palabraActual);
        }

        return palabrasSeparadas;
    }
}
