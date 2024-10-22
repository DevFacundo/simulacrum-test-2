import com.fasterxml.jackson.databind.ObjectMapper;
import model.Airport;
import service.AirportService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CREATE OBJECTS
        Scanner scanner = new Scanner(System.in);
        File filetest = new File("G6UyHYt7.json");
        File fileAirports_parameter = new File ("airports-parameter.json");
        AirportService as = new AirportService();
        ObjectMapper mapper = new ObjectMapper();


        //CREATING ARRAYS
        List<Airport>airports = as.readFile(filetest,mapper);
        List<Airport>airportsParameters = new ArrayList<>();
        // ask for new capacity to add a new file
        System.out.println("What capacity do u preffer to create a new file ?");
        Integer capacity = scanner.nextInt();

        as.passToNewArray(airports,airportsParameters,capacity);
        as.createNewFile(fileAirports_parameter,mapper,airportsParameters);
        as.readFile(filetest,mapper);






    }
    }

