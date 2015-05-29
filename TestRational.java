import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class TestRational {
    public static void main(String args[]) {
        Rational group1[] = generate();
        Rational group2[] = generate();

        JFrame form = new JFrame();
        JPanel rootPanel = new JPanel();
        JLabel mainlabel = new JLabel();
        JTextArea group1Text = new JTextArea();
        JTextArea group2Text = new JTextArea();
        JTextArea group3Text = new JTextArea();
        JButton quitButton = new JButton("Quit");
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");
        JScrollPane sp1 = new JScrollPane(group1Text);
        JScrollPane sp2 = new JScrollPane(group2Text);
        JScrollPane sp3 = new JScrollPane(group3Text);

        group1Text.setColumns(10);
        group1Text.setRows(30);
        group2Text.setColumns(10);
        group2Text.setRows(30);
        group3Text.setColumns(10);
        group3Text.setRows(30);

        for(int i = 0; i < group1.length; i++){
            group1Text.append(group1[i].printRational()+"\n");
        }

        for(int i = 0; i < group2.length; i++){
            group2Text.append(group2[i].printRational()+"\n");
        }

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form.dispose();
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                group3Text.setText(null);
                for(int i = 0; i < group1.length; i++) {
                    Rational result = group1[i].add(group2[i]);
                    group3Text.append(result.printRational()+"\n");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                group3Text.setText(null);
                for(int i = 0; i < group1.length; i++) {
                    Rational result = group1[i].subtract(group2[i]);
                    group3Text.append(result.printRational()+"\n");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                group3Text.setText(null);
                for(int i = 0; i < group1.length; i++) {
                    Rational result = group1[i].multiply(group2[i]);
                    group3Text.append(result.printRational()+"\n");
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                group3Text.setText(null);
                for(int i = 0; i < group1.length; i++) {
                    Rational result = group1[i].divide(group2[i]);
                    group3Text.append(result.printRational()+"\n");
                }
            }
        });


        form.setContentPane(rootPanel);
        form.add(mainlabel);
        form.add(sp1);
        form.add(sp2);
        form.add(sp3);
        form.add(quitButton);
        form.add(addButton);
        form.add(subtractButton);
        form.add(multiplyButton);
        form.add(divideButton);
        form.pack();
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static Rational[] generate() {
        Rational[] group = new Rational[10];
        for(int i = 0; i < group.length; i++){
            Random randomGenerator = new Random();
            int num = randomGenerator.nextInt((8 - 1) + 1) + 1;
            int den = randomGenerator.nextInt((9 - num) + 1) + num;
            group[i] = new Rational(num, den);
        }
        return group;
    }
}