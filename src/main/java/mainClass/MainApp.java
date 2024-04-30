package mainClass;

import javafx.application.Application;
import javafx.stage.Stage;
import view.LoginView;
import view.MainView;

public class MainApp extends Application {
    private LoginView loginView = new LoginView();
    private MainView mainView = new MainView();
    @Override
    public void start(Stage mainStage) throws Exception {
        mainView.getMainView(mainStage);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
