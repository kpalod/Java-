import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class paint extends Frame implements ActionListener
{
    int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,n=5,ch=1;
    int xpoints[]=new int[n];
    int ypoints[]=new int[n];
    MenuBar mb;
                Menu op,col;
                MenuItem l,c,r,a,po,x,br,bb,bg,fr,fb,fg;
    Panel p;
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Button b;
                paint()
                {          
p=new Panel();
t1=new TextField(4);
t2=new TextField(4);
t3=new TextField(4);
t4=new TextField(4);
l1=new Label("x1");
l2=new Label("y1");
l3=new Label("x2");
l4=new Label("y2");
t5=new TextField(4);
t6=new TextField(4);
l5=new Label("height");
l6=new Label("width");
t7=new TextField(4);
t8=new TextField(4);
t9=new TextField(4);
t10=new TextField(4);
l7=new Label("yaxis");
l8=new Label("yaxis");
l9=new Label("yaxis");
l10=new Label("yaxis");
b=new Button("ok");
p.add(l1);
p.add(t1);
p.add(l2);
p.add(t2);
p.add(l3);
p.add(t3);
p.add(l4);
p.add(t4);
p.add(l5);
p.add(t5);
p.add(l6);
p.add(t6);
p.add(l7);
p.add(t7);
p.add(l8);
p.add(t8);
p.add(l9);
p.add(t9);
p.add(l10);
p.add(t10);
p.add(b);
b.addActionListener(this);
setLayout(new BorderLayout());
add("South",p);
 mb=new MenuBar();
        setMenuBar(mb);
                                op=new Menu("option");
                                op.add(l=new MenuItem("Line"));
                                op.add(c=new MenuItem("Circle"));
                                op.add(r=new MenuItem("Rectangle"));
                                op.add(a=new MenuItem("Arc"));
                                op.add(po=new MenuItem("Polygon"));
        op.add(x=new MenuItem("exit"));
        col=new Menu("Color");
        Menu back=new Menu("Background");
        back.add(br=new MenuItem("Red"));
        back.add(bg=new MenuItem("Green"));
        back.add(bb=new MenuItem("Blue"));
        col.add(back);
        Menu fore=new Menu("Foreground");
        fore.add(fr=new MenuItem("Red"));
        fore.add(fg=new MenuItem("Green"));
        fore.add(fb=new MenuItem("Blue"));
        col.add(fore);
                                mb.add(op);
                                mb.add(col);
                                br.addActionListener(this);
                                bg.addActionListener(this);
                                bb.addActionListener(this);
                                fr.addActionListener(this);
                                fg.addActionListener(this);
                                fb.addActionListener(this);
                                l.addActionListener(this);
                                c.addActionListener(this);
                                r.addActionListener(this);
                                a.addActionListener(this);
                                po.addActionListener(this);
                    x.addActionListener(this);
                addWindowListener(new WindowAdapter()
{public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
               
                }
public void paint(Graphics g)
{
                switch(ch)
                {
                                case 1:    g.drawLine(x1,y1,x2,y2);
                                                break;
                                case 2:   g.drawOval(x1,y1,x2,y2);
                                                break;
                                case 3:  g.drawRect(x1,y1,x2,y2);
                                                break;
                                case 4:  g.drawArc(x1,y1,x2,y2,x3,y3);
                                                break;
                                case 5:  xpoints[0]=x1;
                                                xpoints[1]=x2;
                                                xpoints[2]=x3;
                                                xpoints[3]=x4;
                                                xpoints[4]=x5;
                                                ypoints[0]=y1;
                                                ypoints[1]=y2;
                                                ypoints[2]=y3;
                                                ypoints[3]=y4;
                                                ypoints[4]=y5;
                                                g.drawPolygon(xpoints,ypoints,n);
                                                break;                  
                                                               
                }
}
public void actionPerformed(ActionEvent e)
{
  String s=e.getActionCommand();
  Object s1=e.getSource();
  if(s1==br)
                setBackground(Color.red);
  else if(s1==bg)
                setBackground(Color.green);
                else if(s1==bb)
                                setBackground(Color.blue);
                                else if(s1==fr)
                                                setForeground(Color.red);
                                                else if(s1==fg)
                                                                setForeground(Color.green);
                                                                else if(s1==fb)
                                                                                setForeground(Color.blue);
if(s.equals("exit"))
System.exit(0);
else if(s.equals("Line"))
{
                ch=1;

}
else if(s.equals("Circle"))
                ch=2;
else if(s.equals("Rectangle"))
                ch=3;
else if(s.equals("Arc"))
{
                ch=4;
}
else if(s.equals("Polygon"))
{
                    ch=5;
}
else if(s.equals("ok"))
{
                x1=Integer.parseInt(t1.getText());
                x2=Integer.parseInt(t2.getText());
                y1=Integer.parseInt(t3.getText());
                y2=Integer.parseInt(t4.getText());

                x3=Integer.parseInt(t5.getText()+0);
                y3=Integer.parseInt(t6.getText()+0);
               
                x4=Integer.parseInt(t7.getText()+0);
                y4=Integer.parseInt(t8.getText()+0);
                x5=Integer.parseInt(t9.getText()+0);
                y5=Integer.parseInt(t10.getText()+0);
                repaint();
}
}

public static void main(String args[])
{
paint f=new paint();
f.setSize(800,400);
f.setVisible(true);
}
}