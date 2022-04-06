package Pres;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3_Springxml
{
    public static void main(String[] args)
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("AppContext.xml");
        IMetier metier = (IMetier) context.getBean("Metier");
        System.out.println("Res => " + metier.calcul());
    }
}
