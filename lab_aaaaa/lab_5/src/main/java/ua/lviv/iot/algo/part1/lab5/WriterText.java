package ua.lviv.iot.algo.part1.lab5;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter

public class WriterText {
    private String text="";

    public void WriterFile(String roadToFile){
        try(FileReader reader = new FileReader(roadToFile)){
            int current;
            List<String> Words = new ArrayList<String>();
            while ((current = reader.read()) != -1){
                text +=(char)current;
            }

             System.out.println(text);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

}
