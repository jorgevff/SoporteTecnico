import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private ArrayList<String> respuestas;
    private Random aleatorio;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<>();
        aleatorio = new Random();
        respuestas.add("Prueba con la primera pestaña");
        respuestas.add("Reinicia por segunda vez");
        respuestas.add("Sigue los pasos tres y cuatro del manual");
        respuestas.add("Eso estodo amigos!!");
        respuestas.add("Tira de la palanca...");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        String respuestaAleatoria = "";
        int posicionAleatoria = aleatorio.nextInt(respuestas.size());
        respuestaAleatoria = respuestas.get(posicionAleatoria);
        
        return respuestaAleatoria;
    }
}
