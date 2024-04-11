package file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class FileToWrite {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("csitThird.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello, this is CSIT third semester!\nI am Learning Java");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
