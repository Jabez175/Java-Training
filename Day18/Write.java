
import java.io.BufferedWriter;
import java.io.IOException;

public class Write{
    public static void main(String[] args){
        try {
            //FileWriter writer= new FileWriter("Test.txt");
            BufferedWriter writer= new BufferedWriter("Test.txt");
            writer.write("Write using file writer");
            writer.close();
        } catch (IOException e) {

        }
    }
}