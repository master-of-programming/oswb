package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    class myclas {

    }
    String adrss;
    @FXML
    WebView wv;
    @FXML
    TextField txt1;
    @FXML
    Button but_go,but_reload,but_Home;;
private static String HTML_String="<!doctype html>\n" +
        "<html>\n" +
        "<head>\n" +
        "<meta charset=\"utf-8\">\n" +
        "<title>OSWB Search</title>\n" +
        "<style type=\"text/css\">\n" +
        "\tbody{background-color: black; color: white;}\n" +
        "\t#prg{\n" +
        "\t\tposition: absolute;\n" +
        "\t\ttop: 100px;\n" +
        "\t\tleft:580px;\n" +
        "\t}\n" +
        "\t#txt{\n" +
        "\t\tposition: absolute;\n" +
        "\t\ttop: 300px;\n" +
        "\t\tleft: 290px;\n" +
        "\t\twidth: 800px;\n" +
        "\t}\n" +
        "\t#prg2{\n" +
        "\t\tposition: absolute;\n" +
        "\t\ttop: 285px;\n" +
        "\t\tleft: 230px;\n" +
        "\t}\n" +
        "\t#btn{\n" +
        "\t\tposition: absolute;\n" +
        "\t\ttop: 380px;\n" +
        "\t\tleft: 600px;\n" +
        "\t\twidth: 150px;\n" +
        "\t}\n" +
        "</style>\n" +
        "</head>\n" +
        "<body>\n" +
        "    <p id=\"prg\">Open Source Web Browser Search</p>\n" +
        "    <p id=\"prg2\">Search : </p>\n" +
        "    <input type=\"text\" id=\"txt\" value=\"\" autofocus>\n" +
        "    <button id=\"btn\">Ara</button>\n" +
        "    <script>\n" +
        "    \tfunction linkiAc(url) {\n" +
        "            \twindow.location=url;\n" +
        "            }\n" +
        "        var btn=document.getElementById(\"btn\");\n" +
        "        btn.onclick=function(){\n" +
        "            var x=document.getElementById(\"txt\");\n" +
        "            var query=\"https://www.google.com/search?sxsrf=ALeKk02iC-EA3L-tDvQ3ttlWGsxpNG5pFQ%3A1594823970434&source=hp&ei=IhUPX9KiGI3gmwX35ICoBQ&q=\"+x.value;\n" +
        "            //window.alert(\"Hoşgeldin: \"+query);\n" +
        "            linkiAc(query);\n" +
        "        }        \n" +
        "    </script>\n" +
        "</body>\n" +
        "</html>";
    @FXML
    private void but_go_Act(ActionEvent actionEvent){
    adrss=txt1.getText();
    System.out.println(adrss);
    final WebEngine webEngine=wv.getEngine();
    webEngine.setJavaScriptEnabled(true);
    webEngine.load("https://www."+adrss);
    }
    @FXML
    private void but_reload_Act(ActionEvent actionEvent){
        adrss=txt1.getText();
        final WebEngine webEngine=wv.getEngine();
        webEngine.setJavaScriptEnabled(true);
        webEngine.reload();
    }
    @FXML
    public void but_Home_Act(ActionEvent actionEvent){
        final WebEngine webEngine=wv.getEngine();
        webEngine.setJavaScriptEnabled(true);
        webEngine.loadContent(HTML_String);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
