import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sh extends JFrame {
    int x = 0, y = 0;
    private JButton Spartak = new JButton("Spartak");
    private JButton Lokomotiv = new JButton("Lokomotiv");
    private JLabel Result = new JLabel("              Result:");
    private JLabel LastScorer = new JLabel("Last Scorer: N/A");
    private Label Winner = new Label("Winner: DRAW");
    private JLabel EmptyContainer = new JLabel("");



    public sh() {
        super("Football Score Show");
        this.setBounds(100, 100, 500, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 3, 2, 2));
        container.add(Spartak);
        container.add(Result);
        container.add(Lokomotiv);
        container.add(LastScorer);
        container.add(EmptyContainer);
        container.add(Winner);
        ButtonGroup buttonGroup = new ButtonGroup();
        Spartak.addActionListener(new ButtonEventListener1());
        Lokomotiv.addActionListener(new ButtonEventListener2());
    }

    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent Event) {
            x++;
            LastScorer.setText("Last Scorer: Spartak");
            Result.setText("              Result: " + String.valueOf(x) + " X " + String.valueOf(y));
            WhoWinner(x,y);
        }
    }

    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent Event) {
            y++;
            LastScorer.setText("Last Scorer: Lokomotiv");
            Result.setText("              Result: " + String.valueOf(x) + " X " + String.valueOf(y));
            WhoWinner(x,y);
        }
    }

    public void WhoWinner (int x,int y)
    {
        if (x>y)
        {
            Winner.setText("Winner: Spartak");
        }
        if (x<y)
        {
            Winner.setText("Winner: Lokomotiv");
        }
        if (x==y)
        {
            Winner.setText("Winner: DRAW");
        }
    }
}
