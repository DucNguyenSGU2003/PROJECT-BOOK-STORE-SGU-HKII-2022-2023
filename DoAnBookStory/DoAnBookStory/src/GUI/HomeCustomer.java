/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAL.FindDataFromSQL;
import DTO.Account;
import DTO.Book;
import DTO.KhachHang;
import DAL.ReadDataFromSQL;
import DTO.HomeCustomerController;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author DELL
 */
public class HomeCustomer extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form HomeCustomer
     */


     ReadDataFromSQL readData = new ReadDataFromSQL();
    private ArrayList<KhachHang> customers = new ArrayList<KhachHang>();
    private ArrayList<DTO.Book> books= new ArrayList<DTO.Book>();
    private Account preAcc;
    private KhachHang preCus;
    private JPanel[] panelBook;
    private JLabel[] lb;
    private JLabel[] lbDetails;
    private JPanel[] pnBook;
    private JPanel[] panelflow;
    private JLabel[] lbs;
    private JButton[] btns;
    private Book saleBook;
    private DAL.FindDataFromSQL readBookFind;

    public HomeCustomer(LoginFRM log) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.preAcc = log.getAccPre();
        readBookFind=new FindDataFromSQL();
        System.out.println(this.preAcc.getAccount());
        customers = new ArrayList<KhachHang>();
        customers = (ArrayList<KhachHang>) readData.readCustomer();
        books=(ArrayList<Book>) DAL.ReadDataFromSQL.readBook();
        popBook(books);
        this.btnOut.setMnemonic(KeyEvent.VK_R);

        inforOfAccount(log);
    }

