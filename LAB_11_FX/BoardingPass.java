package LAB_11_FX;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/*@author Somit Jain*/
class dbmsconnction{
    String url;
    String uname;
    String pwd;
    public dbmsconnction(String url, String uname, String pwd) {
        this.url = url;
        this.uname = uname;
        this.pwd = pwd;
    }
    public Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Connection con=null;//Establish a connection
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();//loads the driver
        //define the connection propertiesi.e dbname, username and password
        con=DriverManager.getConnection(url,uname,pwd);
        return con;
    }
    public void close(Connection con,Statement stmt) throws SQLException{
        stmt.close();
        con.close();
        System.out.println("Connection closed");
    }
}
class Passenger{
    private String name,source,dest,date,clas;
    int pass;
    public Passenger(String name, String source, String dest, int pass, String date, String clas){
        this.name = name;
        this.source = source;
        this.dest = dest;
        this.pass = pass;
        this.date = date;
        this.clas = clas;
    }
    public void insertpassenger() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        dbmsconnction dbmscon=new dbmsconnction("jdbc:mysql://localhost:3306/boardingpass_l11","root","");
        Connection con=dbmscon.getConnection();
        String sql="insert into passenger_details values(?,?,?,?,?,?);";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1,name);
        stmt.setString(2,source);
        stmt.setString(3,dest);
        stmt.setInt(4,pass);
        stmt.setString(5,date);
        stmt.setString(6,clas);
        int i=stmt.executeUpdate();
        dbmscon.close(con, stmt);
       }      
}
public class BoardingPass extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label l1 = new Label("20BDS0181 Somit Jain");
        Label name = new Label("Name:");
        TextField na = new TextField();
        Label source = new Label("Source: ");
        TextField so = new TextField();
        Label dest = new Label("Destination: ");
        TextField de = new TextField();
        Label pass = new Label("Passengers: ");
        ComboBox pa = new ComboBox();
        pa.getItems().add(1);
        pa.getItems().add(2);
        pa.getItems().add(3);
        pa.getItems().add(4);
        pa.getItems().add(5);
        pa.getItems().add(6);
        Label date = new Label("Date: ");
        DatePicker da = new DatePicker();
        Label clas = new Label("Class: ");
        ComboBox cl = new ComboBox();
        cl.getItems().add("FIRST");
        cl.getItems().add("BUSINESS");
        cl.getItems().add("ECONOMY");
        GridPane root = new GridPane();
        root.add(l1, 0, 0);
        root.add(name,0,1);
        root.add(na, 1, 1);
        root.add(source,0,2);
        root.add(so,1,2);
        root.add(dest,0,3);
        root.add(de,1,3);
        root.add(pass,0,4);
        root.add(pa,1,4);
        root.add(date,0,5);
        root.add(da,1,5);
        root.add(clas,0,6);
        root.add(cl,1,6);
        Button sub = new Button("Book");
        root.add(sub,1,8);
        Scene scene1 = new Scene(root, 300, 250);
        
        
        
        VBox root2 = new VBox();
        Scene scene2 = new Scene(root2,300, 250);
        Label l2 = new Label();
        l2.setText("BOARDING PASS");
        Label kon = new Label();
        Label kaha = new Label();
        Label kitne = new Label();
        Label kab = new Label();
        Label kaise = new Label();
        root2.getChildren().addAll(l2,kon,kaha,kab,kitne,kaise);
        sub.setOnAction((e)->{primaryStage.setScene(scene2);
            
            kon.setText("PASSENGER "+na.getText()+" IS TRAVELLING FROM ");
            kaha.setText(so.getText()+"  TO  "+de.getText());
            kab.setText("ON "+da.getValue());
            kitne.setText("WITH "+pa.getValue()+" PASSENGERS");
            kaise.setText("IN "+cl.getValue()+" CLASS");
        });
        sub.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                LocalDate localDate = da.getValue();//For reference
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
                String formattedString = localDate.format(formatter);
                Passenger p = new Passenger(na.getText(),so.getText(),de.getText(),(int)pa.getValue(),formattedString,(String)cl.getValue());
                try {
                    p.insertpassenger();
                    System.out.println("Record Entered");
                } catch (SQLException ex) {
                    Logger.getLogger(BoardingPass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BoardingPass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(BoardingPass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(BoardingPass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    });
        
        primaryStage.setTitle("FILL YOUR INFO: ");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }   
}
