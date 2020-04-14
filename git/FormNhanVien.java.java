/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaapplication3;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Do Thi Thanh Mui
 */
public class FormNhanVien implements ActionListener{
    private JFrame f;
    JButton btn[];
    JButton btnDau;
    JButton btnArr[];
    JLabel lblThongTin;
    JLabel lblThongTinArr[];
    JTextField txtThongTin;
    JTextField txtTTLienHe1[];
    JTextField txtTTLienHe[];
     JLabel lblTTLH1[];
    JLabel lblTTLH2[];
    JLabel lblTT[];
    JDateChooser dateTT[];
    public FormNhanVien(){
        init();
    }
    public final void init(){
        f=new JFrame();
        f.setLayout(null);
        JPanel pnl1=CreatePanel_ThemXoaSua(f);
        f.add(pnl1);
        pnl1.setBounds(0, 0, 800, 30);
        //TT cơ bản
        JPanel pnlTTCB=ThongTinCoBan();
        pnlTTCB.setBounds(10,110,350,240);
        pnlTTCB.setBorder(BorderFactory.createLineBorder(Color.BLUE));
         f.add(pnlTTCB);
         //Thông tin liên hệ
        JPanel pnlTTLH=TTLienHe();
        pnlTTLH.setBounds(10,380,773,100);
        pnlTTLH.setBorder(BorderFactory.createLineBorder(Color.blue));
           f.add(pnlTTLH);
     //TT phai cử
       JPanel pnlTTPhaiCu=TTPhaiCu(); 
       pnlTTPhaiCu.setBorder(BorderFactory.createLineBorder(Color.blue));
        pnlTTPhaiCu.setBounds(10,490,773,200);
        f.add(pnlTTPhaiCu);
        //Số CMND
        JPanel pnlSoCMND=SoCMND();
        pnlSoCMND.setBounds(370,110,410,70);
        pnlSoCMND.setBorder(BorderFactory.createLineBorder(Color.blue));
        f.add(pnlSoCMND);
        //TT hợp đồng
        JPanel pnlTTHopDong=TTHopDong();
        pnlTTHopDong.setBounds(370,200,410,165);
        pnlTTHopDong.setBorder(BorderFactory.createLineBorder(Color.blue));
        f.add(pnlTTHopDong);
        //Title
        JPanel pnlTitle=Title();
        pnlTitle.setBounds(0,35,800,67);
       
        f.add(pnlTitle);
       f. setSize(800,650);
       f. setTitle(" QUẢN LÍ THỰC TẬP SINH NHẬT BẢN");
       f.setResizable(false);
       f. setLocation(200, 0);
       f. setVisible(true);
       f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public JPanel CreatePanel_ThemXoaSua(JFrame f){
        JPanel p1=new JPanel();
        p1.setLayout(new FlowLayout(2, 10, 3));//trái phải,khoảng cach giua button,khoang cahc tu trn xuong
        p1.setBackground(Color.red);
        btn=new JButton[3];
        
        String btnThemXoaSua[]={"Thêm","Xóa","Sửa"};
        for(int i=0;i<btnThemXoaSua.length;i++){
            btn[i]=new JButton(btnThemXoaSua[i]);
            btn[i].setName("title"+i);
          
            p1.add(btn[i]);
            btn[i].addActionListener((ActionListener)this);
        }
        return p1;
    }
    
   public JPanel ThongTinCoBan(){
       JPanel pnlThongTin=new JPanel();
       pnlThongTin.setLayout(null);
       lblThongTin=new JLabel("Thông Tin cơ bản của nhân viên",JLabel.LEFT);
      lblThongTin.setBackground(Color.blue);
      lblThongTin.setOpaque(true);
      
       pnlThongTin.add(lblThongTin);
       lblThongTin.setBounds(1,0,400,20);
       lblThongTinArr=new JLabel[6];      
       int x_lblTT=5;
        int y_lblTT=40;
       String []ThongTinCN={"Tên đầy đủ *","Ngày sinh *","Giới tính *","Dân tộc *","Hôn nhân *","Trình độ *"};
       String []cb11={"Nam","Nữ"};
     String []cb12={"Kinh","Khác"};
      String[]cb13={"Chưa kết hôn","Đã kết hôn"};
      String []cb14={"Cao đẳng","Đại học","Trung cấp"};
      JComboBox cbGT=new JComboBox(cb11);
       cbGT.setBounds(130,100,150,20);
      cbGT.setFont(new Font("Arial",Font.ITALIC,11));
        pnlThongTin.add(cbGT);
        JComboBox cbDToc=new JComboBox(cb12);
        cbDToc.setFont(new Font("Arial",Font.ITALIC,11));
         cbDToc.setBounds(130,145,150,20);
        pnlThongTin.add(cbDToc);
         JComboBox cbHNhan=new JComboBox(cb13);
          cbHNhan.setBounds(130,180,150,20);
          cbHNhan.setFont(new Font("Arial",Font.ITALIC,11));
        pnlThongTin.add(cbHNhan);
          JComboBox cbTDo=new JComboBox(cb14);
         cbTDo.setBounds(130,215,150,20);
          cbTDo.setFont(new Font("Arial",Font.ITALIC,11));
        pnlThongTin.add(cbTDo);
        txtThongTin=new JTextField();
          txtThongTin.setBounds(130,35,200,20);
           txtThongTin.setFont(new Font("Arial",Font.ITALIC,11));
        pnlThongTin.add(txtThongTin);
       for(int i=0;i<ThongTinCN.length;i++){
          lblThongTinArr[i]=new JLabel(ThongTinCN[i]); 
          pnlThongTin.add(lblThongTinArr[i]);
           lblThongTinArr[i].setForeground(Color.blue);
           lblThongTinArr[i].setFont(new Font("Arial",Font.BOLD,11));
           lblThongTinArr[i].setBounds(x_lblTT,y_lblTT,100,20);
          y_lblTT=y_lblTT+35;
       }
        JDateChooser   NgaySinh = new JDateChooser();
    NgaySinh = new JDateChooser();
	NgaySinh.setBounds(130, 70, 126, 20);
	pnlThongTin.add(NgaySinh);
       return pnlThongTin;
   }
   public JPanel TTLienHe(){
       JPanel pnlTTLH=new JPanel();
       pnlTTLH.setLayout(null);
       //Tạo textFiel tiêu đề
      JLabel lblTitle=new JLabel("Thông tin liên hệ",JLabel.LEFT);
      lblTitle.setBounds(0, 0, 800, 20);
      lblTitle.setFont(new Font("Arial",Font.BOLD,12) );
      lblTitle.setBackground(Color.blue);
      lblTitle.setOpaque(true);
       pnlTTLH.add(lblTitle);
       //Tạo mảng
      txtTTLienHe=new JTextField[3];
      lblTTLH1=new JLabel[3];
      String []lblNoiDung={"Chỗ ở hiện tại *","Hộ khẩu TT *","Nơi làm việc"};
       String []txtNoiDung={"Công Hiến,Vĩnh Bảo,Hải Phòng,Việt Nam","",""};
      int ylbl=23;//chiều cao của lable so vói panel
     for(int i=0;i<lblNoiDung.length;i++){
         lblTTLH1[i]=new JLabel(lblNoiDung[i]);
         lblTTLH1[i].setBounds(5,ylbl,100,19);
         pnlTTLH.add(lblTTLH1[i]);
         txtTTLienHe[i]=new JTextField(txtNoiDung[i]);
         txtTTLienHe[i].setBounds(120,ylbl,350,19);
         txtTTLienHe[i].setFont(new Font("Arial",Font.BOLD,11)); 
        pnlTTLH.add(txtTTLienHe[i]);
         ylbl+=25;
         }
     int ylbl2=23;
     lblTTLH2=new JLabel[3];
     String[]NoiDung2={"Thuộc tỉnh thành *","Thuộc tỉnh thành *","Nơi sinh *"};
     for(int i=0;i<NoiDung2.length;i++){
         lblTTLH2[i]=new JLabel(NoiDung2[i]);
         lblTTLH2[i].setBounds(530,ylbl2,100,20);
         lblTTLH2[i].setFont(new Font("Arial",Font.BOLD,11) );
         pnlTTLH.add(lblTTLH2[i]);
         ylbl2+=25;
     }
     String []TThanh1={"Hải Phòng","Hà Nội","Đà Nẵng"};
      String []TThanh2={"Bắc Ninh","Hà Nội","Đà Nẵng"};
      String[]NoiSinh={"Bắc Ninh","Hà Nội","Đà Nẵng"};
     JComboBox cbbTinh1=new JComboBox(TThanh1);
     cbbTinh1.setFont(new Font("Arial",Font.ITALIC,11));
     cbbTinh1.setBounds(650,23,100,20);
     pnlTTLH.add(cbbTinh1);
     JComboBox cbbTinh2=new JComboBox(TThanh2);
     cbbTinh2.setFont(new Font("Arial",Font.ITALIC,11));
              cbbTinh2.setBounds(650,48,100,20);
     pnlTTLH.add(cbbTinh2);
     JComboBox cbbNoiSinh=new JComboBox(NoiSinh);
     cbbNoiSinh.setFont(new Font("Arial",Font.ITALIC,11));
      cbbNoiSinh.setBounds(650,73,100,20);
     pnlTTLH.add(cbbNoiSinh);
       return pnlTTLH;
   }
   public JPanel TTPhaiCu(){
       JPanel pnlTTPCu=new JPanel();
       pnlTTPCu.setLayout(null);
       JLabel lblTitle=new JLabel("Thông tin phái cử",JLabel.LEFT);
       lblTitle.setBackground(Color.blue);
       lblTitle.setOpaque(true);
       lblTitle.setBounds(0,0,773,20);
       pnlTTPCu.add(lblTitle);
       lblThongTinArr=new JLabel[4];
   
       String []NoiDung1={"Tên T.Nhật *","Nghề nghiệp trước đây *","Công ty phái cử *","Số năm tu nghiệp *"};
       int y_lbl1=26;
       for(int i=0;i<NoiDung1.length;i++){
           lblThongTinArr[i]=new JLabel(NoiDung1[i]);
           lblThongTinArr[i].setFont(new Font("Arial",Font.BOLD,11) );
           lblThongTinArr[i].setBounds(5,y_lbl1,150,15);
           pnlTTPCu.add(lblThongTinArr[i]);
           y_lbl1+=35;
       }
       JTextField txtTen=new JTextField();
       pnlTTPCu.add(txtTen);
       txtTen.setBounds(200,30,150,15);
       String[]NgheNghiep={"Nhân viên bán hàng","Developer IT","CEO Tập đoàn"};
       String[]TTPcu={"","Khác"};
       JComboBox cbbNN=new JComboBox(NgheNghiep);
       pnlTTPCu.add(cbbNN);
       cbbNN.setBounds(200,65,160,15);
       cbbNN.setFont(new Font("Arial",Font.ITALIC,11));
       JComboBox cbbPhaiCu=new JComboBox(TTPcu);
       pnlTTPCu.add(cbbPhaiCu);
       cbbPhaiCu.setBounds(200,100,190,15);
       cbbPhaiCu.setFont(new Font("Arial",Font.ITALIC,11));
       
         JTextField txtTNgiep=new JTextField();
          JTextField txtThang=new JTextField();
           JTextField txtNam=new JTextField();
            JTextField txtSoNam=new JTextField();
            txtTNgiep.setBounds(130,130,70,15);
            txtTNgiep.setFont(new Font("Arial",Font.BOLD,11));
             pnlTTPCu.add(txtTNgiep);
             
            JLabel lblThang=new JLabel("Từ tháng *");
        JLabel lblNam=new JLabel("Từ năm *");
         JLabel lblSoNam=new JLabel("Số năm hiệu lực *");
           lblThang.setBounds(220,130,100,15);
             lblThang.setFont(new Font("Arial",Font.BOLD,11));
              txtThang.setFont(new Font("Arial",Font.BOLD,11));
            txtThang.setBounds(290,130,100,15);
              lblNam.setFont(new Font("Arial",Font.BOLD,11));
            lblNam.setBounds(400,130,100,15);
              txtNam.setFont(new Font("Arial",Font.BOLD,11));
             txtNam.setBounds(450,130,90,15);
              txtSoNam.setFont(new Font("Arial",Font.BOLD,11));
             lblSoNam.setBounds(550,130,150,15);
               lblSoNam.setFont(new Font("Arial",Font.BOLD,11));
              txtSoNam.setBounds(650,130,90,15);
         pnlTTPCu.add(lblThang);
           pnlTTPCu.add(lblNam);
             pnlTTPCu.add(lblSoNam);
           
             pnlTTPCu.add(txtThang);
              pnlTTPCu.add(txtNam);
                pnlTTPCu.add(txtSoNam);
                //Cái bên phải
              lblTTLH1=new JLabel[2];
              int y_lbl2=60;
              String[]NoiDung2={"Ngành nghề xin visa *","Công ty tiếp nhận *"};
                for(int i=0;i<NoiDung2.length;i++){
                    lblTTLH1[i]=new JLabel(NoiDung2[i]);
                    lblTTLH1[i].setFont(new Font("Arial",Font.BOLD,11));
                    lblTTLH1[i].setBounds(410,y_lbl2,150,15);
                    pnlTTPCu.add(lblTTLH1[i]);
                    y_lbl2+=40;
                }
                String []Nghe={"Công nhân sản xuất linh kiện điện","Bán hàng ngoài đường"};
                JComboBox cbbNghe=new JComboBox(Nghe);
                cbbNghe.setFont(new Font("Arial",Font.ITALIC,11));
                cbbNghe.setBounds(540,60,180,18);
                pnlTTPCu.add(cbbNghe);
                String []Cty={"","TNHH "};
                JComboBox cbbCty=new JComboBox(Cty);
                cbbCty.setFont(new Font("Arial",Font.ITALIC,11));
                cbbCty.setBounds(540,100,205,18);
                pnlTTPCu.add(cbbCty);
                 
                
       return pnlTTPCu;
   }
   public JPanel SoCMND(){
       JPanel pnlCMND=new JPanel();
       pnlCMND.setLayout(null);
       //Tiêu đề
       JLabel lblTitle=new JLabel("Số chứng minh nhân dân kiêm mã thành viên",JLabel.LEFT);
       lblTitle.setFont(new Font("Arial",Font.BOLD,12));
       lblTitle.setBackground(Color.blue);
       lblTitle.setOpaque(true);
       lblTitle.setBounds(0,0,410,20);
       pnlCMND.add(lblTitle);
       //Nội dung
       int x_lbl1=4;
       lblTT=new JLabel[3];
       String []NoiDung={"Số CMND *","Ngày cấp *","Nơi cấp *"};
       for(int i=0;i<NoiDung.length;i++){
           lblTT[i]=new JLabel(NoiDung[i]);//Khởi tạo mảng đối tượng Jlable
           lblTT[i].setFont(new Font("Arial",Font.BOLD,11));
           lblTT[i].setBounds(x_lbl1,20,100,15);
           pnlCMND.add(lblTT[i]);
           x_lbl1+=130;
       }
       JTextField txtCMND=new JTextField("123456789",JTextField.LEFT);
        txtCMND.setFont(new Font("Arial",Font.BOLD,11));
          txtCMND.setBounds(4,40,100,19);
       pnlCMND.add(txtCMND);
       //Ngày cấp
       JDateChooser dateNCap=new JDateChooser();
       dateNCap.setFont(new Font("Arial",Font.BOLD,11));
          dateNCap.setBounds(120,40,100,19);
       pnlCMND.add(dateNCap);
       //Nơi cấp
       String[]NoiCap={"Bắc Ninh","Quảng Ngãi","Đà Nẵng"};
       JComboBox cbbNoiCap=new JComboBox(NoiCap);
        cbbNoiCap.setFont(new Font("Arial",Font.BOLD,11));
          cbbNoiCap.setBounds(270,40,100,19);
       pnlCMND.add(cbbNoiCap);
       return pnlCMND;
   }
   public JPanel TTHopDong(){
       JPanel pnlHD=new JPanel();
       pnlHD.setLayout(null);
       JLabel lblTitle=new JLabel("Thông tin hợp đồng và hộ chiếu");
        lblTitle.setFont(new Font("Arial",Font.BOLD,12));
          lblTitle.setBounds(0,0,410,20);
           lblTitle.setBackground(Color.blue);
       lblTitle.setOpaque(true);
       //Ngày
       lblTT=new JLabel[2];
       String[]Ngay={"Ngày ký hợp đồng *","Ngày hết hạn *"};
       int x_lbl=4;
       dateTT=new JDateChooser[2];
       for(int i=0;i<Ngay.length;i++){
           lblTT[i]=new JLabel(Ngay[i]);
           pnlHD.add(lblTT[i]);
            lblTT[i].setFont(new Font("Arial",Font.BOLD,11));
           lblTT[i].setBounds(x_lbl,20,200,15);
          
           dateTT[i]=new JDateChooser();
            pnlHD.add(dateTT[i]);
             dateTT[i].setFont(new Font("Arial",Font.BOLD,11));
           dateTT[i].setBounds(x_lbl,40,100,20);
            x_lbl +=170;
       }
       //Dòng 2
        lblTTLH1=new JLabel[2];
       String[]TroCap={"Trợ cấp thực tập *","Trợ cấp tu nghiệp *"};
       int x_lb2=4;
       int x_txt2=125;
       String[]SoLuong={"5000","1990"};
      txtTTLienHe=new JTextField[2];
       for(int i=0;i<TroCap.length;i++){
           lblTTLH1[i]=new JLabel(TroCap[i]);
           pnlHD.add(lblTTLH1[i]);
            lblTTLH1[i].setFont(new Font("Arial",Font.BOLD,11));
           lblTTLH1[i].setBounds(x_lb2,75,200,15);
          
         
           txtTTLienHe[i]=new JTextField(SoLuong[i]);
             txtTTLienHe[i].setFont(new Font("Arial",Font.BOLD,11));
           txtTTLienHe[i].setBounds(x_txt2,75,50,20);
              pnlHD.add(txtTTLienHe[i]);
            x_lb2 +=210;
             x_txt2+=200;
       }
        int x_lbl3=4;
       lblTT=new JLabel[3];
       String []NoiDung={"Số hộ chiếu *","Ngày cấp *","Nơi cấp *"};
       for(int i=0;i<NoiDung.length;i++){
           lblTT[i]=new JLabel(NoiDung[i]);//Khởi tạo mảng đối tượng Jlable
           lblTT[i].setFont(new Font("Arial",Font.BOLD,11));
           lblTT[i].setBounds(x_lbl3,110,100,15);
           pnlHD.add(lblTT[i]);
           x_lbl3+=130;
       }
       JTextField txtCMND=new JTextField("",JTextField.LEFT);
        txtCMND.setFont(new Font("Arial",Font.BOLD,11));
          txtCMND.setBounds(4,130,100,19);
       pnlHD.add(txtCMND);
       //Ngày cấp
       JDateChooser dateNCap=new JDateChooser();
       dateNCap.setFont(new Font("Arial",Font.BOLD,11));
          dateNCap.setBounds(130,130,100,19);
       pnlHD.add(dateNCap);
       //Nơi cấp
       String[]NoiCap={"Bắc Ninh","Quảng Ngãi","Đà Nẵng"};
       JComboBox cbbNoiCap=new JComboBox(NoiCap);
        cbbNoiCap.setFont(new Font("Arial",Font.BOLD,11));
          cbbNoiCap.setBounds(280,130,100,19);
       pnlHD.add(cbbNoiCap);
       
        
       pnlHD.add(lblTitle);
       return pnlHD;
   }
   public JPanel Title(){
       JPanel pnlTitle=new JPanel();
       pnlTitle.setLayout(null);
       JLabel lblNoiDung1=new JLabel("QUẢN LÝ THỰC TẬP SINH NHẬT BẢN",JLabel.LEFT);
          JLabel lblNoiDung2=new JLabel("ỨNG VIÊN ĐÃ TRÚNG TUYỂN",JLabel.LEFT);
         btnDau=new JButton(">>");
           JButton btnDau1=new JButton();
          lblNoiDung1.setBounds(110,0,300,20);
           lblNoiDung1.setFont(new Font("Arial",Font.BOLD,14));
          lblNoiDung1.setForeground(Color.red);
          pnlTitle.add(lblNoiDung1);
           btnDau.setBounds(375,2,20,20);
            
           pnlTitle.add(btnDau);
              lblNoiDung2.setBounds(400,0,300,20);
               lblNoiDung2.setForeground(Color.red);
                lblNoiDung2.setFont(new Font("Arial",Font.BOLD,14));
          pnlTitle.add(lblNoiDung2);
          JLabel lblNoiDung3=new JLabel("Thông báo: dữ liệu '987654321' không bị trùng, bạn có thể sử dụng! ");
           lblNoiDung3.setBounds(130,20,370,20);
             lblNoiDung3.setFont(new Font("Arial",Font.BOLD,11));
             lblNoiDung3.setForeground(Color.blue);
          pnlTitle.add(lblNoiDung3);
          
       return pnlTitle;
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton p=(JButton)e.getSource();
        System.out.println(""+e);
        for(int i=0;i<btnArr.length;i++){
            if(p==btnArr[i]){
                System.out.println("Đây là btn"+p.getName());
            }
        }
        for(int i=0;i<btnArr.length;i++){
            if(p.getName().equals("title0")){
                System.out.println("ban dang nhap");break;
            }
            else if(p.getName().equals("title1")){
                 System.out.println("ban dang nhap ma");break;
            }
             else if(p.getName().equals("title2")){
                 System.out.println("ban dang nhap ma nnnn");break;
            }
        }
    }
     public static void main(String[]args){
        FormNhanVien FormNV=new FormNhanVien();
    }
}
