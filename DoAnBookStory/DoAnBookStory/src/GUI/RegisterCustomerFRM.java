/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DTO.Account;
import DTO.Check_Error;
import DTO.KhachHang;
import DAL.ReadDataFromSQL;
import DAL.WriteDataToSQL;
import com.toedter.calendar.JDateChooser;
import DTO.RegisterCustomerController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Customizer;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class RegisterCustomerFRM extends javax.swing.JFrame implements ActionListener {

    public static final int LOGIN = 1;
    public static final int MANAGE = 2;
    private int optionRegister;

    /**
     * Creates new form RegisterFRM
     */
    private LoginFRM log;
    private Check_Error check = new Check_Error();
    private RegisterCustomerController registerController;
    private homeManage homeManage;
    private KhachHang customer;
    private DTO.Account account;
    private ArrayList<KhachHang> listCustomer;
    private ArrayList<Account> accountsNoIsDel;
    private DAL.ReadDataFromSQL readData;

    public RegisterCustomerFRM(LoginFRM log, int option) {
        this();
        check = new Check_Error();

        this.setLocationRelativeTo(null);
        this.log = log;
        homeManage = new homeManage();
        readData = new DAL.ReadDataFromSQL();
        this.listCustomer = (ArrayList<KhachHang>) readData.readCustomerNoIsDel();
        if (this.registerController == null) {
            this.registerController = new RegisterCustomerController(this);
        }
        accountsNoIsDel = (ArrayList<Account>) readData.readAccountNoIsDel();
        this.optionRegister = option;
    }

    public RegisterCustomerFRM() {
        initComponents();
        check = new Check_Error();
        addBtnGr_Sex();
        addActionListener();
        this.setLocationRelativeTo(null);
        this.accountsNoIsDel = new ArrayList<Account>();
        this.accountsNoIsDel = (ArrayList<Account>) DAL.ReadDataFromSQL.readAccountNoIsDel();
    }

    public RegisterCustomerFRM(GUI.homeManage homeManage, ArrayList<KhachHang> customers) {
        this();
        this.homeManage = homeManage;
        this.listCustomer = customers;
    }

    public RegisterCustomerFRM(GUI.homeManage homeManage, ArrayList<KhachHang> customers, int option) {
        this(homeManage, customers);
        this.optionRegister = option;
    }

    public homeManage getHomeManage() {

        return homeManage;
    }

    public void setHomeManage(homeManage homeManage) {
        this.homeManage = homeManage;
    }

    public KhachHang getCustomer() {
        return customer;
    }

    public void setCustomer(KhachHang customer) {
        this.customer = customer;
    }

    public Account getAccount() {
        return account;
    }

    //geter
    public void setAccount(Account account) {
        this.account = account;
    }

    public LoginFRM getLog() {
        return log;
    }

    public Check_Error getCheck() {
        return check;
    }

    public JButton getBtnCancle() {
        return btnCancle;
    }

    public JTextField getTxtAddress() {
        return txtAddress;
    }

    public JButton getBtnSign() {
        return btnSign;
    }

    public ButtonGroup getButtonGroup_Sex() {
        return buttonGroup_Sex;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPasswordField getTxtRePassword() {
        return txtRePassword;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public JRadioButton getjRadioNam() {
        return jRadioNam;
    }

    public JRadioButton getjRadioNu() {
        return jRadioNu;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getLbAccount() {
        return lbAccount;
    }

    public JLabel getLbEmail() {
        return lbEmail;
    }

    public JLabel getLbPass() {
        return lbPass;
    }

    public JLabel getLbRePass() {
        return lbRePass;
    }

    public JTextField getTxtAccount() {
        return txtAccount;
    }

   

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JLabel getLbPhone() {
        return lbPhone;
    }

    public JTextField getTxtPhone() {
        return txtPhone;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setLbAccount(JLabel lbAccount) {
        this.lbAccount = lbAccount;
    }

    public void setLbEmail(JLabel lbEmail) {
        this.lbEmail = lbEmail;
    }

    public void setLbPass(JLabel lbPass) {
        this.lbPass = lbPass;
    }

    public void setLbRePass(JLabel lbRePass) {
        this.lbRePass = lbRePass;
    }

    //setter
    public void setTxtAccount(JTextField txtAccount) {
        this.txtAccount = txtAccount;
    }

    public void setLog(LoginFRM log) {
        this.log = log;
    }

    public void setCheck(Check_Error check) {
        this.check = check;
    }

    public void setBtnCancle(JButton btnCancle) {
        this.btnCancle = btnCancle;
    }

    public void setBtnSign(JButton btnSign) {
        this.btnSign = btnSign;
    }

    public void setButtonGroup_Sex(ButtonGroup buttonGroup_Sex) {
        this.buttonGroup_Sex = buttonGroup_Sex;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public Box.Filler getFiller1() {
        return filler1;
    }

    public void setFiller1(Box.Filler filler1) {
        this.filler1 = filler1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public void setjRadioNam(JRadioButton jRadioNam) {
        this.jRadioNam = jRadioNam;
    }

    public void setjRadioNu(JRadioButton jRadioNu) {
        this.jRadioNu = jRadioNu;
    }


    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public int getOptionRegister() {
        return optionRegister;
    }

    public void setOptionRegister(int optionRegister) {
        this.optionRegister = optionRegister;
    }

    public ArrayList<KhachHang> getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(ArrayList<KhachHang> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public ArrayList<Account> getAccountsNoIsDel() {
        return accountsNoIsDel;
    }

    public void setAccountsNoIsDel(ArrayList<Account> accountsNoIsDel) {
        this.accountsNoIsDel = accountsNoIsDel;
    }

    public ReadDataFromSQL getReadData() {
        return readData;
    }

    public void setReadData(ReadDataFromSQL readData) {
        this.readData = readData;
    }

    public JTextField getTxtBirthday() {
        return txtBirthday;
    }

    public void setTxtBirthday(JTextField txtBirthday) {
        this.txtBirthday = txtBirthday;
    }

   

    public void setTxtName(JTextField txtName) {
        this.txtName = txtName;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public void setTxtRePassword(JPasswordField txtRePassword) {
        this.txtRePassword = txtRePassword;
    }

    public RegisterCustomerController getRegisterController() {
        return registerController;
    }

    public void setRegisterController(RegisterCustomerController registerController) {
        this.registerController = registerController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Sex = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtRePassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jRadioNam = new javax.swing.JRadioButton();
        jRadioNu = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSign = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        lbAccount = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        lbRePass = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lbPhone = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        txtBirthday = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Re Password:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtRePassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRePassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtRePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRePasswordActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giới tính", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jRadioNam.setBackground(new java.awt.Color(255, 255, 255));
        jRadioNam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioNam.setText("Nam");
        jRadioNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNamActionPerformed(evt);
            }
        });

        jRadioNu.setBackground(new java.awt.Color(255, 255, 255));
        jRadioNu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioNu.setText("Nữ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jRadioNam, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioNu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioNam)
                    .addComponent(jRadioNu)))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Birthday:");

        jLabel9.setBackground(new java.awt.Color(0, 153, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ĐĂNG_KÝ.png"))); // NOI18N
        jLabel9.setText("Đăng Ký");
        jLabel9.setOpaque(true);

        btnSign.setBackground(new java.awt.Color(0, 204, 0));
        btnSign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSign.setForeground(new java.awt.Color(255, 255, 255));
        btnSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ĐĂNG_KÝ.png"))); // NOI18N
        btnSign.setText("ĐĂNG KÝ");

        btnCancle.setBackground(new java.awt.Color(255, 0, 0));
        btnCancle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancle.setForeground(new java.awt.Color(242, 242, 242));
        btnCancle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/CANCEL.png"))); // NOI18N
        btnCancle.setText("HỦY BỎ");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 0, 255));
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("(YYYY-MM-DD)");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Account: ");

        txtAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAccount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountActionPerformed(evt);
            }
        });

        lbEmail.setForeground(new java.awt.Color(255, 0, 0));
        lbEmail.setText(" ");

        lbAccount.setForeground(new java.awt.Color(255, 0, 0));
        lbAccount.setText(" ");

        lbPass.setForeground(new java.awt.Color(255, 0, 0));
        lbPass.setText(" ");

        lbRePass.setForeground(new java.awt.Color(255, 0, 0));
        lbRePass.setText(" ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Address:");

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Phone:");

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        lbPhone.setForeground(new java.awt.Color(255, 0, 0));
        lbPhone.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 99, Short.MAX_VALUE))
                            .addComponent(lbRePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(txtBirthday))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 707, Short.MAX_VALUE))
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnSign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancle)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(lbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(2, 2, 2)
                        .addComponent(lbAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(lbPass)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRePass)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPhone)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtRePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRePasswordActionPerformed

    private void jRadioNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioNamActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancleActionPerformed

    private void txtAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
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
//            java.util.logging.Logger.getLogger(RegisterCustomerFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegisterCustomerFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegisterCustomerFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegisterCustomerFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegisterCustomerFRM().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnSign;
    private javax.swing.ButtonGroup buttonGroup_Sex;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioNam;
    private javax.swing.JRadioButton jRadioNu;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbRePass;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JPasswordField txtRePassword;
    // End of variables declaration//GEN-END:variables

    private void addBtnGr_Sex() {
        this.buttonGroup_Sex.add(jRadioNam);
        this.buttonGroup_Sex.add(jRadioNu);
    }

    private void addActionListener() {
        registerController = new RegisterCustomerController(this);
        this.btnSign.addActionListener(this);
        this.btnCancle.addActionListener(registerController);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(btnSign)) {
            var name = getTxtName().getText().trim();
            var email = getTxtEmail().getText().trim();
            var account = getTxtAccount().getText().trim();
            var pass = getTxtPassword().getText().trim();
            var rePass = getTxtRePassword().getText().trim();
            var address = getTxtAddress().getText().trim();
            var phone = getTxtPhone().getText().trim();
            var BirthDay = this.txtBirthday.getText();
            String checksex = "false";
            Account acc = new Account();
            KhachHang KH = new KhachHang();

            if (getjRadioNam().isSelected()) {
                checksex = "1";
            } else if (getjRadioNu().isSelected()) {
                checksex = "0";
            }
            KH.setSex(checksex);
            if (!name.isEmpty() && !email.isEmpty() && !pass.isEmpty() && !rePass.isEmpty()
                    && (getjRadioNam().isSelected() || getjRadioNu().isSelected()) && !phone.isEmpty() && !address.isEmpty()) {
                if (!check.check_Email(email)) {
                    getLbEmail().setText("Email không hợp Lệ!");
                } else {
                    KH.setEmail(email);
                    getLbEmail().setText(" ");
                }
                if (!check.check_NumberPhone(phone)) {
                    getLbPhone().setText("Số điện thoại không hợp Lệ!");
                } else {
                    KH.setPhone(phone);
                    getLbPhone().setText(" ");
                }
                if (!check.check_PassWord(pass)) {
                    getLbPass().setText("Mật khẩu phải có ít nhất 1 kí tự thường, 1 kí tự In hoa, 1 Số, 1 kí tự Đặc Biệt(#?!@$%^&*-)!");
                } else {
                    acc.setPassword(pass);
                    getLbPass().setText(" " );
                }
                if (!pass.equals(rePass)) {
                    getLbRePass().setText("Nhập lại PassWord không đúng!");
                } else {
                    getLbRePass().setText(" ");
                }
                if(!check.check_BirthDay(BirthDay))
                    JOptionPane.showMessageDialog(rootPane,"Ngày sinh: yyyy-MM-dd");
                
                if (pass.equals(rePass) && check.check_PassWord(pass) && check.check_NumberPhone(phone) && check.check_Email(email)) {
                                int c = 0;
                    acc = new Account(account, pass, "Customer");
                    KH = new KhachHang(name, checksex, phone, address, BirthDay, acc, email, WriteDataToSQL.getDay(), acc);
                    DTO.upDateId.updateIDCustomer(KH);
                    int count = 0;
                    for (Account a : accountsNoIsDel) {
                        if (account.equals(a.getAccount())) {
                            count++;
                        }
                    }
                    if (count > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Tài Khoản Đã Tồn Tại!");
                    } else {
                        if (optionRegister == GUI.RegisterCustomerFRM.LOGIN) {

                            this.log.addCustomerCallBack(KH, c);
                            if (c == -1) {
//                                JOptionPane.showMessageDialog(rootPane, "Sai Ngày Tháng!");
                                dispose();
                            }
                            System.out.println("1");
                        } else if (optionRegister == GUI.RegisterCustomerFRM.MANAGE) {
                            c=this.homeManage.addCustomerCallBack(KH,c);
//                            System.out.println(c);

                        }
                        if (c != -1) {
                           dispose();
                            JOptionPane.showMessageDialog(rootPane, "Bạn Đã Đăng Kí Thành Công!");
                         }

                    }

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Các ô không được để trống!");
            }
        }
    }

}
