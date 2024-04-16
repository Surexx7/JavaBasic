package fileoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOperation {

    public static void  filesContentLoader(){
        //Number.txt
        //Odd.txt
        //Even.txt
        System.out.println("File Content Loading completed!");
    }

    public void displayRespectiveFileContent(String fileName){

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
