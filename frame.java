import javax.swing.*;

public class frame extends JFrame {
    frame(){
        //adding the panel to the window
        this.add(new panel());
        //naming the frame window
        this.setTitle("SnakeGame");
        //to make sure uniform window size
        this.setResizable(false);
        //to make panel visible to the user
        this.setVisible(true);
        //default size across devices
        this.pack();
    }
}
