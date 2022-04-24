package javafxapplication1;

public class practice extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField name = new TextField();
        VBox root = new VBox();
        root.getChildren().add(name);
        Button sub = new Button("Submit");
        root.getChildren().add(sub);
        VBox root2 = new VBox();
        Label l = new Label();
        sub.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                l.setText(name.getText());
            }
        });
        root2.getChildren().add(l);
        Scene scene1 = new Scene(root,300,250);
        Scene scene2 = new Scene(root2,300, 250);
        sub.setOnAction(e->primaryStage.setScene(scene2));
        primaryStage.setTitle("Choose a Color: ");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }	 	  	 		     	     	  	      	   	   	 	
    public static void main(String[] args) {
        launch(args);
    }
    
}









public class JavaFXApplication1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        
    }	 	  	 		     	     	  	      	   	   	 	
    public static void main(String[] args) {
        launch(args);
    }
    
}
