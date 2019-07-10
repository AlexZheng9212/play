import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.StringBuilder;

public class demo11{
    public static void main(String[] args) {
        // String file = "./abc.txt";
        File f = new File("./abc.txt");
        if(f.exists()) System.out.println("true");
        try(InputStreamReader reader = new InputStreamReader(new FileInputStream(f))){
            StringBuilder sb = new StringBuilder();
            int character = reader.read();
            while(character != -1){
                sb.append((char) character);
                character = reader.read();
            }
            System.out.println(sb.toString());
        }catch(IOException exception){

        }
        
        

    }
}



