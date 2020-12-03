package main.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import main.tableau.Client;

public class MainAppController {
    // Gestionnaire d'écoute pour les sliders
        public void initialize() {

            // Slider pour l'application de mélange
                Slider_red.valueProperty().addListener( evt -> {
                    Slider_red_value = (int) Slider_red.getValue();
                    Change_Slider();
                });
                Slider_green.valueProperty().addListener( evt -> {
                    Slider_green_value = (int) Slider_green.getValue();
                    Change_Slider();
                });
                Slider_blue.valueProperty().addListener( evt -> {
                    Slider_blue_value = (int) Slider_blue.getValue();
                    Change_Slider();
                });

            // Initialisation des données pour le main.tableau
                model.add(new Client("Josh", "Homme", "Joshua Tree"));
                model.add(new Client("Dave", "Grohl", "Warren"));
                model.add(new Client("Krist", "Novoselic", "Compton"));
                model.add(new Client("Robert", "Trujillo", "Santa Monica"));

                //On rend le main.tableau non-éditable
                lst_clients.setEditable(false);

                // Jonction du main.tableau avec les données
                col_prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
                col_nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
                col_ville.setCellValueFactory(new PropertyValueFactory<>("ville"));

                // On indique au TableView quelle modèle observer pour trouver les données
                lst_clients.setItems(model);
        }


    // MENU
        // Membres
            public AnchorPane Menu_Panel;
            public AnchorPane Calculatrice_Windows;
            public AnchorPane Casse_Windows;
            public AnchorPane Melangeur_Windows;
            public AnchorPane Tableau_Windows;

    // Méthode
            public void Hide_All() {
                this.Calculatrice_Windows.setVisible(false);
                this.Casse_Windows.setVisible(false);
                this.Melangeur_Windows.setVisible(false);
                this.Tableau_Windows.setVisible(false);
            }

            public void Menu_Calculatrice() {
                Hide_All();
                this.Calculatrice_Windows.setVisible(true);
            }

            public void Menu_Casse() {
                Hide_All();
                this.Casse_Windows.setVisible(true);
            }

            public void Menu_Melange() {
                Hide_All();
                this.Melangeur_Windows.setVisible(true);
            }

            public void Menu_Tableau() {
                Hide_All();
                this.Tableau_Windows.setVisible(true);
            }

    // CALCULATRICE
        // Membres
        public TextArea result;
        public Button button0,button2,button4,button3,button1,button5,button6,button7,button8,button9,buttonVider,buttonCalculer;

        // Méthode
        public void buttonVider_Click() {this.result.clear();}

        public void buttonCalculer_Click() {
            buttonVider_Click();
            int calc = 0;
            String[] chiffre = this.result.getText().split("[+]");
            for (String element: chiffre) {
                calc += Integer.parseInt(element);
            }
            this.result.appendText("=" + calc);
        }

        public void button0_Click() {
            if (this.result.getLength() == 0){
                this.result.appendText("0");
            }else {
                this.result.appendText("+"+0);
            }
        }

        public void button2_Click() {
            if (this.result.getLength() == 0){
                this.result.appendText("2");
            }else {
                this.result.appendText("+"+2);
            }
        }

        public void button4_Click() {
            if (this.result.getLength() == 0){
                this.result.appendText("4");
            }else {
                this.result.appendText("+"+4);
            }
        }

        public void button3_Click() {
            if (this.result.getLength() == 0){
                this.result.appendText("3");
            }else {
                this.result.appendText("+"+3);
            }
        }

        public void button1_Click() {
            if (this.result.getLength() == 0){
                this.result.appendText("1");
            }else {
                this.result.appendText("+"+1);
            }
        }

        public void button5_Click() {
            if (this.result.getLength() == 0){
                this.result.appendText("5");
            }else {
                this.result.appendText("+"+5);
            }
        }

        public void button6_Click() {
            if (this.result.getLength() == 0){
                this.result.appendText("6");
            }else {
                this.result.appendText("+"+6);
            }
        }

