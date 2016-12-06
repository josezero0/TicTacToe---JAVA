package com.tictactoe.utility;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author BuenSeñor
 */
public class MyButtonGroup {

    /**
     * Set enable or disable all the buttons of a ButtonGroup.
     *
     * @param enable 'true' to enable, 'false to disable.
     * @param bg ButtonGroup to enable or disable.
     */
    public static final void setEnable(boolean enable, ButtonGroup bg) {
        Enumeration elements = bg.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton button = (AbstractButton) elements.nextElement();
            button.setEnabled(enable);
        }
    }

    /**
     * Set a text for all the buttons of a ButtonGroup.
     *
     * @param text String text.
     * @param bg ButtonGroup to set the text.
     */
    public static final void setText(String text, ButtonGroup bg) {
        Enumeration elements = bg.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton button = (AbstractButton) elements.nextElement();
            button.setText(text);
        }
    }

    /**
     * Set selected or unselected all the buttons of a ButtonGroup.
     *
     * @param selected
     * @param bg
     */
    public static final void setSelected(boolean selected, ButtonGroup bg) {
        Enumeration elements = bg.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton button = (AbstractButton) elements.nextElement();
            button.setSelected(selected);
        }
    }

}
