
import java.io.File;
import java.io.IOException;

public class FileExample{
    public static void main(String[] args) throws IOException{
        // if not given throws IOExcetion then need to create try catch exception any one can be implemented
    File newfile = new File("Test.txt");
    try {
    if(newfile.createNewFile()){
        System.out.println("file created "+newfile.getName());

    }
    else{
        System.out.println("Not created");
    }
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    }
}