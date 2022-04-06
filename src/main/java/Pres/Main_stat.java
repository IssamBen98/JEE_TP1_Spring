package Pres;
import Metier.IMetierImpl;
import extension1.IDaoImpl2;

public class Main_stat
{
    public static void main(String[] args)
    {
        /* Injection des dependances par des
           Instanciations statiques : new()
        */

       // IDaoImpl dao = new IDaoImpl();
        IDaoImpl2 dao2 = new IDaoImpl2();
        IMetierImpl metier = new IMetierImpl();
        metier.setDao(dao2); /* On a satisfait les dependances */
        System.out.println("Res : " + metier.calcul());
    }
}
