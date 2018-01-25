import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;
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

    public void mostrarArmasPorOrdenDeNumSerie()
    {
        ArrayList<Arma> armaABuscar = new ArrayList<Arma>();
        Arma armaOrdenada = null;
        
        int indice = 0;
        while (indice < armas.size()){         
            armaOrdenada = armas.get(indice);
            armaABuscar.add(armaOrdenada);
            indice++;
        }
        

        

    }
    
    public ArrayList<Arma> localizaMayorImprimeYLoBorra(ArrayList<Arma> armaMayorNumero)
    {
        ArrayList<Arma> armaABuscar = new ArrayList<Arma>();
        Arma armaOrdenada = null;
        int indice = 0;
        int numeroSerieMayor = 0;
        while (indice < armaMayorNumero.size()){         
            armaOrdenada = armaMayorNumero.get(indice);
            armaABuscar.add(armaOrdenada);
            if(armaOrdenada.obtenerNumeroSerie() > numeroSerieMayor){
                numeroSerieMayor = armaOrdenada.obtenerNumeroSerie();
                System.out.println(armaOrdenada.caracteristicasArmaRegistrada());
                armaABuscar.remove(armaOrdenada);
            }
            indice++;
        }

        return armaABuscar;
    }
    /**
     * 
     */
    
    public void cambiaFechaRevision(int identificador, int anio, int mes, int dia)
    {
        int numId = identificador;
        int posicion = 0;
        while(posicion >= 0 && posicion < armas.size()){
            Arma armaACambiarFecha = armas.get(posicion);
            
            if(armaACambiarFecha.numIdentificativo() == numId){
                armaACambiarFecha.fijaFechaRevision(anio, mes, dia);
            }
            posicion++;
        }
    }
    
    public void eliminaArmaPorNumSerie(int numeroSerie)
    {
        Iterator<Arma> iterador = armas.iterator();
        while(iterador.hasNext()){
            Arma armaAEliminar = iterador.next();
            int numeroSerieBuscar = armaAEliminar.obtenerNumeroSerie();
            if(numeroSerieBuscar == numeroSerie){
                iterador.remove();
            }
        }
                    
        
    }

}
