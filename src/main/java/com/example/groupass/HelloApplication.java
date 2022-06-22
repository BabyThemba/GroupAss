package com.example.groupass;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group= new Group();
        String style = getClass().getResource("/style.css").toExternalForm();
        Label Romannce=new Label("ROMANCE");
        Romannce.setId("gm1");
        HBox romance= new HBox(Romannce);
        HBox hbox=new HBox();
        Label head= new Label("T.T.R.S.L STREAMS");
        head.setId("gm");
        head.setAlignment(Pos.CENTER);
        head.setLayoutX(100);

        //WebView webView= new WebView();

        ScrollPane scroll= new ScrollPane();
        scroll.isVisible();

        VBox vBox=new VBox();
        VBox vBox2=new VBox();
        VBox vBox3=new VBox();
        BorderPane borderpane = new BorderPane();


        Label Action=new Label("SCI-FI");
        Action.setId("gm1");
        HBox action= new HBox(Action);
        HBox hbox2=new HBox();

        Label Comedy=new Label("ACTION");
        Comedy.setId("gm1");
        HBox comedy= new HBox(Comedy);
        HBox hbox3=new HBox();


        //romantic
        Image img1= new Image("after.jpeg");
        ImageView imgview1= new ImageView(img1);
        imgview1.setFitHeight(180);
        imgview1.setPreserveRatio(true);
        imgview1.setId("img");

        imgview1.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img1view = new WebView();
            img1view.getEngine().load("https://m.youtube.com/watch?v=wZ7LytagKlc");
            vBox.getChildren().addAll(img1view);
        });

        Image img2= new Image("Ee.jpeg");
        ImageView imgview2= new ImageView(img2);
        imgview2.setFitHeight(180);
        imgview2.setPreserveRatio(true);

        imgview2.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://youtu.be/mAC-nh9PU5s");
            vBox.getChildren().addAll(img2view);
        });

        Image img3= new Image("fis.jpeg");
        ImageView imgview3= new ImageView(img3);
        imgview3.setFitHeight(180);
        imgview3.setPreserveRatio(true);

        imgview3.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://youtu.be/9ItBvH5J6ss");
            vBox.getChildren().addAll(img2view);
        });

        Image img4= new Image("to.jpg");
        ImageView imgview4= new ImageView(img4);
        imgview4.setFitHeight(180);
        imgview4.setPreserveRatio(true);

        imgview4.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://youtu.be/555oiY9RWM4");
            vBox.getChildren().addAll(img2view);
        });

        Image img5= new Image("kiss1.jpeg");
        ImageView imgview5= new ImageView(img5);
        imgview5.setFitHeight(180);
        imgview5.setPreserveRatio(true);

        imgview5.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://youtu.be/7bfS6seiLhk");
            vBox.getChildren().addAll(img2view);
        });

        Image img6= new Image("kiss2.jpg");
        ImageView imgview6= new ImageView(img6);
        imgview6.setFitHeight(180);
        imgview6.setPreserveRatio(true);

        imgview6.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://youtu.be/fjVonI2oVeM");
            vBox.getChildren().addAll(img2view);
        });

        Image img7= new Image("kiss3.jpeg");
        ImageView imgview7= new ImageView(img7);
        imgview7.setFitHeight(180);
        imgview7.setPreserveRatio(true);

        imgview7.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://youtu.be/5fKn0Dhj64w");
            vBox.getChildren().addAll(img2view);
        });


        Image img8= new Image("me.jpeg");
        ImageView imgview8= new ImageView(img8);
        imgview8.setFitHeight(180);
        imgview8.setPreserveRatio(true);

        imgview8.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://youtu.be/Eh993__rOxA");
            vBox.getChildren().addAll(img2view);
        });


        //SCI-Fi
        Image act1= new Image("end.jpeg");
        ImageView act1view1= new ImageView(act1);
        act1view1.setFitHeight(180);
        act1view1.setFitWidth(200);
        act1view1.setPreserveRatio(true);

        act1view1.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://www.youtube.com/embed?v=TcMBFSGVi1c");
            vBox.getChildren().addAll(img2view);

        });

        Image act2= new Image("in.jpg");
        ImageView act2view2= new ImageView(act2);
        act2view2.setFitHeight(180);
        act2view2.setFitWidth(200);
        act2view2.setPreserveRatio(true);

        act2view2.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://www.youtube.com/watch?v=6ZfuNTqbHE8");
            vBox.getChildren().addAll(img2view);
        });

        Image act3= new Image("spider.jpg");
        ImageView act3view3= new ImageView(act3);
        act3view3.setFitHeight(180);
        act3view3.setPreserveRatio(true);

        act3view3.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://www.youtube.com/watch?v=rt-2cxAiPJk");
            vBox.getChildren().addAll(img2view);
        });

        Image act4= new Image("ete.jpeg");
        ImageView act1view4= new ImageView(act4);
        act1view4.setFitHeight(180);
        act1view4.setPreserveRatio(true);

        act1view4.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://www.youtube.com/watch?v=x_me3xsvDgk");
            vBox.getChildren().addAll(img2view);
        });

        Image act5= new Image("fal.jpeg");
        ImageView act2view5= new ImageView(act5);
        act2view5.setFitHeight(180);
        act2view5.setPreserveRatio(true);

        act2view5.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://www.youtube.com/watch?v=IWBsDaFWyTE");
            vBox.getChildren().addAll(img2view);
        });

        Image act6= new Image("Thor.jpeg");
        ImageView act3view6= new ImageView(act6);
        act3view6.setFitHeight(180);
        act3view6.setPreserveRatio(true);

        act3view6.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://www.youtube.com/watch?v=Go8nTmfrQd8");
            vBox.getChildren().addAll(img2view);
        });


        Image act7= new Image("ven.jpg");
        ImageView act1view7= new ImageView(act7);
        act1view7.setFitHeight(180);
        act1view7.setPreserveRatio(true);

        act1view7.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://www.youtube.com/watch?v=rrwBnlYOp4g");
            vBox.getChildren().addAll(img2view);
        });

        Image act8= new Image("doc.jpeg");
        ImageView act2view8= new ImageView(act8);
        act2view8.setFitHeight(180);
        act2view8.setFitWidth(200);
        act2view8.setPreserveRatio(true);

        act2view8.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://www.youtube.com/watch?v=aWzlQ2N6qqg");
            vBox.getChildren().addAll(img2view);
        });

        Image act9= new Image("adp.jpg");
        ImageView act2view9= new ImageView(act9);
        act2view9.setFitWidth(170);
        act2view9.setPreserveRatio(true);

        act2view9.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img2view = new WebView();
            img2view.getEngine().load("https://www.youtube.com/watch?v=IE8HIsIrq4o");
            vBox.getChildren().addAll(img2view);
        });

        //Action
        Image com1= new Image("White2.jpg");
        ImageView com1view1= new ImageView(com1);
        com1view1.setFitHeight(180);
        com1view1.setPreserveRatio(true);

        com1view1.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img1view = new WebView();
            img1view.getEngine().load("https://youtu.be/WfaTlmYvTA8");
            vBox.getChildren().addAll(img1view);
        });

        Image com2= new Image("apes.jpg");
        ImageView com2view2= new ImageView(com2);
        com2view2.setFitHeight(180);
        com2view2.setPreserveRatio(true);

        com2view2.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img1view = new WebView();
            img1view.getEngine().load("https://youtu.be/DpSaTrW4leg");
            vBox.getChildren().addAll(img1view);
        });


        Image com3= new Image("snakes.jpeg");
        ImageView com3view3= new ImageView(com3);
        com3view3.setFitHeight(180);
        com3view3.setPreserveRatio(true);

        com3view3.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img1view = new WebView();
            img1view.getEngine().load("https://youtu.be/a72xIBcRi48");
            vBox.getChildren().addAll(img1view);
        });


        Image com4= new Image("term.jpeg");
        ImageView com2view4= new ImageView(com4);
        com2view4.setFitHeight(180);
        com2view4.setPreserveRatio(true);

        com2view4.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img1view = new WebView();
            img1view.getEngine().load("https://youtu.be/isVtXH7n9lI");
            vBox.getChildren().addAll(img1view);
        });

        Image com5= new Image("ang.jpeg");
        ImageView com3view5= new ImageView(com5);
        com3view5.setFitHeight(180);
        com3view5.setPreserveRatio(true);

        com3view5.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img1view = new WebView();
            img1view.getEngine().load("https://youtu.be/isVtXH7n9lI");
            vBox.getChildren().addAll(img1view);
        });



        Image com6= new Image("body.jpeg");
        ImageView com3view6= new ImageView(com6);
        com3view6.setFitHeight(180);
        com3view6.setPreserveRatio(true);

        com3view6.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img1view = new WebView();
            img1view.getEngine().load("https://youtu.be/IpKmt4MpctM");
            vBox.getChildren().addAll(img1view);
        });


        Image com7= new Image("ame.jpeg");
        ImageView com2view7= new ImageView(com7);
        com2view7.setFitHeight(180);
        com2view7.setPreserveRatio(true);

        com2view7.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img1view = new WebView();
            img1view.getEngine().load("https://youtu.be/99k3u9ay1gs");
            vBox.getChildren().addAll(img1view);
        });


        Image com8= new Image("ex.jpg");
        ImageView com3view8= new ImageView(com8);
        com3view8.setFitHeight(180);
        com3view8.setPreserveRatio(true);

        com3view8.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img1view = new WebView();
            img1view.getEngine().load("https://youtu.be/L6P3nI6VnlY");
            vBox.getChildren().addAll(img1view);
        });

        Image com9= new Image("Monster.jpg");
        ImageView com3view9= new ImageView(com9);
        com3view9.setFitHeight(180);
        com3view9.setPreserveRatio(true);

        com3view9.setOnMouseClicked(mouseEvent -> {
            System.out.println("Pic one clicked");
            WebView img1view = new WebView();
            img1view.getEngine().load("https://youtu.be/3od-kQMTZ9M");
            vBox.getChildren().addAll(img1view);
        });




        /*Image img4= new Image("both.png");
        ImageView imgview4= new ImageView(img4);

        Image img5= new Image("both.png");
        ImageView imgview5= new ImageView(img5);

        Image img6= new Image("both.png");
        ImageView imgview6= new ImageView(img6);*/

        hbox.getChildren().addAll(imgview1,imgview2,imgview3,imgview4,imgview5,imgview6,imgview7,imgview8);


        hbox2.getChildren().addAll(act1view1,act2view2,act3view3,act1view4,act2view5,act3view6,act1view7,act2view8,act2view9);

        hbox3.getChildren().addAll(com1view1,com2view2,com3view3,com3view5,com3view6,com2view7,com3view8, com3view9);

        vBox.getChildren().addAll(head,romance,hbox);
        vBox2.getChildren().addAll(action,hbox2);
        vBox3.getChildren().addAll(comedy,hbox3);
        //VBox vBox3=new VBox(comedy,hbox3;
        borderpane.getChildren().addAll(scroll);
        borderpane.setTop(vBox);
        borderpane.setId("pane");
        borderpane.setCenter(vBox3);
        borderpane.setBottom(vBox2);


        Scene scene = new Scene(borderpane, 1200, 660);
        scene.getStylesheets().add(style);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMaxWidth(1220);
        stage.setMaxHeight(700);
        stage.setMinWidth(1220);
        stage.setMinHeight(700);

        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}