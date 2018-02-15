import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private HashMap<String, String> respuestas;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new HashMap<>();
        
        respuestas.put("menu", "Prueba con la primera pestaña");
        //porque con la primera en mayuscula no funciona?
        respuestas.put("reinicio", "Reinicia por segunda vez");
        respuestas.put("problema", "Sigue los pasos tres y cuatro del manual");
        respuestas.put("power", "Tira de la palanca...");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String palabraClave)
    {
        String respuesta =  respuestas.get(palabraClave);
        if(respuesta != null){
            respuesta = respuestas.get(palabraClave);
        }
        else{
            respuesta = "Buena pregunta, puedes especificar tu problema?";
        }
        
        return respuesta;
    }
}
