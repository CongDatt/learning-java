import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Hello {
    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("output.txt");
            String arr[] = {"a", "b", "c"};
            for(String i : arr) {
                myWriter.write(i);
            }
            myWriter.close();
        }
        catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data.split(" "));
            }
            myReader.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}