package extension1;

import Dao.IDao;

public class IDaoImpl2 implements IDao
{
    @Override
    public double getData()
    {
        System.out.println("Version 2 : ");
        double temp = 1111;
        return temp;
    }
}
