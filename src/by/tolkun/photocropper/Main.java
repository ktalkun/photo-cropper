package by.tolkun.photocropper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main class to run application.
 */
public class Main extends Application {

    /**
     * Primary stage of application.
     */
    private Stage primaryStage;

    /**
     * Root layout of primary stage.
     */
    private BorderPane rootLayout;

    /**
     * Main method of application.
     *
     * @param args params of starting application
     */
    public static void main(final String[] args) {
        launch(args);
    }

    /**
     * Start method of application.
     *
     * @param primaryStage primary stage of application
     */
    @Override
    public void start(final Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Photo Cropper");
        primaryStage.setResizable(true);

        initRootLayout();
    }

    /**
     * Initialize root layout of application.
     */
    private void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(
                    Main.class.getResource("view/RootLayoutView.fxml"));
            rootLayout = loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
