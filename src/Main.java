import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static  File inputFile, outFile;
    static Scanner inputScanner;
    static PrintWriter outPrinter ;

    static HashSet<Street>[] intersections;
    static HashMap<String,Integer> trafficTime;
    static int D, I, S, V, F;
    static ArrayList <Street> streets;
    static ArrayList <String[]> cars;


    public static void main(String[] args) {

        readFile("Input/f.txt");
        intersections=new HashSet[I];
        streets.forEach(e->{
            if (intersections[e.getEnd()]==null)
                intersections[e.getEnd()]=new HashSet<>();
            intersections[e.getEnd()].add(e);
        });
        dhade();
        writeFile("output2/outf.txt");






    }

    private static void writeFile(String source) {
        outFile = new File(source);
        try {
            outPrinter=new PrintWriter(outFile);
            outPrinter.println(intersections.length);
            for (int i=0;i<intersections.length;i++){
                outPrinter.println(i);
                outPrinter.println(intersections[i].size());
                intersections[i].forEach(e->{
                    outPrinter.println(e.getName()+" "+trafficTime.get(e.getName()));
                });
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        outPrinter.close();

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
    static void dhade(){
        Random a=new Random();
        trafficTime=new HashMap<>(streets.size());
        for (int i=0;i<intersections.length;i++)
        {
            intersections[i].forEach(s->{
                trafficTime.put(s.getName(),1+( a.nextInt()%2));
            });
        }
    }
    public static void huth(int id){
        if(id>6){
            System.out.println("go first");
            int xx=22;
        }
    }



}
