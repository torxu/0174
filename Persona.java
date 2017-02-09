import java.util.*;
public class Persona
{
    private String nombrePersona;
    private boolean sexoPersona;
    private int kilogramosPersona;
    private int alturaPersona;
    private int edadPersona;
    private int caloriasIngeridas;
    private int metabolismoBasal;

    public Persona(String nombre, boolean sexo, int kilogramos, int altura, int edad)
    {
        nombrePersona = nombre;
        sexoPersona = sexo;
        kilogramosPersona = kilogramos;
        alturaPersona = altura;
        edadPersona = edad;
        caloriasIngeridas = this.caloriasIngeridas;
        if(sexoPersona){
            metabolismoBasal = ((10*kilogramosPersona)+(6*alturaPersona)+(5*edadPersona)+5);
        }
        else{
            metabolismoBasal = ((10*kilogramosPersona)+(6*alturaPersona)+(5*edadPersona)-161);
        }
    }

    public int comer(Comida comidaConsumida)
    {
        int caloriasComida = 0;
        if(caloriasIngeridas <= metabolismoBasal){
            caloriasIngeridas = caloriasIngeridas + comidaConsumida.getCalorias();
            caloriasComida = comidaConsumida.getCalorias();
        }
        else{
            caloriasComida = -1;
        }
        return caloriasComida;
    }

    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }
    
    public String contestar(String pregunta)
    {
        String preguntaComparada = pregunta;
        String comentario = pregunta;
        if(caloriasIngeridas > metabolismoBasal || preguntaComparada.length()%3 == 0){
            comentario = "SI";
        }
        else{
            comentario = "NO";
        }
        if(caloriasIngeridas > metabolismoBasal || preguntaComparada.contains(nombrePersona)){
            comentario = pregunta.toUpperCase();
        }
        System.out.println(comentario);
        
        return comentario;
    }
}
