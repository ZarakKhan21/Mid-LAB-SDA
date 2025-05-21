
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        TaskSave repository = new TaskSave();
        Work service = new     Work(repository);

        // Creating the frame for the GUI
        JFrame frame = new JFrame("ADD TASK UI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Creating the components for the form
        JLabel titleLabel = new JLabel("Task Title:");
        JTextField titleField = new JTextField(20);

        JLabel descriptionLabel = new JLabel("Task Description:");
        JTextField descriptionField = new JTextField(20);

        JButton saveButton = new JButton("Save Data");

        // Add components to the frame
        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(descriptionLabel);
        frame.add(descriptionField);
        frame.add(saveButton);

        // Action listener for the save button
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String description = descriptionField.getText();

                if (title.isEmpty() || description.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in both fields", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                   ADDTASK task = new ADDTASK(title, description);
                    service.addTask(task);  // Use the service to process and save the task
                    JOptionPane.showMessageDialog(frame, "  Data saved successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                    // Clear fields after saving
                    titleField.setText("");
                    descriptionField.setText("");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
