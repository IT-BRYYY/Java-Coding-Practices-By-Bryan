package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloFX extends Application {
    @Override
    public void start(Stage stage) {
        // ===== SET WINDOW ICON =====
        stage.getIcons().add(new Image("file:icon.png"));
        // 🔑 Replace "icon.png" with your own file (must be in your project folder)

        // ===== TOP BAR =====
        Label topTitle = new Label("🚀 JavaFX Dashboard");
        topTitle.setFont(Font.font("Arial", 20));
        topTitle.setTextFill(Color.WHITE);

        HBox topBar = new HBox(topTitle);
        topBar.setStyle("-fx-background-color: #2c3e50;");
        topBar.setPadding(new Insets(15));
        topBar.setAlignment(Pos.CENTER_LEFT);

        // ===== SIDEBAR =====
        Button homeBtn = new Button("Home");
        Button reportsBtn = new Button("Reports");
        Button settingsBtn = new Button("Settings");
        Button logoutBtn = new Button("Logout");

        for (Button b : new Button[]{homeBtn, reportsBtn, settingsBtn, logoutBtn}) {
            b.setMaxWidth(Double.MAX_VALUE);
            b.setStyle("-fx-background-color: #34495e; -fx-text-fill: white; -fx-font-size: 14px;");
        }

        VBox sidebar = new VBox(10, homeBtn, reportsBtn, settingsBtn, logoutBtn);
        sidebar.setPadding(new Insets(20));
        sidebar.setStyle("-fx-background-color: #2c3e50;");
        sidebar.setPrefWidth(150);

        // ===== MAIN CONTENT =====
        Label contentLabel = new Label("Welcome to the Dashboard! ✨");
        contentLabel.setFont(Font.font("Arial", 22));
        contentLabel.setTextFill(Color.web("#2c3e50"));

        StackPane contentArea = new StackPane(contentLabel);
        contentArea.setStyle("-fx-background-color: #ecf0f1;");
        contentArea.setAlignment(Pos.CENTER);

        // Change content when buttons are clicked
        homeBtn.setOnAction(e -> contentLabel.setText("🏠 Home Screen"));
        reportsBtn.setOnAction(e -> contentLabel.setText("📊 Reports Section"));
        settingsBtn.setOnAction(e -> contentLabel.setText("⚙️ Settings Page"));
        logoutBtn.setOnAction(e -> contentLabel.setText("👋 Logged Out"));

        // ===== LAYOUT =====
        BorderPane root = new BorderPane();
        root.setTop(topBar);
        root.setLeft(sidebar);
        root.setCenter(contentArea);

        // ===== SCENE & STAGE =====
        Scene scene = new Scene(root, 800, 500);
        stage.setTitle("JavaFX Dashboard Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
