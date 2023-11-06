package com.example.weather;
import javafx.animation.*;
import javafx.collections.transformation.TransformationList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Translate;
import javafx.util.Duration;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.TimeZone;

class MultiThreading extends Thread{
    private Label name;
    private ImageView earthIcon;
    private ImageView searchIcon;
    private TextField ss;

    public void setEarthIcon(ImageView earthIcon) {
        this.earthIcon = earthIcon;
    }

    public void setSearchIcon(ImageView searchIcon) {
        this.searchIcon = searchIcon;
    }

    public void setSs(TextField ss) {
        this.ss = ss;
    }

    public void setLabel(Label name){
        this.name=name;
    }
    private void changeEarthIcon(){
        try{
            Thread.sleep(115);
            TranslateTransition transition5= new TranslateTransition(Duration.seconds(1), earthIcon);
            double finalY_earthIcon=-150;
            transition5.setByY(finalY_earthIcon);
            transition5.play();
        }catch (Exception e){
            System.out.println("problem found in /Earth Icon movement/");
        }

    }
    private void changeSearchIcon(){
        try{
            Thread.sleep(125);
            TranslateTransition transition5= new TranslateTransition(Duration.seconds(1), searchIcon);
            double finalY_earthIcon=-150;
            transition5.setByY(finalY_earthIcon);
            transition5.play();
        }catch (Exception e){
            System.out.println("problem found in /Search Icon movement/");
        }
    }
    private void changeSearchBox(){
        try{
            Thread.sleep(117);
            TranslateTransition transition4= new TranslateTransition(Duration.seconds(1), ss);
            double finalY_ss=-150;
            transition4.setByY(finalY_ss);
            transition4.play();
        } catch (Exception e){
            System.out.println("problem found in /search box movement/");
        }
    }
    public void Change(){
        try{
            Thread.sleep(250);
            TranslateTransition transition3= new TranslateTransition(Duration.seconds(1), name);
            double finalY_name=-40;
            transition3.setByY(finalY_name);
            transition3.play();

        } catch (Exception e){
            System.out.println("threading Exception found");
        }
    }
    @Override
    public void run(){
        Change();
        changeEarthIcon();
        changeSearchIcon();
        changeSearchBox();
    }
}
class MultiThreading2 extends Thread{
    private Label name;
    private Label welcome;
    private Button nextButton;
    private Pane layer_2;
    private ImageView earthIcon;
    private ImageView searchIcon;
    private TextField ss;

    public void setName(Label name) {
        this.name = name;
    }
    public void setWelcome(Label welcome) {
        this.welcome = welcome;
    }

    public void setEarthIcon(ImageView earthIcon) {
        this.earthIcon = earthIcon;
    }

    public void setSearchIcon(ImageView searchIcon) {
        this.searchIcon = searchIcon;
    }

    public void setSearchBox(TextField searchBox) {
        this.ss = searchBox;
    }

    public void setButton(Button button) {
        this.nextButton = button;
    }

    public void setLayer_2(Pane layer_2) {
        this.layer_2 = layer_2;
    }

    private void changeEarthIcon(){
        try{
            Thread.sleep(113);
            TranslateTransition transition5= new TranslateTransition(Duration.seconds(1), earthIcon);
            double finalY_earthIcon=150;
            transition5.setByY(finalY_earthIcon);
            transition5.play();
        }catch (Exception e){
            System.out.println("problem found in /Earth Icon movement/");
        }

    }
    private void changeSearchIcon(){
        try{
            Thread.sleep(105);
            TranslateTransition transition5= new TranslateTransition(Duration.seconds(1), searchIcon);
            double finalY_earthIcon=150;
            transition5.setByY(finalY_earthIcon);
            transition5.play();
        }catch (Exception e){
            System.out.println("problem found in /Search Icon movement/");
        }
    }
    private void changeSearchBox(){
        try{
            Thread.sleep(120);
            TranslateTransition transition4= new TranslateTransition(Duration.seconds(1), ss);
            double finalY_ss=150;
            transition4.setByY(finalY_ss);
            transition4.play();
        } catch (Exception e){
            System.out.println("problem found in /search box movement/");
        }
    }
    private void changeName(){
        try{
            Thread.sleep(220);
            TranslateTransition transition3 = new TranslateTransition(Duration.seconds(1), name);
            double finalY_name = 0;
            transition3.setToY(finalY_name);
            transition3.play();
        } catch (Exception e){
            System.out.println("problem found for label /name/");
        }
    }
    private void changeButton(){
        try{
            Thread.sleep(200);
            TranslateTransition transition1 = new TranslateTransition(Duration.seconds(1), nextButton);
            double finalY_Button = 0;
            double finalX_Button = 0;
            transition1.setToY(finalY_Button);
            transition1.setToX(finalX_Button);
            transition1.play();
        }catch (Exception e){
            System.out.println("exception found for /Button/");
        }
    }
    private void changeWelcome(){
        try{
            Thread.sleep(100);
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.8), welcome);
            fadeTransition.setToValue(1);
            fadeTransition.play();
        } catch (Exception e){
            System.out.println("problem found in welcome");
        }
    }
    private void changeLayer_2(){
        try{
            Thread.sleep(7);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), layer_2);
            double initialY = layer_2.getLayoutY();
            double finalY = initialY + (2 * layer_2.getHeight());
            transition.setByY(finalY);
            transition.play();
        } catch (Exception e){
            System.out.println("problem found in /layer2/");
        }
    }
    @Override
    public void run(){
        changeName();
        changeButton();
        changeWelcome();
        changeLayer_2();
        changeEarthIcon();
        changeSearchIcon();
        changeSearchBox();
    }

}
class Multithreading3 extends Thread {
    private ImageView earthIcon;
    private ImageView searchIcon;
    private ImageView crossIcon;
    private TextField ss;
    private Pane layer_3;

