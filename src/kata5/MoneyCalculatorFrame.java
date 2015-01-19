package kata5;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MoneyCalculatorFrame extends JFrame{

    public MoneyCalculatorFrame() {
        setTitle("MoneyCalculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 300));
        createComponents();
        setVisible(true) ;
    }

    private void createComponents() {
        add(createExchangeDialog());
        add(createToolBar(), BorderLayout.SOUTH);
    }

    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());
        return panel;
    }

    private JPanel createToolBar() {
        JPanel toolBar = new JPanel(new FlowLayout(FlowLayout.RIGHT)) ;
        toolBar.add(createCancelButton());
        toolBar.add(createCalculateButton());
        return toolBar;
    }

    private JButton createCancelButton() {
        JButton button = new JButton("Cancel");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyCalculatorFrame.this.dispose();
            }
        });
        return button ;
   }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculating..");
            }
        });
        return button ;
    }
}
