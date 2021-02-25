import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static  File inputFile;
    static Scanner inputScanner;
    static ArrayList<HashSet<String>> intersections;
    static HashMap<String,Integer> trafficTime;
    static int D, I, S, V, F;
    static ArrayList <Street> streets;
    static ArrayList <String[]> cars;


    public static void main(String[] args) {

        readFile("Input/f.txt");
        writeFile("output/outf.txt");






    }

    private static void writeFile(String file) {
        PrintWriter outPrinter ;
        try {
            outPrinter=new PrintWriter(file);
            outPrinter.println(intersections.size());
            for (int i=0;i<intersections.size();i++){
                outPrinter.println(i);
                intersections.get(i).forEach(e->{
                    outPrinter.println(e+" "+trafficTime.get(e));
                });
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void readFile(String file){


        inputFile = new File(file);


        try {
            inputScanner = new Scanner(inputFile);
        }catch (FileNotFoundException ex){
            System.out.println(ex);
        }





        String[] numbers = inputScanner.nextLine().trim().split(" ");
        D = Integer.parseInt(numbers[0]);
        I = Integer.parseInt(numbers[1]);
        S = Integer.parseInt(numbers[2]);
        V = Integer.parseInt(numbers[3]);
        F = Integer.parseInt(numbers[4]);

        streets = new ArrayList(S);
        for (int i = 0; i< S ; i++) {
            String[] street = inputScanner.nextLine().trim().split(" ");
            streets.add(new Street(Integer.parseInt(street[0]),Integer.parseInt(street[1]),
                    street[2],Integer.parseInt(street[3])));

        }


        cars = new ArrayList<>();
        for (int i = 0; i< V ; i++) {
            String[] car = inputScanner.nextLine().trim().split(" ");
            car = Arrays.copyOfRange(car, 1, car.length);

            cars.add(car);

        }





        inputScanner.close();

    }



}
