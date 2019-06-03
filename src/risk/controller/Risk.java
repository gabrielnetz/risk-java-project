package risk.controller;

import risk.model.Map;
import risk.model.Player;
import risk.view.RiskGUI;

public class Risk {
    public Risk() {
        RiskGUI riskGUI = new RiskGUI();
        riskGUI.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            Risk risk = new Risk();
        } catch (Exception e) {
            System.err.println("Market Interface parou de funcionar.");
        }
    }
}
