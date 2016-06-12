import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class JavaExam extends JFrame implements ActionListener  
{  
	Label l;
        JRadioButton jb[]=new JRadioButton[5];  
        Button b1;  
        Font f=new Font("Arial",Font.BOLD,14);
	Font ff=new Font("Arial",Font.BOLD,8);
        ButtonGroup bg;  
        int count=0,current=0,x=1,y=1;  
        int m[]=new int[10];      
        JavaQuiz(String s)  
        {  
        	super(s);   
		setLayout(new FlowLayout());
		setBackground(Color.cyan);
		l=new Label();
		l.setFont(f);
		add(l);
        	bg=new ButtonGroup();  
        	for(int i=0;i<5;i++)  
        	{  
        	    jb[i]=new JRadioButton();     
        	    add(jb[i]);  
        	    bg.add(jb[i]);  
        	}  
        	b1=new Button("Next");  
        	b1.addActionListener(this);    
        	add(b1);  
        	set();  
        	l.setBounds(30,40,450,20);  
        	jb[0].setBounds(50,80,100,20);  
        	jb[1].setBounds(50,110,100,20);  
        	jb[2].setBounds(50,140,100,20);  
        	jb[3].setBounds(50,170,100,20);  
        	b1.setBounds(100,240,100,30);
		setLayout(null);
        	setVisible(true);  
        	setSize(600,350);  
    	}  	
    	public void actionPerformed(ActionEvent e)  
    	{  
        	if(e.getSource()==b1)  
        	{  
        	       if(check())  
         	       count=count+1;  
         	       current++;  
                       set();    
            	       if(current==6)  
                       {  
                      		b1.setEnabled(false);  
                		System.out.println("Result is:"+count);
         	       }  
        	}  
    	}  
        public void set()  
        {  
        	jb[4].setSelected(true);  
        	if(current==0)  
        	{  
        		l.setText("Que1: Which one among these is not a primitive datatype?"); 
            	 	jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");   
        	}  
        	if(current==1)  
        	{  
                	l.setText("Que2: Which class is available to all the class automatically?");
            		jb[0].setText("System");jb[1].setText("Applet");jb[2].setText("Object");jb[3].setText("ActionEvent");  
        	}  
                if(current==2)  
       		{  
                        l.setText("Que3: Which of these class is not Wrapper class?");  
            		jb[0].setText("Integer");jb[1].setText("float");jb[2].setText("Boolean");jb[3].setText("Character");  
        	}  
       		if(current==3)  
        	{  
                	l.setText("Que4: String class is defined in which package?");  
            		jb[0].setText("lang");jb[1].setText("sql");jb[2].setText("Applet");jb[3].setText("awt");  
        	}  
        	if(current==4)  
        	{  
                	l.setText("Que5: Which of the following is false about String?");  
            		jb[0].setText("String is immutable.");jb[1].setText("String can be created using new operator.");jb[2].setText("String is a primary datatype.");
			jb[3].setText("None of the above.");  
        	}   
		if(current==5)
		{
	     	        l.setText(" PRESS NEXT AND SEE RESULT IN COMMAND PROMPT");
	    		jb[0].setVisible(false);jb[1].setVisible(false);jb[2].setVisible(false);jb[3].setVisible(false);
		}
	}  
    	public boolean check()  
    	{  
        if(current==0)  
		return(jb[1].isSelected());  
        if(current==1)  
                return(jb[2].isSelected());  
        if(current==2)  
                return(jb[1].isSelected());  
        if(current==3)  
                return(jb[0].isSelected());  
        if(current==4)  
                return(jb[2].isSelected());  
        return false;  
    	}  
    	public static void main(String s[])  
    	{  
        	new JavaExam("Online Test Of Java");  
    	}  
}  