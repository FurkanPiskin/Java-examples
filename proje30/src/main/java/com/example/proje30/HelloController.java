package com.example.proje30;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class HelloController {

    @FXML
    private Label panelbl;
    @FXML
    private  TextField text;
    @FXML
    private Button srcbutton;
    @FXML
    private Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B10;
    @FXML
    private Button B11,B12,B13,B14,B15,B16,B17,B18,B19,B20;
    @FXML
    private Button B21,B22,B23,B24,B25,B26,B27,B28,B29,B30;
    @FXML
    private Button ReadyButton;
    @FXML
    private BorderPane borderpane;
    @FXML
    private ImageView imageView;
    @FXML
    protected void searchbutton() throws IOException {
        FX fx=new FX();
        int clicked=FX.ClickedCount();
        if(clicked==1) fx.setText(text,B1,B2,B3,B4,B5,B6,borderpane,panelbl,imageView);
        else if(clicked==2) fx.setText(text,B7,B8,B9,B10,B11,B12,borderpane,panelbl,imageView);
        else if(clicked==3) fx.setText(text,B13,B14,B15,B16,B17,B18,borderpane,panelbl,imageView);
        else if(clicked==4) fx.setText(text,B19,B20,B21,B22,B23,B24,borderpane,panelbl,imageView);
        else if(clicked==5) fx.setText(text,B25,B26,B27,B28,B29,B30,borderpane,panelbl,imageView);


    }
    @FXML
    protected void ReadyButton()
    {
           WriteFilm.RastFilm();
           ReadyButton.setVisible(false);
           srcbutton.setVisible(true);
    }
    @FXML
    protected void RestartButton() {
        borderpane.setVisible(false);
        text.setText("");
        FX.clickedcount=0;
        B1.setText(""); B2.setText(""); B3.setText(""); B4.setText(""); B5.setText(""); B6.setText("");
        B7.setText(""); B8.setText(""); B9.setText(""); B10.setText(""); B11.setText(""); B12.setText("");
        B13.setText(""); B14.setText(""); B15.setText(""); B16.setText(""); B17.setText(""); B18.setText("");
        B19.setText(""); B20.setText(""); B21.setText(""); B22.setText(""); B23.setText(""); B24.setText("");
        B25.setText(""); B26.setText(""); B27.setText(""); B28.setText(""); B29.setText(""); B30.setText("");
        B1.setVisible(false);B2.setVisible(false);B3.setVisible(false);B4.setVisible(false);B5.setVisible(false);
        B6.setVisible(false);B7.setVisible(false);B8.setVisible(false);B9.setVisible(false);B10.setVisible(false);
        B11.setVisible(false);B12.setVisible(false);B13.setVisible(false);B14.setVisible(false);B15.setVisible(false);
        B16.setVisible(false);B17.setVisible(false);B18.setVisible(false);B19.setVisible(false);B20.setVisible(false);
        B21.setVisible(false);B22.setVisible(false);B23.setVisible(false);B24.setVisible(false);B25.setVisible(false);
        B26.setVisible(false);B27.setVisible(false);B28.setVisible(false);B29.setVisible(false);B30.setVisible(false);
        ReadyButton.setVisible(true);
        srcbutton.setVisible(false);
        imageView.setImage(null);
    }


}