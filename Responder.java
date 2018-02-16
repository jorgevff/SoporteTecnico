import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private ArrayList<String> respuestasAleatorias;
    private HashMap<HashSet<String>, String> respuestas;
    private Random aleatorio;

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {

        aleatorio = new Random();
        respuestas = new HashMap<>();
        respuestasAleatorias = new ArrayList<>();

        respuestasAleatorias.add("Instrucción incorrecta");
        respuestasAleatorias.add("Pensando...");
        respuestasAleatorias.add("Indica mejor el problema");
        respuestasAleatorias.add("Eso estodo amigos!!");
        //creamos conjuntos

        HashSet<String> conjunto1 = new HashSet<>();
        conjunto1.add("menu");
        conjunto1.add("archivo");

        HashSet<String> conjunto2 = new HashSet<>();
        conjunto2.add("reinicio");
        conjunto2.add("reseteo");

        HashSet<String> conjunto3 = new HashSet<>();
        conjunto3.add("problema");
        conjunto3.add("menu");

        HashSet<String> conjunto4 = new HashSet<>();
        conjunto4.add("power");
        conjunto4.add("bucle");
        conjunto4.add("of");

        respuestas.put(conjunto1, "Prueba con la primera pestaña");
        //porque con la primera en mayuscula no funciona?
        respuestas.put(conjunto2, "Reinicia por segunda vez");
        respuestas.put(conjunto3, "Sigue los pasos tres y cuatro del manual");
        respuestas.put(conjunto4, "Tira de la palanca...");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> palabraClave)
    {
        String respuesta = null;

        respuesta = respuestas.get(palabraClave);
        /**String palabraIntroducidaPorTeclado = "";
        for(String palabra : palabraClave){
        palabraIntroducidaPorTeclado = palabra;  
        }
         **/

        if(respuesta == null){
            // int posicionAleatoria = aleatorio.nextInt(respuestasAleatorias.size());
            //respuesta = respuestasAleatorias.get(posicionAleatoria)
            if(respuestasAleatorias.size() > 0){
                //remove elimina el objeto y lo devuelve por lo que no hace falta extraerlo con el metodo get
                respuesta = respuestasAleatorias.remove(aleatorio.nextInt(respuestasAleatorias.size()));
            }
            else{
                respuesta = "No entiendo la pregunta, vuelva a empezar";
            }
        }

        return respuesta;
    }
}
