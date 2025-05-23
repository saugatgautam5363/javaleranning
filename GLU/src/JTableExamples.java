// Packages to import
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExamples {
    JFrame f;
    JTable j;

    JTableExamples()
    {
        f = new JFrame();

        f.setTitle("JTable Example");

        String[][] data = {
                { "Kundan Kumar Jha", "4031", "CSE" },
                { "Anand Jha", "6014", "IT" }
        };

        String[] columnNames = { "Name", "Roll Number", "Department" };

        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new JTableExamples();
    }
}