    public void setLayer_3(Pane layer_3) {
        this.layer_3 = layer_3;
    }
    public void setCrossIcon(ImageView crossIcon) {
        this.crossIcon = crossIcon;
    }
    public void setEarthIcon(ImageView earthIcon) {
        this.earthIcon = earthIcon;
    }
    public void setSearchIcon(ImageView searchIcon) {
        this.searchIcon = searchIcon;
    }
    public void setSs(TextField ss) {
        this.ss = ss;
    }
    private void changeEarthIcon(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), earthIcon);
        fadeTransition.setToValue(0);
        fadeTransition.play();
    }
    private void changeSearchBox(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), ss);
        fadeTransition.setToValue(0);
        fadeTransition.play();
    }
    private void changeSearchIcon(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), searchIcon);
        fadeTransition.setToValue(0);
        fadeTransition.play();
    }
    private void changeCrossIcon(){
        try{
            Thread.sleep(130);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(1), crossIcon);
            transition.setByY(-730);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in /location Image/");
        }
    }
    private void changeLayer_3(){
        try{
            Thread.sleep(140);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(1), layer_3);
            transition.setByY(-730.0);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in /Layer_3/");
        }
    }
    @Override
    public void run(){
        changeEarthIcon();
        changeSearchBox();
        changeSearchIcon();
        changeCrossIcon();
        changeLayer_3();

    }

}
class MultiThreading4 extends Thread{
    private ImageView earthIcon;
    private ImageView searchIcon;
    private ImageView crossIcon;
    private TextField ss;
    private Pane layer_3;
    public void setLayer_3(Pane layer_3) {
        this.layer_3 = layer_3;
    }
    public void setCrossIcon(ImageView crossIcon) {
        this.crossIcon = crossIcon;
    }
    public void setEarthIcon(ImageView earthIcon) {
        this.earthIcon = earthIcon;
    }
    public void setSearchIcon(ImageView searchIcon) {
        this.searchIcon = searchIcon;
    }
    public void setSs(TextField ss) {
        this.ss = ss;
    }
    private void reverseEarthIcon() {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), earthIcon);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }
    private void reverseSearchBox() {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), ss);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }
    private void reverseSearchIcon() {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), searchIcon);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }
    private void reverseCrossIcon() {
        try {
            Thread.sleep(130);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), crossIcon);
            transition.setByY(730);
            transition.play();
        } catch (Exception e) {
            System.out.println("Exception found in reversing crossIcon");
        }
    }
    private void reverseLayer_3(){
        try{
            Thread.sleep(140);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(1), layer_3);
            transition.setByY(+730);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in /Layer_3/");
        }
    }
    @Override
    public void run() {
        reverseEarthIcon();
        reverseSearchBox();
        reverseSearchIcon();
        reverseCrossIcon();
        reverseLayer_3();
    }
}
class MultiThreading5 extends Thread{
    private ImageView notFound;
    private Label nfLabel;
    private Label locLabel;
    private ImageView location;
    private ImageView retryIcon;
    private ImageView earthIcon;
    private ImageView searchIcon;
    private TextField ss;

    public void setEarthIcon(ImageView earthIcon) {
        this.earthIcon = earthIcon;
    }

    public void setSearchIcon(ImageView searchIcon) {
        this.searchIcon = searchIcon;
    }

    public void setSs(TextField ss) {
        this.ss = ss;
    }
    private void changeEarthIcon(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), earthIcon);
        fadeTransition.setToValue(0);
        fadeTransition.play();
    }
    private void changeSearchBox(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), ss);
        fadeTransition.setToValue(0);
        fadeTransition.play();
    }
    private void changeSearchIcon(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), searchIcon);
        fadeTransition.setToValue(0);
        fadeTransition.play();
    }
    public void setRetryIcon(ImageView retryIcon) {
        this.retryIcon = retryIcon;
    }
    public void setNotFound(ImageView notFound) {
        this.notFound = notFound;
    }

    public void setNfLabel(Label nfLabel) {
        this.nfLabel = nfLabel;
    }

    public void setLocLabel(Label locLabel) {
        this.locLabel = locLabel;
    }

    public void setLocation(ImageView location) {
        this.location = location;
    }
    private void changeLocationIcon(){
        try{
            Thread.sleep(140);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(1), location);
            transition.setByY(-900);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in /location Image/");
        }
    }
    private void changeNotFound(){
        try{
            Thread.sleep(140);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(1), notFound);
            transition.setByY(-900);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in /location Image/");
        }
    }
    private void changeNfLabel(){
        try{
            Thread.sleep(150);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(1), nfLabel);
            transition.setByY(-900);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in /location Image/");
        }
    }
    private void changeLocLabel(){
        try{
            Thread.sleep(130);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(1), locLabel);
            transition.setByY(-900);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in /location Image/");
        }
    }
    private void changeRetryIcon(){
        try{
            Thread.sleep(130);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(1), retryIcon);
            transition.setByY(-900);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in /location Image/");
        }
    }
    @Override
    public void run(){
        changeLocLabel();
        changeLocationIcon();
        changeNfLabel();
        changeEarthIcon();
        changeSearchBox();
        changeSearchIcon();
        changeNotFound();
        changeRetryIcon();
    }

}
class MultiThreading6 extends Thread{
    private ImageView notFound;
    private Label nfLabel;
    private Label locLabel;
    private ImageView location;
    private ImageView retryIcon;
    private ImageView earthIcon;
    private ImageView searchIcon;
    private TextField ss;

