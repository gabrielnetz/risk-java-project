package risk.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RiskGUI extends JFrame {
  private JPanel fMenu = new JPanel();
  private JPanel fGame = new JPanel();
  private JButton btStart = new JButton("Start");

  public RiskGUI() {
    super("Risk Project");

    this.fMenu.setLayout(new GridLayout(3, 3, 3, 3));
    this.fMenu.add(new JLabel("Risk Game"));
    this.fMenu.add(this.btStart);

    this.fGame.add(new JLabel("Working"));

    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
  }

  public void showMenu() {
    this.add(this.fMenu);
    this.setSize(500, 500);
  }

  public void showGame() {
    this.remove(this.fMenu);
    this.add(this.fGame);
    this.setSize(1000, 1000);
  }

  public JButton getStart() {
    return this.btStart;
  }
}
