package risk.controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import risk.model.Map;
import risk.model.Player;
import risk.view.RiskGUI;

public class Risk {
    public Risk() {
        RiskGUI riskGUI = new RiskGUI();
        riskGUI.showMenu();
        riskGUI.setVisible(true);
        riskGUI.getStart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                riskGUI.showGame();
            }
        });
    }

    public static void main(String[] args) {
      try {
        Risk risk = new Risk();
      } catch(Exception e) {
        System.err.print("Risk game found a runtime issue");
      }
    }
}
