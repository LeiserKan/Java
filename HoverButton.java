import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HoverButton {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hover-Panel");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);

    // Rechteck: JPanel mit fester Größe und Farbe
    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(150, 100));
    Color normalColor = Color.BLUE;
    Color hoverColor = Color.GREEN;

    panel.setBackground(normalColor);

    // Hover-Effekt mit MouseListener
    panel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        panel.setBackground(hoverColor);
      }

      @Override
      public void mouseExited(MouseEvent e) {
        panel.setBackground(normalColor);
      }
    });

    frame.setLayout(new FlowLayout());
    frame.add(panel);
    frame.setVisible(true);
  }
}
