import javax.swing.*;

public class ObjekGUI {
    public static void main(String[] args) {
        GUI g = new GUI();
    }
}

class GUI extends JFrame {
    final JTextField fnama = new JTextField(10);
    JLabel lnama = new JLabel("Nama Lengkap");
    
    final JTextField falamat = new JTextField(20);
    JLabel lalamat = new JLabel("Alamat");
    
    JLabel ljeniskelamin = new JLabel("Jenis Kelamin");
    JRadioButton rblaki = new JRadioButton("Laki-Laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");
    
    JLabel lagama = new JLabel("Agama");
    String[] namaagama = {"Islam","Kristen","Katolik","Hindu","Buddha"};
    JComboBox cmbagama = new JComboBox(namaagama);
    
    JLabel lstatusnikah = new JLabel("Status Pernikahan");
    JRadioButton rbnikah = new JRadioButton("Menikah");
    JRadioButton rblajang = new JRadioButton("Lajang");
    
    JButton btnsave = new JButton("OK");
    
    public GUI() {
        setTitle("Form Data Diri");
        setDefaultCloseOperation(3);
        setSize(350,250);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rblaki);
        group.add(rbperempuan);
        
        setLayout(null);
        add(lnama);
        add(fnama);
        add(lalamat);
        add(falamat);
        add(ljeniskelamin);
        add(rblaki);
        add(rbperempuan);
        add(lagama);
        add(cmbagama);
        add(lstatusnikah);
        add(rbnikah);
        add(rblajang);
        add(btnsave);
        
        lnama.setBounds (10,10,120,20);
        fnama.setBounds (130,10,150,20);
        lalamat.setBounds (10,40,120,20);
        falamat.setBounds (130,40,150,20);
        ljeniskelamin.setBounds (10,70,120,20);
        rblaki.setBounds (130,70,100,20);
        rbperempuan.setBounds (230,70,100,20);
        lagama.setBounds (10,100,150,20);
        cmbagama.setBounds (130,100,150,20);
        lstatusnikah.setBounds (10,130,120,20);
        rbnikah.setBounds (130,130,100,20);
        rblajang.setBounds (230,130,150,20);
        btnsave.setBounds (100,160,120,20);
        setVisible(true);
    }
}