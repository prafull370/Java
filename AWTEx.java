import java.awt.*;
public class AWTEx  {
    Frame f;
    Label l;
    TextField t1;
    TextArea ta;
    Button b;
    Checkbox c;
    // RadioButtonBorder rb;
    // CheckboxGroup g1;
    Choice ch;
    List lt;
    Scrollbar vbar;
    MenuItem mI;
    MenuBar Mb;
  public AWTEx(){
    f=new Frame();
    f.setSize(500,500);/// association method.
    f.setTitle("AWT Components");
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    l=new Label("working with AWT Components");
    f.add (l);
    t1=new TextField(20);
    f.add(t1);
    ta=new TextArea("Text Area",5,20);
    f.add(ta);
    b=new Button ("clickHere");
    f.add(b);
    // g1=new CheckboxGroup("Male",Male,g1);
    // f.add(g1);
    c=new Checkbox("Gender");
    f.add(c);
    ch=new Choice();
    ch.add("apple");
    ch.add("mango");
    f.add(ch);
    lt=new List(3,true);
    lt.add("app");
    lt.add("bb");
    lt.add("cc");
    f.add(lt);
    vbar=new Scrollbar(Scrollbar.HORIZONTAL);
    f.add(vbar);
    mI=new MenuItem("Exit");
    Mb=new MenuBar();
  }
  public static void main(String[] args){
    new AWTEx();
  }
}
