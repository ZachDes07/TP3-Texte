package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.Optional;

public class Controller {

    public TextArea txaTexte;
    public TextArea txaNbEntiers;
    public TextArea txaMots;
    public TextField txfMinuscules;
    public TextField txfMajuscules;
    public TextField txfLettres;
    public TextField txfNbEntiers;
    public TextField txfMots;
    public ComboBox cmbChoixTxt;
    public ComboBox cmbLettres;
    public CheckBox chbConfirmation;

    public void initialize() {
        for(int i = 97; i <= 122; i++) {
            cmbLettres.getItems().add((char) i);
        }
        for(int a = 65; a <= 90; a++) {
            cmbLettres.getItems().add((char) a);
        }
        cmbChoixTxt.getItems().addAll("Extrait L'étranger de Camus","Le cerveau","Test de la prof");
    }

    public void btnAPlusActionEvent(ActionEvent actionEvent) {
    }

    public void btnAMoinsActionEvent(ActionEvent actionEvent) {
    }

    public void tgbNoirActionEvent(ActionEvent actionEvent) {
    }

    public void tgbVertActionEvent(ActionEvent actionEvent) {
    }

    public void tgbRougeActionEvent(ActionEvent actionEvent) {
    }

    public void tgbBleuActionEvent(ActionEvent actionEvent) {
    }

    public void tgbGrisActionEvent(ActionEvent actionEvent) {
    }

    public void tgbOrangeActionEvent(ActionEvent actionEvent) {
    }

    public void tgbMajActionEvent(ActionEvent actionEvent) {
    }

    public void btnInverseActionEvent(ActionEvent actionEvent) {
    }

    public void chbDoublonsActionEvent(ActionEvent actionEvent) {
    }

    public void radAscendantActionEvent(ActionEvent actionEvent) {
    }

    public void radDescendantActionEvent(ActionEvent actionEvent) {
    }

    public void btnEntiersPlusActionEvent(ActionEvent actionEvent) {
    }

    public void btnEntiersMoinsActionEvent(ActionEvent actionEvent) {
    }

    public void btnMotsPlusActionEvent(ActionEvent actionEvent) {
    }

    public void btnMotsMoinsActionEvent(ActionEvent actionEvent) {
    }

    public void btnTxtMoinsActionEvent(ActionEvent actionEvent) {
    }

    public void btnTriNbActionEvent(ActionEvent actionEvent) {
    }

    public void chbConfirmationAcitonEvent(ActionEvent actionEvent) {
    }

    public void btnQuitterActionEvent(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Voulez-vous vraiment quitter?");
        alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
        if(chbConfirmation){
        Optional<ButtonType> resultat = alert.showAndWait();
        if (resultat.get() == ButtonType.YES){
            Platform.exit();
        }
        else
            Platform.exit();
    }

    public void cmbLettresActionEvent(ActionEvent actionEvent) {
    }

    public void cmbChoixTxtActionEvent(ActionEvent actionEvent) {

    }
}
