package chess.ui;

import java.io.IOException;

import javafx.fxml.FXML;

public class StartScreenController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("gameScreen");
    }
}
