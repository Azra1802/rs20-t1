package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class Controller {


    public Label labela;
    public GridPane gridp;

    public void dugmeClick(ActionEvent actionEvent) {
        labela.setText("Hello World!");
        //gridp.setBackground(Color.pink);

        
    }
}
