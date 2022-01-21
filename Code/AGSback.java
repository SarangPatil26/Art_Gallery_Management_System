import java.sql.*;  
import java.util.Scanner;
import java.awt.*;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.sun.xml.internal.ws.api.server.Container;
import com.sun.xml.internal.ws.org.objectweb.asm.Label;
    class AGSback extends SQLException{
    	static int choice;
    public static void main(String args[]) throws Exception,SQLException  {

    	
    	//final Connection conr=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		final JFrame log =new JFrame("LOGIN");
		
		
		
		JLabel un= new JLabel("User Name");
		final JLabel pass=new JLabel("Password");
		log.setSize(400,500);
		un.setBounds(20,20,100,30);
		pass.setBounds(20,50,100,30);
		final JTextField un1 =new JTextField();
		final JTextField pass1 =new JTextField();
		un1.setBounds(130, 20,100,30);
		pass1.setBounds(130,50, 100, 30);
		JButton sub =new JButton("SUBMIT");
		JButton reg =new JButton("REGISTER");
		reg.setBounds(30,200,100,30);
		sub.setBounds(30,150,100,30);
		log.setLayout(null);
		log.setVisible(true);
		log.add(un);
		log.add(pass);
		log.add(un1);
		log.add(pass1);
		log.add(sub);
		log.add(reg);
		
		
		 sub.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				 
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    
	         
	         String uns,unn;
	         String passs,passn;
	         
	         uns=un1.getText();
	         passs=pass1.getText();
	        // unn=rsm.getString(1);
	         //passn=rsm.getString(2);
	         final JTextField g;
	 		JLabel la;
	 		final JFrame fm;
	 		 	fm= new JFrame("Menu");
	 	    	
	 	    	//System.out.println("Menu\n1.Artist Names\n2.Artist's Gallery\n3.Buy\n4.Exit\nSelect Your Choice: ");
	 	    	JLabel lg= new JLabel();
	 	    	lg.setText("1.Artist's Gallery");
	 	    	JLabel lb= new JLabel();
	 	    	lb.setText("2.Buy");
	 	    	JLabel le= new JLabel();
	 	    	le.setText("3.Exit");
	 	    	JLabel lc=new JLabel();
	 	    	lc.setText("Enter the Choice");
	 	    	g=new JTextField();
	 	    	JButton nxt=new JButton("Next");
	 	    	
	 	    	
	 	    	lg.setBounds(50,100,200,30);
	 	    	lb.setBounds(50,150,200,30);
	 	    	le.setBounds(50,200,200,30);
	 	    	lc.setBounds(50,250,200,30);
	 	    	g.setBounds(200,250,100,30);
	 	    	nxt.setBounds(100,300,150,30);
	 	    	 

	 	    	
	 	    	fm.setSize(500, 500);
	 	    	fm.add(lg);
	 	    	fm.add(lb);
	 	    	fm.add(le);
	 	    	fm.add(g);
	 	    	fm.add(lc);
	 	    	fm.add(nxt);
	 	    	fm.setLayout(null);
	 	    	fm.setLocationRelativeTo(null);
	 	    	
	 	    	
	 	    	 nxt.addActionListener(new ActionListener() {
	 					
	 					public void actionPerformed(ActionEvent arg0) {
	 						
	 						String  c;
	 						
	 						c=g.getText();
	 						
	 				    	choice=Integer.parseInt(c);
	 				    
	 				    	fm.setVisible(false);
	 				        
	 				        switch(choice){
	 				        case 1:
	 	
	 				        		//SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
	 				        	ress r=new ress();
	 				        	try {
									r.ress1();
								} catch (ClassNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								};
	 				        	
	 				        	
	 				            break;
	 				        case 2:
	 				        	 try{
	 				                 Class.forName("com.mysql.jdbc.Driver");
	 				                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
	 				             
	 				                 int i=0;
									
	 				                 
	 				                 int gi;
	 				                 
	 				                String a,sample="";
	 				                 byte by[];
	 				                 PreparedStatement ps=con.prepareStatement("select * from AGMS"); 
	 				                 ResultSet rs=ps.executeQuery();
	 				                
	 				                 
	 				                 final JFrame baid=new JFrame("List of arts");
	 				                // System.out.println("Lists of art");
	 				                // while(rs.next())  
	 				               	 // System.out.println(rs.getInt(1)+"."+rs.getString(3));  
	 				                 
	 				                while(rs.next())  
	 				               {
	 				             	// System.out.println(rs.getString(1)); 
	 				               	gi=rs.getInt(1);
	 				             	  a=rs.getString(3);
	 				             	  //g1.setText(rs.getString(1));
	 				             	 sample= sample.concat(gi+"."+a+"\n");
	 				             	 // System.out.println(sample);
	 				             	 
	 				               }
	 				                
	 				         		 JTextArea g2=new JTextArea(sample);
	 				           		baid.setSize(500,500);
	 				           		
	 				           		baid.setLayout(null);
	 				           		baid.setLocationRelativeTo(null);
	 				           		g2.setBounds(20,20,300,200);
	 				           		baid.add(g2);
	 				           		baid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 				                // g1.setText(sample);
	 				           		
	 				           		
	 				           		
	 				           		
	 				           	
	 				                 JLabel lid=new JLabel("Enter ArtistID:");
	 				              final JTextField jid=new JTextField();
	 				             lid.setBounds(20,230,120,30);
	 				             jid.setBounds(145,230,50,30);
	 				             
	 				             JButton buj1=new JButton("Next");
	 				             buj1.setBounds(40,270,100,30);
	 				             baid.add(lid);
	 				             baid.add(jid);
	 				             baid.add(buj1);
	 				             
	 				             baid.setVisible(true);
	 				             
	 				             
	 				            buj1.addActionListener(new ActionListener() {
	 			 					
	 			 					public void actionPerformed(ActionEvent arg0) {
	 				                baid.setVisible(false);
	 				                 PreparedStatement ps1;
	 				                 
									try {
										Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
										int t=Integer.parseInt(jid.getText());
		 				                  String an;
		 				                  long p;
										ps1 = con.prepareStatement("select * from AGMS where ImageID="+t);
										   ResultSet rs1=ps1.executeQuery();
			 				                 rs1.first();
			 				                 
			 				                 final JFrame f=new JFrame("Buy");
			 				                 final JFrame f1=new JFrame("Transaction");
			 				                 final JFrame f2=new JFrame("Transaction Status!!");
			 				                 

			 				                // f.setLocationRelativeTo(null);
			 				                 
			 				                 an=rs1.getString(3);
			 				                 p=rs1.getLong(6);
			 				                 
			 				                 
			 				                 JLabel label=new JLabel();
			 				                 label.setText("Buy "+an+" for $"+p);
			 				                 label.setBounds(100,200,1000,30);
			 				                 
			 				                JButton b=new JButton("Confirm");
			 				                b.setBounds(100,300,95,30);
			 				                JPanel panel = new JPanel(new BorderLayout());
			 				                
			 				                panel.add(label,BorderLayout.EAST);
			 				                
			 				                
			 				                JButton b2=new JButton("Cancel");
			 				                b2.setBounds(300,300,95,30);
			 				                
			 				                b2.addActionListener(new ActionListener() {
			 									
			 									public void actionPerformed(ActionEvent arg0) {
			 										
			 										f.dispose();
			 									}
			 								});
			 				                
			 				               
			 				                
			 				                f.add(b);
			 				                f.add(b2);
			 				                f.add(label);
			 				                
			 				                JLabel label2=new JLabel("Pay $"+p+".....Select Mode of payment.");
			 				                label2.setBounds(100,100,1000,100);
			 				                final JRadioButton r1=new JRadioButton("Cash on Delivery");
			 				                final JRadioButton r2=new JRadioButton("Credit Card");
			 				                
			 				                r1.setBounds(100,160,1000,50);
			 				                r2.setBounds(100,210,1000,50);
			 				                
			 				                ButtonGroup bg=new ButtonGroup();
			 				                bg.add(r1);
			 				                bg.add(r2);	
			 				                
			 				                final JButton pr=new JButton("Proceed");
			 				                pr.setBounds(300,300,95,30);
			 				                
			 				             //   pr.addActionListener(this);
			 				                
			 				                f1.add(label2);
			 				                f1.add(r1);
			 				                f1.add(r2);
			 				                f1.add(pr);
			 				                f1.setSize(500,500);
			 				                f1.setLayout(null);
			 				                
			 				                f.setLayout(null);
			 				                 f.setVisible(true);
			 				                 String s=new String();
			 				                 
			 				                 JLabel label3=new JLabel("Transaction Complete");
			 				                 label3.setBounds(150,150,1000,100);
			 									
			 				                
			 				                 
			 				                 f2.add(label3);
			 									
			 									
			 					                f2.setSize(500,500);
			 					                f2.setLayout(null);
			 					                
			 				                 b.addActionListener(new ActionListener() {
			 				 					
			 				 					public void actionPerformed(ActionEvent arg0) {
			 				 						
			 				 						f.setVisible(false);
			 				 						f1.setVisible(true);
			 				 						
			 				 						
			 				 						pr.addActionListener(new ActionListener() {
			 				 		 					
			 				 		 					public void actionPerformed(ActionEvent arg0) {
			 				 		 						
			 				 		 						if(r1.isSelected())
			 				 		 						{
			 				 				
			 				 		 						final JFrame cod =new JFrame("COD");
			 				 		 						JLabel na= new JLabel("NAME:");
			 				 		 						final JLabel addd=new JLabel("ADDRESS:");
			 				 		 						final JLabel mob=new JLabel("MOB.NO:");
			 				 		 						cod.setSize(400,500);
			 				 		 						na.setBounds(20,20,100,30);
			 				 		 						addd.setBounds(20,50,100,30);
			 				 		 						mob.setBounds(20,80,100,30);
			 				 		 						final JTextField na1 =new JTextField();
			 				 		 						final JTextField add1 =new JTextField();
			 				 		 						final JTextField mob1 =new JTextField();
			 				 		 						na1.setBounds(130, 20,100,30);
			 				 		 						add1.setBounds(130,50, 250, 30);
			 				 		 						mob1.setBounds(130,80,120,30);
			 				 		 						JButton sub =new JButton("SUBMIT");
			 				 		 						
			 				 		 						
			 				 		 						sub.setBounds(30,150,100,30);
			 				 		 						cod.setVisible(true);
			 				 		 						cod.add(na);
			 				 		 						cod.add(addd);
			 				 		 						cod.add(na1);
			 				 		 						cod.add(add1);
			 				 		 						cod.add(sub);
			 				 		 						cod.add(mob1);
			 				 		 						cod.add(mob);
			 				 		 						
			 				 		 						
			 				 		 						cod.setLayout(null);
			 				 		 					
			 				 		 						sub.addActionListener(new ActionListener() {
			 					 		 		 					
			 					 		 		 					public void actionPerformed(ActionEvent arg0) {
			 					 		 		 						
			 					 		 		 						
			 					 		 		 						
			 					 		 		 						try {
			 					 		 									Class.forName("com.mysql.jdbc.Driver");
			 					 		 									Connection conr = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			 					 		 									final String nam1;
			 					 		 									final String addd1;
			 					 		 									final String mbn;
			 					 		 									int m;
			 					 		 									nam1=na1.getText();
			 					 		 									addd1=add1.getText();
			 					 		 									mbn=mob1.getText();
			 					 		 									//m=parseInt(mbn);
			 					 		 									
			 					 		 									
			 					 		 									//String query ="insert into login(\""+uns1+"\",\""+passs1+"\") values (?,?)";
			 					 		 									//String query ="insert into login(username,password) values ("\""+uns1+"\",\""+passs1+"\"")";
			 					 		 									String query ="insert into COD(name,address,mobileno) values (?,?,?)";
			 					 		 									PreparedStatement psr = conr.prepareStatement(query);
			 					 		 									 psr.setString(1,nam1);
			 					 		 							            psr.setString(2,addd1);
			 					 		 							            psr.setString(3,mbn);

			 					 		 							            psr.execute();
			 					 		 							            conr.close();	
			 					 		 								} catch (SQLException e) {
			 					 		 									// TODO Auto-generated catch block
			 					 		 									e.printStackTrace();
			 					 		 								} catch (ClassNotFoundException e) {
			 					 		 									// TODO Auto-generated catch block
			 					 		 									e.printStackTrace();
			 					 		 								}
			 					 		 		 						cod.setVisible(false);
			 					 		 		 						f2.setVisible(true);
			 					 		 		 						}
			 						 						});
			 				 		 						}
			 				 		 						else if(r2.isSelected()){
			 				 		 							final JFrame credit =new JFrame("CREDIT CARD");
			 				 	 		 						JLabel na= new JLabel("NAME:");
			 				 	 		 						final JLabel addd=new JLabel("ADDRESS:");
			 				 	 		 						final JLabel cardno=new JLabel("CARD NUMBER:");
			 				 	 		 						final JLabel mob=new JLabel("MOB.NO:");
			 				 	 		 						credit.setSize(400,500);
			 				 	 		 						na.setBounds(20,20,100,30);
			 				 	 		 						addd.setBounds(20,50,100,30);
			 				 	 		 						mob.setBounds(20,80,100,30);
			 				 	 		 						cardno.setBounds(20,110,100,30);
			 				 	 		 						final JTextField na1 =new JTextField();
			 				 	 		 						final JTextField add1 =new JTextField();
			 				 	 		 						final JTextField mob1 =new JTextField();
			 				 	 		 						final JTextField cardno1 =new JTextField();
			 				 	 		 						
			 				 	 		 						na1.setBounds(130, 20,100,30);
			 				 	 		 						add1.setBounds(130,50, 250, 30);
			 				 	 		 						mob1.setBounds(130,80,120,30);
			 				 	 		 						cardno1.setBounds(130,110,120,30);
			 				 	 		 						JButton sub =new JButton("SUBMIT");
			 				 	 		 						
			 				 	 		 						
			 				 	 		 						sub.setBounds(30,150,100,30);
			 				 	 		 						credit.setVisible(true);
			 				 	 		 						credit.add(na);
			 				 	 		 						credit.add(addd);
			 				 	 		 						credit.add(na1);
			 				 	 		 						credit.add(add1);
			 				 	 		 						credit.add(sub);
			 				 	 		 						credit.add(mob1);
			 				 	 		 						credit.add(mob);
			 				 	 		 						credit.add(cardno1);
			 				 	 		 						credit.add(cardno);
			 				 	 		 						
			 				 	 		 						credit.setLayout(null);
			 				 	 		 						sub.addActionListener(new ActionListener() {
			 				 	 		 		 					
			 				 	 		 		 					public void actionPerformed(ActionEvent arg0) {
			 				 	 		 		 					try {
			 				 	 	 									Class.forName("com.mysql.jdbc.Driver");
			 				 	 	 									Connection conr = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			 				 	 	 									final String nam1;
			 				 	 	 									final String addd1;
			 				 	 	 									final String mbn;
			 				 	 	 									final String cdd1;
			 				 	 	 									int m;
			 				 	 	 									nam1=na1.getText();
			 				 	 	 									addd1=add1.getText();
			 				 	 	 									mbn=mob1.getText();
			 				 	 	 									cdd1=cardno1.getText();
			 				 	 	 									//m=parseInt(mbn);
			 				 	 	 									
			 				 	 	 									
			 				 	 	 									//String query ="insert into login(\""+uns1+"\",\""+passs1+"\") values (?,?)";
			 				 	 	 									//String query ="insert into login(username,password) values ("\""+uns1+"\",\""+passs1+"\"")";
			 				 	 	 									String query ="insert into cred(name,address,cardnumber,mobileno) values (?,?,?,?)";
			 				 	 	 									PreparedStatement psr = conr.prepareStatement(query);
			 				 	 	 									 psr.setString(1,nam1);
			 				 	 	 							            psr.setString(2,addd1);
			 				 	 	 							            psr.setString(3,cdd1);
			 				 	 	 							            psr.setString(4,mbn);

			 				 	 	 							            psr.execute();
			 				 	 	 							            conr.close();	
			 				 	 	 								} catch (SQLException e) {
			 				 	 	 									// TODO Auto-generated catch block
			 				 	 	 									e.printStackTrace();
			 				 	 	 								} catch (ClassNotFoundException e) {
			 				 	 	 									// TODO Auto-generated catch block
			 				 	 	 									e.printStackTrace();
			 				 	 	 								}
			 				 	 		 		 						
			 				 	 		 		 						
			 				 	 		 		 						
			 				 	 		 		 						
			 				 	 		 		 						
			 				 	 		 		 						credit.setVisible(false);
			 				 	 		 		 						f2.setVisible(true);
			 				 	 		 		 						}
			 				 		 						});
			 				 		 						}
			 				 		 						
			 				 		 						f1.setVisible(false);
			 				 		 						
			 				 		 						//f2.setVisible(true);
			 				 		 						//final String uns1;
			 				 		 						//final String passs1;
			 				 		 						
			 				 		 						
			 				 		 						
			 				 		 					}
			 				 		 				});
			 				 					}
			 				 				});
			 				                 f.setSize(500,500);
			 				                 
									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									} 
	 				              
	 			 					}
	 			 					
	 				            });
	 				           con.close();
	 				             }catch(Exception e){
	 				                 e.printStackTrace();
	 				             }
	 				        	break;
	 				        
	 				        case 3:
	 				        	System.out.println("Exiting...");
	 				        	
	 				            
	 				        }
	 					}
	 				});
	 	    	 
	 	    	 
			        if (uns != null && passs != null) {
			        	Connection conm=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
						 PreparedStatement psm=conm.prepareStatement("Select * from login Where username=\""+uns+"\" and password=\"" +passs+"\""); 
			            
			            ResultSet rsm = psm.executeQuery();
			          	
			            if (rsm.next()) {
			                //in this case enter when at least one result comes it means user is valid
			            	fm.setVisible(true);
			            	log.setVisible(false);
			            	
			            	
			            } else {
			               JLabel inv=new JLabel("Invalid User");
			               inv.setBounds(40,240,120,30);
			               log.add(inv);
			               log.setVisible(false);
			               log.setVisible(true);
			            }
			            conm.close();
			        }
			       
			        

				
			       
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		        		 }
		 });


         
         
		
		 reg.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					
					final JFrame log1 =new JFrame("REGISTER");
					
					JLabel un= new JLabel("User Name");
					JLabel pass=new JLabel("Password");
					log1.setSize(400,500);
					un.setBounds(20,20,100,30);
					pass.setBounds(20,50,100,30);
					final JTextField un1 =new JTextField();
					final JTextField pass1 =new JTextField();
					un1.setBounds(130, 20,100,30);
					pass1.setBounds(130,50, 100, 30);
					JButton sub1 =new JButton("SUBMIT");
					//JButton reg =new JButton("REGISTER");
					//reg.setBounds(30,200,100,30);
					sub1.setBounds(30,150,100,30);
					
					log.setVisible(false);
					log1.setLayout(null);
					log1.setVisible(true);
					log1.add(un);
					log1.add(pass);
					log1.add(un1);
					log1.add(pass1);
					log1.add(sub1);
					//log.add(reg);
					
					
					
					//uns1=un1.getText();
					//passs1=pass1.getText();
					
					sub1.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent arg0) {
							
							
							log1.setVisible(false);
				
							
							
							try {
								Class.forName("com.mysql.jdbc.Driver");
								Connection conr = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
								final String uns1;
								final String passs1;
								uns1=un1.getText();
								passs1=pass1.getText();
								
								//String query ="insert into login(\""+uns1+"\",\""+passs1+"\") values (?,?)";
								//String query ="insert into login(username,password) values ("\""+uns1+"\",\""+passs1+"\"")";
								String query ="insert into login(username,password) values (?,?)";
								PreparedStatement psr = conr.prepareStatement(query);
								 psr.setString(1,uns1);
						            psr.setString(2,passs1);

						            psr.execute();
						            conr.close();	
						            
						            
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							log.setVisible(true);
						
						
						}
						
							
					});
				}
			});
		
		
		
    	
    	/*int choice=0;
    	
    	System.out.println("Menu\n1.Artist's Gallery\n2.Buy\n3.Exit\nSelect Your Choice: ");
    	Scanner sc=new Scanner(System.in);
    	choice=sc.nextInt();
    */
		 

	    	   
    	
    	}
    
            
        
    }