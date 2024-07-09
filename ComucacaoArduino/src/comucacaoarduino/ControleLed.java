/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comucacaoarduino;

import com.fazecast.jSerialComm.SerialPort;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


/**
 *
 * @author Eder
 */
public class ControleLed {
    SerialPort porta;
    
    public void inicializa(String port){
        porta = SerialPort.getCommPort(port);
        porta.setComPortParameters(9600, 8, 1, 0);
        porta.openPort();
        porta.closePort();       
    }
    
    public void LigaLed() throws FileNotFoundException{
        porta = SerialPort.getCommPort("COM3");
        PrintWriter saida = new PrintWriter("COM3");
        saida.print('l');
        saida.flush();
        saida.close();
    }
    
    public void DesligaLed() throws FileNotFoundException{
        porta = SerialPort.getCommPort("COM3");
        PrintWriter saida = new PrintWriter("COM3");
        saida.print('d');
        saida.flush();
        saida.close();
    }
    
    public void PiscaLed() throws FileNotFoundException{
        porta = SerialPort.getCommPort("COM3");
        PrintWriter saida = new PrintWriter("COM3");
        saida.print('p');
        saida.flush();
        saida.close();
    }
    
    public void VeloLed(int vel) throws FileNotFoundException{
        porta = SerialPort.getCommPort("COM3");
        PrintWriter saida = new PrintWriter("COM3");
        saida.print(vel);
        saida.flush();
        saida.close();
    }
    
    
    
    
}
