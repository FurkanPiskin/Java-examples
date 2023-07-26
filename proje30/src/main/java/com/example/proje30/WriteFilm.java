package com.example.proje30;



import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class WriteFilm {
    public static int rastfilm;
    public static ArrayList<String> filmS() throws IOException {
        ArrayList<String> filmler=new ArrayList<>();
            String path = "S.txt";
            File file = new File(path);
        FileReader Freader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(Freader);
        String line;
        while((line= bufferedReader.readLine())!=null){
            filmler.add(line);

        }
        bufferedReader.close();
        return filmler;
    }
    public static void RastFilm(){

        Random random=new Random();
        rastfilm= random.nextInt(250)+1;

    }
    public static int getRastfilm(){
        return rastfilm;
    }



}

