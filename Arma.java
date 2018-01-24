import java.time.LocalDate;
/**
 * Write a description of class Arma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arma
{
    // se declaran las variables
    private String modelo;
    private int numeroSerie;
    private LocalDate fechaRevision;
    
    public Arma(String nuevoModelo, int nuevoNumeroSerie)
    {
        modelo = nuevoModelo;
        numeroSerie = nuevoNumeroSerie;
        fechaRevision = null;
    }
    
    public String obtenerModelo()
    {
        return modelo;
    }
    
    public int obtenerNumeroSerie()
    {
        return numeroSerie;
    }
    
    public void fijaFechaRevision(int anio, int mes, int dia)
    {
        fechaRevision = LocalDate.of(anio, mes, dia);
    }
    
    public LocalDate fechaRevision()
    {
        return fechaRevision;
    }
    
    
        
    
    
   
        
}