    public void setEarthIcon(ImageView earthIcon) {
        this.earthIcon = earthIcon;
    }
    public void setSearchIcon(ImageView searchIcon) {
        this.searchIcon = searchIcon;
    }
    public void setSs(TextField ss) {
        this.ss = ss;
    }
    public void setRetryIcon(ImageView retryIcon) {
        this.retryIcon = retryIcon;
    }
    public void setNotFound(ImageView notFound) {
        this.notFound = notFound;
    }
    public void setNfLabel(Label nfLabel) {
        this.nfLabel = nfLabel;
    }
    public void setLocLabel(Label locLabel) {
        this.locLabel = locLabel;
    }
    public void setLocation(ImageView location) {
        this.location = location;
    }
    public void reverseLocationIcon() {
        try {
            Thread.sleep(140);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), location);
            transition.setByY(900);
            transition.play();
        } catch (Exception e) {
            System.out.println("Exception found in reversing location Image");
        }
    }
    public void reverseNotFound() {
        try {
            Thread.sleep(140);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), notFound);
            transition.setByY(900);
            transition.play();
        } catch (Exception e) {
            System.out.println("Exception found in reversing notFound Image");
        }
    }
    public void reverseNfLabel() {
        try {
            Thread.sleep(150);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), nfLabel);
            transition.setByY(900);
            transition.play();
        } catch (Exception e) {
            System.out.println("Exception found in reversing nfLabel");
        }
    }
    public void reverseLocLabel() {
        try {
            Thread.sleep(130);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), locLabel);
            transition.setByY(900);
            transition.play();
        } catch (Exception e) {
            System.out.println("Exception found in reversing locLabel");
        }
    }
    private void reverseRetryIcon(){
        try{
            Thread.sleep(130);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(1), retryIcon);
            transition.setByY(+900);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in /location Image/");
        }
    }
    private void reverseEarthIcon(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), earthIcon);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }
    private void reverseSearchBox(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), ss);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }
    private void reverseSearchIcon(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), searchIcon);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }
    @Override
    public void run(){
        reverseLocLabel();
        reverseLocationIcon();
        reverseNfLabel();
        reverseNotFound();
        reverseRetryIcon();
        reverseEarthIcon();
        reverseSearchBox();
        reverseSearchIcon();
    }
}
class stackMultiThreading extends Thread{
    private final Pane infoPane;
    private final Pane tempInfoPane;
    private final Pane pressurePane;
    private final Pane humidityPane;
    private final Pane sunriseTimePane;
    private final Pane windInfoPane;
    public stackMultiThreading(Pane tempInfoPane, Pane sunriseTimePane, Pane windInfoPane, Pane humidityPane, Pane pressurePane, Pane infoPane){
        this.tempInfoPane=tempInfoPane;
        this.sunriseTimePane=sunriseTimePane;
        this.humidityPane=humidityPane;
        this.pressurePane=pressurePane;
        this.windInfoPane=windInfoPane;
        this.infoPane=infoPane;
    }
    private void changeUp_tempInfoPane(){
        TranslateTransition transition= new TranslateTransition(Duration.seconds(0.7), tempInfoPane);
        transition.setByY(-10);
        transition.play();
    }
    private void fadeIn_tempInfoPane(){
        FadeTransition transition= new FadeTransition(Duration.seconds(0.7), tempInfoPane);
        transition.setToValue(1);
        transition.play();
    }
    private void infoPane_Transition(){
        TranslateTransition transition= new TranslateTransition(Duration.seconds(0.6), infoPane);
        transition.setByX(-362);
        transition.play();
    }
    private void changeUp_pressurePane(){
        try{
            Thread.sleep(105);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(0.7), pressurePane);
            transition.setByY(-20);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found when pressure pane pushed up");
        }

    }
    private void fadeIn_pressurePane(){
        try{
            Thread.sleep(105);
            FadeTransition transition= new FadeTransition(Duration.seconds(0.7), pressurePane);
            transition.setToValue(1);
            transition.play();
        }catch (Exception e){
            System.out.println("Exception found in line 630");
        }

    }
    private void changeUp_humidityPane(){
        try{
           Thread.sleep(120);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(0.7), humidityPane);
            transition.setByY(-20);
            transition.play();
        } catch (Exception e){
            System.out.println("Exception found in ");
        }


    }
    private void fadeIn_humidityPane(){
        try{
            Thread.sleep(120);
            FadeTransition transition= new FadeTransition(Duration.seconds(0.7), humidityPane);
            transition.setToValue(1);
            transition.play();
        }catch (Exception e){
            System.out.println("exception found in ");
        }

    }
    private void changeUp_sunriseTimePane(){
        try{
            Thread.sleep(110);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(0.7), sunriseTimePane);
            transition.setByY(-20);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in ");
        }

    }
    private void fadeIn_sunriseTimePane(){
        try{
            Thread.sleep(110);
            FadeTransition transition= new FadeTransition(Duration.seconds(0.7), sunriseTimePane);
            transition.setToValue(1);
            transition.play();
        } catch (Exception e){
            System.out.println("exception found in ");
        }



    }
    private void changeUp_windInfoPane(){
        try{
            Thread.sleep(130);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(0.7), windInfoPane);
            transition.setByY(-20);
            transition.play();
        } catch (Exception e){
            System.out.println("problem found in finding ");
        }

    }
    private void fadeIn_windInfoPane(){
        try{
            Thread.sleep(130);
            FadeTransition transition= new FadeTransition(Duration.seconds(0.7), windInfoPane);
            transition.setToValue(1);
            transition.play();
        } catch (Exception e){
            System.out.println("problem found in finding ");
        }

    }

    @Override
    public void run(){
        infoPane_Transition();
        changeUp_tempInfoPane();
        changeUp_humidityPane();
        changeUp_pressurePane();
        changeUp_sunriseTimePane();
        changeUp_windInfoPane();
        fadeIn_tempInfoPane();
        fadeIn_humidityPane();
        fadeIn_humidityPane();
        fadeIn_pressurePane();
        fadeIn_sunriseTimePane();
        fadeIn_windInfoPane();


    }
}
class ReverseStackMultiThreading extends Thread {
    private final Pane infoPane;
    private final Pane tempInfoPane;
    private final Pane pressurePane;
    private final Pane humidityPane;
    private final Pane sunriseTimePane;
    private final Pane windInfoPane;

    public ReverseStackMultiThreading(Pane tempInfoPane, Pane sunriseTimePane, Pane windInfoPane, Pane humidityPane, Pane pressurePane, Pane infoPane) {
        this.tempInfoPane = tempInfoPane;
        this.sunriseTimePane = sunriseTimePane;
        this.humidityPane = humidityPane;
        this.pressurePane = pressurePane;
        this.windInfoPane = windInfoPane;
        this.infoPane=infoPane;
    }

