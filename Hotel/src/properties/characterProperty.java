/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import java.awt.TextField;
import javax.swing.JTextField;

/**
 *
 * @author Win -8
 */
public class characterProperty {
    public void letterUppercase(JTextField tf, int index){
        if (tf.getText().isEmpty()) {
        } else {
            if (Character.isLowerCase(tf.getText().charAt(index))) {
                tf.setText(new String(String.valueOf(tf.getText().charAt(index))).toUpperCase() + tf.getText().substring(1));
            }
        }
    }
    public void letterLowercaseALL(JTextField tfALL,int indexALL){
        if(tfALL.getText().isEmpty()){
        }else{
            if(Character.isUpperCase(tfALL.getText().charAt(indexALL))){
                tfALL.setText(new String(String.valueOf(tfALL.getText().charAt(indexALL))).toUpperCase() + tfALL.getText().substring(1));
            }
        }
    }
}
