import java.awt.*;
import java.awt.event.*;

class EmailGenerator extends Frame implements ActionListener {

    Label firstLabel;
    Label lastLabel;
    Label resultLabel;
    TextField firstField;
    TextField lastField;
    Button generateBtn, clearBtn;

    public EmailGenerator() {
        setTitle("Email Generator");
        setSize(400, 200);
        setLayout(new GridLayout(4, 2, 10, 10));

        firstLabel = new Label("Enter First Name:");
        lastLabel = new Label("Enter Last Name:");

        firstField = new TextField();
        lastField = new TextField();

        generateBtn = new Button("Generate Email");
        clearBtn = new Button("Clear");

        resultLabel = new Label("Email: ");

        add(firstLabel);
        add(firstField);
        add(lastLabel);
        add(lastField);
        add(generateBtn);
        add(clearBtn);
        add(resultLabel);

        generateBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateBtn) {
            String first = firstField.getText().trim();
            String last = lastField.getText().trim();

            if (first.isEmpty() || last.isEmpty()) {
                showDialog("Please fill all fields!");
                return;
            }

            if (!first.matches("[a-zA-Z]+") || !last.matches("[a-zA-Z]+")) {
                showDialog("Only alphabets are allowed!");
                return;
            }

            if (first.length() < 3 || last.length() < 2) {
                showDialog("First name must have at least 3 letters and last name must have at least 2 letters!");
                return;
            }

            String email = first.substring(0, 3).toLowerCase()
                     + last.substring(last.length() - 2).toLowerCase()
                     + "@gmail.com";

            resultLabel.setText("Email: " + email);
        }

        if (e.getSource() == clearBtn) {
            firstField.setText("");
            lastField.setText("");
            resultLabel.setText("Email: ");
        }
    }

    public void showDialog(String msg) {
        Dialog d = new Dialog(this, "Alert!", true);
        d.setLayout(new FlowLayout());
        d.setSize(300, 100);

        Label lbl = new Label(msg);
        Button okBtn = new Button("OK");

        okBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
            }
        });

        d.add(lbl);
        d.add(okBtn);
        d.setVisible(true);
    }

}

public class AWT{
    public static void main(String[] args) {
        new EmailGenerator();
    }
}
