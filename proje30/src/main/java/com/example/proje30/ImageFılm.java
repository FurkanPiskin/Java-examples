package com.example.proje30;

import javafx.scene.image.Image;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImageFılm {

    public static ArrayList<String> Images()throws IOException {
        ArrayList<String> Images=new ArrayList<>();
        String path="Images.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader Freader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(Freader);
        String line;
        while((line= bufferedReader.readLine())!=null){
            Images.add(line);
            System.out.println(line);
        }
        bufferedReader.close();

       return Images;

    }





}
