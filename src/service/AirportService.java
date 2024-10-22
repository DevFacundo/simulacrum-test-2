package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Airport;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirportService {

    public List<Airport> readFile(File file, ObjectMapper mapper)
    {
        try
        {
           return mapper.readValue(file,mapper.getTypeFactory().constructCollectionType(ArrayList.class, Airport.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void passToNewArray (List<Airport> list, List<Airport> newlist, Integer capacity)
    {
        for (Airport a: list)
        {
            if (a.getCapacity()>=capacity)
            {
                newlist.add(a);
            }
        }
    }
    public void createNewFile (File file, ObjectMapper mapper,List<Airport> list )
    {
       try
       {
          mapper.writeValue(file, list);
       }catch (IOException e)
       {
           e.printStackTrace();
       }
    }
   /* public List<String> PassToStringArray (List<Airport>airports )
    {

    }
    public List<String> PassToStringArray (List<Airport>airports )
    {

    }*/


}