    private void changeDown_tempInfoPane() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.7), tempInfoPane);
        transition.setByY(10);
        transition.play();
    }
    private void fadeOut_tempInfoPane() {
        FadeTransition transition = new FadeTransition(Duration.seconds(0.7), tempInfoPane);
        transition.setToValue(0);
        transition.play();
    }
    private void reverseInfoPane_Transition(){
        TranslateTransition transition= new TranslateTransition(Duration.seconds(0.6), infoPane);
        transition.setByX(362);
        transition.play();
    }
    private void changeDown_pressurePane() {
        try {
            Thread.sleep(105);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(0.7), pressurePane);
            transition.setByY(20);
            transition.play();
        } catch (Exception e) {
            System.out.println("exception found when pressure pane pushed down");
        }
    }
    private void fadeOut_pressurePane() {
        try {
            Thread.sleep(105);
            FadeTransition transition = new FadeTransition(Duration.seconds(0.7), pressurePane);
            transition.setToValue(0);
            transition.play();
        } catch (Exception e) {
            System.out.println("Exception found in line 630");
        }
    }
    private void changeDown_humidityPane() {
        try {
            Thread.sleep(120);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(0.7), humidityPane);
            transition.setByY(20);
            transition.play();
        } catch (Exception e) {
            System.out.println("Exception found in humidityPane");
        }
    }
    private void fadeOut_humidityPane() {
        try {
            Thread.sleep(120);
            FadeTransition transition = new FadeTransition(Duration.seconds(0.7), humidityPane);
            transition.setToValue(0);
            transition.play();
        } catch (Exception e) {
            System.out.println("exception found in humidityPane");
        }
    }
    private void changeDown_sunriseTimePane() {
        try {
            Thread.sleep(110);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(0.7), sunriseTimePane);
            transition.setByY(20);
            transition.play();
        } catch (Exception e) {
            System.out.println("exception found in sunriseTimePane");
        }
    }
    private void fadeOut_sunriseTimePane() {
        try {
            Thread.sleep(110);
            FadeTransition transition = new FadeTransition(Duration.seconds(0.7), sunriseTimePane);
            transition.setToValue(0);
            transition.play();
        } catch (Exception e) {
            System.out.println("exception found in sunriseTimePane");
        }
    }
    private void changeDown_windInfoPane() {
        try {
            Thread.sleep(130);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(0.7), windInfoPane);
            transition.setByY(20);
            transition.play();
        } catch (Exception e) {
            System.out.println("problem found in windInfoPane");
        }
    }
    private void fadeOut_windInfoPane() {
        try {
            Thread.sleep(130);
            FadeTransition transition = new FadeTransition(Duration.seconds(0.7), windInfoPane);
            transition.setToValue(0);
            transition.play();
        } catch (Exception e) {
            System.out.println("problem found in windInfoPane");
        }
    }
    @Override
    public void run() {
        changeDown_tempInfoPane();
        changeDown_humidityPane();
        changeDown_pressurePane();
        reverseInfoPane_Transition();
        changeDown_sunriseTimePane();
        changeDown_windInfoPane();
        fadeOut_tempInfoPane();
        fadeOut_humidityPane();
        fadeOut_pressurePane();
        fadeOut_sunriseTimePane();
        fadeOut_windInfoPane();
    }
}
class InfoPaneInformation extends Thread{
    private final Pane detailInfoPane;
    public InfoPaneInformation(Pane detailInfoPane){
        this.detailInfoPane=detailInfoPane;

    }
    private void TransitionY_detailInfoPane(){
        TranslateTransition transition= new TranslateTransition(Duration.seconds(0.3), detailInfoPane);
        transition.setByY(-500);
        transition.play();
    }
    private void fadeIn(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.3), detailInfoPane);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }
    @Override
    public void run(){
        fadeIn();
        TransitionY_detailInfoPane();
    }
}
class Reverse_InfoPaneInformation extends Thread {
    private final Pane detailInfoPane;
    public Reverse_InfoPaneInformation(Pane detailInfoPane) {
        this.detailInfoPane = detailInfoPane;
    }
    private void TransitionY_detailInfoPane() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.3), detailInfoPane);
        transition.setByY(500);
        transition.play();
    }
    private void fadeOut() {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.3), detailInfoPane);
        fadeTransition.setToValue(0);
        fadeTransition.play();
    }
    @Override
    public void run() {
        fadeOut();
        TransitionY_detailInfoPane();
    }
}
class moveToRightPosition{
    private final Pane sunRisePane;
    private final Pane sunSetPane;
    private final Pane minTemperaturePane;
    private final Pane feelsLikeTemperaturePane;
    private final Pane maxTemperaturePane;
    private final Pane windSpeedPane;
    private final Pane visibilityPane;
    public moveToRightPosition(Pane sunRisePane, Pane sunSetPane, Pane minTemperaturePane, Pane feelsLikeTemperaturePane, Pane maxTemperaturePane, Pane windSpeedPane, Pane visibilityPane) {
        this.sunRisePane = sunRisePane;
        this.sunSetPane = sunSetPane;
        this.minTemperaturePane = minTemperaturePane;
        this.feelsLikeTemperaturePane = feelsLikeTemperaturePane;
        this.maxTemperaturePane = maxTemperaturePane;
        this.windSpeedPane = windSpeedPane;
        this.visibilityPane = visibilityPane;
    }
    public void rightPosition(){
        TranslateTransition transition1= new TranslateTransition(Duration.seconds(0.2), sunRisePane);
        transition1.setByX(-712);
        transition1.play();

        TranslateTransition transition2= new TranslateTransition(Duration.seconds(0.2), sunSetPane);
        transition2.setByX(-712);
        transition2.play();

        TranslateTransition transition3= new TranslateTransition(Duration.seconds(0.2), minTemperaturePane);
        transition3.setByX(-961);
        transition3.play();

        TranslateTransition transition4= new TranslateTransition(Duration.seconds(0.2), feelsLikeTemperaturePane);
        transition4.setByX(-961);
        transition4.play();

        TranslateTransition transition5= new TranslateTransition(Duration.seconds(0.2), maxTemperaturePane);
        transition5.setByX(-961);
        transition5.play();

        TranslateTransition transition6= new TranslateTransition(Duration.seconds(0.2), windSpeedPane);
        transition6.setByX(-1201);
        transition6.play();

        TranslateTransition transition7= new TranslateTransition(Duration.seconds(0.2), visibilityPane);
        transition7.setByX(-1201);
        transition7.play();
    }
}
class MoveToLeftPosition {
    private final Pane sunRisePane;
    private final Pane sunSetPane;
    private final Pane minTemperaturePane;
    private final Pane feelsLikeTemperaturePane;
    private final Pane maxTemperaturePane;
    private final Pane windSpeedPane;
    private final Pane visibilityPane;
    public MoveToLeftPosition(Pane sunRisePane, Pane sunSetPane, Pane minTemperaturePane, Pane feelsLikeTemperaturePane, Pane maxTemperaturePane, Pane windSpeedPane, Pane visibilityPane) {
        this.sunRisePane = sunRisePane;
        this.sunSetPane = sunSetPane;
        this.minTemperaturePane = minTemperaturePane;
        this.feelsLikeTemperaturePane = feelsLikeTemperaturePane;
        this.maxTemperaturePane = maxTemperaturePane;
        this.windSpeedPane = windSpeedPane;
        this.visibilityPane = visibilityPane;
    }
    public void leftPosition() {
        TranslateTransition transition1 = new TranslateTransition(Duration.seconds(0.2), sunRisePane);
        transition1.setByX(712);
        transition1.play();

        TranslateTransition transition2 = new TranslateTransition(Duration.seconds(0.2), sunSetPane);
        transition2.setByX(712);
        transition2.play();

        TranslateTransition transition3 = new TranslateTransition(Duration.seconds(0.2), minTemperaturePane);
        transition3.setByX(961);
        transition3.play();

        TranslateTransition transition4 = new TranslateTransition(Duration.seconds(0.2), feelsLikeTemperaturePane);
        transition4.setByX(961);
        transition4.play();

        TranslateTransition transition5 = new TranslateTransition(Duration.seconds(0.2), maxTemperaturePane);
        transition5.setByX(961);
        transition5.play();

        TranslateTransition transition6 = new TranslateTransition(Duration.seconds(0.2), windSpeedPane);
        transition6.setByX(1201);
        transition6.play();

        TranslateTransition transition7 = new TranslateTransition(Duration.seconds(0.2), visibilityPane);
        transition7.setByX(1201);
        transition7.play();
    }
}
class TemperatureRightPosition_Y extends Thread{
    private final Pane minTemperaturePane;
    private final Pane feelsLikeTemperaturePane;
    private final Pane maxTemperaturePane;
    public TemperatureRightPosition_Y(Pane minTemperaturePane, Pane feelsLikeTemperaturePane, Pane maxTemperaturePane) {
        this.minTemperaturePane = minTemperaturePane;
        this.feelsLikeTemperaturePane = feelsLikeTemperaturePane;
        this.maxTemperaturePane = maxTemperaturePane;
    }
    private void changeMinTemperaturePane(){
        try{
            TranslateTransition transition= new TranslateTransition(Duration.seconds(0.5), minTemperaturePane);
            transition.setByY(-510);
            transition.play();
        }catch (Exception e){
            System.out.println("here is a problem");
        }

    }
    private void changeMaxTemperaturePane(){
        try{
            Thread.sleep(10);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(0.4), maxTemperaturePane);
            transition.setByY(-510);
            transition.play();
        }catch (Exception e){
            System.out.println("problem found");
        }

    }
    private void changeFeelsLikePane(){
        try{
            Thread.sleep(30);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(0.4), feelsLikeTemperaturePane);
            transition.setByY(-510);
            transition.play();
        }catch (Exception e){
            System.out.println("problem found again");
        }

    }
    private void fadeMinTemperaturePane(){
        try{
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.4), minTemperaturePane);
            fadeTransition.setToValue(1);
            fadeTransition.play();
        }catch (Exception e){
            System.out.println("problem found");
        }
    }
    private void fadeMaxTemperaturePane(){
        try{
            Thread.sleep(10);
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.4), maxTemperaturePane);
            fadeTransition.setToValue(1);
            fadeTransition.play();
        }catch (Exception e){
            System.out.println("problem found");
        }
    }
    private void fadeFeelsLikeTemperaturePane(){
        try{
            Thread.sleep(30);
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.4), feelsLikeTemperaturePane);
            fadeTransition.setToValue(1);
            fadeTransition.play();
        }catch (Exception e){
            System.out.println("problem found");
        }
    }
    @Override
    public void run(){
        changeMinTemperaturePane();
        changeMaxTemperaturePane();
        changeFeelsLikePane();
        fadeFeelsLikeTemperaturePane();
        fadeMaxTemperaturePane();
        fadeMinTemperaturePane();
    }
}
class ReverseTemperatureRightPosition_Y extends Thread {
    private final Pane minTemperaturePane;
    private final Pane feelsLikeTemperaturePane;
    private final Pane maxTemperaturePane;
    public ReverseTemperatureRightPosition_Y(Pane minTemperaturePane, Pane feelsLikeTemperaturePane, Pane maxTemperaturePane) {
        this.minTemperaturePane = minTemperaturePane;
        this.feelsLikeTemperaturePane = feelsLikeTemperaturePane;
        this.maxTemperaturePane = maxTemperaturePane;
    }
    private void changeMinTemperaturePaneBack() {
        try {
            TranslateTransition transition = new TranslateTransition(Duration.seconds(0.5), minTemperaturePane);
            transition.setByY(510);
            transition.play();
        } catch (Exception e) {
            System.out.println("Problem found");
        }
    }
    private void changeMaxTemperaturePaneBack() {
        try {
            Thread.sleep(30);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), maxTemperaturePane);
            transition.setByY(510);
            transition.play();
        } catch (Exception e) {
            System.out.println("Problem found");
        }
    }
    private void changeFeelsLikePaneBack() {
        try {
            Thread.sleep(50);
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), feelsLikeTemperaturePane);
            transition.setByY(510);
            transition.play();
        } catch (Exception e) {
            System.out.println("Problem found");
        }
    }
    private void fadeMinTemperaturePaneOut() {
        try {
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), minTemperaturePane);
            fadeTransition.setToValue(0);
            fadeTransition.play();
        } catch (Exception e) {
            System.out.println("Problem found");
        }
    }
    private void fadeMaxTemperaturePaneOut() {
        try {
            Thread.sleep(30);
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), maxTemperaturePane);
            fadeTransition.setToValue(0);
            fadeTransition.play();
        } catch (Exception e) {
            System.out.println("Problem found");
        }
    }
    private void fadeFeelsLikeTemperaturePaneOut() {
        try {
            Thread.sleep(50);
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), feelsLikeTemperaturePane);
            fadeTransition.setToValue(0);
            fadeTransition.play();
        } catch (Exception e) {
            System.out.println("Problem found");
        }
    }
    @Override
    public void run() {
        changeMinTemperaturePaneBack();
        changeMaxTemperaturePaneBack();
        changeFeelsLikePaneBack();
        fadeFeelsLikeTemperaturePaneOut();
        fadeMaxTemperaturePaneOut();
        fadeMinTemperaturePaneOut();
    }
}
class sunTimeRightPosition_Y extends Thread{
    private final Pane sunRisePane;
    private final Pane sunSetPane;
    public sunTimeRightPosition_Y(Pane sunRisePane, Pane sunSetPane) {
        this.sunRisePane = sunRisePane;
        this.sunSetPane = sunSetPane;
    }
    private void sunRisePosition(){
        TranslateTransition transition1= new TranslateTransition(Duration.seconds(0.4), sunRisePane);
        transition1.setByY(-550);
        transition1.play();
    }
    private void sunSetPosition(){
        try {
            Thread.sleep(20);
            TranslateTransition transition1= new TranslateTransition(Duration.seconds(0.4), sunSetPane);
            transition1.setByY(-550);
            transition1.play();
        }catch (Exception e){
            System.out.println("problem found here");
        }

    }
    private void fadeSunRise(){
        try {
            Thread.sleep(0);
            FadeTransition fade= new FadeTransition(Duration.seconds(0.4), sunRisePane);
            fade.setToValue(1);
            fade.play();
        }catch (Exception e){
            System.out.println("problem found");
        }
    }
    private void fadeSunSet(){
        try {
            Thread.sleep(20);
            FadeTransition fade= new FadeTransition(Duration.seconds(0.4), sunSetPane);
            fade.setToValue(1);
            fade.play();
        }catch (Exception e){
            System.out.println("problem found");
        }

    }
    public void run(){
        sunRisePosition();
        sunSetPosition();
        fadeSunRise();
        fadeSunSet();
    }
}
class SunTimeDownPosition_Y extends Thread {
    private final Pane sunRisePane;
    private final Pane sunSetPane;

