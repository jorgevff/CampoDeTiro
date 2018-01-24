import java.util.ArrayList;
import java.time.LocalDate;
/**
 * Write a description of class CampoDeTiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CampoDeTiro
{
    //se crea un campo para guardar una coleccion de armas registradas
    private ArrayList<Arma> armas;
    int numeroIdentificativo;
    //Se crea el constructor y se incializa nuestro ArrayList
    public CampoDeTiro()
    {
        armas = new ArrayList<Arma>();
        numeroIdentificativo = 0;
    }

    /**
     * Se añaden 
     */

    public void addArma(String modelo, int numeroSerie)
    {

        Arma nuevaArma = new Arma(numeroIdentificativo, modelo, numeroSerie);
        numeroIdentificativo++;
        armas.add(nuevaArma);
    }

    public void mostrarArmasRegistradas()
    {
        if(armas.size() > 0){

            for(Arma arma : armas){
                System.out.println(arma.caracteristicasArmaRegistrada());

            }
        }
        else{
            System.out.println("No hay armas registradas");
        }

    }
        
    
}
