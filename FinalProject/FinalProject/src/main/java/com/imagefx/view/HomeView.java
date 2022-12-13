package com.imagefx.view;

import com.imagefx.controller.HomeController;
import com.imagefx.model.ImageI;
import com.imagefx.model.ImageProperties;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HomeView extends Application implements ImageI {
    private HomeController homeController = new HomeController();

    /**
     * instance variables for Javafx controls
     */
    private ImageView imageView;
    private Label widthLabel;
    private Label heightLabel;
    private Label sizeLabel;
    private Label locationLabel;

    private RadioButton pngRadioButton;
    private RadioButton jpegRadioButton;
    private RadioButton jpgRadioButton;
    private Button chooseImage;
    private Button saveImage;
    private Image image;
    private Alert alert;

    private void initialize() {
        imageView = new ImageView();
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        widthLabel = new Label();
        heightLabel = new Label();
        sizeLabel = new Label();
        locationLabel = new Label();

        pngRadioButton = new RadioButton("PNG");
        jpegRadioButton = new RadioButton("JPEG");
        jpgRadioButton = new RadioButton("JPG");

        chooseImage = new Button("Choose Image");
        chooseImage.setOnAction(event -> {
            chooseImage();
        });
        saveImage = new Button("Save Image");
        saveImage.setOnAction(event -> {
            saveImage();
        });

        ToggleGroup group = new ToggleGroup();
        pngRadioButton.setToggleGroup(group);
        jpegRadioButton.setToggleGroup(group);
        jpgRadioButton.setToggleGroup(group);


        alert = new Alert(Alert.AlertType.NONE);
    }

    @Override
    public void start(Stage stage) throws Exception {
        initialize();

        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.setMinSize(600, 400);
        hBox.setPadding(new Insets(10, 10, 10, 10));


        hBox.getChildren().add(leftVBox());
        Line line = new Line();
        line.setEndY(400);
        hBox.getChildren().add(line);
        hBox.getChildren().add(rightVBox());

        //Creating a scene object
        Scene scene = new Scene(hBox);

        //Setting title to the Stage
        stage.setTitle("Image Processing");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    private VBox leftVBox(){
        /**
         * Left VBox
         */
        VBox leftVBox = new VBox();
        leftVBox.setSpacing(20);
        leftVBox.setMinSize(200, 400);

        leftVBox.getChildren().add(imageView);
        leftVBox.getChildren().add(chooseImage);

        VBox exportVBox = new VBox();
        exportVBox.setSpacing(10);
        exportVBox.setPadding(new Insets(40,0,0,0));
        exportVBox.setMinSize(100, 200);
        exportVBox.getChildren().add(new Label("Export Image to:"));

        HBox radioButtonsHBox = new HBox();
        radioButtonsHBox.setSpacing(10);
        radioButtonsHBox.setMinSize(200, 25);
        radioButtonsHBox.getChildren().addAll(pngRadioButton, jpegRadioButton, jpgRadioButton);

        exportVBox.getChildren().addAll(radioButtonsHBox, saveImage);

        leftVBox.getChildren().add(exportVBox);

        return leftVBox;
    }

    private VBox rightVBox(){
        /**
         * Left VBox
         */
        VBox rightVBox = new VBox();
        rightVBox.setMinSize(300, 350);

        HBox hBox1 = new HBox();
        hBox1.setSpacing(20);
        hBox1.setMinSize(300, 25);
        hBox1.getChildren().addAll(new Label("Width:"), widthLabel);

        HBox hBox2 = new HBox();
        hBox2.setSpacing(20);
        hBox2.setMinSize(300, 25);
        hBox2.getChildren().addAll(new Label("Height:"), heightLabel);

        HBox hBox3 = new HBox();
        hBox3.setSpacing(20);
        hBox3.setMinSize(300, 25);
        hBox3.getChildren().addAll(new Label("Size:"), sizeLabel);

        HBox hBox4 = new HBox();
        hBox4.setSpacing(20);
        hBox4.setMinSize(300, 25);
        hBox4.getChildren().addAll(new Label("Location:"), locationLabel);

        rightVBox.getChildren().addAll(hBox1, hBox2, hBox3, hBox4);

        return rightVBox;
    }

    /**
     * method that called when choose image button clicked
     */
    @Override
    public void chooseImage() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("images", "*.png", "*.jpeg", "*.jpg"));
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            image = new Image(file.toURI().toString());
            imageView.setImage(image);

            Path path = Paths.get(file.getAbsolutePath());
            double bytes = 0;
            try {
                bytes = Files.size(path);

            } catch (IOException e) {
                e.printStackTrace();
            }

            ImageProperties imageProperties = new ImageProperties(image.getWidth(),
                    image.getHeight(), bytes, file.getAbsolutePath());

            widthLabel.setText(String.valueOf(imageProperties.getWidth()));
            heightLabel.setText(String.valueOf(imageProperties.getHeight()));
            sizeLabel.setText(String.valueOf(imageProperties.getSize()) + " bytes");
            locationLabel.setText(imageProperties.getLocation());

            System.out.println("Clicked " + file.getAbsolutePath());
        }
    }

    /**
     * method that called when save image button clicked
     */
    @Override
    public void saveImage() {
        String formatName = "png";
        if (image != null) {
            if (pngRadioButton.isSelected() || jpegRadioButton.isSelected() || jpgRadioButton.isSelected()) {
                FileChooser fileChooser = new FileChooser();

                //Set extension filter for text files
                if (pngRadioButton.isSelected()) {
                    FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("PNG", "*.png");
                    fileChooser.getExtensionFilters().add(extFilter);
                }
                else if (jpegRadioButton.isSelected()) {
                    formatName = "jpeg";
                    FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("JPEG", "*.jpeg");
                    fileChooser.getExtensionFilters().add(extFilter);
                }
                else if (jpgRadioButton.isSelected()) {
                    formatName = "jpg";
                    FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("JPG", "*.jpg");
                    fileChooser.getExtensionFilters().add(extFilter);
                }

                //Show save file dialog
                File file = fileChooser.showSaveDialog(null);

                if (file != null) {
                    if (!homeController.saveImageToFile(image, file, formatName)){
                        alert.setAlertType(Alert.AlertType.INFORMATION);
                        alert.setContentText("Export failed");
                        alert.show();
                    }
                }
            }
            else {
                alert.setAlertType(Alert.AlertType.INFORMATION);
                alert.setContentText("Select image convert format");
                alert.show();
            }
        }
        else {
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setContentText("Select image first");
            alert.show();
            System.out.println("Select image first");
        }
    }
}