    public SunTimeDownPosition_Y(Pane sunRisePane, Pane sunSetPane) {
        this.sunRisePane = sunRisePane;
        this.sunSetPane = sunSetPane;
    }

    private void returnSunRisePosition() {
        TranslateTransition transition1 = new TranslateTransition(Duration.seconds(0.4), sunRisePane);
        transition1.setByY(550);
        transition1.play();
    }

    private void returnSunSetPosition() {
        try {
            Thread.sleep(20);
            TranslateTransition transition2 = new TranslateTransition(Duration.seconds(0.4), sunSetPane);
            transition2.setByY(550);
            transition2.play();
        } catch (Exception e) {
            System.out.println("Problem found here");
        }
    }

    private void fadeOutSunRise() {
        try {
            Thread.sleep(0);
            FadeTransition fade = new FadeTransition(Duration.seconds(0.4), sunRisePane);
            fade.setToValue(0);
            fade.play();
        } catch (Exception e) {
            System.out.println("Problem found");
        }
    }

    private void fadeOutSunSet() {
        try {
            Thread.sleep(20);
            FadeTransition fade = new FadeTransition(Duration.seconds(0.4), sunSetPane);
            fade.setToValue(0);
            fade.play();
        } catch (Exception e) {
            System.out.println("Problem found");
        }
    }

