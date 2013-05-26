/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteiojavafx;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Bruno Borges <bruno.borges at oracle.com>
 */
public class SampleController implements Initializable {
    
    int[] paginas = new int[]{23, 24, 23, 24, 23, 10};
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Random random = new Random();
        int pagina = random.nextInt(paginas.length);
        int linha = random.nextInt(paginas[pagina]);
        linha++;
        pagina++;
        label.setText(String.format("Linha %s, pagina %s", linha, pagina));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
