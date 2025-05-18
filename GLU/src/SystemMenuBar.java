import javax.swing.*;

public class SystemMenuBar extends JMenuBar {
    public SystemMenuBar() {
        // Create menus
        JMenu file = new JMenu("File");
        JMenu addStudent = new JMenu("Add Students");
        JMenu removeStudent = new JMenu("Remove Student");
        JMenu updateStudent = new JMenu("Update Students");
        JMenu deleteStudent = new JMenu("Delete Students");

        JMenuItem exitMenuItem = new JMenuItem("Exit");

        file.add(exitMenuItem);

        this.add(file);
        this.add(addStudent);
        this.add(removeStudent);
        this.add(updateStudent);
        this.add(deleteStudent);
    }
}
