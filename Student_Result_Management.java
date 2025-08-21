import java.awt.*;
import java.awt.event.*;

class User_type
{
    public User_type(){
        Frame frame = new Frame("Welcome!!");

        // set components
        Label label = new Label("Which user you are?");
        label.setBounds(20,40,150,20);

        Button studentButton = new Button("Student");
        studentButton.setBounds(20,70,60,20);

        Button teacherButton = new Button("Teacher");
        teacherButton.setBounds(90,70,60,20);

        // actions
        teacherButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                teacherFrame();
            }
        });

        studentButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                studentFrame();
            }
        });

        // add components
        frame.add(label);
        frame.add(studentButton);
        frame.add(teacherButton);

        // about frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // close frame
        frame.addWindowListener(new WindowAdapter(){
            @override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }    
        });
    }
    
    public void teacherFrame(){
        Frame frame = new Frame("Please login..");

        // set components
        Label username = new Label("Enter username :");
        username.setBounds(20,40,100,20);

        TextField text_username = new TextField();
        text_username.setBounds(150,40,70,20);

        Label password = new Label("Enter password :");
        password.setBounds(20,70,100,20);

        TextField text_password = new TextField();
        text_password.setBounds(150,70,70,20);

        Button login = new Button("Login");
        login.setBounds(20,100,50,20);

        // actions
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                enterResult();
            }
        });

        // add components
        frame.add(username);
        frame.add(text_username);
        frame.add(password);
        frame.add(text_password);
        frame.add(login);

        // about frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // close frame
        frame.addWindowListener(new WindowAdapter(){
            @override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }    
        });
    }

    public void studentFrame(){
        Frame frame = new Frame("Please login..");

        // set components
        Label username = new Label("Enter username :");
        username.setBounds(20,40,100,20);

        TextField text_username = new TextField();
        text_username.setBounds(150,40,70,20);

        Label password = new Label("Enter password :");
        password.setBounds(20,70,100,20);

        TextField text_password = new TextField();
        text_password.setBounds(150,70,70,20);

        Button login = new Button("Login");
        login.setBounds(80,100,50,20);

        Button signUp = new Button("Sign up");
        signUp.setBounds(20,100,50,20);

        // actions
        signUp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                newStudent();
            }
        });

        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                viewResult();
            }
        });

        // add components
        frame.add(username);
        frame.add(text_username);
        frame.add(password);
        frame.add(text_password);
        frame.add(login);
        frame.add(signUp);

        // about frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // close frame
        frame.addWindowListener(new WindowAdapter(){
            @override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }    
        });
    }

    public void newStudent(){
        Frame frame = new Frame("Please sign up");

        // set components
        Label username = new Label("Enter username :");
        username.setBounds(20,40,100,20);

        TextField text_username = new TextField();
        text_username.setBounds(150,40,70,20);

        Label password = new Label("Set password :");
        password.setBounds(20,70,100,20);

        TextField text_password = new TextField();
        text_password.setBounds(150,70,70,20);

        Button signUp = new Button("Sign up");
        signUp.setBounds(20,100,50,20);

        // actions
        signUp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                studentFrame();
            }
        });

        // add components
        frame.add(username);
        frame.add(text_username);
        frame.add(password);
        frame.add(text_password);
        frame.add(signUp);

        // about frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // close frame
        frame.addWindowListener(new WindowAdapter(){
            @override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }    
        });
    }

    public void viewResult()
    {
        Frame frame = new Frame("Your Result");

        // set components
        Label roll_no = new Label("Enter roll no");
        roll_no.setBounds(20,40,80,20);

        TextField text_roll_no = new TextField();
        text_roll_no.setBounds(100,40,80,20);

        Button view = new Button("View result");
        view.setBounds(20,70,60,20);

        Label result = new Label();
        result.setBounds(20,100,200,20);

        // actions
        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText("You have been passed");
            }
        });

        // add components
        frame.add(roll_no);
        frame.add(text_roll_no);
        frame.add(view);
        frame.add(result);

        // about frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // close frame
        frame.addWindowListener(new WindowAdapter(){
            @override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }    
        });
    }

    public void enterResult()
    {
        Frame frame = new Frame("Your Result");

        // set components
        Label roll_no = new Label("Enter roll no");
        roll_no.setBounds(20,40,80,20);

        TextField text_roll_no = new TextField();
        text_roll_no.setBounds(100,40,80,20);

        Label cgpa = new Label("Enter CGPA");
        cgpa.setBounds(20,70,80,20);

        TextField text_cgpa = new TextField();
        text_cgpa.setBounds(100,70,50,20);

        Button enter = new Button("Enter result");
        enter.setBounds(20,100,80,20);

        Label successful = new Label();
        successful.setBounds(20,130,200,20);

        // actions
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                successful.setText("Result added sucessfully");
            }
        });

        // add components
        frame.add(roll_no);
        frame.add(text_roll_no);
        frame.add(cgpa);
        frame.add(text_cgpa);
        frame.add(enter);
        frame.add(successful);

        // about frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // close frame
        frame.addWindowListener(new WindowAdapter(){
            @override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }    
        });
    }
    
    public static void main(String[] args){
        User_type SRM = new User_type(); 
    }
}