    @Override
    public void run() {
        returnSunRisePosition();
        returnSunSetPosition();
        fadeOutSunRise();
        fadeOutSunSet();
    }
}
class windAndVisibility extends Thread{
    private final Pane windSpeedPane;
    private final Pane visibilityPane;

    public windAndVisibility(Pane windSpeedPane, Pane visibilityPane) {
        this.windSpeedPane = windSpeedPane;
        this.visibilityPane = visibilityPane;
    }
    private void WindSpeedPosition(){
        TranslateTransition transition1= new TranslateTransition(Duration.seconds(0.4), windSpeedPane);
        transition1.setByY(-550);
        transition1.play();
    }
    private void VisibilityPosition(){
        try {
            Thread.sleep(20);
            TranslateTransition transition1= new TranslateTransition(Duration.seconds(0.4), visibilityPane);
            transition1.setByY(-550);
            transition1.play();
        }catch (Exception e){
            System.out.println("problem found here");
        }
    }
    private void fadeWindSpeed(){
        try {
            Thread.sleep(0);
            FadeTransition fade= new FadeTransition(Duration.seconds(0.4), windSpeedPane);
            fade.setToValue(1);
            fade.play();
        }catch (Exception e){
            System.out.println("problem found");
        }
    }
    private void fadeVisibility(){
        try {
            Thread.sleep(20);
            FadeTransition fade= new FadeTransition(Duration.seconds(0.4), visibilityPane);
            fade.setToValue(1);
            fade.play();
        }catch (Exception e){
            System.out.println("problem found");
        }

    }
    @Override
    public void  run(){
        WindSpeedPosition();
        VisibilityPosition();
        fadeVisibility();
        fadeWindSpeed();
    }
}
class WindAndVisibilityReverse extends Thread {
    private final Pane windSpeedPane;
    private final Pane visibilityPane;

    public WindAndVisibilityReverse(Pane windSpeedPane, Pane visibilityPane) {
        this.windSpeedPane = windSpeedPane;
        this.visibilityPane = visibilityPane;
    }
    private void returnWindSpeedPosition() {
        TranslateTransition transition1 = new TranslateTransition(Duration.seconds(0.4), windSpeedPane);
        transition1.setByY(550);
        transition1.play();
    }
    private void returnVisibilityPosition() {
        try {
            Thread.sleep(20);
            TranslateTransition transition2 = new TranslateTransition(Duration.seconds(0.4), visibilityPane);
            transition2.setByY(550);
            transition2.play();
        } catch (Exception e) {
            System.out.println("Problem found here");
        }
    }
    private void fadeOutWindSpeed() {
        try {
            Thread.sleep(0);
            FadeTransition fade = new FadeTransition(Duration.seconds(0.4), windSpeedPane);
            fade.setToValue(0);
            fade.play();
        } catch (Exception e) {
            System.out.println("Problem found");
        }
    }
    private void fadeOutVisibility() {
        try {
            Thread.sleep(20);
            FadeTransition fade = new FadeTransition(Duration.seconds(0.4), visibilityPane);
            fade.setToValue(0);
            fade.play();
        } catch (Exception e) {
            System.out.println("Problem found");
        }
    }
    @Override
    public void run() {
        returnWindSpeedPosition();
        returnVisibilityPosition();
        fadeOutVisibility();
        fadeOutWindSpeed();
    }
}
public class Controller implements Initializable {
    private boolean flag= true;
    private int index=0;

    @FXML private Button nextButton;
    @FXML private Button infoButton;

    @FXML private Label welcomeLabel;
    @FXML private Label name;
    @FXML private Label locLabel;
    @FXML private Label nfLabel;
    @FXML private Label countryLabel;
    @FXML private Label weatherConditionValue;
    @FXML private Label temperatureValue;

    @FXML private Label setSunRiseValue;
    @FXML private Label setSunSetValue;
    @FXML private Label setMinimumTemperatureValue;
    @FXML private Label setFeelsLikeTemperatureValue;
    @FXML private Label setMaximumTemperatureValue;
    @FXML private Label setSpeedValue;
    @FXML private Label setWindDegreeValue;
    @FXML private Label setVisibilityValue;
    @FXML private Label setPressure;
    @FXML private Label setHumidity;
    @FXML private Label CoverSetTemperature;


