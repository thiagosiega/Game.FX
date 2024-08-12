package com.example.teste;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button Inicio;

    @FXML
    private Button Config;

    @FXML
    private Button Pecados;

    @FXML
    private Button Virtudes;

    @FXML
    private Button Sair;

    @FXML
    protected void onInicioClick() {
        System.out.println("Inicio");
    }

    @FXML
    protected void onConfigClick() {
        try {
            // Carregar o novo arquivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("config_pag.fxml"));
            Parent newRoot = loader.load();

            // Obter o Stage atual a partir do botão Config
            Stage stage = (Stage) Config.getScene().getWindow();

            // Definir o tamanho da nova cena
            Scene newScene = new Scene(newRoot, 800, 300); // Define a largura e altura desejadas
            stage.setScene(newScene);

            // Opcional: Definir o título da janela
            stage.setTitle("Configuração");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onPecadosClick() {
        System.out.println("Pecados");
    }

    @FXML
    protected void onVirtudesClick() {
        System.out.println("Virtudes");
    }

    @FXML
    protected void onSairClick() {
        System.exit(0);
    }
}
