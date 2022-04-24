package LAB_11_FX;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Colors extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label l1 = new Label("20BDS0181 Somit Jain");
        Button r = new Button("Red");
        r.setStyle("-fx-background-color: Red");
        Button p = new Button("Pink");
        p.setStyle("-fx-background-color: Pink");
        Button b = new Button("Blue");
        b.setStyle("-fx-background-color: Aqua");
        Button g = new Button("Green");
        g.setStyle("-fx-background-color: LightGreen");
        Button bl = new Button("Black");
        bl.setStyle("-fx-background-color: Black");
        bl.setTextFill(Color.WHITE);
        r.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Red");
            }
        });
        p.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {	 	  	 		     	     	  	      	   	   	 	
                System.out.println("Pink");
            }
        });
        g.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Green");
            }
        });
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Blue");
            }
        });
        bl.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Black");
            }
        });
        VBox root = new VBox();
//        root.setPadding(new Insets(50,100,50,50));
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        root.getChildren().add(l1);
        root.getChildren().add(r);
        root.getChildren().add(g);
        root.getChildren().add(b);
        root.getChildren().add(p);
        root.getChildren().add(bl);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Choose a Color: ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }	 	  	 		     	     	  	      	   	   	 	
    public static void main(String[] args) {
        launch(args);
    }
    
}
