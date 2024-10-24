package clg_programs;

import java.awt.*;

public class MyLoginWindow extends Frame {
    TextField name, pass;
    Button b1, b2;

    MyLoginWindow() {
        
        this.setLayout(null);
        
        Label n = new Label("Name:", Label.CENTER);
        Label p = new Label("Password:", Label.CENTER);

        name = new TextField(20);
        pass = new TextField(20);
        pass.setEchoChar('#');

        b1 = new Button("Submit");
        b2 = new Button("Cancel");

        Choice c = new Choice();
        c.setBounds(300, 100, 75, 75);
        c.add("Item1");
        c.add("Item2");

        // Add components to the frame
        this.add(n);
        this.add(name);
        this.add(p);
        this.add(pass);
        this.add(b1);
        this.add(b2);
        this.add(c);

        // Set component bounds
        n.setBounds(70, 90, 90, 60);
        p.setBounds(70, 130, 90, 60);
        name.setBounds(200, 100, 90, 20);
        pass.setBounds(200, 140, 90, 20);
        b1.setBounds(100, 290, 70, 40);
        b2.setBounds(180, 290, 70, 40); // Fixed positioning
    }

    public static void main(String args[]) {
        // Create the window
        MyLoginWindow m1 = new MyLoginWindow();
        m1.setVisible(true);
        m1.setSize(400, 400);
        m1.setTitle("My AWT Login Window ");
    }
}
