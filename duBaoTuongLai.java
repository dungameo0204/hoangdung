import javax.swing.JOptionPane;
public class duBaoTuongLai {
public static void main(String[] args) {
	String Tuoi;
	Tuoi=JOptionPane.showInputDialog("Nhap tuoi cua ban");
	int tuoi=Integer.parseInt(Tuoi);
	tuoi=tuoi+10;
	JOptionPane.showMessageDialog(null, "10 nam sau ban se tro thanh...","Nhan ENTER de tiep tuc",JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, "1 nguoi "+tuoi+" tuoi","Dung nhan sai cai giup em a",JOptionPane.INFORMATION_MESSAGE);
	
}
}
