package LAB_11_FX;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/*@author Somit Jain*/
public class login extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        logins l = new logins();
        l.log(primaryStage);
    }
}
class logins{
    Label name = new Label("Enter name: ");
    TextField naam = new TextField();
    Label pass = new Label("Enter password: ");
    TextField pas = new TextField();
    Label color = new Label();
    TextField rang = new TextField();
    public void log(Stage ps){
        GridPane root = new GridPane();
        Scene sc = new Scene(root);
        ps.setScene(sc);
        ps.setHeight(700);
        ps.setWidth(700);
        ps.show();
        
    }
    
}

