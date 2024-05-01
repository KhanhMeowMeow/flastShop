package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoginView {
    private StackPane stackPane;
    private Scene scene;
    private Button button;
    private Label label;
    private Image icon;

    public void getLoginView(Stage stage) {
        stackPane = new StackPane();
        icon = new Image(getClass().getResourceAsStream("imageView/shopIcon.png"));

        // Thêm các thành phần của cửa sổ đăng nhập vào stackPane
        label = new Label("Mành hình đăng nhập");
        stackPane.getChildren().add(label);

        scene = new Scene(stackPane, 300, 200);
        stage.setTitle("Đăng nhập");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public void closeLoginView(Stage stage) {
        stage.close();
    }
}