    @FXML private Pane layer_2;
    @FXML private Pane layer_3;
    @FXML private Pane infoPane;
    @FXML private Pane detailInfoPane;

    @FXML private Pane tempInfoPane;
    @FXML private Pane pressurePane;
    @FXML private Pane humidityPane;
    @FXML private Pane sunriseTimePane;
    @FXML private Pane windInfoPane;

    @FXML private Pane sunRisePane;
    @FXML private Pane sunSetPane;
    @FXML private Pane minTemperaturePane;
    @FXML private Pane feelsLikeTemperaturePane;
    @FXML private Pane maxTemperaturePane;
    @FXML private Pane windSpeedPane;
    @FXML private Pane visibilityPane;


    @FXML private ImageView cloudImage;
    @FXML private ImageView searchIcon;
    @FXML private ImageView earthIcon;
    @FXML private ImageView locationIcon;
    @FXML private ImageView notFound;
    @FXML private ImageView crossIcon;
    @FXML private ImageView retryIcon;
    @FXML private ImageView detailInfoCross;
    @FXML private ImageView doneButton;

    @FXML private TextField ss;

    //visibility
    private void visibility_true(){
        notFound.setVisible(true);
        locLabel.setVisible(true);
        nfLabel.setVisible(true);
        retryIcon.setVisible(true);
    }
    private void visibility_false(){
        notFound.setVisible(false);
        locLabel.setVisible(false);
        nfLabel.setVisible(false);
        retryIcon.setVisible(false);
    }

