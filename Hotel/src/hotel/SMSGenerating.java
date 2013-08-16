/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import properties.SerialConnection;
import properties.SerialParameters;

/**
 *
 * @author Win -8
 */
public class SMSGenerating {

    char c = '"';
    char ctrtZ=(char)26;
    SerialConnection serialcons;
    SerialParameters serialparams;

    public void connect(String port) {

        try {
            serialparams = new SerialParameters(port, 9600, 0, 0, 8, 1, 0);
            serialcons = new SerialConnection(serialparams);
            serialcons.openConnection();
            System.out.println("Connected....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void sending(){
        new Thread(new Runnable() {
            
            String data=text();
            String number=number();

            @Override
            public void run() {
                System.out.println("Sending Started....");
                serialcons.send("AT+CMGF=1");
                serialcons.send("AT");
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                }
                String s1 = serialcons.getIncommingString();
                System.out.println("s1  " + s1);
                if (s1.contains("OK")) {
                    serialcons.send("AT+CMGS=" + c + "" + "+94" + number + c);
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                    }
                    String s2 = serialcons.getIncommingString();
                    System.out.println("s2" + s2);
                    if (s2.contains(">")) {
                        serialcons.send(data + ctrtZ);
                        try {
                            Thread.sleep(5000);
                        } catch (Exception e) {
                        }
                        System.out.println(serialcons.getIncommingString());
                    } else {
                        System.out.println("Error mode 03");
                    }
                } else {
                    System.out.println("Error mode 01");
                }
            }
        }).start();
    }
    public String text(){
        String data="Username : riat001\nPassword : 123\n\nNeelagiri-software@RIAT";
        return data;
    }
    public String number(){
        String number="771676192";
        return number;
    }
    public static void main(String[] args) {
        SMSGenerating s=new SMSGenerating();
        s.connect("COM17");
        s.sending();
    }
}