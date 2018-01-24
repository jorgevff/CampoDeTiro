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
    
    
   
        
}
