package chess.ui;

import java.io.IOException;

import javafx.fxml.FXML;

public class GameScreenController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("startScreen");
    }
}