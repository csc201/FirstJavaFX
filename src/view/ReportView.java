package view;

import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Screen;

/**
 * Created by tkanchanawanchai6403 on 7/6/2016.
 */
public class ReportView {
    public ReportView(String report) {
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        TextArea parent = new TextArea();
        parent.setText(report);
        Main.getPrimaryStage().setScene(new Scene(parent, bounds.getWidth(),bounds.getHeight()));
    }
}
