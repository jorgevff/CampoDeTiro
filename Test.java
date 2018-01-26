
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public void testCampoTiro()
    {
        System.out.println("Creamos un objeto Campo de Tiro");
        CampoDeTiro campoDeT1 = new CampoDeTiro();
        System.out.println("####################");
        System.out.println("Añadimos armas registradas al campo");
        campoDeT1.addArma("Revolver Star 38", 1206);
        campoDeT1.addArma("H&K G36", 4510);
        campoDeT1.addArma("Anchuzt Cal.22", 1324);
        campoDeT1.addArma("Barret 50", 3524);
        System.out.println("####################");
        System.out.println("Mostramos listado de armas");
        campoDeT1.mostrarArmasRegistradas();
        System.out.println("####################");
        System.out.println("Se fija la fecha de revision indicando su id, en este caso la 2");
        campoDeT1.cambiaFechaRevision(2, 2018, 7, 24);
        System.out.println("####################");
        System.out.println("Mostramos listado de armas");
        campoDeT1.mostrarArmasRegistradas();
        System.out.println("####################");
        System.out.println("Se borra el arma con numero de serie 3524");
        campoDeT1.eliminaArmaPorNumSerie(3524);
        System.out.println("Mostramos listado de armas");
        campoDeT1.mostrarArmasRegistradas();
        
    }
    
    public void testMayor()
    {
        System.out.println("Creamos un objeto Campo de Tiro");
        CampoDeTiro campoDeT1 = new CampoDeTiro();
        System.out.println("####################");
        System.out.println("Añadimos armas registradas al campo");
        campoDeT1.addArma("Revolver Star 38", 1206);
        campoDeT1.addArma("H&K G36", 4510);
        campoDeT1.addArma("Anchuzt Cal.22", 5324);
        campoDeT1.addArma("Barret 50", 3524);
        System.out.println("####################");
        campoDeT1.mostrarArmasRegistradas();
        System.out.println("####################");
        campoDeT1.mostrarArmasPorOrdenDeNumSerie();
        
        
    }
    
    
}
