import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ress {
	public static void ress1() throws ClassNotFoundException, SQLException, IOException {
     	Class.forName("com.mysql.jdbc.Driver");
         final Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
   	  
         
         
         int i=0;
         PreparedStatement ps=con.prepareStatement("select ArtistID,ArtistName from AGMS group by ArtistID"); 
         final ResultSet rs=ps.executeQuery();
         
         String sample="",a;
         int iid=0;
         
         //new Window2();
         while(rs.next())  
         {
       	// System.out.println(rs.getString(1)); 
         	iid=rs.getInt(1);
       	  a=rs.getString(2);
       	  //g1.setText(rs.getString(1));
       	 sample= sample.concat(iid+"."+a+"\n");
       	 // System.out.println(sample);
       	 
         }
         final JFrame fm1=new JFrame("Artist Name");
   		 JTextArea g1=new JTextArea(sample);
   		fm1.setSize(500,500);
   		
   		fm1.setLayout(null);
   		fm1.setLocationRelativeTo(null);
   		g1.setBounds(20,20,300,200);
   		fm1.add(g1);
   		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // g1.setText(sample);
   		
   		
   		
   		
   		
         JLabel lid=new JLabel("Enter ArtistID:");
      final JTextField jid=new JTextField();
     lid.setBounds(20,230,120,30);
     jid.setBounds(145,230,50,30);
     
     JButton buj=new JButton("Next");
     buj.setBounds(40,270,100,30);
     fm1.add(lid);
     fm1.add(jid);
     fm1.add(buj);
     
     fm1.setVisible(true);
     
     buj.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				fm1.setVisible(false);
				 int aid;
		         String n;
				aid=Integer.parseInt(jid.getText());
				  byte b[];
				  int i=1;
			      Blob blob[]=new Blob[10];
			     int a1[]=new int[10];
			     String an[]=new String[10];
			     String ar[]=new String[10];
			     String sa[]=new String[10];
			     long p[]=new long[10];
			      i=0;
			      int temp;
			      long temp2;
			      Blob btemp;
			      PreparedStatement ps1;
				try {
					ps1 = con.prepareStatement("select * from AGMS where ArtistID="+aid);
					 ResultSet rs1=ps1.executeQuery();
				      JFrame f=new JFrame("Art Gallery");
				      
				      f.setLayout(new GridBagLayout());
				      while(rs1.next()){
				      	 File file=new File("image"+i+".jpg");
				           FileOutputStream fos=new FileOutputStream(file);
				      	a1[i]=rs1.getInt(1);
				      	an[i]=rs1.getString(3);
				      	ar[i]=rs1.getString(2);
				      	sa[i]=rs1.getString(4);
				      	p[i]=rs1.getLong(6);
				      	btemp=blob[i];
				          btemp=rs1.getBlob(5);
				          b=btemp.getBytes(1,(int)btemp.length());
				          fos.write(b);
				     
				      
				      ImageIcon image = new ImageIcon("image"+i+".jpg");
				      
				      TextArea t1=new TextArea();
				      temp=a1[i];
				     String s1=Integer.toString(a1[i]);
				      temp2=p[i];
				      String s2=Long.toString(p[i]);
				      t1.setText("ImageID-"+s1+"\nArt's Title:"+an[i]+"\nArtist Name:"+ar[i]+"\nStyle of Art:"+sa[i]+"\nPrice=$"+s2);
				      t1.setPreferredSize(new Dimension(200,200));
				    //  System.out.println(t1.getSize());

				      t1.setBackground(Color.orange);
				    //  t1.setLineWrap(true);
				  //    t1.setWrapStyleWord(false);
				      t1.setSize(10, 10);
				      JLabel label = new JLabel("",image, JLabel.CENTER);
				     // JLabel label = new JLabel("",image,JLabel.setBounds(100,100,100,100));
				    //label.setSize(100,100);
				      JPanel panel = new JPanel(new BorderLayout());
				     
				      panel.add(label,BorderLayout.CENTER );
				      panel.add(t1,BorderLayout.SOUTH);
				     // panel.setSize(100,100);

				      
				      f.add(panel);
				      fos.close();
				      i++;
				    
				      file.delete();
				      fos.flush();
				      }
				      
				      rs.close();

				      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


				      f.getContentPane().setBackground(Color.CYAN);
				      f.setVisible(true);
				      f.setSize(10000,10000);
				      
				      
				      ps1.close();
				      
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			     
				
			}
		});
     
  
     
     
      //n=sc1.nextLine();
    ps.close();
	}
}
