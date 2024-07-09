/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comucacaoarduino;

/**
 *
 * @author Eder
 */
public class ComucacaoArduino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleLed controle = new ControleLed();
        controle.inicializa("COM3");
        
        FrmLed tela = new FrmLed();
        tela.setVisible(true);
    }

}
