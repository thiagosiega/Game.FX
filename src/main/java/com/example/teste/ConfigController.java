package com.example.teste;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class ConfigController {

    @FXML
    private Label Janela; // ID do Label "Janela"

    @FXML
    private ListView<String> Lista; // ID da ListView "Lista"

    @FXML
    private Label Dif; // ID do Label "Dif"

    @FXML
    private ListView<String> Dificuldade; // ID da ListView "Dificuldade"

    @FXML
    private Label Frame; // ID do Label "Frame"

    @FXML
    private ListView<String> FPS; // ID da ListView "FPS"

    @FXML
    private Button salvarButton; // ID do botão "Salvar"

    @FXML
    private Button sairButton; // ID do botão "Sair"

    @FXML
    protected void onToggleLista() {
        // Código para quando um item da ListView "Lista" é selecionado
        System.out.println("Item selecionado na ListView Lista");
    }

    @FXML
    protected void onToggleDificuldade() {
        // Código para quando um item da ListView "Dificuldade" é selecionado
        System.out.println("Item selecionado na ListView Dificuldade");
    }

    @FXML
    protected void onToggleFPS() {
        // Código para quando um item da ListView "FPS" é selecionado
        System.out.println("Item selecionado na ListView FPS");
    }


    @FXML
    public void initialize() {
        // ListView Dimensões
        Lista.getItems().addAll("800x600", "1024x768", "1280x720", "Fullscreen");

        // ListView Dificuldade
        Dificuldade.getItems().addAll("Fácil", "Médio", "Difícil", "Insano");

        // ListView FPS
        FPS.getItems().addAll("30", "60", "120", "Ilimitado");

        // Configuração dos Labels
        Janela.setText("Dimensões");
        Dif.setText("Dificuldade");
        Frame.setText("FPS");

        // Configuração dos Botões
        salvarButton.setText("Salvar");
        sairButton.setText("Sair");
    }

    @FXML
    protected void onSalvarClick() {
        // Exibe as opções selecionadas no console
        String dimensaoSelecionada = Lista.getSelectionModel().getSelectedItem();
        String dificuldadeSelecionada = Dificuldade.getSelectionModel().getSelectedItem();
        String fpsSelecionado = FPS.getSelectionModel().getSelectedItem();

        // Verifica se as seleções não são nulas antes de exibir
        System.out.println("Dimensões: " + (dimensaoSelecionada != null ? dimensaoSelecionada : "Nenhuma seleção"));
        System.out.println("Dificuldade: " + (dificuldadeSelecionada != null ? dificuldadeSelecionada : "Nenhuma seleção"));
        System.out.println("FPS: " + (fpsSelecionado != null ? fpsSelecionado : "Nenhuma seleção"));
    }

    @FXML
    protected void onSairClick() {
        try {
            // Carregar o novo arquivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent newRoot = loader.load();

            // Obter o Stage atual a partir da cena do botão
            Scene currentScene = sairButton.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();

            // Atualizar a cena com o novo root
            currentStage.setScene(new Scene(newRoot, 800, 300));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
