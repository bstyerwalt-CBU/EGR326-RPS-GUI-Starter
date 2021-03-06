package simplerps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectStreamException;
import java.util.Observable;
import java.util.Observer;

/**
 * This class represents a GUI for a basic rock-paper-scissors observer.
 */
public class SimpleRockPaperScissorsGui {
    private JFrame frame;
    private JButton move1;
    private JButton move2;
    private JButton play;
    private Game game;

    /**
     * Constructs the GUI and displays it on the screen.
     */
    public SimpleRockPaperScissorsGui() {
        // your code here
    }

    // sets up graphical components in the window
    private void setupComponents() {
        // your code here
    }

    // attaches various listeners to handle events
    private void handleEvents() {
        // your code here
    }

    // sets up containers for layout in the window
    private void doLayout() {
        // your code here
    }

    // This observer responds to changes in the state of the TTT observer
    // by updating the GUI to reflect the changes.
    private class GameObserver implements Observer {
        public void update(Observable arg0, Object arg1) {
            // your code here
            }
        }
    }

    // This listener responds to clicks on the "Play" button.
    private class ButtonListener implements ActionListener {
        /**
         * Called when the Play button is clicked.
         * Plays a new observer round of tic-tac-toe.
         */
        public void actionPerformed(ActionEvent event) {
            // your code here
        }
    }
}






