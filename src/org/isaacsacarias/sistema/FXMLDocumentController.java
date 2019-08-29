
package org.isaacsacarias.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ISAAC
 */
public class FXMLDocumentController implements Initializable {
    float dato1,dato2, resultado;
    int OP;
    
    @FXML private TextField txtValores;
    @FXML private Button btnMasMenos;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnSumar;
    @FXML private Button btnIgual;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMenos;
    @FXML private Button btnMultiplicador;
    @FXML private Button btnC;
    @FXML private Button btnDivicion;
    @FXML private Button btnXCuadrado;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnRaiz;
    @FXML private Button btnBorrar;
    @FXML private Button btnUnox;
    @FXML private Button btnCE;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       if(event.getSource()==btnUno)
            txtValores.setText(txtValores.getText()+"1");
       
        else if (event.getSource()==btnDos)
            txtValores.setText(txtValores.getText()+"2");
        
        else if (event.getSource()== btnTres)
            txtValores.setText(txtValores.getText()+"3");
        
        else if (event.getSource()== btnCuatro)
            txtValores.setText(txtValores.getText()+"4");
        
        else if (event.getSource()== btnCinco)
            txtValores.setText(txtValores.getText()+"5");
        
        else if (event.getSource()== btnSeis)
            txtValores.setText(txtValores.getText()+"6");
        
        else if (event.getSource()== btnSiete)
            txtValores.setText(txtValores.getText()+"7");
        
        else if (event.getSource()== btnOcho)
            txtValores.setText(txtValores.getText()+"8");
        
        else if (event.getSource()== btnNueve)
            txtValores.setText(txtValores.getText()+"9");
        
        else if (event.getSource()== btnCero)
            txtValores.setText(txtValores.getText()+"0");
        
        else if (event.getSource()== btnPunto)
            txtValores.setText(txtValores.getText()+".");
        
        
        
        else if (event.getSource()==btnSumar){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText ("");
            OP = 1; 
        }
        else if (event.getSource()==btnMenos){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText ("");
            OP = 2;
        }
        else if (event.getSource()==btnMultiplicador){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText ("");
            OP = 3;
        }
        else if (event.getSource()==btnDivicion){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText ("");
            OP = 4;
        }
        else if (event.getSource()==btnXCuadrado){
            dato1 = Float.parseFloat(txtValores.getText());
            OP = 5;
        }
        else if (event.getSource()==btnPorcentaje){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText ("");
            OP = 6;
        }
        else if (event.getSource()==btnRaiz){
            dato1 = Float.parseFloat(txtValores.getText());
            OP = 7;
        }
        else if (event.getSource()==btnMasMenos){
            dato1 = Float.parseFloat(txtValores.getText());
            OP = 8;
        }
        
        else if (event.getSource()==btnUnox){
            dato1 = Float.parseFloat(txtValores.getText());
            OP = 9;
        }
        else if (event.getSource()==btnCE){
            dato2 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
        }
        else if (event.getSource()==btnC){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText ("");
            
        }
        else if (event.getSource()== btnIgual){
            dato2 = Float.parseFloat(txtValores .getText());
            
        ////////////////////////////////////////////////////////////////////////    
        switch (OP){
            case 1:
                resultado = dato1 + dato2;
                txtValores.setText(String.valueOf(resultado));
                break;
            
            case 2:
                resultado = dato1 - dato2;
                txtValores.setText(String.valueOf(resultado));
                break;
            
            case 3:
                resultado = dato1 * dato2;
                txtValores.setText(String.valueOf(resultado));
                break;
                
            case 4:
                resultado = dato1 / dato2;
                txtValores.setText(String.valueOf(resultado));
                break;
                
            case 5:
                resultado = (float) Math.pow (dato1,dato2);
                txtValores.setText(String.valueOf(resultado));
                break;
                
            case 6:
                resultado = (dato1 * dato2) /100;
                txtValores.setText(String.valueOf(resultado));
                break;
                
            case 7:
                resultado = (float) Math.sqrt(dato1);
                txtValores.setText(String.valueOf(resultado));
                break;
                
            case 8:
                resultado = dato1 * -1;
                txtValores.setText(String.valueOf(resultado));
                break;
                
            case 9:
                resultado = 1 / dato1;
                txtValores.setText(String.valueOf(resultado));
                break;
                
                
            }
        }
    }
    
    @FXML
    private Label label;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
