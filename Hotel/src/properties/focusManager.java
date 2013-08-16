/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.DefaultFocusManager;

/**
 *
 * @author Win -8
 */
public class focusManager {

    DefaultFocusManager df = new DefaultFocusManager();

    public void textFieldsNext(KeyEvent evt, Component cmpNext, Component cmpBack) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            df.focusNextComponent(cmpNext);
        }

        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            df.focusPreviousComponent(cmpBack);
        }
    }
}
