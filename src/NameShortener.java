import javax.swing.JOptionPane;

public class NameShortener {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog(null, "What is your name?");
char p =0;
System.out.println("Your name before intials are: " + name);
char a = name.charAt(0);
name.length();
for(int v=0; v<name.length(); v++){
char r = name.charAt(v);
if(r==' ') {
	int d = v+=1;
	p = name.charAt(d);
}
}


 System.out.println(a+"."+p);}
}