//
    public Account getPreAcc() {
        return preAcc;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Book getSaleBook() {
        return saleBook;
    }

    public void setSaleBook(Book saleBook) {
        this.saleBook = saleBook;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JPanel getPnMain() {
        return pnMain;
    }

    public void setPnMain(JPanel pnMain) {
        this.pnMain = pnMain;
    }

    public void setPreAcc(Account preAcc) {
        this.preAcc = preAcc;
    }

    public ArrayList<KhachHang> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<KhachHang> customers) {
        this.customers = customers;
    }

    public JPanel getJpanelHome() {
        return JpanelHome;
    }

    public void setJpanelHome(JPanel JpanelHome) {
        this.JpanelHome = JpanelHome;
    }

    public JPanel getJpanelInfo() {
        return JpanelInfo;
    }

    public void setJpanelInfo(JPanel JpanelInfo) {
        this.JpanelInfo = JpanelInfo;
    }

    public JButton getBtn_Edit() {
        return btn_Edit;
    }

    public void setBtn_Edit(JButton btn_Edit) {
        this.btn_Edit = btn_Edit;
    }

    public JLabel getLbHome() {
        return lbHome;
    }

    public void setLbHome(JLabel lbHome) {
        this.lbHome = lbHome;
    }

    public JLabel getLbInfo() {
        return lbInfo;
    }

    public void setLbInfo(JLabel lbInfo) {
        this.lbInfo = lbInfo;
    }

    public JPanel getPanelMenu() {
        return panelMenu;
    }

    public void setPanelMenu(JPanel panelMenu) {
        this.panelMenu = panelMenu;
    }

    public JPanel getPanelParent() {
        return panelParent;
    }

    public ReadDataFromSQL getReadData() {
        return readData;
    }

    public void setReadData(ReadDataFromSQL readData) {
        this.readData = readData;
    }

    public KhachHang getPreCus() {
        return preCus;
    }

    public void setPreCus(KhachHang preCus) {
        this.preCus = preCus;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JLabel getLbAccount() {
        return lbAccount;
    }

    public void setLbAccount(JLabel lbAccount) {
        this.lbAccount = lbAccount;
    }

    public JLabel getLbAddress() {
        return lbAddress;
    }

    public void setLbAddress(JLabel lbAddress) {
        this.lbAddress = lbAddress;
    }

    public JLabel getLbMail() {
        return lbMail;
    }

    public void setLbMail(JLabel lbMail) {
        this.lbMail = lbMail;
    }

    public JLabel getLbMenu() {
        return lbMenu;
    }

    public void setLbMenu(JLabel lbMenu) {
        this.lbMenu = lbMenu;
    }

    public JLabel getLbName() {
        return lbName;
    }

    public void setLbName(JLabel lbName) {
        this.lbName = lbName;
    }

    public JLabel getLbPass() {
        return lbPass;
    }

    public void setLbPass(JLabel lbPass) {
        this.lbPass = lbPass;
    }

    public JLabel getLbPhone() {
        return lbPhone;
    }

    public void setLbPhone(JLabel lbPhone) {
        this.lbPhone = lbPhone;
    }

    public JLabel getLbPreview() {
        return lbPreview;
    }

    public void setLbPreview(JLabel lbPreview) {
        this.lbPreview = lbPreview;
    }

    public JLabel getLbScores() {
        return lbScores;
    }

    public void setLbScores(JLabel lbScores) {
        this.lbScores = lbScores;
    }

    public void setPanelParent(JPanel panelParent) {
        this.panelParent = panelParent;
    }

    public JPanel getPnPrivate() {
        return pnPrivate;
    }

    public void setPnPrivate(JPanel pnPrivate) {
        this.pnPrivate = pnPrivate;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbHome = new javax.swing.JLabel();
        lbInfo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbMenu = new javax.swing.JLabel();
        lbPreview = new javax.swing.JLabel();
        panelParent = new javax.swing.JPanel();
        JpanelHome = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnMain = new javax.swing.JPanel();
        JpanelInfo = new javax.swing.JPanel();
        pnPrivate = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbScores = new javax.swing.JLabel();
        lbMail = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbAccount = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        btn_Edit = new javax.swing.JButton();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BOOKSTORE.png"))); // NOI18N
        jLabel3.setText("BOOK STORE");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbHome.setBackground(new java.awt.Color(255, 153, 51));
        lbHome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbHome.setForeground(new java.awt.Color(255, 255, 255));
        lbHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/HOME.png"))); // NOI18N
        lbHome.setText("        HOME");
        lbHome.setOpaque(true);
        lbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbHomeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbHomeMouseReleased(evt);
            }
        });

        lbInfo.setBackground(new java.awt.Color(255, 153, 51));
        lbInfo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbInfo.setForeground(new java.awt.Color(255, 255, 255));
        lbInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thông tin.png"))); // NOI18N
        lbInfo.setText("INFORMATION");
        lbInfo.setOpaque(true);
        lbInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbInfoMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 0, 153));
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("______________________________________________________");

        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("______________________________________________________");

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ĐĂNGXUAT.png"))); // NOI18N
        jButton2.setText("       LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(lbInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbHome, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lbInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(51, 51, 255));

        lbMenu.setBackground(new java.awt.Color(255, 255, 255));
        lbMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbMenu.setForeground(new java.awt.Color(51, 51, 255));
        lbMenu.setText(" | | |");
        lbMenu.setOpaque(true);
        lbMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMenuMouseClicked(evt);
            }
        });

        lbPreview.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbPreview.setForeground(new java.awt.Color(51, 51, 255));
        lbPreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPreview.setText("CHÀO MỪNG BẠN ĐẾN VỚI BOOKSTORE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPreview)
                    .addComponent(lbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelParent.setLayout(new java.awt.CardLayout());

        JpanelHome.setBackground(new java.awt.Color(153, 153, 153));

        pnMain.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1127, Short.MAX_VALUE)
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnMain);

        javax.swing.GroupLayout JpanelHomeLayout = new javax.swing.GroupLayout(JpanelHome);
        JpanelHome.setLayout(JpanelHomeLayout);
        JpanelHomeLayout.setHorizontalGroup(
            JpanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1117, Short.MAX_VALUE)
        );
        JpanelHomeLayout.setVerticalGroup(
            JpanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelParent.add(JpanelHome, "panelHome");

        JpanelInfo.setBackground(new java.awt.Color(153, 255, 255));

        pnPrivate.setBackground(new java.awt.Color(255, 255, 255));
        pnPrivate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Cá Nhân", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Họ Tên:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Địa Chỉ:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Số Điện Thoại:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Mail:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("Điểm:");

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("jLabel1");

        lbScores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbScores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbScores.setText("jLabel1");

        lbMail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMail.setText("jLabel1");

        lbPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPhone.setText("jLabel1");

        lbAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAddress.setText("jLabel1");

        javax.swing.GroupLayout pnPrivateLayout = new javax.swing.GroupLayout(pnPrivate);
        pnPrivate.setLayout(pnPrivateLayout);
        pnPrivateLayout.setHorizontalGroup(
            pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrivateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addGroup(pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addGroup(pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMail, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbScores, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnPrivateLayout.setVerticalGroup(
            pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrivateLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbName))
                .addGap(20, 20, 20)
                .addGroup(pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbAddress))
                .addGroup(pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPrivateLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrivateLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbMail))
                .addGap(20, 20, 20)
                .addGroup(pnPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lbScores))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin tài khoản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel2.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Tài Khoản:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Mật Khẩu:");

        lbAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAccount.setText("jLabel22");

        lbPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPass.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lbAccount))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lbPass))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_Edit.setBackground(new java.awt.Color(51, 51, 255));
        btn_Edit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/CẬP_NHẬT.png"))); // NOI18N
        btn_Edit.setText("SỬA");
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelInfoLayout = new javax.swing.GroupLayout(JpanelInfo);
        JpanelInfo.setLayout(JpanelInfoLayout);
        JpanelInfoLayout.setHorizontalGroup(
            JpanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelInfoLayout.createSequentialGroup()
                .addGroup(JpanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelInfoLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(JpanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JpanelInfoLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        JpanelInfoLayout.setVerticalGroup(
            JpanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelInfoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(pnPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_Edit)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        panelParent.add(JpanelInfo, "PanelInfor");

        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFind.setText("Tìm Kiếm Theo Tên Sách:");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOut.setText("<Trở về");
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });
        btnOut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnOutKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panelParent, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFind)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOut, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOut))
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseClicked
        openMenuBar(panelMenu, 317, 565, 1);
        this.lbMenu.setEnabled(false);
    }//GEN-LAST:event_lbMenuMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        closeMenuBar(panelMenu, 317, 565, 1);
        this.lbMenu.setEnabled(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseClicked
        panelParent.removeAll();
        panelParent.add(this.JpanelHome);
        panelParent.repaint();
        panelParent.revalidate();
        this.lbPreview.setText("TRANG CHỦ");
        this.txtFind.setEnabled(true);
        this.btnFind.setEnabled(true);
        this.btnOut.setEnabled(true);
    }//GEN-LAST:event_lbHomeMouseClicked

    private void lbHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseEntered
        setEnterLB(this.lbHome);
    }//GEN-LAST:event_lbHomeMouseEntered

    private void lbHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseReleased
        // TODO add your handling code here:
        this.lbHome.setBackground(Color.ORANGE);
        this.lbHome.setOpaque(true);
    }//GEN-LAST:event_lbHomeMouseReleased

    private void lbHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseExited
        // TODO add your handling code here:
        setExitLB(this.lbHome);
    }//GEN-LAST:event_lbHomeMouseExited

    private void lbInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfoMouseClicked
        panelParent.removeAll();
        panelParent.add(this.JpanelInfo);
        panelParent.repaint();
        panelParent.revalidate();
        this.lbPreview.setText("THÔNG TIN CỦA BẠN");
        this.txtFind.setEnabled(false);
        this.btnFind.setEnabled(false);
        this.btnOut.setEnabled(false);
    }//GEN-LAST:event_lbInfoMouseClicked

    private void lbInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfoMouseEntered
        // TODO add your handling code here
        setEnterLB(this.lbInfo);
    }//GEN-LAST:event_lbInfoMouseEntered

    private void lbInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfoMouseExited
        setExitLB(this.lbInfo);
    }//GEN-LAST:event_lbInfoMouseExited

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        EditCustomerDialog editCustomerDialog = new EditCustomerDialog(this, rootPaneCheckingEnabled, this, preCus, EditCustomerDialog.LOCATION_CUSTOMER);
        editCustomerDialog.setVisible(true);

    }//GEN-LAST:event_btn_EditActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.
                dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed


    }//GEN-LAST:event_txtFindActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        this.pnMain.removeAll();
        var nameFind = txtFind.getText();
        books.clear();
        books = (ArrayList<Book>) readBookFind.findEmployeeById(nameFind);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        for (DTO.Book b : books) {
            {
                System.out.println(b.toString());
            }

        }
        System.out.println(books.size());
        popBook(books);
        panelParent.repaint();
        panelParent.revalidate();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        books=(ArrayList<Book>) DAL.ReadDataFromSQL.readBook();
        popBook(books);
    }//GEN-LAST:event_btnOutActionPerformed

    private void btnOutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnOutKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOutKeyPressed

    private JLabel setEnterLB(JLabel jLabel) {
        jLabel.setBackground(Color.GRAY);
        jLabel.setOpaque(true);
        return jLabel;
    }

    private JLabel setExitLB(JLabel jLabel) {
        jLabel.setBackground(Color.ORANGE);
        jLabel.setOpaque(true);
        return jLabel;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HomeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HomeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HomeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HomeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeCustomer(new LoginFRM()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelHome;
    private javax.swing.JPanel JpanelInfo;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbHome;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbMail;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbPreview;
    private javax.swing.JLabel lbScores;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelParent;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnPrivate;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables

    public void openMenuBar(JPanel panel, int width, int hight, int speed) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    panel.setSize(i, hight);
                    try {
                        if (i % 2 == 0) {
                            Thread.sleep(speed);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HomeCustomer.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

        }).start();
    }

    public void closeMenuBar(JPanel panel, int width, int hight, int speed) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = width; i > 0; i--) {
                    panel.setSize(i, hight);
                    try {
                        if (i % 2 == 0) {
                            Thread.sleep(speed);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HomeCustomer.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }).start();
    }

    private void inforOfAccount(LoginFRM log) {
        this.lbAccount.setText(log.getAccPre().getAccount());
        this.lbPass.setText(log.getAccPre().getPassword());
        this.customers = (ArrayList<KhachHang>) readData.readCustomer();
        this.preCus = new KhachHang("", "", "", "", "", log.getAccPre(), "", "");
        for (KhachHang cus : customers) {
            if (cus.getAccount1().equals(log.getAccPre().getAccount())) {
                preCus = cus;
                break;
            }
        }
        this.lbMail.setText(this.preCus.getEmail());
        this.lbAddress.setText(this.preCus.getDiaChi());
        this.lbName.setText(this.preCus.getTenKH());
        this.lbPhone.setText(this.preCus.getPhone());
        this.lbScores.setText(this.preCus.getDiem() + "");
    }

    void updateDataCallBack(KhachHang customer) {
        loadData(customer);
    }

    private void loadData(KhachHang cus) {
        this.lbAccount.setText(cus.getAccount().getAccount());
        this.lbAddress.setText(cus.getDiaChi());
        this.lbMail.setText(cus.getEmail());
        this.lbName.setText(cus.getTenKH());
        this.lbPass.setText(cus.getAccount().getPassword());
        this.lbPhone.setText(cus.getPhone());
        this.lbScores.setText(cus.getDiem() + "");
    }

    private void popBook(ArrayList<DTO.Book> bookss) {
       
        
        this.pnMain.removeAll();
        int soLuongPanel = ((bookss.size()) / 4) + 1;
        this.pnMain.setLayout(new GridLayout(soLuongPanel, 1));
        panelflow = new JPanel[soLuongPanel + 1];
        for (int i = 0; i < soLuongPanel + 1; i++) {
            panelflow[i] = new JPanel(new FlowLayout(FlowLayout.LEADING, 55, 60));
            panelflow[i].setBackground(Color.pink);
            panelflow[i].setSize(1000, 3500);
        }
        pnBook = new JPanel[bookss.size()];
        for (int i = 0; i < bookss.size(); i++) {
            pnBook[i] = new JPanel(new BorderLayout());
            pnBook[i].setSize(200, 350);
        }
        lbs = new JLabel[bookss.size()];
        btns = new JButton[bookss.size()];
        //thêm sách
        int i = -1;
        int k = 0;
        int ii = 0;
        for (DTO.Book b : bookss) {
           
            k += 1;
            i += 1;
         //   System.out.println(b.getSourceIMG());
            if (k % 5 == 0) {
                k = 1;
                ii++;
            }
   //         lbs[i] = new JLabel(new ImageIcon(b.getSourceIMG()));
//             lbs[i] = new JLabel(new ImageIcon(getClass().getResource(b.getSourceIMG()) ));
           // System.out.println(getClass().getResource(b.getSourceIMG()));
             if(b.getSourceIMG().contains("/"))
            {
                lbs[i] = new JLabel(new ImageIcon(getClass().getResource(b.getSourceIMG())));
            }else lbs[i] = new JLabel(new ImageIcon(b.getSourceIMG()));
            lbs[i].setSize(200, 300);
                
           
           
           
            lbs[i].setSize(200, 300);
            btns[i] = new JButton("Đặt Hàng");
            btns[i].setBackground(Color.BLACK);
            btns[i].setForeground(Color.WHITE);
            pnBook[i] = new JPanel(new BorderLayout());
            pnBook[i].add(lbs[i], BorderLayout.CENTER);
            pnBook[i].add(btns[i], BorderLayout.SOUTH);
            panelflow[ii].
                    add(pnBook[i]);

        }
        for (int x = 0; x < soLuongPanel; x++) {
            pnMain.add(panelflow[x]);
        }
        panelParent.repaint();
        panelParent.revalidate();
                    addActionListener(btns);


    }
    
