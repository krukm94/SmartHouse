package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class Controller {

    @FXML
    TableView eventsTableView;

    @FXML
    public void initialize()
    {
        eventsTableView.setPlaceholder(new Label("Brak zdarzeń"));
    }
}
