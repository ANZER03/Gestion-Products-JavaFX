package ma.enset.gestionproductsjavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductControler implements Initializable {

    @FXML
    private TextField nom_field;
    @FXML
    private TextField prix_field;
    @FXML
    private Button btn_add;
    @FXML
    private Button btn_delete;
    @FXML
    private ListView<Product> listview;

    private ObservableList<Product> data = FXCollections.observableArrayList();

    public void AddProduct() {
        if (!prix_field.getText().trim().isEmpty() || !nom_field.getText().trim().isEmpty()){
            try {
                double prix = Double.parseDouble(prix_field.getText());
                String name = nom_field.getText();
                Product pr1 = new Product(name, prix);
                data.add(pr1);
                prix_field.setText("");
                nom_field.setText("");
            } catch (NumberFormatException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("The prix is not valid!");
                alert.show();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Entrer les valeurs!");
            alert.show();
        }
    }

    public void DeleteProduct() {
        int index = listview.getSelectionModel().getSelectedIndex();
        if (index == -1){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Veuillez séléctionner un produit !!!");
            alert.show();
        }else{
            data.remove(index);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        listView.setItems(data);
        if (listview == null) {
            System.err.println("listView is NULL! Check FXML file.");
        } else {
            Product pr1 = new Product("Apple", 3000.0);
            Product pr2 = new Product("Apple", 3000.0);
            Product pr3 = new Product("Apple", 3000.0);
            data.addAll(pr1,pr2,pr3);
            listview.setItems(data);
        }
    }
}
