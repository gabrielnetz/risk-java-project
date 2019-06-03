package risk.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RiskGUI extends JFrame {
  private JLabel lName = new JLabel("Risk Game");
  private JButton btStart = new JButton("Start");

  public RiskGUI() {
    super("Risk Project");
    this.setLayout(new GridLayout(5, 5, 5, 5));
    this.add(this.lName);
    this.add(this.btStart);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setSize(500, 500);
  }
}