    //transition
    @FXML
    public void slideOutLayer2() {
        if(flag){
            TransitionUp();
            flag=false;
        }else{
            TransitionDown();
            flag=true;
        }
    }
    private void TransitionUp(){
        TranslateTransition transition = new TranslateTransition(Duration.seconds(1), layer_2);
        double initialY = layer_2.getLayoutY();
        double finalY = initialY - (2*layer_2.getHeight());

        transition.setFromY(initialY);
        transition.setToY(finalY);
        transition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), welcomeLabel);
        fadeTransition.setToValue(0);
        fadeTransition.play();

        FadeTransition fadeTransition1= new FadeTransition(Duration.seconds(1), cloudImage);
        fadeTransition1.setToValue(0);
        fadeTransition1.play();

        FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1), layer_2);
        fadeTransition2.setToValue(1);
        fadeTransition2.play();

        TranslateTransition transition1 = new TranslateTransition(Duration.seconds(1), nextButton);
        double initialY_Button = nextButton.getTranslateY();
        double finalY_Button = initialY_Button - 330;
        double finalX_Button = 110.0;

        transition1.setByY(finalY_Button);
        transition1.setByX(finalX_Button);
        transition1.play();

        MultiThreading thread = new MultiThreading();
        thread.setLabel(name);
        thread.setSs(ss);
        thread.setEarthIcon(earthIcon);
        thread.setSearchIcon(searchIcon);
        thread.start();

    }
    private void TransitionDown() {

        FadeTransition fadeTransition1= new FadeTransition(Duration.seconds(1), cloudImage);
        fadeTransition1.setToValue(1);
        fadeTransition1.play();

        FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1), layer_2);
        fadeTransition2.setToValue(1);
        fadeTransition2.play();

        MultiThreading2 threading2= new MultiThreading2();
        threading2.setButton(nextButton);
        threading2.setName(name);
        threading2.setWelcome(welcomeLabel);
        threading2.setLayer_2(layer_2);
        threading2.setEarthIcon(earthIcon);
        threading2.setSearchBox(ss);
        threading2.setSearchIcon(searchIcon);
        threading2.start();

    }
    public void TransitionX_detailInfoPane(){
        TranslateTransition transition= new TranslateTransition(Duration.seconds(0.3), detailInfoPane);
        transition.setByX(-366);
        transition.play();
    }
    public void Reverse_TransitionX_detailInfoPane(){
        TranslateTransition transition= new TranslateTransition(Duration.seconds(0.3), detailInfoPane);
        transition.setByX(366);
        transition.play();
    }
    //Fade in transition
    public void fadeLabel_countryLabel(double value, double second){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(second), countryLabel);
        fadeTransition.setToValue(value);
        fadeTransition.play();
    }
    private void fadeOut_tempInfoPane(){

        FadeTransition transition1= new FadeTransition(Duration.seconds(0.1), tempInfoPane);
        transition1.setToValue(0);
        transition1.play();

        FadeTransition transition2= new FadeTransition(Duration.seconds(0.1), sunriseTimePane);
        transition2.setToValue(0);
        transition2.play();

        FadeTransition transition3= new FadeTransition(Duration.seconds(0.1), windInfoPane);
        transition3.setToValue(0);
        transition3.play();

        FadeTransition transition4= new FadeTransition(Duration.seconds(0.1), humidityPane);
        transition4.setToValue(0);
        transition4.play();

        FadeTransition transition5= new FadeTransition(Duration.seconds(0.1), pressurePane);
        transition5.setToValue(0);
        transition5.play();

    }
    public void fade_detailInfoPane(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.1), detailInfoPane);
        fadeTransition.setToValue(0);
        fadeTransition.play();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fade_detailInfoPane();
        fadeOut_tempInfoPane();
        fadeLabel_countryLabel(0, 1);


        infoButton.setOnMouseClicked(mouseEvent -> {
            moveToRightPosition position= new moveToRightPosition( sunRisePane,  sunSetPane,  minTemperaturePane,  feelsLikeTemperaturePane,  maxTemperaturePane,  windSpeedPane,  visibilityPane);
            position.rightPosition();
            TransitionX_detailInfoPane();
            stackMultiThreading threading= new stackMultiThreading(tempInfoPane,  sunriseTimePane,  windInfoPane,  humidityPane,  pressurePane, infoPane);
            threading.start();
        });

        doneButton.setOnMouseClicked(mouseEvent -> {
            MoveToLeftPosition move= new MoveToLeftPosition(sunRisePane,  sunSetPane,  minTemperaturePane,  feelsLikeTemperaturePane,  maxTemperaturePane,  windSpeedPane,  visibilityPane);
            move.leftPosition();

            Reverse_TransitionX_detailInfoPane();
            ReverseStackMultiThreading threading= new ReverseStackMultiThreading(tempInfoPane,  sunriseTimePane,  windInfoPane,  humidityPane,  pressurePane, infoPane);
            threading.start();
        });
        searchIcon.setOnMouseClicked(mouseEvent -> {
            if(ss.getText().isEmpty()){
                ss.setPromptText("Location is not Found");
                visibility_true();
                MultiThreading5 threading= new MultiThreading5();
                threading.setLocation(locationIcon);
                threading.setLocLabel(locLabel);
                threading.setNotFound(notFound);
                threading.setRetryIcon(retryIcon);
                threading.setNfLabel(nfLabel);
                threading.setSs(ss);
                threading.setEarthIcon(earthIcon);
                threading.setSearchIcon(searchIcon);
                threading.start();
            }else{
                try {
                    Weather weather=WeatherApplication.throwWeatherInformation(ss.getText());
                    assert weather != null;

                    String description=weather.getWeather()[0].getDescription();
                    DecimalFormat df = new DecimalFormat("0.00");
                    String minimumTemperature = df.format(weather.getMain().getTempMin()-273);
                    String maximumTemperature = df.format(weather.getMain().getTempMax()-273);
                    String humidity = df.format(weather.getMain().getHumidity());
                    String feelsLikeTemperature = df.format(weather.getMain().getFeelsLike() - 273.15);
                    String pressure = df.format(weather.getMain().getPressure());
                    String windSpeed = df.format(weather.getWind().getSpeed());
                    String windDegree = df.format(weather.getWind().getDeg());
                    String visibility = df.format((float)weather.getVisibility() /(float) 1000.0);


                    long sunriseTimestamp = weather.getSys().getSunrise();
                    long sunsetTimestamp = weather.getSys().getSunset();

                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

                    Date sunriseDate = new Date(sunriseTimestamp * 1000L);
                    Date sunsetDate = new Date(sunsetTimestamp * 1000L);

                    String formattedSunrise = sdf.format(sunriseDate);
                    String formattedSunset = sdf.format(sunsetDate);


                    temperatureValue.setText(feelsLikeTemperature);
                    weatherConditionValue.setText(description);

                    setSunSetValue.setText(formattedSunset);
                    setSunRiseValue.setText(formattedSunrise);
                    setFeelsLikeTemperatureValue.setText(feelsLikeTemperature);
                    setMaximumTemperatureValue.setText(maximumTemperature);
                    setMinimumTemperatureValue.setText(minimumTemperature);
                    setSpeedValue.setText(windSpeed+"Km");
                    setWindDegreeValue.setText(windDegree+"°");
                    setVisibilityValue.setText(visibility+"Km");
                    setPressure.setText(pressure+"Pa");
                    setHumidity.setText(humidity+"%");
                    CoverSetTemperature.setText(feelsLikeTemperature);

                    fadeLabel_countryLabel(1, 0.7);
                    visibility_false();
                    Multithreading3 threading= new Multithreading3();
                    threading.setSs(ss);
                    threading.setLayer_3(layer_3);
                    threading.setCrossIcon(crossIcon);
                    threading.setEarthIcon(earthIcon);
                    threading.setSearchIcon(searchIcon);
                    threading.start();
                } catch (Exception e){
                    ss.setPromptText("Location is not Found");
                    visibility_true();
                    MultiThreading5 threading= new MultiThreading5();
                    threading.setLocation(locationIcon);
                    threading.setLocLabel(locLabel);
                    threading.setNotFound(notFound);
                    threading.setRetryIcon(retryIcon);
                    threading.setNfLabel(nfLabel);
                    threading.setSs(ss);
                    threading.setEarthIcon(earthIcon);
                    threading.setSearchIcon(searchIcon);
                    threading.start();
                }
            }

        });
        crossIcon.setOnMouseClicked(mouseEvent -> {
            fadeLabel_countryLabel(0, 0.7);
            MultiThreading4 threading= new MultiThreading4();
            threading.setSs(ss);
            threading.setLayer_3(layer_3);
            threading.setCrossIcon(crossIcon);
            threading.setEarthIcon(earthIcon);
            threading.setSearchIcon(searchIcon);
            threading.start();
        });
        retryIcon.setOnMouseClicked(mouseEvent -> {
            MultiThreading6 threading= new MultiThreading6();
            threading.setLocation(locationIcon);
            threading.setLocLabel(locLabel);
            threading.setNotFound(notFound);
            threading.setRetryIcon(retryIcon);
            threading.setNfLabel(nfLabel);
            threading.setSs(ss);
            threading.setEarthIcon(earthIcon);
            threading.setSearchIcon(searchIcon);
            threading.start();
        });
        tempInfoPane.setOnMouseClicked(mouseEvent -> {
            InfoPaneInformation infoTransition= new InfoPaneInformation(detailInfoPane);
            TemperatureRightPosition_Y move= new TemperatureRightPosition_Y(minTemperaturePane, feelsLikeTemperaturePane, maxTemperaturePane);
            move.start();
            infoTransition.start();
            index=1;
        });
        sunriseTimePane.setOnMouseClicked(mouseEvent -> {
            InfoPaneInformation infoTransition= new InfoPaneInformation(detailInfoPane);
            sunTimeRightPosition_Y positionY= new sunTimeRightPosition_Y(sunRisePane, sunSetPane);
            positionY.start();
            infoTransition.start();
            index=2;
        });
        windInfoPane.setOnMouseClicked(mouseEvent -> {
            InfoPaneInformation infoTransition= new InfoPaneInformation(detailInfoPane);
            infoTransition.start();
            windAndVisibility move= new windAndVisibility(windSpeedPane, visibilityPane);
            move.start();
            index=3;
        });
        detailInfoCross.setOnMouseClicked(mouseEvent -> {
            Reverse_InfoPaneInformation reverse_InfoTransition= new Reverse_InfoPaneInformation(detailInfoPane);
            reverse_InfoTransition.start();
            if(index==1){
                ReverseTemperatureRightPosition_Y transition= new ReverseTemperatureRightPosition_Y(minTemperaturePane, feelsLikeTemperaturePane, maxTemperaturePane);
                transition.start();
                index=0;
            }else if(index==2){
                SunTimeDownPosition_Y transition= new SunTimeDownPosition_Y(sunRisePane, sunSetPane);
                transition.start();
                index=0;
            }else if(index==3){
                WindAndVisibilityReverse move= new WindAndVisibilityReverse(windSpeedPane, visibilityPane);
                move.start();
                index=0;
            }
        });

    }
}