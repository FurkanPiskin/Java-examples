package com.example.proje30;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.util.ArrayList;

public class deneme {
    static int a=0;
    public static void A(){
        a=a+1;
    }

    public static void main(String[] args)throws IOException {
      WriteFilm.RastFilm();
      System.out.println(WriteFilm.getRastfilm());
      WriteFilm.RastFilm();
        System.out.println(WriteFilm.getRastfilm());
        // if (!file.exists()) {
        //file.createNewFile();
        // }
        //FileWriter fileWriter=new FileWriter(file,true);
        // BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        //bufferedWriter.write(val);
        //bufferedWriter.close();

    }
}
