// uername: khalid_gad
// password: 1621
package adv;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class Adv extends Frame implements ActionListener{

    static ServerSocket ss;
    static Socket s;
    static Socket s2;
    static DataInputStream din;
    static DataOutputStream dout;
    
    
    // name of pprogram
    JLabel nameapp=new JLabel("Modern Chat");
    
    // program logo
    URL Img=getClass().getResource("logo.png");
    ImageIcon logo =new ImageIcon(Img);
    JLabel icon =new JLabel(logo); 
    
    // user logo
    URL Img1=getClass().getResource("user.png");
    ImageIcon logo1 =new ImageIcon(Img1);
    JLabel user =new JLabel(logo1);
    
    // pass logo
    URL Img2=getClass().getResource("pass.png");
    ImageIcon logo2 =new ImageIcon(Img2);
    JLabel pass =new JLabel(logo2);
    
    // create check pass labels  
    JLabel telllabel = new JLabel("Please, Enter your Username & Password ");
    JLabel userlabel = new JLabel("Username :");
    JLabel passlabel = new JLabel("Password :");
    
    // create Text Fields for check pass
    JTextField usertext = new JTextField();
    JTextField passtext = new JTextField();    
    
    // create Button Log in 
    JButton submitpass = new JButton("Log In");
    JButton signup = new JButton("Sign Up");
    
    //create Fonts
    Font font = new Font("SansSerif", Font.BOLD, 20);
    Font font1 = new Font("SansSerif", Font.BOLD, 25);
    Font font2 = new Font("SansSerif", Font.BOLD, 30);
    Font font3 = new Font("SansSerif", Font.BOLD, 40);
    Font font4 = new Font("SansSerif", Font.BOLD, 10);
    Font font5 = new Font("SansSerif", Font.BOLD, 15);
    Font font6 = new Font("SansSerif", Font.BOLD, 55);
    
    
    // chat frame
    JFrame chatframe = new JFrame();
   
    // panels for view chat & contact chat bar & contacts side bar 
    static JTextArea textbox = new JTextArea();
    JPanel pcontactname = new JPanel();
    JPanel pcontactside = new JPanel();
        
    // text field to write the message will send
    TextField Tmsg=new TextField();
    
    
    // Buttons for send a message & files & emoji
    static JButton Bsend = new JButton();
    JButton files = new JButton();
    JButton emojis = new JButton();
    JButton emojisoff = new JButton();
    
    // Buttons for private mode turn on & turn off
    JButton privatemode = new JButton("Private Mode");
    JButton turnoff = new JButton();
    
    // Button for calculator frame
    JButton calc = new JButton("Ai Calculator");
    JButton turnon = new JButton();
    
    // Button for contacts & Group & Archive Side
    JButton contacts = new JButton();
    JButton groups = new JButton();
    JButton archive = new JButton();
    
    // Buttons for contacts & Groups & Archive
    JButton contact1 = new JButton("Ahmed Adel");
    JButton contact2 = new JButton("Sherif Khaled");
    JButton contact3 = new JButton("Hossam Shaban");
    
    // Button log out
    JButton Blogout = new JButton("Log out");
    

    // icon for send button
    URL send=getClass().getResource("send.png");
    ImageIcon logosend =new ImageIcon(send);
    
    // icon for files
    URL link=getClass().getResource("link.png");
    ImageIcon link1 =new ImageIcon(link);
    
    // icon for emoji
    URL more=getClass().getResource("more.png");
    ImageIcon more1 =new ImageIcon(more);
    
    URL moreoff=getClass().getResource("more_disable.png");
    ImageIcon moreoff1 =new ImageIcon(moreoff);
      
    // icon for turn on & turn off private mode
    URL green=getClass().getResource("greenc.png");
    ImageIcon green1 =new ImageIcon(green);
    
    URL red=getClass().getResource("redc.png");
    ImageIcon red1 =new ImageIcon(red);
    
    URL blue=getClass().getResource("bluec.png");
    ImageIcon blue1 =new ImageIcon(blue);
    
    // icon for contacts side bar
    URL message=getClass().getResource("message_selected.png");
    ImageIcon message1 =new ImageIcon(message);
    
    // icon for Groups side bar
    URL group=getClass().getResource("group_selected.png");
    ImageIcon group1 =new ImageIcon(group);
    
    // icon for Archive side bar
    URL box=getClass().getResource("box_selected.png");
    ImageIcon box1 =new ImageIcon(box);
    
    // labels for contact name in chat bar & status
    JLabel name =new JLabel("Khaled Atef");
    JLabel active =new JLabel("Active Now");
    
    // photo icon for contact name in chat bar
    URL user2=getClass().getResource("user2.png");
    ImageIcon logouser2 =new ImageIcon(user2);
    JLabel labeluser2 =new JLabel(logouser2);
     
    
    // photo icon for contacts name in chat side
    URL user3=getClass().getResource("user2.png");
    ImageIcon logouser3 =new ImageIcon(user3);
    JLabel labeluser3 =new JLabel(logouser3);   
    
    URL user4=getClass().getResource("user2.png");
    ImageIcon logouser4 =new ImageIcon(user4);
    JLabel labeluser4=new JLabel(logouser4);   
    
    URL user5=getClass().getResource("user2.png");
    ImageIcon logouser5 =new ImageIcon(user5);
    JLabel labeluser5 =new JLabel(logouser5);
    
    
    // lines for chat bar & side bar
    JLabel line =new JLabel("____________________________________________________________________________________________");
    JLabel line2 =new JLabel("____________________________________________________________________________________________");
    JLabel line1 =new JLabel("____________________________________");
    JLabel line3 =new JLabel("____________________________________________________________________________________________");
    
    
    // panel for emojies
    JPanel pemoji = new JPanel();
    
    // Buttons for emojies
    JButton B1 = new JButton();
    JButton B2 = new JButton();
    JButton B3 = new JButton();
    JButton B4 = new JButton();
    JButton B5 = new JButton();
    JButton B6 = new JButton();
    JButton B7 = new JButton();
    JButton B8 = new JButton();
    JButton B9 = new JButton();
    JButton B10 = new JButton();
    JButton B11 = new JButton();
    JButton B12 = new JButton();
    JButton B13 = new JButton();
    JButton B14 = new JButton();
    JButton B15 = new JButton();
    JButton B16 = new JButton();
    JButton B17 = new JButton();
    JButton B18 = new JButton();
    JButton B19 = new JButton();
    JButton B20 = new JButton();
    JButton B21 = new JButton();
    JButton B22 = new JButton();
    JButton B23 = new JButton();
    JButton B24 = new JButton();
    JButton B25 = new JButton();
    JButton B26 = new JButton();
    JButton B27 = new JButton();
    JButton B28 = new JButton();
    
    URL i1=getClass().getResource("1.png");
    ImageIcon e1 =new ImageIcon(i1);
    
    URL i2=getClass().getResource("2.png");
    ImageIcon e2 =new ImageIcon(i2);
    
    URL i3=getClass().getResource("3.png");
    ImageIcon e3 =new ImageIcon(i3);
    
    URL i4=getClass().getResource("4.png");
    ImageIcon e4 =new ImageIcon(i4);
    
    URL i5=getClass().getResource("5.png");
    ImageIcon e5 =new ImageIcon(i5);
    
    URL i6=getClass().getResource("6.png");
    ImageIcon e6 =new ImageIcon(i6);
    
    URL i7=getClass().getResource("7.png");
    ImageIcon e7 =new ImageIcon(i7);
    
    URL i8=getClass().getResource("8.png");
    ImageIcon e8 =new ImageIcon(i8);
    
    URL i9=getClass().getResource("9.png");
    ImageIcon e9 =new ImageIcon(i9);
    
    URL i10=getClass().getResource("10.png");
    ImageIcon e10 =new ImageIcon(i10);
    
    URL i11=getClass().getResource("11.png");
    ImageIcon e11 =new ImageIcon(i11);
    
    URL i12=getClass().getResource("12.png");
    ImageIcon e12 =new ImageIcon(i12);
    
    URL i13=getClass().getResource("13.png");
    ImageIcon e13 =new ImageIcon(i13);
    
    URL i14=getClass().getResource("14.png");
    ImageIcon e14 =new ImageIcon(i14);
    
    URL i15=getClass().getResource("15.png");
    ImageIcon e15 =new ImageIcon(i15);
    
    URL i16=getClass().getResource("16.png");
    ImageIcon e16 =new ImageIcon(i16);
    
    URL i17=getClass().getResource("17.png");
    ImageIcon e17 =new ImageIcon(i17);
    
    URL i18=getClass().getResource("18.png");
    ImageIcon e18 =new ImageIcon(i18);
    
    URL i19=getClass().getResource("19.png");
    ImageIcon e19 =new ImageIcon(i19);
    
    URL i20=getClass().getResource("20.png");
    ImageIcon e20 =new ImageIcon(i20);
    
    URL i21=getClass().getResource("21.png");
    ImageIcon e21 =new ImageIcon(i21);
    
    URL i22=getClass().getResource("23.png");
    ImageIcon e22 =new ImageIcon(i22);
    
    URL i23=getClass().getResource("24.png");
    ImageIcon e23 =new ImageIcon(i23);
    
    URL i24=getClass().getResource("25.png");
    ImageIcon e24 =new ImageIcon(i24);
    
    URL i25=getClass().getResource("27.png");
    ImageIcon e25 =new ImageIcon(i25);
    
    URL i26=getClass().getResource("35.png");
    ImageIcon e26 =new ImageIcon(i26);
    
    URL i27=getClass().getResource("33.png");
    ImageIcon e27=new ImageIcon(i27);
    
    URL i28=getClass().getResource("40.png");
    ImageIcon e28 =new ImageIcon(i28);
    
    
    
    
    
    // calculator frame
    JFrame calcframe = new JFrame();
    
    // panels for view chat & chat bar
    static JTextArea textboxc = new JTextArea();
    JPanel chatbarc = new JPanel(); 
    
    // text field to write the message will send
    TextField Tmsgc=new TextField(); 
    // Buttons for send a message
    JButton Bsendc = new JButton();
    
    // Button back
    JButton back = new JButton("Back");
    
    // icon for send button
    URL sendc=getClass().getResource("send.png");
    ImageIcon logosendc =new ImageIcon(send);
    
    
    URL logoc=getClass().getResource("calc.png");
    ImageIcon imgc =new ImageIcon(logoc);
    JLabel iconc =new JLabel(imgc);
    
    URL iconback=getClass().getResource("back.png");
    ImageIcon backc =new ImageIcon(iconback);
    
    JLabel namecalc=new JLabel("Calculator");
    JLabel line1c=new JLabel("___________________________________________________________________________________________________________________");
    JLabel line2c =new JLabel("___________________________________________________________________________________________________________________");

    
    // boolean
    
    Boolean archiveframe;
    
    
    
    
    // Constructor
     Adv(){
         
          archiveframe = false ;
        // close Button turn on
        this.addWindowListener(new WindowAdapter() 
        {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        }
        );
          
       
        // Welcome Frame 
        setLayout(null);
        setBounds(400, 150, 1250, 730); 
        setBackground(Color.LIGHT_GRAY);
        
        // program logo & name 
        icon.setBounds(0,115,500,300); 
        nameapp.setBounds(122,480,300,40);
        nameapp.setFont(font3);
        
        // tell enter username & password labels 
        telllabel.setBounds(555,170,600,100);
        telllabel.setFont(font1);
        userlabel.setBounds(615,270,150,100);
        userlabel.setFont(font);
        passlabel.setBounds(615,370,150,50);
        passlabel.setFont(font);
        
        // username & password icons
        user.setBounds(520,257,130,150);    
        pass.setBounds(520,340,130,100); 
 
        // username & password icons Text Fields
        usertext.setBounds(740,308,300,28);
        passtext.setBounds(740,382,300,28);
        
        // Welcome Frame Button Log in
        submitpass.setBounds(820,468,190,50);
        signup.setBounds(610,468,190,50);
        
        // add components on welcome frame
        add(icon);
        add(nameapp);
        add(telllabel);
        add(passlabel);
        add(userlabel);
        add(user);
        add(pass);
        add(usertext);
        add(passtext);
        add(submitpass);
        add(signup);
        
        //add actionlistener to log in Button
        submitpass.addActionListener(this);
 
        setVisible(true);
        
        
       
        
        
        // chat frame
        chatframe.setLayout(null);
        chatframe.setBounds(400, 150, 1250, 730);
        
        // text box by panel
        textbox.setLayout(null);
        
        textbox.setBounds(300, 125, 930, 470);
        
        // contact name in chat bar by panel
        pcontactname.setLayout(null);
        pcontactname.setBounds(300, 0, 900, 110);
        
        // contacts name side bar by panel
        pcontactside.setLayout(null);
        pcontactside.setBounds(0, 0, 300, 700);
        pcontactside.setBackground(Color.LIGHT_GRAY);
        
        // text field to wirte message
        Tmsg.setBounds(480, 610, 560, 45);
        
        
        // Buttons for send a message & files & emoji
        Bsend.setBounds(1050, 605, 130, 55);
        Bsend.setIcon(logosend);
        
        files.setBounds(395, 605, 60, 52);
        files.setIcon(link1);
        
        emojis.setBounds(320, 605, 60, 52);
        emojis.setIcon(more1);
        
        
        // Buttons for private mode turn on & turn off
        privatemode.setBounds(700, 20, 170, 45);
        privatemode.setForeground(Color.red);
        
        turnoff.setBounds(700, 20, 35, 45);
        turnoff.setIcon(red1);
       
        // Button for Calculator
        calc.setBounds(700, 68, 170, 45);
        calc.setForeground(Color.blue);
        
        turnon.setBounds(700, 68, 35, 45);
        turnon.setIcon(blue1);
        
        // Button for log out
        Blogout.setBounds(85, 605, 130, 55);
        Blogout.setForeground(Color.red);
        
        
        // Buttons for contacts & Group & Archive 
        contacts.setBounds(55, 28, 50, 50);
        contacts.setIcon(message1);
        
        groups.setBounds(125, 28, 50, 50);
        groups.setIcon(group1);
        
        archive.setBounds(195, 28, 50, 50);
        archive.setIcon(box1);
        
        
        // Buttons for contacts & Groups & Archive
        contact1.setBounds(120, 150, 160, 50);
        contact2.setBounds(120, 250, 160, 50);
        contact3.setBounds(120, 350, 160, 50);
        
        
        // photo icon for contact name in chat bar
        labeluser2.setBounds(20, 20, 85, 90);

        // labels for contact name in chat bar
        name.setBounds(130, 35, 300, 50);
        name.setFont(font2);  
        
        // status the contact in chat bar
        active.setBounds(130, 65, 100, 50);
        active.setForeground(Color.green);
        active.setFont(font4); 
        
        // photo icons for contact names in sidebar
        labeluser3.setBounds(20, 130, 85, 90);
        labeluser4.setBounds(20, 230, 85, 90);
        labeluser5.setBounds(20, 330, 85, 90);
        
        
        // lines for chat bar & side bar
        line.setBounds(0, -23, 2000, 30);
        line.setFont(font);
        
        line2.setBounds(0, 445, 2000, 25);
        line2.setFont(font);
 
        line1.setBounds(0, 70, 500, 30);
        line1.setFont(font);

        
        line3.setBounds(300, 518, 2000, 25);
        line3.setFont(font);
        
        emojisoff.setBounds(320, 580, 60, 52);
        emojisoff.setIcon(moreoff1);

        
        B1.setBounds(400, 550, 55, 55);
        B1.setIcon(e1);

        B2.setBounds(455, 550, 55, 55);
        B2.setIcon(e2);
        
        B3.setBounds(510, 550, 55, 55);
        B3.setIcon(e3);
        
        B4.setBounds(895, 550, 55, 55);
        B4.setIcon(e4);
        
        B5.setBounds(620, 550, 55, 55);
        B5.setIcon(e5);
        
        B6.setBounds(675, 550, 55, 55);
        B6.setIcon(e6);
        
        B7.setBounds(730, 550, 55, 55);
        B7.setIcon(e7);
        
        B8.setBounds(785, 550, 55, 55);
        B8.setIcon(e8);
        
        B9.setBounds(840, 550, 55, 55);
        B9.setIcon(e9);
        
        B10.setBounds(565, 550, 55, 55);
        B10.setIcon(e10);
        
        B11.setBounds(400, 605, 55, 55);
        B11.setIcon(e11);
        
        B12.setBounds(785, 605, 55, 55);
        B12.setIcon(e12);
        
        B13.setBounds(510, 605, 55, 55);
        B13.setIcon(e13);
        
        B14.setBounds(565, 605, 55, 55);
        B14.setIcon(e14);
        
        B15.setBounds(620, 605, 55, 55);
        B15.setIcon(e15);
        
        B16.setBounds(895, 605, 55, 55);
        B16.setIcon(e16);
        
        B17.setBounds(730, 605, 55, 55);
        B17.setIcon(e17);
        
        B18.setBounds(455, 605, 55, 55);
        B18.setIcon(e18);
        
        B19.setBounds(840, 605, 55, 55);
        B19.setIcon(e19);
        
        B20.setBounds(675, 605, 55, 55);
        B20.setIcon(e20);
        
        B21.setBounds(950, 550, 55, 55);
        B21.setIcon(e21);
        
        B22.setBounds(1005, 550, 55, 55);
        B22.setIcon(e22);
        
        B23.setBounds(1060, 550, 55, 55);
        B23.setIcon(e23);
        
        B24.setBounds(1105, 550, 55, 55);
        B24.setIcon(e24);
        
        B25.setBounds(950, 605, 55, 55);
        B25.setIcon(e25);
        
        B26.setBounds(1005, 605, 55, 55);
        B26.setIcon(e26);
        
        B27.setBounds(1060, 605, 55, 55);
        B27.setIcon(e27);
        
        B28.setBounds(1105, 605, 55, 55);
        B28.setIcon(e28);
        
   
        // add components on chat frame
        chatframe.add(textbox);
        chatframe.add(pcontactname);
        chatframe.add(pcontactside);
        chatframe.add(Tmsg);
        chatframe.add(Bsend);
        chatframe.add(files);
        chatframe.add(emojis);
        
        // add components on chat bar panel
        pcontactname.add(labeluser2);
        pcontactname.add(name);
        pcontactname.add(active); 
        pcontactname.add(turnoff);
        pcontactname.add(privatemode);
        pcontactname.add(turnon);
        pcontactname.add(calc);
       
        // add components on side bar panel
        pcontactside.add(contacts);
        pcontactside.add(groups);
        pcontactside.add(archive);
        pcontactside.add(line1);
        pcontactside.add(labeluser3);
        pcontactside.add(labeluser4);
        pcontactside.add(labeluser5);
        pcontactside.add(contact1);
        pcontactside.add(contact2);
        pcontactside.add(contact3);
        pcontactside.add(Blogout);
                   
        // add lines on text box panel
        textbox.add(line);
        textbox.add(line2);
        
        //add actionlistener to Buttons
        privatemode.addActionListener(this);
        turnoff.addActionListener(this);
        calc.addActionListener(this);
        emojis.addActionListener(this);
        emojisoff.addActionListener(this);
        contacts.addActionListener(this);
        groups.addActionListener(this);
        contact1.addActionListener(this);
        contact2.addActionListener(this);
        contact3.addActionListener(this);
        Blogout.addActionListener(this);
        Bsend.addActionListener(this);
        files.addActionListener(this);
        archive.addActionListener(this);
        
        
        
        
        // calculator frame
        calcframe.setLayout(null);
        calcframe.setBounds(400, 150, 1250, 730);
        
        // text box for calculator chat
        textboxc.setLayout(null);
        textboxc.setBounds(30, 125, 1200, 470);
        
        // calculator chat bar
        chatbarc.setLayout(null);
        chatbarc.setBounds(30, 0, 1200, 110);
        
        // text field to wirte message
        Tmsgc.setBounds(135, 610, 900, 45);
        
        
        // Buttons for send a message & back
        Bsendc.setBounds(1050, 605, 130, 55);
        Bsendc.setIcon(logosendc);
        
        back.setBounds(30, 605, 90, 55);
        back.setIcon(backc);
        
        // logo & name
        iconc.setBounds(400, 20, 85, 90);
        namecalc.setBounds(500, 20, 300, 90);
        namecalc.setFont(font6);
        namecalc.setForeground(Color.blue);
        
        // lines for calculator chat bar 
        line1c.setBounds(0, -23, 2000, 30);
        line1c.setFont(font);
        
        line2c.setBounds(0, 445, 2000, 25);
        line2c.setFont(font);
        
        calcframe.add(textboxc);
        calcframe.add(chatbarc);
        calcframe.add(Tmsgc);
        calcframe.add(Bsendc);
        calcframe.add(back);
        textboxc.add(line1c);
        textboxc.add(line2c);
        chatbarc.add(iconc);
        chatbarc.add(namecalc);
        
        back.addActionListener(this);
        
    }
     
     
     
     
     
     
    public static void main(String[] args) {
        Adv ob  = new Adv();
          
        try {
         receiver r =new receiver();
        } catch(Exception ee){
            System.out.println(ee.getMessage());
        }
       
        String msg= " ";
        while(true){
       try {
           
           // port number 
                    ss = new ServerSocket(911);
                    s = ss.accept();
                    din = new DataInputStream (s.getInputStream());
                    dout = new DataOutputStream(s.getOutputStream());
                    while (!msg.equals("exit"))
           {
               msg = din.readUTF();
              textbox.setText(textbox.getText().trim()+"\n Client: " + msg);
           }
                } catch (Exception eea) {
                    eea.getStackTrace();
                }
        }
    }

    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==submitpass)
        {
         if(usertext.getText().equals("khalid_gad")&&passtext.getText().equals("********"))
         {
             chatframe.setVisible(true);
             setVisible(false);
             usertext.setText("");
             passtext.setText("");
         }
         else { 
             telllabel.setText("Wrong Username or Password !! try again ");
             telllabel.setForeground(Color.red);
             usertext.setText("");
             passtext.setText("");
         }
        }
        
        // send message
        else if(e.getSource()==Bsend)
        {
            
                   try {
                     String msgout =  msgout = Tmsg.getText().trim();
                    dout.writeUTF(msgout);
                    Tmsg.setText(" ");
                }
                    catch (Exception ae)
                    {
            System.out.println(ae.getMessage());
        }
        }
        
        else if(e.getSource().equals(files))
        {
                    final File[] fileToSend = new File[1];
        JFileChooser jFileChooser = new JFileChooser();
                // Set the title of the dialog.
                jFileChooser.setDialogTitle("Choose a file to send.");
                // Show the dialog and if a file is chosen from the file chooser execute the following statements.
                if (jFileChooser.showOpenDialog(null)  == JFileChooser.APPROVE_OPTION) {
                    // Get the selected file.
                    fileToSend[0] = jFileChooser.getSelectedFile();
                    if (fileToSend[0] == null) {

                } else {
                    try {
                        // Create an input stream into the file you want to send.
                        FileInputStream fileInputStream = new FileInputStream(fileToSend[0].getAbsolutePath());
                        
                        
                        
                        // Create a socket connection to connect with the server.
                        s2 = new Socket("localhost",2020);
                        
                        
                        
                        DataOutputStream dataOutputStream = new DataOutputStream(s2.getOutputStream());
                        // Get the name of the file you want to send and store it in filename.
                        String fileName = fileToSend[0].getName();
                        // Convert the name of the file into an array of bytes to be sent to the server.
                        byte[] fileNameBytes = fileName.getBytes();
                        // Create a byte array the size of the file so don't send too little or too much data to the server.
                        byte[] fileBytes = new byte[(int)fileToSend[0].length()];
                        // Put the contents of the file into the array of bytes to be sent so these bytes can be sent to the server.
                        fileInputStream.read(fileBytes);
                        // Send the length of the name of the file so server knows when to stop reading.
                        dataOutputStream.writeInt(fileNameBytes.length);
                        // Send the file name.
                        dataOutputStream.write(fileNameBytes);
                        // Send the length of the byte array so the server knows when to stop reading.
                        dataOutputStream.writeInt(fileBytes.length);
                        // Send the actual file.
                        dataOutputStream.write(fileBytes);
                    } catch (IOException ex) {
                    }
                    
                    }   
                }

        }
        
        else if(e.getSource().equals(archive))
        {
            if(archiveframe.equals(false))
                archiveframe=true;
            else
                archiveframe = false;
            
            receiver.jFrame.setVisible(archiveframe);
        }
        
        else if(e.getSource()==Blogout){    
            setVisible(true);
            chatframe.setVisible(false);  
            telllabel.setText("Please, Enter your Username & Password ");
            telllabel.setForeground(Color.BLACK);
        }
        
        else if(e.getSource()==privatemode){    
            privatemode.setForeground(Color.green);
            turnoff.setIcon(green1);
        }
        
        else if(e.getSource()==turnoff){  
            privatemode.setForeground(Color.red);
            turnoff.setIcon(red1);
        }
              
        else if(e.getSource()==emojis){    

            chatframe.add(emojisoff);
            chatframe.add(line3);
            
            chatframe.add(B1);
            chatframe.add(B2);
            chatframe.add(B3);
            chatframe.add(B4);
            chatframe.add(B5);
            chatframe.add(B6);
            chatframe.add(B7);
            chatframe.add(B8);
            chatframe.add(B9);
            chatframe.add(B10);
            chatframe.add(B11);
            chatframe.add(B12);
            chatframe.add(B13);
            chatframe.add(B14);
            chatframe.add(B15);
            chatframe.add(B16);
            chatframe.add(B17);
            chatframe.add(B18);
            chatframe.add(B19);
            chatframe.add(B20);
            chatframe.add(B21);
            chatframe.add(B22);
            chatframe.add(B23);
            chatframe.add(B24);
            chatframe.add(B25);
            chatframe.add(B26);
            chatframe.add(B27);
            chatframe.add(B28);
            
            textbox.setBounds(300, 110, 900, 360);
            line2.setBounds(0, 335, 2000, 25);
            
            Tmsg.setBounds(480, 480, 560, 45);
            Bsend.setBounds(1050, 475, 130, 55);
            files.setBounds(395, 475, 60, 52);
            emojis.setBounds(320, 475, 60, 52);
        }
        
        else if(e.getSource()==emojisoff){    
            chatframe.remove(emojisoff);
            chatframe.remove(line3);
            
            chatframe.remove(B1);
            chatframe.remove(B2);
            chatframe.remove(B3);
            chatframe.remove(B4);
            chatframe.remove(B5);
            chatframe.remove(B6);
            chatframe.remove(B7);
            chatframe.remove(B8);
            chatframe.remove(B9);
            chatframe.remove(B10);
            chatframe.remove(B11);
            chatframe.remove(B12);
            chatframe.remove(B13);
            chatframe.remove(B14);
            chatframe.remove(B15);
            chatframe.remove(B16);
            chatframe.remove(B17);
            chatframe.remove(B18);
            chatframe.remove(B19);
            chatframe.remove(B20);
            chatframe.remove(B21);
            chatframe.remove(B22);
            chatframe.remove(B23);
            chatframe.remove(B24);
            chatframe.remove(B25);
            chatframe.remove(B26);
            chatframe.remove(B27);
            chatframe.remove(B28);
            
            textbox.setBounds(300, 125, 900, 470);
            line2.setBounds(0, 445, 2000, 25);
            
            Tmsg.setBounds(480, 610, 560, 45);
            Bsend.setBounds(1050, 605, 130, 55);
            files.setBounds(395, 605, 60, 52);
            emojis.setBounds(320, 605, 60, 52);
            
            
            
            
        }
        
       
        else if(e.getSource()==contact1){
            
            String check = name.getText();
            
              if(check == "Khaled Atef"){
                  name.setText("Ahmed Adel");
                  contact1.setText("Khaled Atef");
                  contact2.setText("Sherif Khaled"); 
                  contact3.setText("Hossam Shaban");
              }
              else if(check == "Sherif Khaled"){
                  name.setText("Ahmed Adel");
                  contact1.setText("Khaled Atef");
                  contact2.setText("Sherif Khaled"); 
                  contact3.setText("Hossam Shaban");
              }
              else if(check == "Hossam Shaban"){
                  name.setText("Ahmed Adel");
                  contact1.setText("Khaled Atef");
                  contact2.setText("Sherif Khaled"); 
                  contact3.setText("Hossam Shaban");
              }
              else if(check == "Ahmed Adel"){
                  name.setText("Khaled Atef");
                  contact1.setText("Ahmed Adel");
                  contact2.setText("Sherif Khaled"); 
                  contact3.setText("Hossam Shaban");
              }
              
              
              if(check == "Technical Support"){
                  name.setText("Team");
                  contact1.setText("Technical Support");
                  contact2.setText("Friends"); 
                  contact3.setText("Family");
              }
              else if(check == "Friends"){
                  name.setText("Team");
                  contact1.setText("Technical Support");
                  contact2.setText("Friends"); 
                  contact3.setText("Family");
              }
              else if(check == "Family"){
                  name.setText("Team");
                  contact1.setText("Technical Support");
                  contact2.setText("Friends"); 
                  contact3.setText("Family");
              }
              else if(check == "Team"){
                  name.setText("Technical Support");
                  contact1.setText("Team");
                  contact2.setText("Friends"); 
                  contact3.setText("Family");
              }
        }
        
        else if(e.getSource()==contact2){

            String check = name.getText();
            
            if(check == "Khaled Atef"){
                name.setText("Sherif Khaled");
                contact1.setText("Ahmed Adel");
                contact2.setText("Khaled Atef");
                contact3.setText("Hossam Shaban");
                
             }
             else if(check == "Ahmed Adel"){
                 name.setText("Sherif Khaled");
                 contact1.setText("Ahmed Adel");
                contact2.setText("Khaled Atef");
                contact3.setText("Hossam Shaban");
             }
             else if(check == "Hossam Shaban"){
                 name.setText("Sherif Khaled");
                 contact1.setText("Ahmed Adel");
                contact2.setText("Khaled Atef");
                contact3.setText("Hossam Shaban");
             }
            else if(check == "Sherif Khaled"){
                  name.setText("Khaled Atef");
                  contact1.setText("Ahmed Adel");
                  contact2.setText("Sherif Khaled"); 
                  contact3.setText("Hossam Shaban");
              }
            
            
            if(check == "Technical Support"){
                name.setText("Friends");
                contact1.setText("Team");
                contact2.setText("Technical Support");
                contact3.setText("Family");
                
             }
             else if(check == "Team"){
                 name.setText("Friends");
                 contact1.setText("Team");
                contact2.setText("Technical Support");
                contact3.setText("Family");
             }
             else if(check == "Family"){
                 name.setText("Friends");
                 contact1.setText("Team");
                contact2.setText("Technical Support");
                contact3.setText("Family");
             }
            else if(check == "Friends"){
                  name.setText("Technical Support");
                  contact1.setText("Team");
                  contact2.setText("Friends"); 
                  contact3.setText("Family");
              }

        }
        
        else if(e.getSource()==contact3){

            String check = name.getText();

            if(check == "Khaled Atef"){
                name.setText("Hossam Shaban");
                contact1.setText("Ahmed Adel");
                contact2.setText("Sherif Khaled");
                contact3.setText("Khaled Atef");
             }
             else if(check == "Ahmed Adel"){
                 name.setText("Hossam Shaban");
                 contact1.setText("Ahmed Adel");
                contact2.setText("Sherif Khaled");
                contact3.setText("Khaled Atef");
             }
             else if (check == "Sherif Khaled"){
                 name.setText("Hossam Shaban");
                 contact1.setText("Ahmed Adel");
                contact2.setText("Sherif Khaled");
                contact3.setText("Khaled Atef");
             }
            else if(check == "Hossam Shaban"){
                  name.setText("Khaled Atef");
                  contact1.setText("Ahmed Adel");
                  contact2.setText("Sherif Khaled"); 
                  contact3.setText("Hossam Shaban");
              }
       
            
            
            if(check == "Technical Support"){
                name.setText("Family");
                contact1.setText("Team");
                contact2.setText("Friends");
                contact3.setText("Technical Support");
             }
             else if(check == "Team"){
                 name.setText("Family");
                 contact1.setText("Team");
                contact2.setText("Friends");
                contact3.setText("Technical Support");
             }
             else if (check == "Friends"){
                 name.setText("Family");
                 contact1.setText("Team");
                contact2.setText("Friends");
                contact3.setText("Technical Support");
             }
            else if(check == "Family"){
                  name.setText("Technical Support");
                  contact1.setText("Team");
                  contact2.setText("Friends"); 
                  contact3.setText("Family");
              }
        }
        
        else if(e.getSource()==groups){
            name.setText("Technical Support");
            contact1.setText("Team");
            contact2.setText("Friends");
            contact3.setText("Family");
        
        }
        
        else if(e.getSource()==contacts){    
            name.setText("Khaled Atef");
            contact1.setText("Ahmed Adel");
            contact2.setText("Sherif Khaled");
            contact3.setText("Hossam Shaban");
        
        }
        
        
           else if(e.getSource()==calc){    
            chatframe.setVisible(false);
             calcframe.setVisible(true);
        }
        
        else if(e.getSource()==back){    
            chatframe.setVisible(true);
            calcframe.setVisible(false);
        }
        
    }
    
    
}
