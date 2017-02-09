public class Comida
{
    private String nombreComida;
    private int caloriasComida;
    
    public Comida(String comida, int calorias)
    {
        nombreComida = comida;
        caloriasComida = calorias;
    }
    
    public int getCalorias()
    {
        return caloriasComida;
    }
}
