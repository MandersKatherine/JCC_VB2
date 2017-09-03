import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        stage.initStyle(StageStyle.TRANSPARENT);
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));

        Scene scene = new Scene(root, Color.TRANSPARENT);

        stage.setScene(scene);

        stage.show();

        //Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root));
        //primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
