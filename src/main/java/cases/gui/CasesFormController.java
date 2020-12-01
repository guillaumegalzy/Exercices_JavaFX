package cases.gui;

import javafx.scene.control.*;

public class CasesFormController {
    public TextField textInput;
    public CheckBox Choix_couleur,Choix_texte,Choix_casse;
    public RadioButton Fond_Rouge,Fond_Vert,Fond_Bleu;
    public RadioButton Texte_Rouge,Texte_Blanc,Texte_Noir;
    public RadioButton Casse_Min,Casse_Maj;
    public TextField textResult;
    public TitledPane Choice_Panel,Fond_Panel,Texte_Panel,Casse_Panel;
    public ToggleGroup Fond,Texte;
    public String Fond_value = "white";
    public String Texte_value = "black";

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
}