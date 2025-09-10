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
            @Override
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
            @Override
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
        login.setBounds(20,100,50,20);

        // actions
        
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

        // about frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // close frame
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }    
        });
    }

    public void newStudent(){
        Frame frame = new Frame("Adding new student");

        // set components
        Label username = new Label("Enter username :");
        username.setBounds(20,40,100,20);

        TextField text_username = new TextField();
        text_username.setBounds(150,40,70,20);

        Label password = new Label("Set password :");
        password.setBounds(20,70,100,20);

        TextField text_password = new TextField();
        text_password.setBounds(150,70,70,20);

        Button addStud = new Button("Add new student");
        addStud.setBounds(20,100,100,20);

        // actions
        addStud.addActionListener(new ActionListener(){
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
        frame.add(addStud);

        // about frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // close frame
        frame.addWindowListener(new WindowAdapter(){
            @Override
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

        Button view_result = new Button("View result");
        view_result.setBounds(20,70,80,20);

        Label DS_result = new Label();
        DS_result.setBounds(20,100,100,20);

        Label DiS_result = new Label();
        DiS_result.setBounds(20,130,100,20);

        Label DAM_result = new Label();
        DAM_result.setBounds(20,160,100,20);

        Label DMS_result = new Label();
        DMS_result.setBounds(20,190,100,20);

        Label DCN_result = new Label();
        DCN_result.setBounds(20,220,100,20);

        Label CGPA = new Label();
        CGPA.setBounds(20,250,100,20);

        Button logout = new Button("Logout");
        logout.setBounds(20,280,60,20);

        // actions
        view_result.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DS_result.setText("Score in DS: 100");
                DiS_result.setText("Score in DiS: 100");
                DAM_result.setText("Score in DAM: 100");
                DMS_result.setText("Score in DMS: 100");
                DCN_result.setText("Score in DCN: 100");
                CGPA.setText("Your CGPA is 10");
            }
        });

        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                User_type SRM = new User_type();
            }
        });

        // add components
        frame.add(roll_no);
        frame.add(text_roll_no);
        frame.add(view_result);
        frame.add(DS_result);
        frame.add(DiS_result);
        frame.add(DAM_result);
        frame.add(DMS_result);
        frame.add(DCN_result);
        frame.add(CGPA);
        frame.add(logout);

        // about frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // close frame
        frame.addWindowListener(new WindowAdapter(){
            @Override
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

        Label DS = new Label("DS");
        DS.setBounds(20,70,80,20);

        TextField DS_marks = new TextField();
        DS_marks.setBounds(100,70,80,20);

        Label DiS = new Label("DiS");
        DiS.setBounds(20,100,80,20);

        TextField DiS_marks = new TextField();
        DiS_marks.setBounds(100,100,80,20);

        Label DAM = new Label("DAM");
        DAM.setBounds(20,130,80,20);

        TextField DAM_marks = new TextField();
        DAM_marks.setBounds(100,130,80,20);

        Label DMS = new Label("DMS");
        DMS.setBounds(20,160,80,20);

        TextField DMS_marks = new TextField();
        DMS_marks.setBounds(100,160,80,20);

        Label DCN = new Label("DCN");
        DCN.setBounds(20,190,80,20);

        TextField DCN_marks = new TextField();
        DCN_marks.setBounds(100,190,80,20);

        Button enter = new Button("Enter result");
        enter.setBounds(20,220,80,20);

        Button newStudent = new Button("Add new Student");
        newStudent.setBounds(110,220,100,20);

        Label successful = new Label();
        successful.setBounds(20,250,200,20);

        Button logout = new Button("Logout");
        logout.setBounds(20,280,60,20);

        // actions
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                successful.setText("Result added sucessfully");
            }
        });

        newStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                newStudent();
            }
        });

        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                User_type SRM = new User_type();
            }
        });

        // add components
        frame.add(roll_no);
        frame.add(text_roll_no);
        frame.add(DS);
        frame.add(DS_marks);
        frame.add(DiS);
        frame.add(DiS_marks);
        frame.add(DAM);
        frame.add(DAM_marks);
        frame.add(DMS);
        frame.add(DMS_marks);
        frame.add(DCN);
        frame.add(DCN_marks);
        frame.add(enter);
        frame.add(newStudent);
        frame.add(successful);
        frame.add(logout);

        // about frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // close frame
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }    
        });
    }
    
    public static void main(String[] args){
        User_type SRM = new User_type(); 
    }
}
