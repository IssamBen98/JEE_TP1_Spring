package Pres;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main2_dynam
 {
    public static void main(String[] args) throws Exception
    {
        /* Lire le fichier texte, s'il existe  */
            Scanner s = new Scanner(new File("config.txt"));

        /* Lire la premiere ligne du fichier texte */
            String daoClassName = s.nextLine();

        /* Instanciation dynamique de la classe : 1ere ligne*/
            Class cDao = Class.forName(daoClassName);

            /* La classe mentionnee dans le fichier txt (IDaoImpl)
               est chargee en memoire, si elle existe sous
               forme d'un objet de type "Class" */

        /* Creation d'un objet de la classe */
           IDao objDao = (IDao) cDao.newInstance();

        /* Meme procedure pour la classe IMetierImpl*/
            String metierClassName = s.nextLine();
            Class cmetier = Class.forName(metierClassName);
            IMetier objMetier = (IMetier) cmetier.newInstance();

        /* On applique dynamiquenent la methode SetDao */
            Method methode = cmetier.getMethod("s  etDao",IDao.class);

        /* On attribue la methode à l'objet objMetier en
           inserant l'objet objDao come parametre
        */
            methode.invoke(objMetier,objDao);

        System.out.println(objDao.getData());
        System.out.println(objMetier.calcul());
    }
}
