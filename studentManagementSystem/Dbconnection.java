    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.sql.*;
    
    import javax.swing.*;
    //import javax.swing.border.Border;
       
    public class Dbconnection  implements ActionListener {
       JLabel title,idlbl,namelbl,courselbl,yearlbl,mobilelbl;
       JTextField idtf,nametf,coursetf,mobiletf;
       JButton save,delete,view,update;
       JComboBox year;
       JPanel pan;
       ButtonGroup grp;

    public Dbconnection(){
     JFrame frame=new JFrame();
          
         
    
    
        title=new JLabel("STUDENT MANAGEMENT SYSTEM");
        title.setForeground(Color.yellow);
        title.setFont(new Font("ARIAL",Font.BOLD,20));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setBounds(0,20,600,20);
    
        idlbl=new JLabel("Id");
        idlbl.setForeground(Color.WHITE);
        idlbl.setFont(new Font("ARIAL",Font.BOLD,18));
        idlbl.setBounds(150, 70, 100, 80);
    
    
        namelbl=new JLabel("Name");
        namelbl.setForeground(Color.WHITE);
        namelbl.setFont(new Font("ARIAL",Font.BOLD,18));
        namelbl.setBounds(150, 120, 100, 80);
        
    
    
        courselbl=new JLabel("Course");
        courselbl.setForeground(Color.WHITE);
        courselbl.setFont(new Font("ARIAL",Font.BOLD,18));
        courselbl.setBounds(150, 170, 100, 80);
    
    
        yearlbl=new JLabel("Year");
        yearlbl.setForeground(Color.WHITE);
        yearlbl.setFont(new Font("ARIAL",Font.BOLD,18));
        yearlbl.setBounds(150, 220, 100, 80);
    
        
        mobilelbl=new JLabel("Mobile No.");
        mobilelbl.setForeground(Color.WHITE);
        mobilelbl.setFont(new Font("ARIAL",Font.BOLD,18));
        mobilelbl.setBounds(150, 270, 100, 80);
    
        idtf=new JTextField();
        idtf.setBounds(320, 102, 120, 15);
    
        nametf=new JTextField();
        nametf.setBounds(320, 152, 120, 15);
        
        coursetf=new JTextField();
        coursetf.setBounds(320, 202, 120, 15);
        grp=new ButtonGroup();
        String [] years={"I","II","III","IV"};
        year=new JComboBox(years);
        year.addActionListener(this);
        year.setBounds(320,252,100,20);
      
         mobiletf=new JTextField();
        mobiletf.setBounds(320, 302, 120, 15);
        
        pan=new JPanel();
        pan.setLayout(null);
        pan.setBackground(null);
        pan.setBounds(120,350,400,50);
     
       
        save=new JButton("SAVE");
        save.setBounds(30, 15, 80, 20);
        save.setBackground(Color.green);
        save.setForeground(Color.white);
        save.addActionListener(this);
        
    
        delete=new JButton("DELETE");
        delete.setBounds(120, 15, 80, 20);
        delete.setBackground(Color.red);
        delete.setForeground(Color.white);
        delete.addActionListener(this);
    
        view=new JButton("VIEW");
        view.setBounds(210, 15, 80, 20);
        view.setBackground(Color.orange);
        view.setForeground(Color.white);
        view.addActionListener(this);
    
        update=new JButton("UPDATE");
        update.setBounds(300, 15, 80, 20);
        update.setBackground(Color.blue);
        update.setForeground(Color.white);
        update.addActionListener(this);
    
          frame.setLayout(null);
          frame.setSize(600,500);
          frame.setResizable(false);
          frame.setVisible(true);
          frame.getContentPane().setBackground(Color.darkGray);
          frame.add(title);
         frame.add(idlbl);
         frame.add(idtf);
         frame.add(namelbl);
         frame.add(nametf);
         frame.add(courselbl);
         frame.add(yearlbl);
         frame.add(mobilelbl);
         frame.add(mobiletf);
         frame.add(coursetf);
        
         frame.add(year);
         
         frame.add(pan);
         pan.add(save);
         pan.add(delete);
         pan.add(view);
         pan.add(update);
    }
    
          @Override
        public void actionPerformed(ActionEvent e){
          if(e.getSource()==view){
            try{
             adddata.viewdata();
          }
          catch(Exception r){
            System.out.println(r);
          }
            }

            
          if(e.getSource()==save){
            try{
            String name=nametf.getText();
int id=Integer.parseInt(idtf.getText());
            String course=coursetf.getText();
            String num=mobiletf.getText();
            String years= (String)year.getSelectedItem();
           adddata.adddetails(id,name, course, years, num);
            }
            catch(Exception r){
            System.out.println(r);
          }
           
          }
          
             if(e.getSource()==update){
              try{
            int id=Integer.parseInt(idtf.getText());
            String name=nametf.getText();
            String course=coursetf.getText();
            String num=mobiletf.getText();
            String years= (String)year.getSelectedItem();
           adddata.updateDetails(id,name, course, years, num);

              }
              catch(Exception r){
            System.out.println(r);
          }
          }

     if(e.getSource()==delete){try{
      int id=Integer.parseInt(idtf.getText());
      adddata.deleteData(id);
     }
        
        catch(Exception a){
          System.out.println(a);
        }}
        }
    public static void main(String[] args)throws SQLException{
    new Dbconnection();
        
        }
    }
    
    


