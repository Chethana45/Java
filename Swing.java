import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LibraryFineCalculator extends JFrame implements ActionListener, MouseListener, KeyListener {

    JRadioButton ugBtn;
    JRadioButton pgBtn;
    JRadioButton scholarBtn;
    JRadioButton facultyBtn;
    ButtonGroup group;
    JTextField daysField;
    JButton calcBtn;
    JButton clearBtn;
    JLabel resultLabel;
    
    public LibraryFineCalculator() {
        setTitle("Library Fine Calculator");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder("Select User Category"));
        panel1.setLayout(new FlowLayout());

        ugBtn = new JRadioButton("UG Student");
        pgBtn = new JRadioButton("PG Student");
        scholarBtn = new JRadioButton("Scholar");
        facultyBtn = new JRadioButton("Faculty");

        group = new ButtonGroup();
        group.add(ugBtn);
        group.add(pgBtn);
        group.add(scholarBtn);
        group.add(facultyBtn);

        panel1.add(ugBtn);
        panel1.add(pgBtn);
        panel1.add(scholarBtn);
        panel1.add(facultyBtn);

        add(panel1, BorderLayout.NORTH);

        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createTitledBorder("Enter Details"));
        panel2.setLayout(new GridLayout(3, 2, 10, 10));

        panel2.add(new JLabel("Number of Overdue Days:"));
        daysField = new JTextField();
        daysField.addKeyListener(this); // Key Event
        panel2.add(daysField);

        calcBtn = new JButton("Calculate Fine");
        calcBtn.addActionListener(this); // Action Event
        calcBtn.addMouseListener(this);  // Mouse Event
        panel2.add(calcBtn);

        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(this);
        clearBtn.addMouseListener(this);
        panel2.add(clearBtn);

        resultLabel = new JLabel("Fine Amount: ₹ 0");
        panel2.add(resultLabel);

        add(panel2, BorderLayout.CENTER);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcBtn) {
            calculateFine();
        } else if (e.getSource() == clearBtn) {
            daysField.setText("");
            resultLabel.setText("Fine Amount: ₹ 0");
            group.clearSelection();
        }
    }

    public void calculateFine() {
        try {
            int days = Integer.parseInt(daysField.getText());
            int fine = 0;

            if (ugBtn.isSelected()) {
                if (days > 15 && days <= 20) fine = (days - 15) * 5;
                else if (days > 20) fine = (5 * 5) + ((days - 20) * 10);
            } 
            else if (pgBtn.isSelected() || scholarBtn.isSelected()) {
                if (days > 30 && days <= 35) fine = (days - 30) * 5;
                else if (days > 35) fine = (5 * 5) + ((days - 35) * 10);
            } 
            else if (facultyBtn.isSelected()) {
                if (days > 90) fine = (days - 90) * 10;
            } 
            else {
                JOptionPane.showMessageDialog(this, "Please select a user category!");
                return;
            }

            resultLabel.setText("Fine Amount: ₹ " + fine);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number of days!");
        }
    }

    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == calcBtn) calcBtn.setBackground(Color.lightGray);
        if (e.getSource() == clearBtn) clearBtn.setBackground(Color.lightGray);
    }
    
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == calcBtn) calcBtn.setBackground(null);
        if (e.getSource() == clearBtn) clearBtn.setBackground(null);
    }

    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c) && c != '\b') {
            e.consume();
        }
    }
    
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

}

public class Swing{
    public static void main(String[] args) {
        new LibraryFineCalculator();
    }
}


