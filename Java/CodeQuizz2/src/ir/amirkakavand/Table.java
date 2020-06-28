package ir.amirkakavand;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Table {

    JFrame f;
    JTable j;

    Table() {

        float sum  = 0;

        f = new JFrame();

        f.setTitle("Table");

        float[][] data = {
                {1, 2, 3, 4, 5},
                {1, 123, 3, 67, 5},
                {657, 2, 12, 56, 5},
                {1, 2, 31, 4, 41},
                {1, 67, 123, 4, 5},
        };

        String[][] sums = new String[data.length][data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j =0; j < data.length; j++) {
                sum += data[i][j];

            }
            sums[i][0] = sum + "";
            sum = 0;
        }


        String[] columnNames = {"sums"};


        j = new JTable(sums, columnNames);
        j.setBounds(30, 40, 200, 300);


        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }


    public static void main(String[] args) {
        new Table();
    }
}