        public void button7_Click() {
            if (this.result.getLength() == 0){
                this.result.appendText("7");
            }else {
                this.result.appendText("+"+7);
            }
        }

        public void button8_Click() {
            if (this.result.getLength() == 0){
                this.result.appendText("8");
            }else {
                this.result.appendText("+"+8);
            }
        }

        public void button9_Click() {
            if (this.result.getLength() == 0){
                this.result.appendText("9");
            }else {
                this.result.appendText("+"+9);
            }
        }

    // CASSE
        // Membres
            public TextField textInput;
            public CheckBox Choix_couleur,Choix_texte,Choix_casse;
            public RadioButton Fond_Rouge,Fond_Vert,Fond_Bleu;
            public RadioButton Texte_Rouge,Texte_Blanc,Texte_Noir;
            public RadioButton Casse_Min,Casse_Maj;
            public TextField textResult;
            public TitledPane Choice_Panel,Fond_Panel,Texte_Panel,Casse_Panel;
            public ToggleGroup Fond,Texte,Casse;
            public String Fond_value = "white";
            public String Texte_value = "black";

        // Méthode
            public void textInput_MAJ() {
                this.textResult.setText(this.textInput.getText());

                // Active, désactive choix si taille nulle dans l'input
                this.Choice_Panel.setDisable(this.textResult.getText().length() == 0);
            }

            public void Choix_couleur_Click() {this.Fond_Panel.setDisable(!this.Choix_couleur.isSelected());}

            public void Choix_texte_Click() {this.Texte_Panel.setDisable(!this.Choix_texte.isSelected());}

            public void Choix_casse_Click() {this.Casse_Panel.setDisable(!this.Choix_casse.isSelected());}

            public void Casse_Min_Click() {this.textResult.setText(this.textResult.getText().toLowerCase());}

            public void Casse_Maj_Click() {this.textResult.setText(this.textResult.getText().toUpperCase());}

            public void Texte_Rouge_Click() {this.Texte_value = "red";Change();}

            public void Texte_Blanc_Click() {this.Texte_value = "white";Change();}

            public void Texte_Noir_Click() {this.Texte_value = "black";Change();}

            public void Fond_Rouge_Click() {this.Fond_value = "red";Change();}

            public void Fond_Vert_Click() {this.Fond_value = "green";Change();}

            public void Fond_Bleu_Click() {this.Fond_value = "blue";Change();}

            public void Change(){
                this.textResult.setStyle("-fx-text-fill:" + this.Texte_value + "; -fx-background-color:" + this.Fond_value);
            }

    // MELANGE
        // Membres
            public Slider Slider_red;
            public Slider Slider_green;
            public Slider Slider_blue;
            public int Slider_red_value;
            public int Slider_green_value;
            public int Slider_blue_value;
            public TextField result_melange;

        // Méthode
            public void Change_Slider(){
                this.result_melange.setStyle("-fx-background-color: rgb("+ this.Slider_red_value + "," + this.Slider_green_value + "," + this.Slider_blue_value+")");
            }

    // TABLEAU
        // Membres
            public TableView<Client> lst_clients;
            public TableColumn<Client,String> col_prenom;
            public TableColumn<Client,String> col_nom;
            public TableColumn<Client,String> col_ville;
            public TextField txt_prenom;
            public TextField txt_nom;
            public TextField txt_ville;
            public Button btn_sauver;
            public Button btn_annuler;
            public Button btn_supprimer;
            public ObservableList<Client> model = FXCollections.observableArrayList();

        // Méthode
            public void btn_sauver(){
                Client client = new Client(this.txt_nom.getText(),this.txt_prenom.getText(),this.txt_ville.getText()); //Création d'un nouveau client avec les valeurs des inputs
                model.add(client); //Ajout dans la liste
            }

            public void btn_annuler(){
                this.txt_prenom.clear();
                this.txt_nom.clear();
                this.txt_ville.clear();
            }

            public void btn_supprimer(){
                int indexClient = lst_clients.getSelectionModel().getSelectedIndex(); //Récupération de l'index du client sélectionné
                model.remove(indexClient); //Suppression dans la liste
            }
}