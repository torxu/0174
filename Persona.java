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
        metabolismoBasal = this.metabolismoBasal;
        caloriasIngeridas = this.caloriasIngeridas;
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
        if(sexoPersona){
            metabolismoBasal = ((10*kilogramosPersona)+(6*alturaPersona)+(5*edadPersona)+5);
        }
        else{
            metabolismoBasal = ((10*kilogramosPersona)+(6*alturaPersona)+(5*edadPersona)-161);
        }
        return caloriasComida;
    }

    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }
}
