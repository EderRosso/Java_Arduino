/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.fazecast.jSerialComm.SerialPort;

/**
 *
 * @author Eder
 */
public class ConexaoDAO {

    private SerialPort porta;

    public ConexaoDAO(String Nporta) {
        porta = SerialPort.getCommPort(Nporta);
        porta.setComPortParameters(9600, 8, 1, 0);
        porta.openPort();
        porta.closePort();
    }

//     public void sendData(LedDTO data) {
//        // Envia dados para o Arduino
//        porta.writeBytes(data.getLed().getBytes(), data.getLed().length());
//    }

    public String receiveData() {
        // Recebe dados do Arduino
        byte[] readBuffer = new byte[porta.bytesAvailable()];
        porta.readBytes(readBuffer, readBuffer.length);
        return new String(readBuffer);
    }
    
    public static void listaPortas() {
        // Obtém uma lista de portas seriais disponíveis
        SerialPort[] ports = SerialPort.getCommPorts();

        // Cria um array de strings para armazenar os nomes das portas
        String[] portNames = new String[ports.length];

        // Preenche o array com os nomes das portas
        for (SerialPort porta : ports) {
            
//            portNames[i] = ports[i].getSystemPortName();
        }

        
    }
}