//    
//    private void popBook(ArrayList<BUS.Book> bookss) {
//
//        this.pnMain.removeAll();
//        int soLuongPanel = ((bookss.size()) / 4) + 1;
//        this.pnMain.setLayout(new GridLayout(soLuongPanel, 1));
//        panelflow = new ArrayList<JPanel>();
//        for (int i = 0; i < soLuongPanel + 1; i++) {
//
//            JPanel pn = new JPanel(new FlowLayout(FlowLayout.CENTER, 60, 60));
//            pn.setBackground(Color.pink);
//            pn.setSize(1000, 3500);
//            panelflow.add(pn);
//        }
//        pnBook = new ArrayList<JPanel>();
//        for (int i = 0; i < bookss.size(); i++) {
//            JPanel pn = new JPanel(new BorderLayout());
//            pn.setSize(200, 350);
//            pnBook.add(pn);
//        }
//        lbs = new ArrayList<JLabel>();
//        btns = new ArrayList<JButton>();
//        //thêm sách
//        int i = -1;
//        int k = 0;
//        int ii = 0;
//        for (BUS.Book b : bookss) {
//            k += 1;
//            i += 1;
//            System.out.println(b.toString());
//            if (k % 5 == 0) {
//                k = 1;
//                ii++;
//            }
//            JLabel lb = new JLabel(new ImageIcon(b.getSourceIMG()));
//            lb.setSize(200, 300);
//            this.lbs.add(lb);
//            JButton btn = new JButton("Đặt Hàng");
//            btn.setBackground(Color.BLACK);
//            btn.setForeground(Color.WHITE);
//            btns.add(btn);
//            JPanel pnbook = new JPanel(new BorderLayout());
//            pnbook.add(lb, BorderLayout.CENTER);
//            pnbook.add(btn, BorderLayout.SOUTH);
//            panelflow.add(ii, panelMenu);
//
//        }
//        for (int x = 0; x < soLuongPanel; x++) {
//            pnMain.add(panelflow.get(x));
//        }
////        panelParent.repaint();
////        panelParent.revalidate();
//
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var src = e.getSource();
        for (int i = 0; i < this.books.size(); i++) {
            if (src.equals(btns[i])) {
                saleBook = this.books.get(i);
                GUI.Sale sale = new Sale(this, rootPaneCheckingEnabled, this, saleBook);
                sale.setVisible(true);
                break;
            }

        }
    }

    

    private void addActionListener(JButton[] btns) {
        for (int i = 0; i < this.books.size(); i++) {
            this.btns[i].addActionListener(this);

        }
    }
}

