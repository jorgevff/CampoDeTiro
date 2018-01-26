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
        if(numeroSerie >= 0){
            Arma nuevaArma = new Arma(numeroIdentificativo, modelo, numeroSerie);
            numeroIdentificativo++;
            armas.add(nuevaArma);
        }
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

    public ArrayList<Arma> mostrarArmasPorOrdenDeNumSerie()
    {
        ArrayList<Arma> armasCopia = new ArrayList<Arma>();

        int indice = 0;
        while (indice < armas.size()){         
            armasCopia.add(armas.get(indice));
            indice++;
        }
        
        
        
        
        
        return localizaMayorImprimeYLoBorra(armas);

    }

    public ArrayList<Arma> localizaMayorImprimeYLoBorra(ArrayList<Arma> armaMayorNumero)
    {
        int numeroSerieMayor = 0;
        Arma armaOrdenada = null;
        int posicionMayor = 0;

        int indice = 0;
        while (indice < armaMayorNumero.size()){         
            Arma armaActual = armaMayorNumero.get(indice);
            if(armaActual.obtenerNumeroSerie() > numeroSerieMayor){
                numeroSerieMayor = armaActual.obtenerNumeroSerie();
                armaOrdenada = armaActual;
                posicionMayor = indice;
                
            } 

            indice++;
        }
        System.out.println(armaOrdenada.caracteristicasArmaRegistrada());
        armaMayorNumero.remove(posicionMayor);

        return armaMayorNumero;
    }

    /**
     * 
     */

    public void cambiaFechaRevision(int identificador, int anio, int mes, int dia)
    {
        int posicion = 0;
        while(posicion >= 0 && posicion < armas.size()){
            Arma armaACambiarFecha = armas.get(posicion);

            if(armaACambiarFecha.numIdentificativo() == identificador){
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
