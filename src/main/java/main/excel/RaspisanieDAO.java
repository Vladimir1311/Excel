package main.excel;

import java.util.ArrayList;
import java.util.List;

class RaspisanieDAO 
{
    public static List<Raspisanie> listRaspisanie() 
    {
        List<Raspisanie> list = new ArrayList<Raspisanie>();
        
        Raspisanie rasp = new Raspisanie("4 часа", "10 часов", "3,5 - 5 часов",
                "0 - 1 часа", "2,5 часа", "20 - 22,5 часа");
        
        list.add(rasp);
        
        return list;
    }
}