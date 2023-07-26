package com.example.proje30;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


import java.io.IOException;
import java.util.ArrayList;

public class FX {
    static int clickedcount = 0;
    String[] TextFilm = new String[8];
    String[] RastFilm = new String[8];
    String[] ImageFilm=new String[2];
    public void setText(TextField src, Button B1, Button B2, Button B3, Button B4, Button B5, Button B6, BorderPane pane,Label panelbl
    ,ImageView imageView)
            throws IOException {
        ArrayList<String> films = WriteFilm.filmS();
        ArrayList<String> images=ImageFılm.Images();
        int rastfilm=WriteFilm.getRastfilm();
        RastFilm = films.get(rastfilm).split(";");
        for (int i = 1; i < 251; i++) {
            TextFilm = films.get(i).split(";");
            ImageFilm=images.get(i).split(";");
            int a = TextFilm[1].compareToIgnoreCase(src.getText());
            if (a == 0) {
                if (RastFilm[1].compareToIgnoreCase(src.getText()) != 0) {
                    B1.setVisible(true);B2.setVisible(true);B3.setVisible(true);
                    B4.setVisible(true);B5.setVisible(true);B6.setVisible(true);
                    Imagess(ImageFilm[1],imageView);
                    B1.setText(TextFilm[1]);
                    B2.setText(TextFilm[2]);
                    B3.setText(TextFilm[3]);
                    B4.setText(TextFilm[4]);
                    B5.setText(TextFilm[5]);
                    B6.setText(TextFilm[6]);
                    B1.setTextFill(Color.RED);
                    if (RastFilm[2].compareToIgnoreCase(TextFilm[2]) == 0) B2.setTextFill(Color.GREEN);
                    else B2.setTextFill(Color.RED);
                    if (RastFilm[3].compareToIgnoreCase(TextFilm[3]) == 0) B3.setTextFill(Color.GREEN);
                    else B3.setTextFill(Color.RED);
                    if (RastFilm[4].compareToIgnoreCase(TextFilm[4]) == 0) B4.setTextFill(Color.GREEN);
                    else B4.setTextFill(Color.RED);
                    if (RastFilm[5].compareToIgnoreCase(TextFilm[5]) == 0) B5.setTextFill(Color.GREEN);
                    else B5.setTextFill(Color.RED);
                    if (RastFilm[6].compareToIgnoreCase(TextFilm[6]) == 0) B6.setTextFill(Color.GREEN);
                    else B6.setTextFill(Color.RED);
                    if(clickedcount==5){
                        ImageFilm=images.get(rastfilm).split(";");
                        Imagess(ImageFilm[1],imageView);
                        pane.setVisible(true);
                        panelbl.setText("YOU LOST;FİLM İS  "+RastFilm[1].toUpperCase());
                    }


                }
                else if(RastFilm[1].compareToIgnoreCase(src.getText()) == 0){
                    B1.setVisible(true);B2.setVisible(true);B3.setVisible(true);
                    B4.setVisible(true);B5.setVisible(true);B6.setVisible(true);
                    Imagess(ImageFilm[1],imageView);
                    B1.setText(RastFilm[1]);
                    B2.setText(RastFilm[2]);
                    B3.setText(RastFilm[3]);
                    B4.setText(RastFilm[4]);
                    B5.setText(RastFilm[5]);
                    B6.setText(RastFilm[6]);
                    B1.setTextFill(Color.GREEN);
                    B2.setTextFill(Color.GREEN);
                    B3.setTextFill(Color.GREEN);
                    B4.setTextFill(Color.GREEN);
                    B5.setTextFill(Color.GREEN);
                    B6.setTextFill(Color.GREEN);
                    pane.setVisible(true);

                }
            }

        }
        src.setText("");
    }

    public static int ClickedCount(){
        return clickedcount=clickedcount+1;
    }
    public static void Imagess(String url,ImageView imageView){
        Image ımage=new Image(url);
        imageView.setImage(ımage);
    }

}
