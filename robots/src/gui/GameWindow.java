package gui;

import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class GameWindow extends JInternalFrame
{
    private final GameVisualizer m_visualizer;
    public GameWindow()
    {
        super("Game window", true, true, true, true);
        m_visualizer = new GameVisualizer();
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(m_visualizer, BorderLayout.CENTER);
        getContentPane().add(panel);
        pack();
        addInternalFrameListener(new WindowClosingHandler());
        this.setLocation(250, 10);
        this.setSize(400, 400);

    }
}