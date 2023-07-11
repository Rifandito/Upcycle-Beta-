package Pages.PagePeran;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


public class ControllerPeran implements Initializable {

    @FXML
    private TextField jumlahSetoran;

    @FXML
    private Button Setor;

    @FXML
    private DatePicker tanggalSetoran;

    @FXML
    private BarChart<String, Integer> grafikSetoran;

    
    XYChart.Series<String, Integer> data1 = new XYChart.Series<>();

    @FXML
    private void Setorkan() {
        Integer jmlhSetoran = Integer.valueOf(jumlahSetoran.getText());
        String tglSetoran = getTanggal();
        data1.getData().add(new XYChart.Data<>(tglSetoran, jmlhSetoran));
        grafikSetoran.getData().add(data1);
    }

    public String getTanggal() {
        LocalDate date = tanggalSetoran.getValue();
        return (date != null) ? date.toString() : "Tidak ada tanggal yang dipilih";
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        grafikSetoran.getData().add(data1);
    }
}
