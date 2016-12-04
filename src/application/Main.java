package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/// node에 스타일 적용!!!!!!!!!!!!
public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			Label text = new Label();
			text.setText("Hello world");
			text.setStyle("-fx-font-size:70; "
					+ "-fx-text-fill:red;"
					+ "-fx-background-color: yellow;"
					+ "-fx-border-color:green;");	 // css 스타일 적용 가능
			
			StackPane pane = new StackPane(); //Container
			/*StackPane pane = new StackPane(text);*/
			
			pane.getChildren().add(text);
			
			Scene scene = new Scene(pane,800,500);
			stage.setScene(scene);
			
			stage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
