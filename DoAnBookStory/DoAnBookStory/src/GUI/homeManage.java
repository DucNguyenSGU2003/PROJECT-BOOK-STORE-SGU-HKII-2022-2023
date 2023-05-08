
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.text.ParseException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.axis.CategoryAxis;



import DTO.Account;
import DTO.Book;
import BUS.ChiTietHoaDon_BUS;
import DTO.KhachHang;
import DTO.Staff;
import DTO.Supplier;
import BUS.HoaDon_BUS;
        
import DTO.BILL_DTO;
import DAL.BILL_DAO;
import DAL.FindDataFromSQL;
import DAL.ReadDataFromSQL;
import DAL.SortUpDataToSQL;
import DAL.WriteDataToSQL;
import DTO.Book_DTO;
import DTO.ChiTietHoaDon_DTO;
import DTO.HoaDon_DTO;
import com.sun.java.accessibility.util.GUIInitializedListener;
import com.toedter.calendar.JDateChooser;
import DTO.RegisterCustomerController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.accessibility.AccessibleContext;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.util.Rotation;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author DELL
 */
public class homeManage extends javax.swing.JFrame implements ActionListener {

//    private ArrayList<BILL_DTO> bill;
    private ArrayList<Account> accounts;
    private ArrayList<KhachHang> customers;
    private ArrayList<DTO.Staff> staffs;
    private ArrayList<DTO.Supplier> suppliers;
    private ArrayList<Staff> staffsNoIsDel;
    private ArrayList<Account> accountsNoIsDel;
    private ArrayList<KhachHang> customersNoIsDel;
    private ArrayList<Supplier> suppliersNoIsDel;
    private ArrayList<HoaDon_DTO> hoaDon ; 
    private ArrayList<ChiTietHoaDon_DTO> cthd ; 
    private DAL.ReadDataFromSQL readData;
    private DAL.WriteDataToSQL writeData;
    private DefaultTableModel tblModelCustomer, tblModelStaff,
            tblModelBook, tblModelSupplier;
    DAL.FindDataFromSQL findData = new FindDataFromSQL();
    DAL.SortUpDataToSQL sortData = new SortUpDataToSQL();
    DTO.Book editBook;
    Staff staffPre;
    Staff editStaff;
    Account editAccount;
    Staff removeStaff;
    Account removeAccount;
    KhachHang editCustomer;
    LoginFRM log;
    Supplier editSupplier;
    
    ChiTietHoaDon_BUS cthd_BUS = new ChiTietHoaDon_BUS();
    HoaDon_BUS hdBUS  = new HoaDon_BUS();
    
    
    private ArrayList<Book> books;
    private ArrayList<Book> booksNoIsDel;

    public homeManage() {
        initComponents();
        this.setLocationRelativeTo(null);
        readData = new ReadDataFromSQL();
        writeData = new DAL.WriteDataToSQL();
        this.editBook = new DTO.Book();
        this.editStaff = new Staff();
        this.editAccount = new Account();
        this.removeStaff = new Staff();
        this.removeAccount = new Account();
        this.editSupplier = new DTO.Supplier();
        loadDataFromSQL();
        this.tblModelSupplier = (DefaultTableModel) this.tblSupplier.getModel();
        this.tblModelCustomer = (DefaultTableModel) this.tblCustomer.getModel();
        this.tblModelStaff = (DefaultTableModel) this.tblStaff.getModel();
        this.tblModelSupplier = (DefaultTableModel) tblSupplier.getModel();
        this.tblModelBook = (DefaultTableModel) tblBook.getModel();
        showDataCustomer(customers);
        showDataStaff(staffs);
        showSuplierToTable(suppliers);
        ShowBookToTable(books);
        showDataHoaDon(hoaDon);
        showBieuDO();
        addActionLister();
    }

    public homeManage(LoginFRM log) {
        this();
        this.log = log;
        loadInforManage(this.log.getAccPre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SapXep = new javax.swing.ButtonGroup();
        NHANVIEN_GIOITINH = new javax.swing.ButtonGroup();
        KHACHHANG_GIOITINH = new javax.swing.ButtonGroup();
        btnGroup_Sort = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        MANAGE_NHANVIEN = new javax.swing.JPanel();
        panelStaff = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jComboBox_sapXepNv = new javax.swing.JComboBox<>();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        txt_IDNhanVien = new javax.swing.JTextField();
        txt_NameNv = new javax.swing.JTextField();
        txt_LuongNv = new javax.swing.JTextField();
        txt_CCCDNhanVien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jDateChooser_NVDateCreate = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_DiaCHiNv = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jDateChooser_NvSinhNhat = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        txt_EmailNv = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_PhoneNv = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        btnAddStaff = new javax.swing.JButton();
        btnEditStaff = new javax.swing.JButton();
        btnRemoveStaff = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        MANAGE_KHACHHANG = new javax.swing.JPanel();
        panelCus = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jComboBox_SapXepKhachHang = new javax.swing.JComboBox<>();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton_GiamDanKhachHang = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        btnAddCus = new javax.swing.JButton();
        btnEditCus = new javax.swing.JButton();
        btnRemoveCus = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        txt_KhachHangID = new javax.swing.JTextField();
        txt_KhachHangName = new javax.swing.JTextField();
        txt_KhachHangEmail = new javax.swing.JTextField();
        txt_KhachHangPhone = new javax.swing.JTextField();
        txt_KhachHangScores = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_KhachHangDiaChi = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        MANAGE_BOOK = new javax.swing.JPanel();
        panelBook = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox_SapXepSach = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jTextField_IdBook = new javax.swing.JTextField();
        jTextField_TypeBook = new javax.swing.JTextField();
        jTextField_NCCBook = new javax.swing.JTextField();
        jDateChooser_DateCrateBook = new com.toedter.calendar.JDateChooser();
        jTextField_PriceBook = new javax.swing.JTextField();
        jTextField_NumberOfBook = new javax.swing.JTextField();
        jTextField_AuthorBook = new javax.swing.JTextField();
        jTextField_NameBook = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnAddBook = new javax.swing.JButton();
        btnEditBook = new javax.swing.JButton();
        btnRemoveBook = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        MANAGE_NCC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jComboBox_SapXepNCC = new javax.swing.JComboBox<>();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txt_IDNcc = new javax.swing.JTextField();
        txt_BankAccountNcc = new javax.swing.JTextField();
        txt_PhoneNcc = new javax.swing.JTextField();
        jDateChoose_ngayTaoNcc = new com.toedter.calendar.JDateChooser();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt_DiaChiNcc = new javax.swing.JTextArea();
        txt_bankNameNcc = new javax.swing.JTextField();
        txt_NameNcc = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jButton_TimkiemNcc = new javax.swing.JButton();
        btnEditSupplier = new javax.swing.JButton();
        btnRemoveSupplier = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAddSupplier = new javax.swing.JButton();
        MANAGE_HOADON = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comboBox_SapXepHD = new javax.swing.JComboBox<>();
        radio_Tang = new javax.swing.JRadioButton();
        radio_Giam = new javax.swing.JRadioButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txt_maHD = new javax.swing.JTextField();
        txt_maNV = new javax.swing.JTextField();
        txt_MaKH = new javax.swing.JTextField();
        txt_ThanhTien = new javax.swing.JTextField();
        b_TimKiem = new javax.swing.JButton();
        txt_NgayLap = new com.toedter.calendar.JDateChooser();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_HoaDon = new javax.swing.JTable();
        THONGTIN = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_ChucVu = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtPhone = new javax.swing.JLabel();
        txtBankAccount = new javax.swing.JLabel();
        txtBankName = new javax.swing.JLabel();
        txtPosition = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbpass = new javax.swing.JLabel();
        txtAccount = new javax.swing.JLabel();
        txtPass = new javax.swing.JLabel();
        btnEditManage = new javax.swing.JButton();
        MANAGE_THONGKE = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        pan_doanhThuTheoThang = new javax.swing.JPanel();
        pan_TT = new javax.swing.JPanel();
        pan_bieuDoTron = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGE");

        jTabbedPane1.setBackground(new java.awt.Color(102, 255, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTabbedPane1.setOpaque(true);

        MANAGE_NHANVIEN.setBackground(new java.awt.Color(255, 255, 255));

        panelStaff.setBackground(new java.awt.Color(255, 255, 255));

        tblStaff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Giới tính", "Ngày Sinh", "Địa Chỉ", "SĐT", "Tài Khoản NH", "Tên Ngân Hàng ", "EMAIL", "CCCD", "Lương", "Thưởng", "Tài khoản", "Ngày tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStaff.setGridColor(new java.awt.Color(204, 204, 255));
        tblStaff.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tblStaff.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tblStaff);

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp Xếp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N

        jComboBox_sapXepNv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_sapXepNv.setForeground(new java.awt.Color(0, 153, 255));
        jComboBox_sapXepNv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MÃ NV", "NAME", "SALARY", "BONUS" }));
        jComboBox_sapXepNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_sapXepNvActionPerformed(evt);
            }
        });

        SapXep.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 153, 255));
        jRadioButton3.setText("Sắp xếp giảm dần");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        SapXep.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(0, 153, 255));
        jRadioButton4.setText("Sắp xếp tăng dần");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(46, 46, 46))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_sapXepNv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBox_sapXepNv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(0, 102, 255));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Tìm_Kiếm.png"))); // NOI18N
        jButton2.setText("TÌM KIẾM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_IDNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_IDNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDNhanVienActionPerformed(evt);
            }
        });

        txt_NameNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameNvActionPerformed(evt);
            }
        });

        txt_LuongNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LuongNvActionPerformed(evt);
            }
        });
        txt_LuongNv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_LuongNvKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Lương :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 255));
        jLabel26.setText("Mã NV:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 255));
        jLabel27.setText("Tên NV:");

        jDateChooser_NVDateCreate.setDateFormatString("yyyy-MM-dd");
        jDateChooser_NVDateCreate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_NVDateCreatePropertyChange(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 255));
        jLabel28.setText("Ngày Lập:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 153, 255));
        jLabel29.setText("CCCD");

        txt_DiaCHiNv.setColumns(20);
        txt_DiaCHiNv.setRows(5);
        jScrollPane5.setViewportView(txt_DiaCHiNv);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 153, 255));
        jLabel30.setText("Địa Chỉ");

        jDateChooser_NvSinhNhat.setDateFormatString("yyyy-MM-dd");
        jDateChooser_NvSinhNhat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_NvSinhNhatPropertyChange(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 153, 255));
        jLabel31.setText("Ngày Sinh:");

        txt_EmailNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailNvActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 153, 255));
        jLabel32.setText("Email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Điện Thoại");

        txt_PhoneNv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PhoneNvKeyTyped(evt);
            }
        });

        NHANVIEN_GIOITINH.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 153, 255));
        jCheckBox1.setText("NAM");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        NHANVIEN_GIOITINH.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 153, 255));
        jCheckBox2.setText("NỮ");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 153, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Giới Tính");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel31)
                            .addComponent(jLabel1)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_EmailNv, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NameNv, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_IDNhanVien)
                            .addComponent(jDateChooser_NvSinhNhat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_NVDateCreate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_LuongNv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_CCCDNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(txt_PhoneNv))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(127, 127, 127)
                        .addComponent(jButton2)
                        .addGap(16, 16, 16))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_IDNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txt_CCCDNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txt_NameNv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_PhoneNv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_EmailNv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_NvSinhNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_LuongNv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jDateChooser_NVDateCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddStaff.setBackground(new java.awt.Color(0, 153, 255));
        btnAddStaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ADD (2).png"))); // NOI18N
        btnAddStaff.setText("THÊM");
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });

        btnEditStaff.setBackground(new java.awt.Color(102, 255, 204));
        btnEditStaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEditStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnEditStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/CẬP_NHẬT.png"))); // NOI18N
        btnEditStaff.setText("SỬA");
        btnEditStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditStaffActionPerformed(evt);
            }
        });

        btnRemoveStaff.setBackground(new java.awt.Color(255, 0, 51));
        btnRemoveStaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRemoveStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/XÓA_35.png"))); // NOI18N
        btnRemoveStaff.setText("XÓA");
        btnRemoveStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStaffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelStaffLayout = new javax.swing.GroupLayout(panelStaff);
        panelStaff.setLayout(panelStaffLayout);
        panelStaffLayout.setHorizontalGroup(
            panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStaffLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(btnAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditStaff)
                .addGap(243, 243, 243)
                .addComponent(btnRemoveStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
            .addGroup(panelStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(panelStaffLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelStaffLayout.setVerticalGroup(
            panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStaffLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemoveStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jLabel6.setBackground(new java.awt.Color(51, 153, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/NHÂN_VIÊN.png"))); // NOI18N
        jLabel6.setText("NHÂN VIÊN");
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout MANAGE_NHANVIENLayout = new javax.swing.GroupLayout(MANAGE_NHANVIEN);
        MANAGE_NHANVIEN.setLayout(MANAGE_NHANVIENLayout);
        MANAGE_NHANVIENLayout.setHorizontalGroup(
            MANAGE_NHANVIENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGE_NHANVIENLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MANAGE_NHANVIENLayout.setVerticalGroup(
            MANAGE_NHANVIENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGE_NHANVIENLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("   NHÂN VIÊN", new javax.swing.ImageIcon(getClass().getResource("/Icon/NHÂN_VIÊN.png")), MANAGE_NHANVIEN); // NOI18N

        MANAGE_KHACHHANG.setBackground(new java.awt.Color(255, 255, 255));

        panelCus.setBackground(new java.awt.Color(255, 255, 255));
        panelCus.setToolTipText("");

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Ngày Sinh", "Địa Chỉ", "SĐT", "Giới Tính", "Điểm", "Email", "Ngày Tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomer.setGridColor(new java.awt.Color(0, 0, 0));
        tblCustomer.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tblCustomer.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblCustomer);

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp Xếp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox_SapXepKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_SapXepKhachHang.setForeground(new java.awt.Color(0, 153, 255));
        jComboBox_SapXepKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MÃ KH", "TÊN KH", "SĐT", "ĐIỂM" }));
        jComboBox_SapXepKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SapXepKhachHangActionPerformed(evt);
            }
        });

        SapXep.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(0, 153, 255));
        jRadioButton5.setText("Sắp xếp tăng dần");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        SapXep.add(jRadioButton_GiamDanKhachHang);
        jRadioButton_GiamDanKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton_GiamDanKhachHang.setForeground(new java.awt.Color(0, 153, 255));
        jRadioButton_GiamDanKhachHang.setText("Sắp xếp giảm dần");
        jRadioButton_GiamDanKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_GiamDanKhachHangActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jComboBox_SapXepKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_GiamDanKhachHang)
                    .addComponent(jRadioButton5))
                .addGap(70, 70, 70))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBox_SapXepKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jRadioButton5)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton_GiamDanKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAddCus.setBackground(new java.awt.Color(0, 153, 255));
        btnAddCus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddCus.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ADD (2).png"))); // NOI18N
        btnAddCus.setText("THÊM");
        btnAddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCusActionPerformed(evt);
            }
        });

        btnEditCus.setBackground(new java.awt.Color(102, 255, 204));
        btnEditCus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEditCus.setForeground(new java.awt.Color(255, 255, 255));
        btnEditCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/CẬP_NHẬT.png"))); // NOI18N
        btnEditCus.setText("SỬA");

        btnRemoveCus.setBackground(new java.awt.Color(255, 0, 51));
        btnRemoveCus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRemoveCus.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/XÓA_35.png"))); // NOI18N
        btnRemoveCus.setText("XÓA");

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N

        jButton6.setBackground(new java.awt.Color(0, 153, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Tìm_Kiếm.png"))); // NOI18N
        jButton6.setText("TÌM KIẾM");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txt_KhachHangPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_KhachHangPhoneKeyTyped(evt);
            }
        });

        txt_KhachHangScores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_KhachHangScoresKeyTyped(evt);
            }
        });

        jDateChooser3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser3PropertyChange(evt);
            }
        });

        jDateChooser4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser4PropertyChange(evt);
            }
        });

        txt_KhachHangDiaChi.setColumns(20);
        txt_KhachHangDiaChi.setRows(5);
        jScrollPane6.setViewportView(txt_KhachHangDiaChi);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Mã KH:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 153, 255));
        jLabel33.setText("Tên KH :");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 255));
        jLabel34.setText("Email :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 153, 255));
        jLabel35.setText("Điện thoại :");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 153, 255));
        jLabel36.setText("Ngày Sinh :");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 153, 255));
        jLabel37.setText("Ngày lập :");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 153, 255));
        jLabel38.setText("Giới tính :");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 153, 255));
        jLabel39.setText("Điểm :");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 153, 255));
        jLabel40.setText("Địa chỉ :");

        KHACHHANG_GIOITINH.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 153, 255));
        jCheckBox3.setText("NAM");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        KHACHHANG_GIOITINH.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 153, 255));
        jCheckBox4.setText("NỮ");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel35))
                .addGap(52, 52, 52)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_KhachHangID, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_KhachHangName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_KhachHangEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_KhachHangPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(txt_KhachHangScores)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jButton6)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_KhachHangID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_KhachHangName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txt_KhachHangEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_KhachHangScores, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_KhachHangPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox3)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCusLayout = new javax.swing.GroupLayout(panelCus);
        panelCus.setLayout(panelCusLayout);
        panelCusLayout.setHorizontalGroup(
            panelCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCusLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(btnAddCus)
                .addGap(195, 195, 195)
                .addComponent(btnEditCus)
                .addGap(190, 190, 190)
                .addComponent(btnRemoveCus, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCusLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(panelCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(panelCusLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(161, 161, 161))
        );
        panelCusLayout.setVerticalGroup(
            panelCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCusLayout.createSequentialGroup()
                .addGroup(panelCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(panelCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditCus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveCus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        jLabel8.setBackground(new java.awt.Color(51, 153, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/KHÁCH HÀNG_60.png"))); // NOI18N
        jLabel8.setText("KHÁCH HÀNG");
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout MANAGE_KHACHHANGLayout = new javax.swing.GroupLayout(MANAGE_KHACHHANG);
        MANAGE_KHACHHANG.setLayout(MANAGE_KHACHHANGLayout);
        MANAGE_KHACHHANGLayout.setHorizontalGroup(
            MANAGE_KHACHHANGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGE_KHACHHANGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MANAGE_KHACHHANGLayout.setVerticalGroup(
            MANAGE_KHACHHANGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGE_KHACHHANGLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("   KHÁCH HÀNG", new javax.swing.ImageIcon(getClass().getResource("/Icon/KHÁCH HÀNG_50.png")), MANAGE_KHACHHANG); // NOI18N

        MANAGE_BOOK.setBackground(new java.awt.Color(255, 255, 255));

        panelBook.setBackground(new java.awt.Color(255, 255, 255));

        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SÁCH", "TÊN SÁCH", "THỂ LOẠI", "TÁC GIẢ", "GIÁ", "SỐ LƯỢNG", "NHÀ CUNG CẤP", "DATE CREATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBook.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tblBook.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(tblBook);

        jPanel14.setBackground(new java.awt.Color(204, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp Xếp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N

        SapXep.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 153, 255));
        jRadioButton1.setText("Sắp xếp tăng dần");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        SapXep.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 153, 255));
        jRadioButton2.setText("Sắp xếp giảm dần");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jComboBox_SapXepSach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_SapXepSach.setForeground(new java.awt.Color(0, 153, 255));
        jComboBox_SapXepSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MÃ SÁCH", "TÊN SÁCH", "TÁC GIẢ", "SỐ LƯỢNG", "LOẠI SÁCH", "NGÀY TẠO", "NHÀ CUNG CẤP", "GIÁ" }));
        jComboBox_SapXepSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SapXepSachActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGap(19, 19, 19))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_SapXepSach, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBox_SapXepSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jRadioButton1)
                .addGap(28, 28, 28)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(204, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(0, 51, 255));

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Tìm_Kiếm.png"))); // NOI18N
        jButton5.setText("TÌM KIẾM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField_IdBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_IdBook.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_IdBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdBookActionPerformed(evt);
            }
        });

        jTextField_TypeBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_TypeBook.setForeground(new java.awt.Color(102, 102, 102));

        jTextField_NCCBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_NCCBook.setForeground(new java.awt.Color(102, 102, 102));

        jDateChooser_DateCrateBook.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooser_DateCrateBook.setDateFormatString("dd-MM-yyyy");
        jDateChooser_DateCrateBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDateChooser_DateCrateBook.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_DateCrateBookPropertyChange(evt);
            }
        });

        jTextField_PriceBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_PriceBook.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_PriceBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PriceBookActionPerformed(evt);
            }
        });
        jTextField_PriceBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PriceBookKeyTyped(evt);
            }
        });

        jTextField_NumberOfBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_NumberOfBook.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_NumberOfBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NumberOfBookKeyTyped(evt);
            }
        });

        jTextField_AuthorBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_AuthorBook.setForeground(new java.awt.Color(102, 102, 102));

        jTextField_NameBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_NameBook.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("MÃ SÁCH:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("THỂ LOẠI:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("MÃ NCC :");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("NGÀY TẠO:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("TÊN SÁCH");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("TÁC GIẢ");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("SỐ LƯỢNG");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("GIÁ");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(53, 53, 53)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_TypeBook, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jTextField_NCCBook)
                    .addComponent(jTextField_IdBook)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jDateChooser_DateCrateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(142, 142, 142)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_AuthorBook, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jTextField_NumberOfBook)
                    .addComponent(jTextField_PriceBook)
                    .addComponent(jTextField_NameBook))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_NameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_IdBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_AuthorBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_TypeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_NCCBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_NumberOfBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_PriceBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_DateCrateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addComponent(jButton5)
                .addContainerGap())
        );

        btnAddBook.setBackground(new java.awt.Color(0, 153, 255));
        btnAddBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddBook.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ADD (2).png"))); // NOI18N
        btnAddBook.setText("THÊM");

        btnEditBook.setBackground(new java.awt.Color(102, 255, 204));
        btnEditBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEditBook.setForeground(new java.awt.Color(255, 255, 255));
        btnEditBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/CẬP_NHẬT.png"))); // NOI18N
        btnEditBook.setText("SỬA");

        btnRemoveBook.setBackground(new java.awt.Color(255, 0, 51));
        btnRemoveBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRemoveBook.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/XÓA_35.png"))); // NOI18N
        btnRemoveBook.setText("XÓA");

        javax.swing.GroupLayout panelBookLayout = new javax.swing.GroupLayout(panelBook);
        panelBook.setLayout(panelBookLayout);
        panelBookLayout.setHorizontalGroup(
            panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBookLayout.createSequentialGroup()
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBookLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addGroup(panelBookLayout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBookLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnAddBook)
                        .addGap(190, 190, 190)
                        .addComponent(btnEditBook)
                        .addGap(190, 190, 190)
                        .addComponent(btnRemoveBook)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelBookLayout.setVerticalGroup(
            panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBookLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditBook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveBook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jLabel7.setBackground(new java.awt.Color(51, 153, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/SACH_50.png"))); // NOI18N
        jLabel7.setText("SÁCH");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout MANAGE_BOOKLayout = new javax.swing.GroupLayout(MANAGE_BOOK);
        MANAGE_BOOK.setLayout(MANAGE_BOOKLayout);
        MANAGE_BOOKLayout.setHorizontalGroup(
            MANAGE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGE_BOOKLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(MANAGE_BOOKLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MANAGE_BOOKLayout.setVerticalGroup(
            MANAGE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGE_BOOKLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(86, 86, 86))
        );

        jTabbedPane1.addTab("                  SÁCH", new javax.swing.ImageIcon(getClass().getResource("/Icon/SACH_50.png")), MANAGE_BOOK); // NOI18N

        MANAGE_NCC.setBackground(new java.awt.Color(255, 255, 255));
        MANAGE_NCC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MANAGE_NCC.setPreferredSize(new java.awt.Dimension(1076, 1000));

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NCC", "Tên NCC", "SĐT", "Địa Chỉ", "Tài Khoản Ngân Hàng", "Tên Ngân Hàng", "Ngày Lập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSupplier.setGridColor(new java.awt.Color(255, 255, 255));
        tblSupplier.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tblSupplier.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblSupplier);

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp Xếp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N

        jComboBox_SapXepNCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_SapXepNCC.setForeground(new java.awt.Color(0, 153, 255));
        jComboBox_SapXepNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MÃ NCC", "NAME", "DATECREATE", "PHONE" }));
        jComboBox_SapXepNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SapXepNCCActionPerformed(evt);
            }
        });

        SapXep.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(0, 153, 255));
        jRadioButton7.setText("Sắp xếp tăng dần");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        SapXep.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(0, 153, 255));
        jRadioButton8.setText("Sắp xếp giảm dần");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("RESET");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jComboBox_SapXepNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBox_SapXepNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jRadioButton7)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_BankAccountNcc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BankAccountNccKeyTyped(evt);
            }
        });

        txt_PhoneNcc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PhoneNccKeyTyped(evt);
            }
        });

        jDateChoose_ngayTaoNcc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChoose_ngayTaoNccPropertyChange(evt);
            }
        });

        txt_DiaChiNcc.setColumns(20);
        txt_DiaChiNcc.setRows(5);
        jScrollPane7.setViewportView(txt_DiaChiNcc);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 153, 255));
        jLabel41.setText("Mã NCC:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 153, 255));
        jLabel42.setText("Tên NCC:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 153, 255));
        jLabel43.setText("SĐT:");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 153, 255));
        jLabel46.setText("Ngày Lập:");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 153, 255));
        jLabel44.setText("Tên Ngân Hàng");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 153, 255));
        jLabel47.setText("TK Ngân Hàng");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 153, 255));
        jLabel48.setText("Địa chỉ");

        jButton_TimkiemNcc.setBackground(new java.awt.Color(0, 153, 255));
        jButton_TimkiemNcc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_TimkiemNcc.setForeground(new java.awt.Color(255, 255, 255));
        jButton_TimkiemNcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Tìm_Kiếm.png"))); // NOI18N
        jButton_TimkiemNcc.setText("TÌM KIẾM");
        jButton_TimkiemNcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TimkiemNccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_NameNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_PhoneNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChoose_ngayTaoNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_IDNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7)
                    .addComponent(txt_bankNameNcc)
                    .addComponent(txt_BankAccountNcc))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_TimkiemNcc)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_IDNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_BankAccountNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_NameNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bankNameNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_PhoneNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChoose_ngayTaoNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jButton_TimkiemNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel45)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btnEditSupplier.setBackground(new java.awt.Color(102, 255, 204));
        btnEditSupplier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEditSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnEditSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/CẬP_NHẬT.png"))); // NOI18N
        btnEditSupplier.setText("SỬA");

        btnRemoveSupplier.setBackground(new java.awt.Color(255, 0, 51));
        btnRemoveSupplier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRemoveSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/XÓA_35.png"))); // NOI18N
        btnRemoveSupplier.setText("XÓA");
        btnRemoveSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSupplierActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/NCC_55.png"))); // NOI18N
        jLabel2.setText("NHÀ CUNG CẤP");
        jLabel2.setOpaque(true);

        btnAddSupplier.setBackground(new java.awt.Color(0, 153, 255));
        btnAddSupplier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ADD (2).png"))); // NOI18N
        btnAddSupplier.setText("THÊM");

        javax.swing.GroupLayout MANAGE_NCCLayout = new javax.swing.GroupLayout(MANAGE_NCC);
        MANAGE_NCC.setLayout(MANAGE_NCCLayout);
        MANAGE_NCCLayout.setHorizontalGroup(
            MANAGE_NCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGE_NCCLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(btnAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(btnEditSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(btnRemoveSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MANAGE_NCCLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(MANAGE_NCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(MANAGE_NCCLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(173, 173, 173))
        );
        MANAGE_NCCLayout.setVerticalGroup(
            MANAGE_NCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MANAGE_NCCLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MANAGE_NCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(MANAGE_NCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        jTabbedPane1.addTab("NHÀ CUNG CẤP", new javax.swing.ImageIcon(getClass().getResource("/Icon/NCC_55.png")), MANAGE_NCC); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel50.setBackground(new java.awt.Color(0, 153, 255));
        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bill_4.png"))); // NOI18N
        jLabel50.setText("HÓA ĐƠN");
        jLabel50.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SẮP XẾP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));

        comboBox_SapXepHD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBox_SapXepHD.setForeground(new java.awt.Color(0, 153, 255));
        comboBox_SapXepHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MÃ HĐ", "MÃ KH", "MÃ NV", "THÀNH TIỀN" }));
        comboBox_SapXepHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_SapXepHDActionPerformed(evt);
            }
        });

        SapXep.add(radio_Tang);
        radio_Tang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radio_Tang.setForeground(new java.awt.Color(0, 153, 255));
        radio_Tang.setText("Sắp xếp tăng dần");
        radio_Tang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_TangActionPerformed(evt);
            }
        });

        btnGroup_Sort.add(radio_Giam);
        radio_Giam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radio_Giam.setForeground(new java.awt.Color(0, 153, 255));
        radio_Giam.setText("Sắp xếp giảm dần");
        radio_Giam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_GiamActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 153, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("RESET");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(radio_Giam)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radio_Tang)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(comboBox_SapXepHD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(comboBox_SapXepHD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(radio_Tang)
                .addGap(34, 34, 34)
                .addComponent(radio_Giam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(204, 255, 255));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 153, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Mã hóa đơn:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 153, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Mã NV:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 153, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Mã KH:");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 153, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Ngày tạo");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 153, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Thành tiền:");

        txt_ThanhTien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ThanhTienKeyTyped(evt);
            }
        });

        b_TimKiem.setBackground(new java.awt.Color(0, 153, 255));
        b_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        b_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Tìm_Kiếm.png"))); // NOI18N
        b_TimKiem.setText("TÌM KIẾM");
        b_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_TimKiemActionPerformed(evt);
            }
        });

        txt_NgayLap.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_NgayLapPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_MaKH))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_maNV))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_maHD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_TimKiem))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel55)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_NgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 135, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_maHD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_NgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_TimKiem)
                .addContainerGap())
        );

        tbl_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ HĐ", "MÃ NV", "MÃ KH", "Ngày Lập", "Thành Tiền"
            }
        ));
        tbl_HoaDon.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tbl_HoaDon.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(tbl_HoaDon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout MANAGE_HOADONLayout = new javax.swing.GroupLayout(MANAGE_HOADON);
        MANAGE_HOADON.setLayout(MANAGE_HOADONLayout);
        MANAGE_HOADONLayout.setHorizontalGroup(
            MANAGE_HOADONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MANAGE_HOADONLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MANAGE_HOADONLayout.setVerticalGroup(
            MANAGE_HOADONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MANAGE_HOADONLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("         HÓA ĐƠN", new javax.swing.ImageIcon(getClass().getResource("/Icon/bill_4.png")), MANAGE_HOADON); // NOI18N

        THONGTIN.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setEnabled(false);

        jLabel9.setBackground(new java.awt.Color(0, 153, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thông tin.png"))); // NOI18N
        jLabel9.setText("THÔNG TIN CỦA BẠN");
        jLabel9.setOpaque(true);

        txt_ChucVu.setBackground(new java.awt.Color(204, 255, 255));
        txt_ChucVu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin cá nhân", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        txt_ChucVu.setForeground(new java.awt.Color(153, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("Họ Tên:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("Địa Chỉ:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("Số Điện Thoại:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setText("Số Tài Khoản:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("Tên Ngân Hàng:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 255));
        jLabel15.setText("Email:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 255));
        jLabel16.setText("Chức Vụ:");

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtBankAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtBankName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPosition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout txt_ChucVuLayout = new javax.swing.GroupLayout(txt_ChucVu);
        txt_ChucVu.setLayout(txt_ChucVuLayout);
        txt_ChucVuLayout.setHorizontalGroup(
            txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_ChucVuLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txt_ChucVuLayout.createSequentialGroup()
                        .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txtBankAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(txt_ChucVuLayout.createSequentialGroup()
                        .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(716, Short.MAX_VALUE))
        );
        txt_ChucVuLayout.setVerticalGroup(
            txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_ChucVuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txt_ChucVuLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28)
                        .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(txt_ChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(204, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin tài khoản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel17.setForeground(new java.awt.Color(0, 153, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 255));
        jLabel17.setText("Tài Khoản: ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 255));
        jLabel18.setText("Mật Khẩu: ");

        lbpass.setForeground(new java.awt.Color(255, 51, 51));
        lbpass.setText(" ");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbpass))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lbpass))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnEditManage.setBackground(new java.awt.Color(102, 255, 204));
        btnEditManage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEditManage.setForeground(new java.awt.Color(255, 255, 255));
        btnEditManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/CẬP_NHẬT.png"))); // NOI18N
        btnEditManage.setText("SỬA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_ChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(btnEditManage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditManage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout THONGTINLayout = new javax.swing.GroupLayout(THONGTIN);
        THONGTIN.setLayout(THONGTINLayout);
        THONGTINLayout.setHorizontalGroup(
            THONGTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(THONGTINLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 147, Short.MAX_VALUE))
        );
        THONGTINLayout.setVerticalGroup(
            THONGTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(THONGTINLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("        THÔNG TIN", new javax.swing.ImageIcon(getClass().getResource("/Icon/thông tin.png")), THONGTIN); // NOI18N

        jLabel56.setBackground(new java.awt.Color(0, 153, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-statistics-80.png"))); // NOI18N
        jLabel56.setText("THÔNG KÊ");
        jLabel56.setOpaque(true);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pan_doanhThuTheoThang.setBackground(new java.awt.Color(204, 255, 255));
        pan_doanhThuTheoThang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        pan_doanhThuTheoThang.setForeground(new java.awt.Color(0, 153, 255));

        pan_TT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doanh thu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        javax.swing.GroupLayout pan_TTLayout = new javax.swing.GroupLayout(pan_TT);
        pan_TT.setLayout(pan_TTLayout);
        pan_TTLayout.setHorizontalGroup(
            pan_TTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        pan_TTLayout.setVerticalGroup(
            pan_TTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pan_bieuDoTron.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        javax.swing.GroupLayout pan_bieuDoTronLayout = new javax.swing.GroupLayout(pan_bieuDoTron);
        pan_bieuDoTron.setLayout(pan_bieuDoTronLayout);
        pan_bieuDoTronLayout.setHorizontalGroup(
            pan_bieuDoTronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        pan_bieuDoTronLayout.setVerticalGroup(
            pan_bieuDoTronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pan_doanhThuTheoThangLayout = new javax.swing.GroupLayout(pan_doanhThuTheoThang);
        pan_doanhThuTheoThang.setLayout(pan_doanhThuTheoThangLayout);
        pan_doanhThuTheoThangLayout.setHorizontalGroup(
            pan_doanhThuTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_doanhThuTheoThangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pan_TT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pan_bieuDoTron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        pan_doanhThuTheoThangLayout.setVerticalGroup(
            pan_doanhThuTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_doanhThuTheoThangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_doanhThuTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pan_TT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pan_bieuDoTron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MANAGE_THONGKELayout = new javax.swing.GroupLayout(MANAGE_THONGKE);
        MANAGE_THONGKE.setLayout(MANAGE_THONGKELayout);
        MANAGE_THONGKELayout.setHorizontalGroup(
            MANAGE_THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGE_THONGKELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MANAGE_THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pan_doanhThuTheoThang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        MANAGE_THONGKELayout.setVerticalGroup(
            MANAGE_THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGE_THONGKELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan_doanhThuTheoThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("    THÔNG KÊ   ", new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-statistics-80.png")), MANAGE_THONGKE); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveStaffActionPerformed

    private void btnRemoveSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveSupplierActionPerformed

    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffActionPerformed
    }//GEN-LAST:event_btnAddStaffActionPerformed

    private void btnEditStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditStaffActionPerformed

    private void btnAddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCusActionPerformed

    private void jTextField_IdBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdBookActionPerformed
 String dateCreateBook = "";
    private void jDateChooser_DateCrateBookPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_DateCrateBookPropertyChange
        // TODO add your handling code here:
this.jDateChooser_DateCrateBook.setDateFormatString("yyyy-MM-dd");
        
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);
            //ystem.out.println(formattedDate);
            dateCreateBook = formattedDate ;
      
        }
    }//GEN-LAST:event_jDateChooser_DateCrateBookPropertyChange

    private void jTextField_PriceBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PriceBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PriceBookActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        loadNhanVienList(sortData.sortDownIdNhanVien(keySapXepNV));
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void txt_NameNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NameNvActionPerformed

    private void txt_IDNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDNhanVienActionPerformed
String keySapXepNV = "ID";
    private void jComboBox_sapXepNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_sapXepNvActionPerformed
        // TODO add your handling code here:
          if (jComboBox_sapXepNv.getSelectedIndex() == 0) {
            // Chọn sắp xếp theo MANV
            SapXep.clearSelection();
            keySapXepNV = "ID";
        } else if (jComboBox_sapXepNv.getSelectedIndex() == 1) {
            // Chọn sắp xếp theo HOTENNV
            SapXep.clearSelection();
            keySapXepNV = "NAME";
        } else if (jComboBox_sapXepNv.getSelectedIndex() == 2) {
            // Chọn sắp xếp theo SDT
            SapXep.clearSelection();
            keySapXepNV = "SALARY";
        } else {
            // Chọn sắp xếp theo GMAIL
            SapXep.clearSelection();
            keySapXepNV = "BONUS";
        }
    }//GEN-LAST:event_jComboBox_sapXepNvActionPerformed

    private void jRadioButton_GiamDanKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_GiamDanKhachHangActionPerformed
        // TODO add your handling code here:
              loadKhachHangList(sortData.sortDownIdKhachHang(keySapXepKH));     
    }//GEN-LAST:event_jRadioButton_GiamDanKhachHangActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
        loadNCCList(sortData.sortDownIdNCC(keySapXepNCC));
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(!jTextField_IdBook.getText().equals("")||!jTextField_NameBook.getText().equals("")||!jTextField_TypeBook.getText().equals("")
                ||!jTextField_NCCBook.getText().equals("")||!jTextField_AuthorBook.getText().equals("")
                ||!jTextField_NumberOfBook.getText().equals("")||!dateCreateBook.equals("")||!jTextField_PriceBook.getText().equals("")){
           String id = jTextField_IdBook.getText();
        String name = jTextField_NameBook.getText();
        String type = jTextField_TypeBook.getText();
        String ncc = jTextField_NCCBook.getText();
        String author = jTextField_AuthorBook.getText();
        String quantity = jTextField_NumberOfBook.getText();
        String dateCreate = dateCreateBook;
        String price = jTextField_PriceBook.getText();

    loadEmployeeList(findData.findBooks(id, name, type, ncc, author, quantity, dateCreate, price));
      }   
        else
             JOptionPane.showMessageDialog(this, "Bạn chưa nhâp dữ liệu!");
   

    }//GEN-LAST:event_jButton5ActionPerformed
String GioiTinhNhanVien = "";
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(!txt_IDNhanVien.getText().equals("")||!txt_NameNv.getText().equals("")||!txt_DiaCHiNv.getText().equals("")
                ||!txt_PhoneNv.getText().equals("")||!txt_EmailNv.getText().equals("")
                ||!txt_CCCDNhanVien.getText().equals("")||!SinhNhatNV.equals("")||!txt_LuongNv.getText().equals("")
                  ||!dateCreateNV.equals("")||!GioiTinhNhanVien.equals("")
                  ){
           String ID = txt_IDNhanVien.getText();           
               String tenNV = txt_NameNv.getText();
               String sex =GioiTinhNhanVien ;
               String sinhNhat = SinhNhatNV;
               String address = txt_DiaCHiNv.getText();
               String phone = txt_PhoneNv.getText();             
               String email = txt_EmailNv.getText();
               String CCCD = txt_CCCDNhanVien.getText();
               String salary = txt_LuongNv.getText();
               String dateCreate = dateCreateNV;
        loadNhanVienList(findData.findNhanViens( ID,  tenNV,  CCCD,  phone,  address,  sinhNhat,  dateCreate,  salary, email, sex) );
         }   
        else
             JOptionPane.showMessageDialog(this, "Bạn chưa nhâp dữ liệu!");
        
              
    }//GEN-LAST:event_jButton2ActionPerformed
    String dateCreateNV = "";
    private void jDateChooser_NVDateCreatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_NVDateCreatePropertyChange
        // TODO add your handling code here:
         this.jDateChooser_NVDateCreate.setDateFormatString("yyyy-MM-dd");
           if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);
            //ystem.out.println(formattedDate);
            dateCreateNV = formattedDate ;
      
        }
    }//GEN-LAST:event_jDateChooser_NVDateCreatePropertyChange
String SinhNhatNV = "";
    private void jDateChooser_NvSinhNhatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_NvSinhNhatPropertyChange
        // TODO add your handling code here:
         this.jDateChooser_NvSinhNhat.setDateFormatString("yyyy-MM-dd");
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);
            //ystem.out.println(formattedDate);
            SinhNhatNV = formattedDate ;
      
        }
    }//GEN-LAST:event_jDateChooser_NvSinhNhatPropertyChange

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        GioiTinhNhanVien = "1";
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
          GioiTinhNhanVien = "0";
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton_TimkiemNccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TimkiemNccActionPerformed
        // TODO add your handling code here:
        if(!txt_IDNcc.getText().equals("")||!txt_NameNcc.getText().equals("")||!txt_DiaChiNcc.getText().equals("")
                ||!txt_PhoneNcc.getText().equals("")||!txt_bankNameNcc.getText().equals("")
                ||!txt_BankAccountNcc.getText().equals("")||!ngayTaoNCC.equals("")){
             String id = txt_IDNcc.getText();
               String tenNCC = txt_NameNcc.getText();
               String address =txt_DiaChiNcc.getText() ;
               String phone = txt_PhoneNcc.getText();
               String bankName =txt_bankNameNcc.getText();             
               String bankAccount = txt_BankAccountNcc.getText();
               String dateCreate = ngayTaoNCC;
              
        loadNCCList(findData.findNCCs(id, tenNCC, address, phone, bankName, bankAccount, dateCreate) );
 
        }   
        else
             JOptionPane.showMessageDialog(this, "Bạn chưa nhâp dữ liệu!");
            
              
    }//GEN-LAST:event_jButton_TimkiemNccActionPerformed
String ngayTaoNCC = "";
    private void jDateChoose_ngayTaoNccPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChoose_ngayTaoNccPropertyChange
        // TODO add your handling code here:
        this.jDateChoose_ngayTaoNcc.setDateFormatString("yyyy-MM-dd");
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);
            //ystem.out.println(formattedDate);
            ngayTaoNCC = formattedDate ;
      
        }
    }//GEN-LAST:event_jDateChoose_ngayTaoNccPropertyChange

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       if(!txt_KhachHangID.getText().equals("")||!txt_KhachHangName.getText().equals("")||!txt_KhachHangScores.getText().equals("")
                ||!txt_KhachHangEmail.getText().equals("")||!txt_KhachHangPhone.getText().equals("")
                ||!txt_KhachHangDiaChi.getText().equals("")||!ngayTaoKH.equals("")
                  ||!sinhNhatKH.equals("")||!GioiTinhKhachHang.equals("")
                  ){
           String id = txt_KhachHangID.getText();
       String tenKH = txt_KhachHangName.getText();
       String scores = txt_KhachHangScores.getText();
       String email = txt_KhachHangEmail.getText();
       String address = txt_KhachHangDiaChi.getText();
       String phone = txt_KhachHangPhone.getText();
       String sex = GioiTinhKhachHang;
       String dateCreate = ngayTaoKH;
       String sinhNhat = sinhNhatKH;
       
              
        loadKhachHangList(findData. findKhachHangs( id,  tenKH,  scores, email,  address,  phone,  sex,  dateCreate,  sinhNhat)); }   
        else
             JOptionPane.showMessageDialog(this, "Bạn chưa nhâp dữ liệu!");
     
    }//GEN-LAST:event_jButton6ActionPerformed
String GioiTinhKhachHang = "";
    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        GioiTinhKhachHang = "True";
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        GioiTinhKhachHang = "False";
    }//GEN-LAST:event_jCheckBox4ActionPerformed
String sinhNhatKH = "";
    private void jDateChooser3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser3PropertyChange
        // TODO add your handling code here:
         this.jDateChooser3.setDateFormatString("yyyy-MM-dd");
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);
            //ystem.out.println(formattedDate);
            sinhNhatKH = formattedDate ;
      
        }
    }//GEN-LAST:event_jDateChooser3PropertyChange
String ngayTaoKH ="" ;
    private void jDateChooser4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser4PropertyChange
        // TODO add your handling code here:
         this.jDateChooser4.setDateFormatString("yyyy-MM-dd");
         if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);
            //ystem.out.println(formattedDate);
            ngayTaoKH = formattedDate ;
      
        }
    }//GEN-LAST:event_jDateChooser4PropertyChange

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
          loadNhanVienList(sortData.sortUpIdNhanVien(keySapXepNV));
    }//GEN-LAST:event_jRadioButton4ActionPerformed
String keySapXepKH = "ID";
    private void jComboBox_SapXepKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SapXepKhachHangActionPerformed
        // TODO add your handling code here:
          if (jComboBox_SapXepKhachHang.getSelectedIndex() == 0) {
            // Chọn sắp xếp theo MANV
            SapXep.clearSelection();
            keySapXepKH = "ID";
        } else if (jComboBox_SapXepKhachHang.getSelectedIndex() == 1) {
            // Chọn sắp xếp theo HOTENNV
            SapXep.clearSelection();
            keySapXepKH = "NAME";
        } else if (jComboBox_SapXepKhachHang.getSelectedIndex() == 2) {
            // Chọn sắp xếp theo SDT
            SapXep.clearSelection();
            keySapXepKH = "PHONE";
        } else {
            // Chọn sắp xếp theo GMAIL
            SapXep.clearSelection();
            keySapXepKH = "SCORES";
        }
    }//GEN-LAST:event_jComboBox_SapXepKhachHangActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
            loadKhachHangList(sortData.sortUpIdKhachHang(keySapXepKH));     
    }//GEN-LAST:event_jRadioButton5ActionPerformed
String keySapXepSach = "ID";
    private void jComboBox_SapXepSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SapXepSachActionPerformed
        // TODO add your handling code here:
          if (jComboBox_SapXepSach.getSelectedIndex() == 0) {
            // Chọn sắp xếp theo MANV
            SapXep.clearSelection();
            keySapXepSach = "ID";
        } else if (jComboBox_SapXepSach.getSelectedIndex() == 1) {
            // Chọn sắp xếp theo HOTENNV
            SapXep.clearSelection();
            keySapXepSach = "NAME";
        } else if (jComboBox_SapXepSach.getSelectedIndex() == 2) {
            // Chọn sắp xếp theo SDT
            SapXep.clearSelection();
            keySapXepSach = "AUTHOR";
        } else if (jComboBox_SapXepSach.getSelectedIndex() == 3) {
            // Chọn sắp xếp theo SDT
            SapXep.clearSelection();
            keySapXepSach = "QUANATY";
        } else if (jComboBox_SapXepSach.getSelectedIndex() == 4) {
            // Chọn sắp xếp theo SDT
            SapXep.clearSelection();
            keySapXepSach = "TYPE";
        } else if (jComboBox_SapXepSach.getSelectedIndex() == 5) {
            // Chọn sắp xếp theo SDT
            SapXep.clearSelection();
            keySapXepSach = "DATECREATE";
        } else if (jComboBox_SapXepSach.getSelectedIndex() == 6) {
            // Chọn sắp xếp theo SDT
            SapXep.clearSelection();
            keySapXepSach = "ID_SUPPLIER";
        } 
        else {
            // Chọn sắp xếp theo GMAIL
            SapXep.clearSelection();
            keySapXepSach = "CAST(PRICE AS FLOAT)";
        }
    }//GEN-LAST:event_jComboBox_SapXepSachActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
         loadEmployeeList(sortData.sortUpIdEmployees(keySapXepSach));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        loadEmployeeList(sortData.sortDownIdEmployees(keySapXepSach));
    }//GEN-LAST:event_jRadioButton2ActionPerformed
String keySapXepNCC = "ID";
    private void jComboBox_SapXepNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SapXepNCCActionPerformed
        // TODO add your handling code here:
          if (jComboBox_SapXepNCC.getSelectedIndex() == 0) {
            // Chọn sắp xếp theo MANV
            SapXep.clearSelection();
            keySapXepNCC = "ID";
        } else if (jComboBox_SapXepNCC.getSelectedIndex() == 1) {
            // Chọn sắp xếp theo HOTENNV
            SapXep.clearSelection();
            keySapXepNCC = "NAME";
        } else if (jComboBox_SapXepNCC.getSelectedIndex() == 2) {
            // Chọn sắp xếp theo SDT
            SapXep.clearSelection();
            keySapXepNCC = "DATECREATE";
        } else {
            // Chọn sắp xếp theo GMAIL
            SapXep.clearSelection();
            keySapXepNCC = "PHONE";
        }
    }//GEN-LAST:event_jComboBox_SapXepNCCActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
           loadNCCList(sortData.sortUpIdNCC(keySapXepNCC));
    }//GEN-LAST:event_jRadioButton7ActionPerformed
    
    String keySapXepHoaDon ="ID";
    private void comboBox_SapXepHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_SapXepHDActionPerformed
        // TODO add your handling code here:
        if(comboBox_SapXepHD.getSelectedIndex()==0){
            btnGroup_Sort.clearSelection();
            keySapXepHoaDon ="ID";
   
        }else if(comboBox_SapXepHD.getSelectedIndex()==1){
            btnGroup_Sort.clearSelection();
            keySapXepHoaDon ="ID_CUSTOMER";
            
        }else if(comboBox_SapXepHD.getSelectedIndex()==2){
            btnGroup_Sort.clearSelection();
            keySapXepHoaDon ="ID_STAFF";
            
        }else{
            btnGroup_Sort.clearSelection();
            keySapXepHoaDon ="TOTAL";
        }
    }//GEN-LAST:event_comboBox_SapXepHDActionPerformed

    private void radio_TangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_TangActionPerformed
        // TODO add your handling code here:
         loadHoaDonList(hdBUS.sortUpIdHD(keySapXepHoaDon) );
    }//GEN-LAST:event_radio_TangActionPerformed

    private void b_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_TimKiemActionPerformed
        // TODO add your handling code here:
       if(!txt_maHD.getText().equals("")||!txt_maNV.getText().equals("")||!txt_MaKH.getText().equals("")||!txt_ThanhTien.getText().equals("")||!ngayTaoNCC.equals("")){
            String idHĐ = txt_maHD.getText();
               String idNV =txt_maNV.getText() ;
               String idKH = txt_MaKH.getText();
               String thanhTien =txt_ThanhTien.getText();             
               String ngayTao = ngayTaoNCC;
              
        loadHoaDonList(hdBUS.findHoaDons(idHĐ,  idNV,  ngayTao,  thanhTien,  idKH) );
       }
       else
           JOptionPane.showMessageDialog(this, "Bạn chưa nhâp dữ liệu!");
              
    }//GEN-LAST:event_b_TimKiemActionPerformed
    String ngayTaoHoaDon = "";
    private void txt_NgayLapPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_NgayLapPropertyChange
        // TODO add your handling code here:
        this.txt_NgayLap.setDateFormatString("yyyy-MM-dd");
         if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);
            //ystem.out.println(formattedDate);
            ngayTaoHoaDon = formattedDate ;
      
        }
    }//GEN-LAST:event_txt_NgayLapPropertyChange

    private void radio_GiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_GiamActionPerformed
        // TODO add your handling code here:
        loadHoaDonList(hdBUS.sortDownIdHD(keySapXepHoaDon) );
    }//GEN-LAST:event_radio_GiamActionPerformed

    private void txt_EmailNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailNvActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         //loadDataFromSQL();
        this.tblModelStaff = (DefaultTableModel) this.tblStaff.getModel();
        this.tblModelStaff.setRowCount(0);
        showDataStaff(staffs);
       
        txt_IDNhanVien.setText("");
        txt_NameNv.setText("");
        txt_EmailNv.setText("");
        txt_LuongNv.setText("");
        txt_DiaCHiNv.setText("");
        txt_PhoneNv.setText("");
        txt_CCCDNhanVien.setText("");
         this.SapXep.clearSelection();
        this.NHANVIEN_GIOITINH.clearSelection();
        jDateChooser_NvSinhNhat.setDateFormatString("");
        jDateChooser_NVDateCreate.setDateFormatString("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_LuongNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LuongNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LuongNvActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.tblModelCustomer = (DefaultTableModel) this.tblCustomer.getModel();
        this.tblModelCustomer.setRowCount(0);
        showDataCustomer(customers);
       
        txt_KhachHangID.setText("");
        txt_KhachHangName.setText("");
        txt_KhachHangEmail.setText("");
        txt_KhachHangDiaChi.setText("");
        txt_KhachHangScores.setText("");
        txt_KhachHangPhone.setText("");
     
         this.SapXep.clearSelection();
        this.KHACHHANG_GIOITINH.clearSelection();
        jDateChooser4.setDateFormatString("");
        jDateChooser3.setDateFormatString("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.tblModelBook = (DefaultTableModel) this.tblBook.getModel();
        this.tblModelBook.setRowCount(0);
        ShowBookToTable(books);
       
        jTextField_IdBook.setText("");
        jTextField_TypeBook.setText("");
        jTextField_NCCBook.setText("");
        jTextField_NameBook.setText("");
        jTextField_AuthorBook.setText("");
        jTextField_NumberOfBook.setText("");
        jTextField_PriceBook.setText("");
     
         this.SapXep.clearSelection();

        jDateChooser_DateCrateBook.setDateFormatString("");
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.tblModelSupplier = (DefaultTableModel) this.tblSupplier.getModel();
        this.tblModelSupplier.setRowCount(0);
        showSuplierToTable(suppliers);
       
        txt_IDNcc.setText("");
        txt_NameNcc.setText("");
        txt_PhoneNcc.setText("");
        txt_BankAccountNcc.setText("");
        txt_bankNameNcc.setText("");
        txt_DiaChiNcc.setText("");
      
     
         this.SapXep.clearSelection();

        jDateChoose_ngayTaoNcc.setDateFormatString("");
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        showDataHoaDon(hoaDon);
       
        txt_maHD.setText("");
        txt_maNV.setText("");
        txt_MaKH.setText("");
        txt_ThanhTien.setText("");
       
      
     
         this.SapXep.clearSelection();

        txt_NgayLap.setDateFormatString("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txt_LuongNvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_LuongNvKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_LuongNvKeyTyped

    private void txt_PhoneNvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PhoneNvKeyTyped
        // TODO add your handling code here:
           char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_PhoneNvKeyTyped

    private void txt_KhachHangScoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_KhachHangScoresKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_KhachHangScoresKeyTyped

    private void txt_KhachHangPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_KhachHangPhoneKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_KhachHangPhoneKeyTyped

    private void jTextField_NumberOfBookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NumberOfBookKeyTyped
 char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NumberOfBookKeyTyped

    private void jTextField_PriceBookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PriceBookKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PriceBookKeyTyped

    private void txt_ThanhTienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ThanhTienKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_ThanhTienKeyTyped

    private void txt_PhoneNccKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PhoneNccKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_PhoneNccKeyTyped

    private void txt_BankAccountNccKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BankAccountNccKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_BankAccountNccKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginFRM log = new LoginFRM();
                new homeManage(log).setVisible(true);
            }
        });
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<KhachHang> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<KhachHang> customers) {
        this.customers = customers;
    }

    public ReadDataFromSQL getReadData() {
        return readData;
    }

    public void setReadData(ReadDataFromSQL readData) {
        this.readData = readData;
    }

    public DefaultTableModel getTblModelCustomer() {
        return tblModelCustomer;
    }

    public ArrayList<Supplier> getSuppliersNoIsDel() {
        return suppliersNoIsDel;
    }

    public void setSuppliersNoIsDel(ArrayList<Supplier> suppliersNoIsDel) {
        this.suppliersNoIsDel = suppliersNoIsDel;
    }

    public DefaultTableModel getTblModelBook() {
        return tblModelBook;
    }

    public void setTblModelBook(DefaultTableModel tblModelBook) {
        this.tblModelBook = tblModelBook;
    }

    public Book getEditBook() {
        return editBook;
    }

    public void setEditBook(Book editBook) {
        this.editBook = editBook;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooksNoIsDel() {
        return booksNoIsDel;
    }

    public void setBooksNoIsDel(ArrayList<Book> booksNoIsDel) {
        this.booksNoIsDel = booksNoIsDel;
    }

    public JButton getBtnAddBook() {
        return btnAddBook;
    }

    public void setBtnAddBook(JButton btnAddBook) {
        this.btnAddBook = btnAddBook;
    }

    public JButton getBtnEditBook() {
        return btnEditBook;
    }

    public void setBtnEditBook(JButton btnEditBook) {
        this.btnEditBook = btnEditBook;
    }

    public void setTblModelCustomer(DefaultTableModel tblModelCustomer) {
        this.tblModelCustomer = tblModelCustomer;
    }

   

    public JButton getBtnAdd3() {
        return btnAddBook;
    }

    public void setBtnAdd3(JButton btnAdd3) {
        this.btnAddBook = btnAdd3;
    }

    public JButton getBtnAddCus() {
        return btnAddCus;
    }

    public void setBtnAddCus(JButton btnAddCus) {
        this.btnAddCus = btnAddCus;
    }

    public JButton getBtnAddStaff() {
        return btnAddStaff;
    }

    public void setBtnAddStaff(JButton btnAddStaff) {
        this.btnAddStaff = btnAddStaff;
    }

    public JButton getBtnDeleteStaff() {
        return btnRemoveStaff;
    }

    public void setBtnDeleteStaff(JButton btnDeleteStaff) {
        this.btnRemoveStaff = btnDeleteStaff;
    }

    public JButton getBtnEdit() {
        return btnEditSupplier;
    }

    public void setBtnEdit(JButton btnEdit) {
        this.btnEditSupplier = btnEdit;
    }

    public JButton getBtnEdit3() {
        return btnEditBook;
    }

    public void setBtnEdit3(JButton btnEdit3) {
        this.btnEditBook = btnEdit3;
    }

    public JButton getBtnEditEdit() {
        return btnEditStaff;
    }

    public void setBtnEditEdit(JButton btnEditEdit) {
        this.btnEditStaff = btnEditEdit;
    }

    public JButton getjButton1() {
        return btnRemoveSupplier;
    }

    public void setjButton1(JButton jButton1) {
        this.btnRemoveSupplier = jButton1;
    }

    public JButton getjButton4() {
        return btnRemoveBook;
    }

    public void setjButton4(JButton jButton4) {
        this.btnRemoveBook = jButton4;
    }

    public JPanel getjPanel11() {
        return jPanel11;
    }

    public void setjPanel11(JPanel jPanel11) {
        this.jPanel11 = jPanel11;
    }

    public JPanel getjPanel12() {
        return jPanel12;
    }

    public void setjPanel12(JPanel jPanel12) {
        this.jPanel12 = jPanel12;
    }

    public JPanel getjPanel14() {
        return jPanel14;
    }

    public void setjPanel14(JPanel jPanel14) {
        this.jPanel14 = jPanel14;
    }

    public JPanel getjPanel15() {
        return jPanel15;
    }

    public void setjPanel15(JPanel jPanel15) {
        this.jPanel15 = jPanel15;
    }

    public JPanel getjPanel2() {
        return MANAGE_KHACHHANG;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.MANAGE_KHACHHANG = jPanel2;
    }

    public JPanel getjPanel3() {
        return MANAGE_NHANVIEN;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.MANAGE_NHANVIEN = jPanel3;
    }

    public JPanel getjPanel4() {
        return MANAGE_BOOK;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.MANAGE_BOOK = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public void setjPanel8(JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    public JPanel getjPanel9() {
        return jPanel9;
    }

    public void setjPanel9(JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JPanel getPanelAccount() {
        return MANAGE_NCC;
    }

    public void setPanelAccount(JPanel panelAccount) {
        this.MANAGE_NCC = panelAccount;
    }

    public JPanel getPanelBook() {
        return panelBook;
    }

    public void setPanelBook(JPanel panelBook) {
        this.panelBook = panelBook;
    }

    public JPanel getPanelCus() {
        return panelCus;
    }

    public void setPanelCus(JPanel panelCus) {
        this.panelCus = panelCus;
    }

    public JPanel getPanelStaff() {
        return panelStaff;
    }

    public void setPanelStaff(JPanel panelStaff) {
        this.panelStaff = panelStaff;
    }

    public JTable getTblAccount() {
        return tblSupplier;
    }

    public void setTblAccount(JTable tblAccount) {
        this.tblSupplier = tblAccount;
    }

    public ArrayList<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(ArrayList<Staff> staffs) {
        this.staffs = staffs;
    }

    public WriteDataToSQL getWriteData() {
        return writeData;
    }

    public void setWriteData(WriteDataToSQL writeData) {
        this.writeData = writeData;
    }

    public DefaultTableModel getTblModelStaff() {
        return tblModelStaff;
    }

    public void setTblModelStaff(DefaultTableModel tblModelStaff) {
        this.tblModelStaff = tblModelStaff;
    }

    public Staff getEditStaff() {
        return editStaff;
    }

    public void setEditStaff(Staff editStaff) {
        this.editStaff = editStaff;
    }

    public Account getEditAccount() {
        return editAccount;
    }

    public void setEditAccount(Account editAccount) {
        this.editAccount = editAccount;
    }

    public JButton getBtnEditCus() {
        return btnEditCus;
    }

    public void setBtnEditCus(JButton btnEditCus) {
        this.btnEditCus = btnEditCus;
    }

    public JButton getBtnEditStaff() {
        return btnEditStaff;
    }

    public void setBtnEditStaff(JButton btnEditStaff) {
        this.btnEditStaff = btnEditStaff;
    }

    public JButton getBtnRemoveCus() {
        return btnRemoveCus;
    }

    public void setBtnRemoveCus(JButton btnRemoveCus) {
        this.btnRemoveCus = btnRemoveCus;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

   
    public JTable getTblBook() {
        return tblBook;
    }

    public void setTblBook(JTable tblBook) {
        this.tblBook = tblBook;
    }

    public JTable getTblCustomer() {
        return tblCustomer;
    }

    public Staff getRemoveStaff() {
        return removeStaff;
    }

    public void setRemoveStaff(Staff removeStaff) {
        this.removeStaff = removeStaff;
    }

    public Account getRemoveAccount() {
        return removeAccount;
    }

    public void setRemoveAccount(Account removeAccount) {
        this.removeAccount = removeAccount;
    }

    public KhachHang getEditCustomer() {
        return editCustomer;
    }

    public void setEditCustomer(KhachHang editCustomer) {
        this.editCustomer = editCustomer;
    }

    public JButton getBtnRemoveBook() {
        return btnRemoveBook;
    }

    public void setBtnRemoveBook(JButton btnRemoveBook) {
        this.btnRemoveBook = btnRemoveBook;
    }

    public JButton getBtnRemoveStaff() {
        return btnRemoveStaff;
    }

    public void setBtnRemoveStaff(JButton btnRemoveStaff) {
        this.btnRemoveStaff = btnRemoveStaff;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public void setTblCustomer(JTable tblCustomer) {
        this.tblCustomer = tblCustomer;
    }

    public JTable getTblStaff() {
        return tblStaff;
    }

    public void setTblStaff(JTable tblStaff) {
        this.tblStaff = tblStaff;
    }

    private void showDataStaff(ArrayList<Staff> staffs) {
        for (Staff sta : staffs) {
            insertStaff(sta);
        }
    }

    public ArrayList<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(ArrayList<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public DefaultTableModel getTblModelSupplier() {
        return tblModelSupplier;
    }

    public void setTblModelSupplier(DefaultTableModel tblModelSupplier) {
        this.tblModelSupplier = tblModelSupplier;
    }

    public ArrayList<Staff> getStaffsNoIsDel() {
        return staffsNoIsDel;
    }

    public void setStaffsNoIsDel(ArrayList<Staff> staffsNoIsDel) {
        this.staffsNoIsDel = staffsNoIsDel;
    }

    public ArrayList<Account> getAccountsNoIsDel() {
        return accountsNoIsDel;
    }

    public void setAccountsNoIsDel(ArrayList<Account> accountsNoIsDel) {
        this.accountsNoIsDel = accountsNoIsDel;
    }

    public ArrayList<KhachHang> getCustomersNoIsDel() {
        return customersNoIsDel;
    }

    public void setCustomersNoIsDel(ArrayList<KhachHang> customersNoIsDel) {
        this.customersNoIsDel = customersNoIsDel;
    }

    public Staff getStaffPre() {
        return staffPre;
    }

    public void setStaffPre(Staff staffPre) {
        this.staffPre = staffPre;
    }

    public LoginFRM getLog() {
        return log;
    }

    public void setLog(LoginFRM log) {
        this.log = log;
    }

    public Supplier getEditSupplier() {
        return editSupplier;
    }

    public void setEditSupplier(Supplier editSupplier) {
        this.editSupplier = editSupplier;
    }

    public JButton getBtnAddSupplier() {
        return btnAddSupplier;
    }

    public void setBtnAddSupplier(JButton btnAddSupplier) {
        this.btnAddSupplier = btnAddSupplier;
    }

    public JButton getBtnEditManage() {
        return btnEditManage;
    }

    public void setBtnEditManage(JButton btnEditManage) {
        this.btnEditManage = btnEditManage;
    }

    public JButton getBtnEditSupplier() {
        return btnEditSupplier;
    }

    public void setBtnEditSupplier(JButton btnEditSupplier) {
        this.btnEditSupplier = btnEditSupplier;
    }

    public JButton getBtnRemoveSupplier() {
        return btnRemoveSupplier;
    }

    public void setBtnRemoveSupplier(JButton btnRemoveSupplier) {
        this.btnRemoveSupplier = btnRemoveSupplier;
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

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
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

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
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

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return THONGTIN;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.THONGTIN = jPanel1;
    }

    public JPanel getjPanel16() {
        return txt_ChucVu;
    }

    public FindDataFromSQL getFindData() {
        return findData;
    }

    public void setFindData(FindDataFromSQL findData) {
        this.findData = findData;
    }

    public SortUpDataToSQL getSortData() {
        return sortData;
    }

    public void setSortData(SortUpDataToSQL sortData) {
        this.sortData = sortData;
    }

    public String getDateCreateBook() {
        return dateCreateBook;
    }

    public void setDateCreateBook(String dateCreateBook) {
        this.dateCreateBook = dateCreateBook;
    }

    public String getKeySapXepNV() {
        return keySapXepNV;
    }

    public void setKeySapXepNV(String keySapXepNV) {
        this.keySapXepNV = keySapXepNV;
    }

    public String getGioiTinhNhanVien() {
        return GioiTinhNhanVien;
    }

    public void setGioiTinhNhanVien(String GioiTinhNhanVien) {
        this.GioiTinhNhanVien = GioiTinhNhanVien;
    }

    public String getDateCreateNV() {
        return dateCreateNV;
    }

    public void setDateCreateNV(String dateCreateNV) {
        this.dateCreateNV = dateCreateNV;
    }

    public String getSinhNhatNV() {
        return SinhNhatNV;
    }

    public void setSinhNhatNV(String SinhNhatNV) {
        this.SinhNhatNV = SinhNhatNV;
    }

    public String getNgayTaoNCC() {
        return ngayTaoNCC;
    }

    public void setNgayTaoNCC(String ngayTaoNCC) {
        this.ngayTaoNCC = ngayTaoNCC;
    }

    public String getGioiTinhKhachHang() {
        return GioiTinhKhachHang;
    }

    public void setGioiTinhKhachHang(String GioiTinhKhachHang) {
        this.GioiTinhKhachHang = GioiTinhKhachHang;
    }

    public String getSinhNhatKH() {
        return sinhNhatKH;
    }

    public void setSinhNhatKH(String sinhNhatKH) {
        this.sinhNhatKH = sinhNhatKH;
    }

    public String getNgayTaoKH() {
        return ngayTaoKH;
    }

    public void setNgayTaoKH(String ngayTaoKH) {
        this.ngayTaoKH = ngayTaoKH;
    }

    public String getKeySapXepKH() {
        return keySapXepKH;
    }

    public void setKeySapXepKH(String keySapXepKH) {
        this.keySapXepKH = keySapXepKH;
    }

    public String getKeySapXepSach() {
        return keySapXepSach;
    }

    public void setKeySapXepSach(String keySapXepSach) {
        this.keySapXepSach = keySapXepSach;
    }

    public String getKeySapXepNCC() {
        return keySapXepNCC;
    }

    public void setKeySapXepNCC(String keySapXepNCC) {
        this.keySapXepNCC = keySapXepNCC;
    }

    public ButtonGroup getKHACHHANG_GIOITINH() {
        return KHACHHANG_GIOITINH;
    }

    public void setKHACHHANG_GIOITINH(ButtonGroup KHACHHANG_GIOITINH) {
        this.KHACHHANG_GIOITINH = KHACHHANG_GIOITINH;
    }

    public JPanel getMANAGE_BOOK() {
        return MANAGE_BOOK;
    }

    public void setMANAGE_BOOK(JPanel MANAGE_BOOK) {
        this.MANAGE_BOOK = MANAGE_BOOK;
    }

    public JPanel getMANAGE_KHACHHANG() {
        return MANAGE_KHACHHANG;
    }

    public void setMANAGE_KHACHHANG(JPanel MANAGE_KHACHHANG) {
        this.MANAGE_KHACHHANG = MANAGE_KHACHHANG;
    }

    public JPanel getMANAGE_NCC() {
        return MANAGE_NCC;
    }

    public void setMANAGE_NCC(JPanel MANAGE_NCC) {
        this.MANAGE_NCC = MANAGE_NCC;
    }

    public JPanel getMANAGE_NHANVIEN() {
        return MANAGE_NHANVIEN;
    }

    public void setMANAGE_NHANVIEN(JPanel MANAGE_NHANVIEN) {
        this.MANAGE_NHANVIEN = MANAGE_NHANVIEN;
    }

    public ButtonGroup getNHANVIEN_GIOITINH() {
        return NHANVIEN_GIOITINH;
    }

    public void setNHANVIEN_GIOITINH(ButtonGroup NHANVIEN_GIOITINH) {
        this.NHANVIEN_GIOITINH = NHANVIEN_GIOITINH;
    }

    public ButtonGroup getSapXep() {
        return SapXep;
    }

    public void setSapXep(ButtonGroup SapXep) {
        this.SapXep = SapXep;
    }

    public JPanel getTHONGTIN() {
        return THONGTIN;
    }

    public void setTHONGTIN(JPanel THONGTIN) {
        this.THONGTIN = THONGTIN;
    }

    public JButton getjButton_TimkiemNcc() {
        return jButton_TimkiemNcc;
    }

    public void setjButton_TimkiemNcc(JButton jButton_TimkiemNcc) {
        this.jButton_TimkiemNcc = jButton_TimkiemNcc;
    }

    public JCheckBox getjCheckBox1() {
        return jCheckBox1;
    }

    public void setjCheckBox1(JCheckBox jCheckBox1) {
        this.jCheckBox1 = jCheckBox1;
    }

    public JCheckBox getjCheckBox2() {
        return jCheckBox2;
    }

    public void setjCheckBox2(JCheckBox jCheckBox2) {
        this.jCheckBox2 = jCheckBox2;
    }

    public JCheckBox getjCheckBox3() {
        return jCheckBox3;
    }

    public void setjCheckBox3(JCheckBox jCheckBox3) {
        this.jCheckBox3 = jCheckBox3;
    }

    public JCheckBox getjCheckBox4() {
        return jCheckBox4;
    }

    public void setjCheckBox4(JCheckBox jCheckBox4) {
        this.jCheckBox4 = jCheckBox4;
    }

    public JComboBox<String> getjComboBox_SapXepKhachHang() {
        return jComboBox_SapXepKhachHang;
    }

    public void setjComboBox_SapXepKhachHang(JComboBox<String> jComboBox_SapXepKhachHang) {
        this.jComboBox_SapXepKhachHang = jComboBox_SapXepKhachHang;
    }

    public JComboBox<String> getjComboBox_SapXepNCC() {
        return jComboBox_SapXepNCC;
    }

    public void setjComboBox_SapXepNCC(JComboBox<String> jComboBox_SapXepNCC) {
        this.jComboBox_SapXepNCC = jComboBox_SapXepNCC;
    }

    public JComboBox<String> getjComboBox_SapXepSach() {
        return jComboBox_SapXepSach;
    }

    public void setjComboBox_SapXepSach(JComboBox<String> jComboBox_SapXepSach) {
        this.jComboBox_SapXepSach = jComboBox_SapXepSach;
    }

    public JComboBox<String> getjComboBox_sapXepNv() {
        return jComboBox_sapXepNv;
    }

    public void setjComboBox_sapXepNv(JComboBox<String> jComboBox_sapXepNv) {
        this.jComboBox_sapXepNv = jComboBox_sapXepNv;
    }

    public JDateChooser getjDateChoose_ngayTaoNcc() {
        return jDateChoose_ngayTaoNcc;
    }

    public void setjDateChoose_ngayTaoNcc(JDateChooser jDateChoose_ngayTaoNcc) {
        this.jDateChoose_ngayTaoNcc = jDateChoose_ngayTaoNcc;
    }

    public JDateChooser getjDateChooser3() {
        return jDateChooser3;
    }

    public void setjDateChooser3(JDateChooser jDateChooser3) {
        this.jDateChooser3 = jDateChooser3;
    }

    public JDateChooser getjDateChooser4() {
        return jDateChooser4;
    }

    public void setjDateChooser4(JDateChooser jDateChooser4) {
        this.jDateChooser4 = jDateChooser4;
    }

    public JDateChooser getjDateChooser_DateCrateBook() {
        return jDateChooser_DateCrateBook;
    }

    public void setjDateChooser_DateCrateBook(JDateChooser jDateChooser_DateCrateBook) {
        this.jDateChooser_DateCrateBook = jDateChooser_DateCrateBook;
    }

    public JDateChooser getjDateChooser_NVDateCreate() {
        return jDateChooser_NVDateCreate;
    }

    public void setjDateChooser_NVDateCreate(JDateChooser jDateChooser_NVDateCreate) {
        this.jDateChooser_NVDateCreate = jDateChooser_NVDateCreate;
    }

    public JDateChooser getjDateChooser_NvSinhNhat() {
        return jDateChooser_NvSinhNhat;
    }

    public void setjDateChooser_NvSinhNhat(JDateChooser jDateChooser_NvSinhNhat) {
        this.jDateChooser_NvSinhNhat = jDateChooser_NvSinhNhat;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public void setjLabel22(JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public JLabel getjLabel26() {
        return jLabel26;
    }

    public void setjLabel26(JLabel jLabel26) {
        this.jLabel26 = jLabel26;
    }

    public JLabel getjLabel27() {
        return jLabel27;
    }

    public void setjLabel27(JLabel jLabel27) {
        this.jLabel27 = jLabel27;
    }

    public JLabel getjLabel28() {
        return jLabel28;
    }

    public void setjLabel28(JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    public JLabel getjLabel29() {
        return jLabel29;
    }

    public void setjLabel29(JLabel jLabel29) {
        this.jLabel29 = jLabel29;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel30() {
        return jLabel30;
    }

    public void setjLabel30(JLabel jLabel30) {
        this.jLabel30 = jLabel30;
    }

    public JLabel getjLabel31() {
        return jLabel31;
    }

    public void setjLabel31(JLabel jLabel31) {
        this.jLabel31 = jLabel31;
    }

    public JLabel getjLabel32() {
        return jLabel32;
    }

    public void setjLabel32(JLabel jLabel32) {
        this.jLabel32 = jLabel32;
    }

    public JLabel getjLabel33() {
        return jLabel33;
    }

    public void setjLabel33(JLabel jLabel33) {
        this.jLabel33 = jLabel33;
    }

    public JLabel getjLabel34() {
        return jLabel34;
    }

    public void setjLabel34(JLabel jLabel34) {
        this.jLabel34 = jLabel34;
    }

    public JLabel getjLabel35() {
        return jLabel35;
    }

    public void setjLabel35(JLabel jLabel35) {
        this.jLabel35 = jLabel35;
    }

    public JLabel getjLabel36() {
        return jLabel36;
    }

    public void setjLabel36(JLabel jLabel36) {
        this.jLabel36 = jLabel36;
    }

    public JLabel getjLabel37() {
        return jLabel37;
    }

    public void setjLabel37(JLabel jLabel37) {
        this.jLabel37 = jLabel37;
    }

    public JLabel getjLabel38() {
        return jLabel38;
    }

    public void setjLabel38(JLabel jLabel38) {
        this.jLabel38 = jLabel38;
    }

    public JLabel getjLabel39() {
        return jLabel39;
    }

    public void setjLabel39(JLabel jLabel39) {
        this.jLabel39 = jLabel39;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel40() {
        return jLabel40;
    }

    public void setjLabel40(JLabel jLabel40) {
        this.jLabel40 = jLabel40;
    }

    public JLabel getjLabel41() {
        return jLabel41;
    }

    public void setjLabel41(JLabel jLabel41) {
        this.jLabel41 = jLabel41;
    }

    public JLabel getjLabel42() {
        return jLabel42;
    }

    public void setjLabel42(JLabel jLabel42) {
        this.jLabel42 = jLabel42;
    }

    public JLabel getjLabel43() {
        return jLabel43;
    }

    public void setjLabel43(JLabel jLabel43) {
        this.jLabel43 = jLabel43;
    }

    public JLabel getjLabel44() {
        return jLabel44;
    }

    public void setjLabel44(JLabel jLabel44) {
        this.jLabel44 = jLabel44;
    }

    public JLabel getjLabel45() {
        return jLabel45;
    }

    public void setjLabel45(JLabel jLabel45) {
        this.jLabel45 = jLabel45;
    }

    public JLabel getjLabel46() {
        return jLabel46;
    }

    public void setjLabel46(JLabel jLabel46) {
        this.jLabel46 = jLabel46;
    }

    public JLabel getjLabel47() {
        return jLabel47;
    }

    public void setjLabel47(JLabel jLabel47) {
        this.jLabel47 = jLabel47;
    }

    public JLabel getjLabel48() {
        return jLabel48;
    }

    public void setjLabel48(JLabel jLabel48) {
        this.jLabel48 = jLabel48;
    }

    public JLabel getjLabel49() {
        return jLabel49;
    }

    public void setjLabel49(JLabel jLabel49) {
        this.jLabel49 = jLabel49;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.jRadioButton1 = jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.jRadioButton2 = jRadioButton2;
    }

    public JRadioButton getjRadioButton3() {
        return jRadioButton3;
    }

    public void setjRadioButton3(JRadioButton jRadioButton3) {
        this.jRadioButton3 = jRadioButton3;
    }

    public JRadioButton getjRadioButton4() {
        return jRadioButton4;
    }

    public void setjRadioButton4(JRadioButton jRadioButton4) {
        this.jRadioButton4 = jRadioButton4;
    }

    public JRadioButton getjRadioButton5() {
        return jRadioButton5;
    }

    public void setjRadioButton5(JRadioButton jRadioButton5) {
        this.jRadioButton5 = jRadioButton5;
    }

    public JRadioButton getjRadioButton7() {
        return jRadioButton7;
    }

    public void setjRadioButton7(JRadioButton jRadioButton7) {
        this.jRadioButton7 = jRadioButton7;
    }

    public JRadioButton getjRadioButton8() {
        return jRadioButton8;
    }

    public void setjRadioButton8(JRadioButton jRadioButton8) {
        this.jRadioButton8 = jRadioButton8;
    }

    public JRadioButton getjRadioButton_GiamDanKhachHang() {
        return jRadioButton_GiamDanKhachHang;
    }

    public void setjRadioButton_GiamDanKhachHang(JRadioButton jRadioButton_GiamDanKhachHang) {
        this.jRadioButton_GiamDanKhachHang = jRadioButton_GiamDanKhachHang;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public JScrollPane getjScrollPane6() {
        return jScrollPane6;
    }

    public void setjScrollPane6(JScrollPane jScrollPane6) {
        this.jScrollPane6 = jScrollPane6;
    }

    public JScrollPane getjScrollPane7() {
        return jScrollPane7;
    }

    public void setjScrollPane7(JScrollPane jScrollPane7) {
        this.jScrollPane7 = jScrollPane7;
    }

    public JTextField getjTextField_AuthorBook() {
        return jTextField_AuthorBook;
    }

    public void setjTextField_AuthorBook(JTextField jTextField_AuthorBook) {
        this.jTextField_AuthorBook = jTextField_AuthorBook;
    }

    public JTextField getjTextField_IdBook() {
        return jTextField_IdBook;
    }

    public void setjTextField_IdBook(JTextField jTextField_IdBook) {
        this.jTextField_IdBook = jTextField_IdBook;
    }

    public JTextField getjTextField_NCCBook() {
        return jTextField_NCCBook;
    }

    public void setjTextField_NCCBook(JTextField jTextField_NCCBook) {
        this.jTextField_NCCBook = jTextField_NCCBook;
    }

    public JTextField getjTextField_NameBook() {
        return jTextField_NameBook;
    }

    public void setjTextField_NameBook(JTextField jTextField_NameBook) {
        this.jTextField_NameBook = jTextField_NameBook;
    }

    public JTextField getjTextField_NumberOfBook() {
        return jTextField_NumberOfBook;
    }

    public void setjTextField_NumberOfBook(JTextField jTextField_NumberOfBook) {
        this.jTextField_NumberOfBook = jTextField_NumberOfBook;
    }

    public JTextField getjTextField_PriceBook() {
        return jTextField_PriceBook;
    }

    public void setjTextField_PriceBook(JTextField jTextField_PriceBook) {
        this.jTextField_PriceBook = jTextField_PriceBook;
    }

    public JTextField getjTextField_TypeBook() {
        return jTextField_TypeBook;
    }

    public void setjTextField_TypeBook(JTextField jTextField_TypeBook) {
        this.jTextField_TypeBook = jTextField_TypeBook;
    }

    public JLabel getTxtAccount() {
        return txtAccount;
    }

    public void setTxtAccount(JLabel txtAccount) {
        this.txtAccount = txtAccount;
    }

    public JLabel getTxtAddress() {
        return txtAddress;
    }

    public void setTxtAddress(JLabel txtAddress) {
        this.txtAddress = txtAddress;
    }

    public JLabel getTxtBankAccount() {
        return txtBankAccount;
    }

    public void setTxtBankAccount(JLabel txtBankAccount) {
        this.txtBankAccount = txtBankAccount;
    }

    public JLabel getTxtBankName() {
        return txtBankName;
    }

    public void setTxtBankName(JLabel txtBankName) {
        this.txtBankName = txtBankName;
    }

    public JLabel getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JLabel txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JLabel getTxtName() {
        return txtName;
    }

    public void setTxtName(JLabel txtName) {
        this.txtName = txtName;
    }

    public JLabel getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(JLabel txtPass) {
        this.txtPass = txtPass;
    }

    public JLabel getTxtPhone() {
        return txtPhone;
    }

    public void setTxtPhone(JLabel txtPhone) {
        this.txtPhone = txtPhone;
    }

    public JLabel getTxtPosition() {
        return txtPosition;
    }

    public void setTxtPosition(JLabel txtPosition) {
        this.txtPosition = txtPosition;
    }

    public JTextField getTxt_BankAccountNcc() {
        return txt_BankAccountNcc;
    }

    public void setTxt_BankAccountNcc(JTextField txt_BankAccountNcc) {
        this.txt_BankAccountNcc = txt_BankAccountNcc;
    }

    public JTextField getTxt_CCCDNhanVien() {
        return txt_CCCDNhanVien;
    }

    public void setTxt_CCCDNhanVien(JTextField txt_CCCDNhanVien) {
        this.txt_CCCDNhanVien = txt_CCCDNhanVien;
    }

    public JPanel getTxt_ChucVu() {
        return txt_ChucVu;
    }

    public void setTxt_ChucVu(JPanel txt_ChucVu) {
        this.txt_ChucVu = txt_ChucVu;
    }

    public JTextArea getTxt_DiaCHiNv() {
        return txt_DiaCHiNv;
    }

    public void setTxt_DiaCHiNv(JTextArea txt_DiaCHiNv) {
        this.txt_DiaCHiNv = txt_DiaCHiNv;
    }

    public JTextArea getTxt_DiaChiNcc() {
        return txt_DiaChiNcc;
    }

    public void setTxt_DiaChiNcc(JTextArea txt_DiaChiNcc) {
        this.txt_DiaChiNcc = txt_DiaChiNcc;
    }

    public JTextField getTxt_EmailNv() {
        return txt_EmailNv;
    }

    public void setTxt_EmailNv(JTextField txt_EmailNv) {
        this.txt_EmailNv = txt_EmailNv;
    }

    public JTextField getTxt_IDNcc() {
        return txt_IDNcc;
    }

    public void setTxt_IDNcc(JTextField txt_IDNcc) {
        this.txt_IDNcc = txt_IDNcc;
    }

    public JTextField getTxt_IDNhanVien() {
        return txt_IDNhanVien;
    }

    public void setTxt_IDNhanVien(JTextField txt_IDNhanVien) {
        this.txt_IDNhanVien = txt_IDNhanVien;
    }

    public JTextArea getTxt_KhachHangDiaChi() {
        return txt_KhachHangDiaChi;
    }

    public void setTxt_KhachHangDiaChi(JTextArea txt_KhachHangDiaChi) {
        this.txt_KhachHangDiaChi = txt_KhachHangDiaChi;
    }

    public JTextField getTxt_KhachHangEmail() {
        return txt_KhachHangEmail;
    }

    public void setTxt_KhachHangEmail(JTextField txt_KhachHangEmail) {
        this.txt_KhachHangEmail = txt_KhachHangEmail;
    }

    public JTextField getTxt_KhachHangID() {
        return txt_KhachHangID;
    }

    public void setTxt_KhachHangID(JTextField txt_KhachHangID) {
        this.txt_KhachHangID = txt_KhachHangID;
    }

    public JTextField getTxt_KhachHangName() {
        return txt_KhachHangName;
    }

    public void setTxt_KhachHangName(JTextField txt_KhachHangName) {
        this.txt_KhachHangName = txt_KhachHangName;
    }

    public JTextField getTxt_KhachHangPhone() {
        return txt_KhachHangPhone;
    }

    public void setTxt_KhachHangPhone(JTextField txt_KhachHangPhone) {
        this.txt_KhachHangPhone = txt_KhachHangPhone;
    }

    public JTextField getTxt_KhachHangScores() {
        return txt_KhachHangScores;
    }

    public void setTxt_KhachHangScores(JTextField txt_KhachHangScores) {
        this.txt_KhachHangScores = txt_KhachHangScores;
    }

    public JTextField getTxt_LuongNv() {
        return txt_LuongNv;
    }

    public void setTxt_LuongNv(JTextField txt_LuongNv) {
        this.txt_LuongNv = txt_LuongNv;
    }

    public JTextField getTxt_NameNcc() {
        return txt_NameNcc;
    }

    public void setTxt_NameNcc(JTextField txt_NameNcc) {
        this.txt_NameNcc = txt_NameNcc;
    }

    public JTextField getTxt_NameNv() {
        return txt_NameNv;
    }

    public void setTxt_NameNv(JTextField txt_NameNv) {
        this.txt_NameNv = txt_NameNv;
    }

    public JTextField getTxt_PhoneNcc() {
        return txt_PhoneNcc;
    }

    public void setTxt_PhoneNcc(JTextField txt_PhoneNcc) {
        this.txt_PhoneNcc = txt_PhoneNcc;
    }

    public JTextField getTxt_PhoneNv() {
        return txt_PhoneNv;
    }

    public void setTxt_PhoneNv(JTextField txt_PhoneNv) {
        this.txt_PhoneNv = txt_PhoneNv;
    }

    public JTextField getTxt_bankNameNcc() {
        return txt_bankNameNcc;
    }

    public void setTxt_bankNameNcc(JTextField txt_bankNameNcc) {
        this.txt_bankNameNcc = txt_bankNameNcc;
    }
    
    public void setjPanel16(JPanel jPanel16) {
        this.txt_ChucVu = jPanel16;
    }

    public JPanel getjPanel17() {
        return jPanel17;
    }

    public void setjPanel17(JPanel jPanel17) {
        this.jPanel17 = jPanel17;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JLabel getLbpass() {
        return lbpass;
    }

    public void setLbpass(JLabel lbpass) {
        this.lbpass = lbpass;
    }

    public JTable getTblSupplier() {
        return tblSupplier;
    }

    public void setTblSupplier(JTable tblSupplier) {
        this.tblSupplier = tblSupplier;
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup KHACHHANG_GIOITINH;
    private javax.swing.JPanel MANAGE_BOOK;
    private javax.swing.JPanel MANAGE_HOADON;
    private javax.swing.JPanel MANAGE_KHACHHANG;
    private javax.swing.JPanel MANAGE_NCC;
    private javax.swing.JPanel MANAGE_NHANVIEN;
    private javax.swing.JPanel MANAGE_THONGKE;
    private javax.swing.ButtonGroup NHANVIEN_GIOITINH;
    private javax.swing.ButtonGroup SapXep;
    private javax.swing.JPanel THONGTIN;
    private javax.swing.JButton b_TimKiem;
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddCus;
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnEditBook;
    private javax.swing.JButton btnEditCus;
    private javax.swing.JButton btnEditManage;
    private javax.swing.JButton btnEditStaff;
    private javax.swing.JButton btnEditSupplier;
    private javax.swing.ButtonGroup btnGroup_Sort;
    private javax.swing.JButton btnRemoveBook;
    private javax.swing.JButton btnRemoveCus;
    private javax.swing.JButton btnRemoveStaff;
    private javax.swing.JButton btnRemoveSupplier;
    private javax.swing.JComboBox<String> comboBox_SapXepHD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton_TimkiemNcc;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox_SapXepKhachHang;
    private javax.swing.JComboBox<String> jComboBox_SapXepNCC;
    private javax.swing.JComboBox<String> jComboBox_SapXepSach;
    private javax.swing.JComboBox<String> jComboBox_sapXepNv;
    private com.toedter.calendar.JDateChooser jDateChoose_ngayTaoNcc;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser_DateCrateBook;
    private com.toedter.calendar.JDateChooser jDateChooser_NVDateCreate;
    private com.toedter.calendar.JDateChooser jDateChooser_NvSinhNhat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton_GiamDanKhachHang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_AuthorBook;
    private javax.swing.JTextField jTextField_IdBook;
    private javax.swing.JTextField jTextField_NCCBook;
    private javax.swing.JTextField jTextField_NameBook;
    private javax.swing.JTextField jTextField_NumberOfBook;
    private javax.swing.JTextField jTextField_PriceBook;
    private javax.swing.JTextField jTextField_TypeBook;
    private javax.swing.JLabel lbpass;
    private javax.swing.JPanel pan_TT;
    private javax.swing.JPanel pan_bieuDoTron;
    private javax.swing.JPanel pan_doanhThuTheoThang;
    private javax.swing.JPanel panelBook;
    private javax.swing.JPanel panelCus;
    private javax.swing.JPanel panelStaff;
    private javax.swing.JRadioButton radio_Giam;
    private javax.swing.JRadioButton radio_Tang;
    private javax.swing.JTable tblBook;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTable tbl_HoaDon;
    private javax.swing.JLabel txtAccount;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtBankAccount;
    private javax.swing.JLabel txtBankName;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPass;
    private javax.swing.JLabel txtPhone;
    private javax.swing.JLabel txtPosition;
    private javax.swing.JTextField txt_BankAccountNcc;
    private javax.swing.JTextField txt_CCCDNhanVien;
    private javax.swing.JPanel txt_ChucVu;
    private javax.swing.JTextArea txt_DiaCHiNv;
    private javax.swing.JTextArea txt_DiaChiNcc;
    private javax.swing.JTextField txt_EmailNv;
    private javax.swing.JTextField txt_IDNcc;
    private javax.swing.JTextField txt_IDNhanVien;
    private javax.swing.JTextArea txt_KhachHangDiaChi;
    private javax.swing.JTextField txt_KhachHangEmail;
    private javax.swing.JTextField txt_KhachHangID;
    private javax.swing.JTextField txt_KhachHangName;
    private javax.swing.JTextField txt_KhachHangPhone;
    private javax.swing.JTextField txt_KhachHangScores;
    private javax.swing.JTextField txt_LuongNv;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_NameNcc;
    private javax.swing.JTextField txt_NameNv;
    private com.toedter.calendar.JDateChooser txt_NgayLap;
    private javax.swing.JTextField txt_PhoneNcc;
    private javax.swing.JTextField txt_PhoneNv;
    private javax.swing.JTextField txt_ThanhTien;
    private javax.swing.JTextField txt_bankNameNcc;
    private javax.swing.JTextField txt_maHD;
    private javax.swing.JTextField txt_maNV;
    // End of variables declaration//GEN-END:variables

    private void addActionLister() {
        this.btnEditBook.addActionListener(this);
        this.btnAddCus.addActionListener(this);
        this.btnAddStaff.addActionListener(this);
        this.btnEditStaff.addActionListener(this);
        this.btnEditCus.addActionListener(this);
        this.btnRemoveBook.addActionListener(this);
        this.btnRemoveCus.addActionListener(this);
        this.btnRemoveStaff.addActionListener(this);
        this.btnEditManage.addActionListener(this);
        this.btnAddSupplier.addActionListener(this);
        this.btnEditSupplier.addActionListener(this);
        this.btnRemoveSupplier.addActionListener(this);
        this.btnAddBook.addActionListener(this);
        this.btnRemoveBook.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(this.btnAddSupplier)) {
            GUI.AddSupplierDialog addSupplierDialog = new AddSupplierDialog(this,
                    rootPaneCheckingEnabled, this);
            addSupplierDialog.setVisible(true);

        }
        if (src.equals(btnAddCus)) {
            GUI.RegisterCustomerFRM registerFrm = new RegisterCustomerFRM(this,
                    customers, RegisterCustomerFRM.MANAGE);
            registerFrm.setVisible(true);
        }
        if (src.equals(btnAddStaff)) {
            GUI.AddStaff addStaffDialog = new AddStaff(this,
                    rootPaneCheckingEnabled, this);
            addStaffDialog.setVisible(true);
        }
        if (src.equals(this.btnAddBook)) {
            GUI.AddBookDialog addBookDialog = new AddBookDialog(this,
                    rootPaneCheckingEnabled, this, AddBookDialog.BTN_ADD);
            addBookDialog.setVisible(true);
        }
        if (src.equals(btnEditStaff)) {
            editStaff = new Staff();
            editStaff = this.selectedEditStaff();
           // System.out.println(editStaff.toString());
            if (!editStaff.getAddress().equals("")) {
                EditStaffDialog editStaffDialog = new EditStaffDialog(this,
                        rootPaneCheckingEnabled, this, editStaff, GUI.EditStaffDialog.LOACTION_HOME_MANAGE);
                editStaffDialog.setVisible(true);
            }
        }
        if (src.equals(btnEditCus)) {
            editCustomer = new KhachHang();
            editCustomer = this.selectEditCustomer();
            if (!editCustomer.getMaKH().equals("")) {
                GUI.EditCustomerDialog editCustomerDialog
                        = new EditCustomerDialog(this, rootPaneCheckingEnabled,
                                this, GUI.EditCustomerDialog.LOCATION_MANAGE);
                editCustomerDialog.setVisible(true);
            }

        }
        if (src.equals(this.btnEditManage)) {
            for (Staff staff : staffs) {
                if (staff.getAccountStr().equals(this.log.getAccPre().getAccount())) {
                    staffPre = staff;
                }
            }
            GUI.EditStaffDialog editStaffDialog = new EditStaffDialog(this,
                    rootPaneCheckingEnabled, this, staffPre, 2);
            editStaffDialog.setVisible(true);
        }
        if (src.equals(this.btnEditSupplier)) {
            editSupplier = new Supplier();
            editSupplier = selectEditSupplier();
            if (!editSupplier.getAddress().equals("")) {
                GUI.EditSupplierDialog editSupplierDialog = new EditSupplierDialog(this,
                        rootPaneCheckingEnabled, this, editSupplier);
                editSupplierDialog.setVisible(true);
            }

        }
        if (src.equals(this.btnEditBook)) {
            this.editBook = new Book();
            this.editBook = selectBook();
            if (!this.editBook.getAuthor().equals("")) {
                System.out.println("haha");
                GUI.AddBookDialog addBookDialog = new AddBookDialog(this,
                        rootPaneCheckingEnabled, this, AddBookDialog.BTN_UPDATE);
                addBookDialog.setVisible(true);
            }

        }
        if (src.equals(btnRemoveBook)) {
            selectRemoveBook();
//            JOptionPane.showConfirmDialog(panelAccount,"Bạn đã xóa sách thành công!");
        }
        if (src.equals(btnRemoveSupplier)) {
            selectRemoveSupplier();
        }
        if (src.equals(btnRemoveCus)) {
            selectedRemoveCus();
        }
        if (src.equals(btnRemoveStaff)) {
            selectedRemoveStaff();

        }

    }

    public void insertCustomer(KhachHang c) {
        boolean x = true;
        boolean sex = true;
        if (c.getSex().equals("1")) {
            sex = true;
        } else if (c.getSex().equals("0")) {
            sex = false;
        }
        Object[] row = new Object[]{c.getMaKH(), c.getTenKH(), c.getNgaySinh(),
            c.getDiaChi(), c.getPhone(), sex, c.getDiem(), c.getEmail(), c.getDateCreate()};
        this.tblModelCustomer.addRow(row);
//            tblModelCustomer.fireTableDataChanged();
    }

    

    public void loadData() {
        this.customers = new ArrayList<KhachHang>();
        this.customers = (ArrayList<KhachHang>) readData.readCustomer();
        this.accounts = new ArrayList<Account>();
        this.accounts = (ArrayList<Account>) readData.readAccount();
        showDataCustomer(customers);
//        showDataAccount(accounts);
    }

    private void showDataCustomer(ArrayList<KhachHang> customers) {
        for (KhachHang c : customers) {
            insertCustomer(c);
        }
    }

//    private void showDataAccount(ArrayList<Account> accounts) {
//        for (Account a : accounts) {
//            insertAccount(a);
//        }
//    }

    private void deleteDataInTable(ArrayList<KhachHang> customers, ArrayList<Account> accounts) {
        if (customers.size() > 0) {
            for (int i = customers.size() - 2; i >= 0; i--) {
                tblModelCustomer.removeRow(i);
            }
        }
//        if (accounts.size() > 0) {
//            for (int i = accounts.size() - 2; i >= 0; i--) {
//                tblModelAccount.removeRow(i);
//            }
//        }

    }
    
    private void showDataHoaDon(ArrayList<HoaDon_DTO> hoadon) {
        hoadon = hdBUS.getAllHD();
        loadHoaDonList(hoadon);
    }

    private void insertStaff(Staff sta) {
        float bonus = Float.parseFloat( sta.getBonus()) ;
        float luong =  Float.parseFloat( sta.getSalary()) ; 
        Object[] row = new Object[]{sta.getID(), sta.getName(), sta.getSex(),
            sta.getBirthDay(), sta.getAddress(), sta.getPhone(), sta.getBankAccount(),
            sta.getNameBank(), sta.getEmail(), sta.getCCCD(), formatTotalPrice(luong),
            formatTotalPrice(bonus), sta.getAccountStr(), sta.getDateCreate()};
        this.tblModelStaff.addRow(row);
        this.tblModelStaff.fireTableDataChanged();
    }

    public void refreshTable() {
        deleteDataInTable(customers, accounts);
        this.loadData();
    }

    private void loadDataFromSQL() {
        staffs = new ArrayList<Staff>();
        accounts = new ArrayList<Account>();
        customers = new ArrayList<KhachHang>();
        suppliers = new ArrayList<Supplier>();
        books = new ArrayList<Book>();
        this.suppliersNoIsDel = new ArrayList<DTO.Supplier>();
        this.staffsNoIsDel = new ArrayList<DTO.Staff>();
        this.customersNoIsDel = new ArrayList<DTO.KhachHang>();
        this.accountsNoIsDel = new ArrayList<DTO.Account>();
        this.booksNoIsDel = new ArrayList<DTO.Book>();

        accounts = (ArrayList<Account>) readData.readAccount();
        customers = (ArrayList<KhachHang>) readData.readCustomer();
        staffs = (ArrayList<Staff>) readData.readStaff();
        suppliers = (ArrayList<Supplier>) readData.readSupplier();
        books = (ArrayList<Book>) readData.readBook();
        this.suppliersNoIsDel = (ArrayList<Supplier>) readData.readSupplierNoIsDel();
        this.staffsNoIsDel = (ArrayList<Staff>) readData.readStaffNoIsDel();
        this.customersNoIsDel = (ArrayList<KhachHang>) readData.readCustomerNoIsDel();
        this.accountsNoIsDel = (ArrayList<Account>) readData.readAccountNoIsDel();
        this.booksNoIsDel = (ArrayList<Book>) readData.readBookNoIsDel();
        updateAutoIdCustomer();
        updateAutoIdStaff();
    }

    private void updateAutoIdCustomer() {
        int max = -1;
        for (KhachHang c : customers) {
            int tmp = Integer.parseInt(c.getMaKH().substring(2));
            if (max < tmp) {
                max = tmp;
            }
        }
        KhachHang.setCount(max + 1);
    }

    int addCustomerCallBack(KhachHang KH,int c) {
        int x = 0;
        DAL.WriteDataToSQL writeData = new WriteDataToSQL();
        writeData.insertDataAccount(KH.getAccount());
        x = writeData.insertDataCustomer(KH);
        System.out.println(x);
        if (x != -1) {
            c=1;
            this.customers.add(KH);
            this.accounts.add(KH.getAccount());
            this.insertCustomer(KH);
//            this.insertAccount(KH.getAccount());

        }
        if (x == -1) {
            DAL.EditDataToSQL.removeDataAccount(KH.getAccount());
            c=-1;
            return -1;
        }
        return 1;

    }

    private void updateAutoIdStaff() {
        int max = -1;
        for (Staff sta : staffs) {
            int tmp = Integer.parseInt(sta.getID().substring(3));
            if (max < tmp) {
                max = tmp;
            }
        }
        Staff.setCount(max + 1);
    }

    public int addStaffCallBack(Staff staff,int c) {
        
        updateAutoIdStaff();
//        try {
        DAL.WriteDataToSQL.insertDataAccount(staff.getAccount());
        int x = DAL.WriteDataToSQL.insertDataStaff(staff);
        insertStaff(staff);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(panelAccount,"Ngày tháng sai!");
//        }
        if (x != -1) {
            staffs.add(staff);
            accounts.add(staff.getAccount());
            c=0;
            return 1;
        } else {
            c=-1;
            DAL.EditDataToSQL.removeDataAccount(staff.getAccount());
            return -1;
        }
//        return 1;

    }

    //những nét cơ bản của nghệ thuật quâm sự việt nam trong quá trình đánh bại chiến lược "Việt Nam hóa chiến "
    public Staff selectedEditStaff() {
        Staff sta = new Staff();
        if (staffs.size() > 0) {
            var index = tblStaff.getSelectedRow();
            if (index != -1) {
                sta = this.staffs.get(index);
                for (Staff s : staffs) {
                    if (s.getID().equals(sta.getID())) {
                        sta = s;
                        break;
                    }
                }

            } else {
                JOptionPane.showMessageDialog(MANAGE_NCC,
                        "Bạn chưa chọn Nhân Viên!");
            }
        } else {
            JOptionPane.showMessageDialog(MANAGE_NCC,
                    "Danh Sách Rỗng!");
        }
        return sta;

    }

    public void selectAccount() {
        editAccount = new Account();
        for (Account a : accounts) {
            if (this.editStaff.getAccountStr().equals(a.getAccount())) {
                this.editAccount = a;
            }
        }
    }

    void editStaffAndAccountCallBackHomeManage(String address,
            String bankAccount, String bonus, String email, String name,
            String phone, String salary, String bankName, int indexComboBox,
            String pass, String account, String position) {
        editStaffAndAccountInList(address, bankAccount, bonus, email, name,
                phone, salary, bankName, indexComboBox, pass, account, position);
        editStaffAndAccountInTable(address, bankAccount, bonus, email, name,
                phone, salary, bankName, indexComboBox, pass, account, position);

    }

    private void editStaffAndAccountInList(String address, String bankAccount,
            String bonus, String email, String name, String phone, String salary,
            String bankName, int indexComboBox, String pass, String account,
            String position) {
        for (Staff s : staffs) {
            if (this.editStaff.getID().equals(s.getID())) {
                s.editStaff(address, bankAccount, bonus, email, name, phone, salary, bankName);
                DAL.EditDataToSQL.editDataStaff(s);
                break;
            }
        }
        for (Account a : accountsNoIsDel) {
            if (this.editAccount.getAccount().equals(a.getAccount())) {
                a.editAccount(pass, position);
                DAL.EditDataToSQL.editDataAccount(a);
                break;
            }
        }

    }

    private void editStaffAndAccountInTable(String address, String bankAccount,
            String bonus, String email, String name, String phone, String salary,
            String bankName, int indexComboBox, String pass, String account, String position) {
        if (this.staffs.size() > 0) {
            int i = -1;
            for (Staff s : staffs) {
                i += 1;
                if (this.editStaff.getID().equals(s.getID())) {
                    break;
                }
            }
            System.out.println("haha" + i);
            this.tblModelStaff.removeRow(i);
            editStaffTable(this.editStaff, i);
            int x = -1;
            for (Account a : accountsNoIsDel) {
                x += 1;
                if (this.editAccount.getAccount().equals(a.getAccount())) {
                    break;
                }
            }
            System.out.println(x);
//            this.tblModelAccount.removeRow(x);
            editAccountTable(this.editAccount, x);

        } else {
            JOptionPane.showMessageDialog(MANAGE_NCC, "Bảng chưa có dữ liệu!");
        }
    }

    private void editStaffTable(Staff sta, int i) {
        Object[] row = new Object[]{sta.getID(), sta.getName(), sta.getSex(), sta.getBirthDay(), sta.getAddress(), sta.getPhone(), sta.getBankAccount(), sta.getNameBank(), sta.getEmail(), sta.getCCCD(), sta.getSalary(), sta.getBonus(), sta.getAccountStr(), WriteDataToSQL.getDay()};
        this.tblModelStaff.insertRow(i, row);
        this.tblModelStaff.fireTableDataChanged();
    }

    private void editAccountTable(Account a, int i) {
        Object[] row = new Object[]{
            a.getAccount(), a.getPassword(), a.getPosition(), WriteDataToSQL.getDay()
        };
//        this.tblModelAccount.insertRow(i, row);
    }

    private void selectedRemoveStaff() {
        Staff staff = new Staff();
        Account acc = new Account();
        int index = -1;
        if (this.staffs.size() > 0) {
            index = tblStaff.getSelectedRow();
            if (index != -1) {

                staff = this.staffs.get(index);
                this.staffs.remove(staff);
                this.tblModelStaff.removeRow(index);
                int x = -1;
                for (Account s : accounts) {
                    x += 1;
                    System.out.println(staff.getAccountStr());
                    if (s.getAccount().equals(staff.getAccountStr())) {
                        acc = s;
                        break;
                    }
                }
//                this.tblModelAccount.removeRow(x);
                this.accounts.remove(acc);
                DAL.EditDataToSQL.removeStaff(staff);
                DAL.EditDataToSQL.removeAccount(acc);
            } else {
                JOptionPane.showMessageDialog(MANAGE_NCC, "Bạn chưa chọn Nhân Viên để xóa!");
            }

        } else {
            JOptionPane.showMessageDialog(MANAGE_NCC, "Bảng chưa có dữ liệu!");
        }

    }

    private void selectedRemoveCus() {
        KhachHang customer = new KhachHang();
        int index = -1;
        Account acc = new Account();
        if (this.customers.size() > 0) {
            index = tblCustomer.getSelectedRow();
            if (index != -1) {
                customer = this.customers.get(index);
                this.customers.remove(customer);
                int i = -1;
                for (Account s : accounts) {
                    i++;
                    if (s.equals(customer.getAccount())) {
                        acc = s;
                        break;
                    }
                }
                this.accounts.remove(acc);
                DAL.EditDataToSQL.removeCustomer(customer);
                DAL.EditDataToSQL.removeAccount(acc);
//                tblModelAccount.removeRow(i);
                tblModelCustomer.removeRow(index);
            } else {
                JOptionPane.showMessageDialog(MANAGE_NCC, "Bạn chưa chọn Nhân Viên để xóa!");
            }

        } else {
            JOptionPane.showMessageDialog(MANAGE_NCC, "Bảng chưa có dữ liệu!");
        }
    }

    void EditCustomerCallBackHomeManage(String NAME, String ADDRESS, String PHONE, String MAIL, String ACCOUNT, String PASS) {
        editCustomerInList(NAME, ADDRESS, PHONE, MAIL, ACCOUNT, PASS);
        editCustomerInTable(NAME, ADDRESS, PHONE, MAIL, ACCOUNT, PASS);
    }

    private KhachHang selectEditCustomer() {
        KhachHang cus = new KhachHang();
        if (this.customers.size() > 0) {
            int index = tblCustomer.getSelectedRow();
            if (index != -1) {
                cus = this.customers.get(index);
            } else {
                JOptionPane.showMessageDialog(MANAGE_NCC, "Bạn chưa chọn ô để sửa!");
            }
        } else {
            JOptionPane.showMessageDialog(MANAGE_NCC, "Bảng chưa có dữ liệu!");
        }
    //   //
    //System.out.println(cus.toString());
        return cus;

    }

    private void editCustomerInList(String NAME, String ADDRESS, String PHONE, String MAIL, String ACCOUNT, String PASS) {
        for (KhachHang cus : this.customers) {
            if (cus.getMaKH().equals(this.editCustomer.getMaKH())) {
                cus.updateData(NAME, ADDRESS, PHONE, MAIL, ACCOUNT, PASS);
                DAL.EditDataToSQL.editDataCustomer(cus);
                break;

            }
        }
        for (Account acc : accounts) {
            if (acc.getAccount().equals(this.editCustomer.getAccount1())) {
                acc.setPassword(PASS);
                DAL.EditDataToSQL.editDataAccount(acc);
                break;
            }
        }
    }

    private void editCustomerInTable(String NAME, String ADDRESS, String PHONE, String MAIL, String ACCOUNT, String PASS) {
        int i = -1;
        this.editCustomer.updateData(NAME, ADDRESS, PHONE, MAIL, ACCOUNT, PASS);
        for (KhachHang cus : this.customers) {
            i = i + 1;

            if (cus.getMaKH().equals(this.editCustomer.getMaKH())) {
                break;
            }
        }
//        System.out.println(i);
        this.tblModelCustomer.removeRow(i);
        insertCustomerInTable(this.editCustomer, i);
    }

    private void insertCustomerInTable(KhachHang c, int i) {

        boolean x = true;
        boolean sex = true;
        if (c.getSex().equals("1")) {
            sex = true;
        } else if (c.getSex().equals("0")) {
            sex = false;
        }
        Object[] row = new Object[]{c.getMaKH(), c.getTenKH(), c.getNgaySinh(), c.getDiaChi(), c.getPhone(), sex, c.getDiem(), c.getEmail(), WriteDataToSQL.getDay()};
        this.tblModelCustomer.insertRow(i, row);
        int i1 = -1;
        for (Account a : accounts) {
            i1 += 1;
            if (c.getAccount().getAccount().equals(a.getAccount())) {
                break;
            }
        }
        System.out.println(x);
//        this.tblModelAccount.removeRow(i1);
        editAccountTable(this.editCustomer.getAccount(), i1);
    }

    public void loadInforManage(Account accPre) {
        this.txtAccount.setText(accPre.getAccount());
        this.txtPass.setText(accPre.getPassword());
        if (accPre.getPosition().equals("Staff")) {
            this.txtPosition.setText("Nhân Viên");
        } else if (accPre.getPosition().equals("Stocker")) {
            this.txtPosition.setText("Thủ Kho");

        } else if (accPre.getPosition().equals("Manage")) {
            this.txtPosition.setText("Quản Lý");
        }
        Staff sta = new Staff();
        for (Staff s : staffs) {
            if (s.getAccount().getAccount().equals(accPre.getAccount())) {
                sta = s;
                break;
            }
        }
        this.txtAddress.setText(sta.getAddress());
        this.txtBankAccount.setText(sta.getBankAccount());
        this.txtBankName.setText(sta.getBankName());
        this.txtEmail.setText(sta.getEmail());
        this.txtName.setText(sta.getName());
        this.txtPhone.setText(sta.getPhone());
    }

    public void showSuplierToTable(ArrayList<DTO.Supplier> suppliers) {

        for (Supplier s : suppliers) {
//         //   System.out.println(s.toString());
            addSupplierToTable(s);
        }
    }

    void addSupplierToTable(Supplier supplier) {
        Object[] row;
        row = new Object[]{
            supplier.getID(),
            supplier.getName(), supplier.getPhone(),
            supplier.getAddress(), supplier.getBankAccount(), supplier.getBankName(),
            supplier.getDateCreate()
        };
       // System.out.println(supplier.getID());
        this.tblModelSupplier.addRow(row);

    }

//    public void showSuplierToTable(ArrayList<BUS.Supplier> suppliers) {
//
//        for (Supplier s
//                : suppliers) {
//            System.out.println(s.toString());
//            addSupplierToTable(s);
//        }
//    }

//    void addSupplierToTable(Supplier supplier) {
//        Object[] row;
//        row = new Object[]{
//            supplier.getID(),
//            supplier.getName(), supplier.getPhone(),
//            supplier.getAddress(), supplier.getBankAccount(), supplier.getBankName(),
//            supplier.getDateCreate()
//        };
//        System.out.println(supplier.getID());
//        this.tblModelSupplier.addRow(row);
//
//    }

    void addSupplierToTable(int i, Supplier supplier) {
        Object[] row;
        row = new Object[]{
            supplier.getID(),
            supplier.getName(), supplier.getPhone(),
            supplier.getAddress(), supplier.getBankAccount(), supplier.getBankName(),
            supplier.getDateCreate()
        };
       // System.out.println(supplier.getID());
        this.tblModelSupplier.insertRow(i, row);

    }

    private Supplier selectEditSupplier() {
        DTO.Supplier supplier = new Supplier();
        supplier.setName("c");
        if (this.suppliers.size() > 0) {
            int index = this.tblSupplier.getSelectedRow();
            if (index != -1) {
                supplier = this.suppliers.get(index);
                //System.out.println(supplier.toString());
            } else {
                JOptionPane.showMessageDialog(MANAGE_NCC,
                        "Bạn chưa chọn nhà cung cấp!");
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "Bảng chưa có dữ liệu");
        }
        return supplier;

    }

    void addInListSupplier(Supplier supplier) {
        this.suppliers.add(supplier);
    }

    void editSupplierCallBackHomeManager(String name, String address, String phone, String bankAccount, String bankName) {
        this.editSupplier.edit(name, address, phone, bankAccount, bankName);
        editSupplier(name, address, phone, bankAccount, bankName);
    }

    private void editSupplier(String name, String address, String phone, String bankAccount, String bankName) {
        int i = -1;
        for (Supplier s : suppliers) {
            i++;
            if (s.getID().equals(this.editSupplier.getID())) {
                s.edit(name, address, phone, bankAccount, bankName);
                break;
            }
        }
        this.tblModelSupplier.removeRow(i);
        addSupplierToTable(i, editSupplier);
        DAL.EditDataToSQL.editDataSupplier(editSupplier);

    }

    private void selectRemoveSupplier() {
        if (this.suppliers.size() > 0) {
            int index = this.tblSupplier.getSelectedRow();
            this.editSupplier = this.suppliers.get(index);
            if (index != -1) {
                this.suppliers.remove(index);
                this.tblModelSupplier.removeRow(index);
                DAL.EditDataToSQL.removeSupllier(editSupplier);
                JOptionPane.showMessageDialog(MANAGE_NCC,"Bạn Xóa Nhà Cung Cấp Thành Công!");
            } else {
                JOptionPane.showMessageDialog(MANAGE_NCC, "Bạn chưa chọn nhà cung cấp!");
            }
        } else {
            JOptionPane.showMessageDialog(MANAGE_NCC, "Bảng chưa có dữ liệu");
        }

    }

    int AddBookCallBackHomeManage(Book book) {
        int c = 0;
        c = DAL.WriteDataToSQL.insertDataBook(book);
        if (c != -1) {
            insertBookToTable(book);
            this.books.add(book);
            return 0;
        } else {
            return -1;
        }

    }

    private void ShowBookToTable(ArrayList<Book> books) {
        for (Book b : books) {
            insertBookToTable(b);
        }
    }

    private void insertBookToTable(Book b) {
        Object[] row;
        row = new Object[]{
            b.getID(), b.getName(), b.getType(), b.getAuthor(),formatTotalPrice(Float.parseFloat(b.getPrice()))  ,
            b.getQuanaty(), b.getID_SUPPLIER(), b.getDateCreate()

        };
        tblModelBook.addRow(row);
    }

    private Book selectBook() {
        Book book = new Book();
        if (this.books.size() > 0) {
            int index = this.tblBook.getSelectedRow();
            if (index != -1) {
                book = this.books.get(index);
            } else {
                JOptionPane.showMessageDialog(MANAGE_NCC,
                        "Bạn chưa chọn trường dữ liệu");
            }

        } else {
            JOptionPane.showMessageDialog(MANAGE_NCC,
                    "Bảng chưa có dữ liệu");
        }
      // // System.out.println(book.toString());
        return book;
    }

    void EditBookCallBackManage() {
        editBookInList();
        editbookInTable();
    }

    private void editBookInList() {
        for (DTO.Book b : books) {
            if (b.getID().equals(this.editBook.getID())) {
                b.edit(getEditBook().getName(), getEditBook().getType(),
                        getEditBook().getQuanaty(), getEditBook().getAuthor(),
                        getEditBook().getPrice(), getEditBook().getDateComposition(),
                        getEditBook().getID_SUPPLIER(), getEditBook().getDetails(), editBook.getSourceIMG());
            }
        }

    }

    private void editbookInTable() {
        int index = -1;
        for (Book b : books) {
            index += 1;
            if (b.getID().equals(this.editBook.getID())) {
                break;
            }
        }
        this.tblModelBook.removeRow(index);
        addBookAtIndex(index, this.editBook);
    }

    private void addBookAtIndex(int index, Book b) {
        Object[] row;
        row = new Object[]{
            b.getID(), b.getName(), b.getType(), b.getAuthor(), b.getPrice(),
            b.getQuanaty(), b.getID_SUPPLIER(), b.getDateCreate()

        };
        this.tblModelBook.insertRow(index, row);
    }

    private void selectRemoveBook() {
        this.editBook = new Book();
      

        if (this.books.size() > 0) {
              int index = this.tblBook.getSelectedRow();
            if (index != -1) {
                
                this.editBook = this.books.get(index);
                this.books.remove(index);
                this.tblModelBook.removeRow(index);
                DAL.EditDataToSQL.removeBook(editBook);
                JOptionPane.showMessageDialog(MANAGE_NCC, "Bạn đã xóa sách thành công!");
                
            } else if(index==-1){
                JOptionPane.showMessageDialog(MANAGE_NCC, "Bạn chưa chọn sách để xóa!");
            }

        } else {
            JOptionPane.showMessageDialog(MANAGE_NCC, "Bảng chưa có dữ liệu");
        }
    }
     public void loadEmployeeList(ArrayList<Book_DTO> books) {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("MÃ SÁCH");
        dtm.addColumn("TÊN SÁCH");
        dtm.addColumn("LOẠI SÁCH");
        dtm.addColumn("TÁC GIẢ");
        dtm.addColumn("GIÁ");
        dtm.addColumn("SỐ LƯỢNG");
        dtm.addColumn("NHÀ CUNG CẤP");
        dtm.addColumn("DATE CREATE");
        
        tblBook.setModel(dtm);
        
        ArrayList<Book_DTO> arr = new ArrayList<Book_DTO>();
        //arr = empBUS.getAllEmployees();
        arr = books;
        for (int i = 0; i < arr.size(); i++) {
            Book_DTO em = arr.get(i);
            String maSach = em.getID();
            String nameSach = em.getName();
            String theLoai = em.getType();
            String tacGia = em.getAuthor();
            String giaSach = em.getPrice();
            String soLuong = em.getQuanaty();
            String nhaCungCap = em.getID_SUPPLIER();
            String ngayTao = em.getDateCreate();

            Object[] row = {maSach, nameSach, theLoai, tacGia, giaSach , soLuong, nhaCungCap, ngayTao};
            dtm.addRow(row);
        }
    }
     
     public void loadNhanVienList(ArrayList<Staff> staff) {
       DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NAME");
        dtm.addColumn("MALES");
        dtm.addColumn("BIRTHDAY");
        dtm.addColumn("ADDRESS");
        dtm.addColumn("PHONE");
        dtm.addColumn("BANKACCOUNT");
        dtm.addColumn("BANKNAME");
        dtm.addColumn("EMAIL");
        dtm.addColumn("CCCD");
        dtm.addColumn("SALARY");
        dtm.addColumn("BONUS");
         dtm.addColumn("ACCOUNT");
        dtm.addColumn("DATE CREATE");
        
        tblStaff.setModel(dtm);
        
        ArrayList<Staff> arr = new ArrayList<Staff>();
        //arr = empBUS.getAllEmployees();
        arr = staff;
        for (int i = 0; i < arr.size(); i++) {
            Staff em = arr.get(i);
               String ID = em.getID();
               Account Account =  em.getAccount();
               String name = em.getName();
               String sex = em.getSex();
               String sinhNhat = em.getBirthDay();
               String diaChi = em.getAddress();
               String sdt = em.getPhone();
               String acbank = em.getBankAccount();
               String nameBank = em.getNameBank();
               String email = em.getEmail();
               String CCCD = em.getCCCD();
               String luongNv = em.getSalary();
               String bonusNv = em.getBonus();
               String ngayTao = em.getDateCreate();
 
           


            Object[] row = {ID,name ,sex , sinhNhat, diaChi , sdt, acbank,nameBank,email,CCCD, formatTotalPrice(Float.parseFloat(luongNv)),formatTotalPrice(Float.parseFloat(bonusNv)),Account, ngayTao};
            dtm.addRow(row);
        }
    }
     
        public void loadNCCList(ArrayList<Supplier> ncc) {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NAME");
        dtm.addColumn("PHONE");
        dtm.addColumn("ADDRESS");
        dtm.addColumn("BANKACCOUNT");
        dtm.addColumn("BANKNAME");
        dtm.addColumn("DATE CREATE");
        
        tblSupplier.setModel(dtm);
        
        ArrayList<Supplier> arr = new ArrayList<Supplier>();
        //arr = empBUS.getAllEmployees();
        arr = ncc;
        for (int i = 0; i < arr.size(); i++) {
            Supplier em = arr.get(i);
            String idNcc = em.getID();
            String nameNcc = em.getName();
            String phoneNcc = em.getPhone() ;
            String diaChiaNcc =em.getAddress() ;
            String bankAccount = em.getBankAccount();
            String bankName = em.getBankName();
            String dateCreate = em.getDateCreate();

            Object[] row = {idNcc, nameNcc, phoneNcc, diaChiaNcc, bankAccount , bankName, dateCreate};
            dtm.addRow(row);
        }
    }
        
   public void loadKhachHangList(ArrayList<KhachHang> khachHang) {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NAME");
        dtm.addColumn("BIRTHDAY");
        dtm.addColumn("ADDESS");
        dtm.addColumn("PHONE");
        dtm.addColumn("MALES");
        dtm.addColumn("SCORES");
        dtm.addColumn("EMAIL");
        dtm.addColumn("DATE CREATE");
        
        tblCustomer.setModel(dtm);
        
        ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
        //arr = empBUS.getAllEmployees();
        arr = khachHang;
        for (int i = 0; i < arr.size(); i++) {
            KhachHang em = arr.get(i);
            String idKH = em.getMaKH();
            String nameKH = em.getTenKH();
            String ngaySinhKh = em.getNgaySinh() ;
            String diaChiKH = em.getDiaChi();
            String sdtKH = em.getPhone();
            String gioiTinhKH = em.getSex();
            double diemKH = em.getDiem();
            String emailKh = em.getEmail();
            String dateCreate = em.getDateCreate();

            Object[] row = {idKH, nameKH, ngaySinhKh, diaChiKH, sdtKH , gioiTinhKH, diemKH,emailKh, dateCreate};
            dtm.addRow(row);
        }
    }
   
   public void loadHoaDonList(ArrayList<HoaDon_DTO> hoadon) {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("MÃ HĐ");
        dtm.addColumn("MÃ NV");
        dtm.addColumn("MÃ KH");
        dtm.addColumn("Ngày lập");
        dtm.addColumn("Thành Tiền");
       
        tbl_HoaDon.setModel(dtm);
        
        ArrayList<HoaDon_DTO> arr = new ArrayList<HoaDon_DTO>();
        //arr = empBUS.getAllEmployees();
        arr = hoadon;
        for (int i = 0; i < arr.size(); i++) {
            HoaDon_DTO em = arr.get(i);
            
            String idHd = em.getID_HoaDon();
            String idNV = em.getID_Staff();
            String idKH = em.getID_Customer();
            String ngayTao = em.getDateCreate();
            float thanhTien = em.getTotal();
            
            
          

            Object[] row = {idHd, idNV, idKH, ngayTao, formatTotalPrice(thanhTien)};
            dtm.addRow(row);
        }
    }
   
   private  String formatTotalPrice(float total) {
        DecimalFormat formatter = new DecimalFormat("###,###.##");
        return formatter.format(total);
    }
   
   // DOANH THU
//   public void createChart(JTable table, JPanel panel) {
//    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//    JFreeChart chart = ChartFactory.createLineChart("Doanh thu theo tháng", "Tháng", "Doanh thu", dataset, PlotOrientation.VERTICAL, true, true, false);
//    CategoryPlot plot = chart.getCategoryPlot();
//    CategoryAxis categoryAxis = plot.getDomainAxis();
//    NumberAxis numberAxis = (NumberAxis) plot.getRangeAxis();
//    TableModel model = table.getModel();
//    int rowCount = model.getRowCount();
//    for (int i = 0; i < rowCount; i++) {
//        Date date = (Date) model.getValueAt(i, 3);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        int month = calendar.get(Calendar.MONTH) + 1;
//        double thanhTien = (double) model.getValueAt(i, 4);
//        dataset.addValue(thanhTien, "Doanh thu", String.valueOf(month));
//    }
//
//ChartPanel chartPanel = new ChartPanel(chart);
//panel.add(chartPanel, BorderLayout.CENTER);
//panel.validate();
//}
   public void createChart(JTable table, JPanel panel) {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    JFreeChart chart = ChartFactory.createLineChart("Doanh thu theo tháng", "Tháng", "Doanh thu", dataset, PlotOrientation.VERTICAL, true, true, false);
    CategoryPlot plot = chart.getCategoryPlot();
    CategoryAxis categoryAxis = plot.getDomainAxis();
    NumberAxis numberAxis = (NumberAxis) plot.getRangeAxis();
    TableModel model = table.getModel();
    int rowCount = model.getRowCount();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
   for (int i = 0; i < rowCount; i++) {
    try {
        String dateString = (String) model.getValueAt(i, 3);
        Date date = dateFormat.parse(dateString.substring(0, 10));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH) + 1;
        double thanhTien = (double) model.getValueAt(i, 4);
        dataset.addValue(thanhTien, "Doanh thu", String.valueOf(month));
    } catch (ParseException e) {
        e.printStackTrace();
    }
}
    ChartPanel chartPanel = new ChartPanel(chart);
chartPanel.setPreferredSize(new Dimension(500, 400));
panel.setLayout(new BorderLayout());
panel.add(chartPanel, BorderLayout.CENTER);
panel.revalidate();
}


public void createChartCot7(ArrayList<HoaDon_DTO> list, JPanel panel) {
    // Create a map to store the total revenue for each month
    Map<String, Double> monthRevenueMap = new HashMap<>();

    // Calculate the total revenue for each month in the same year
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Calendar calendar = Calendar.getInstance();
    int currentYear = calendar.get(Calendar.YEAR);
    for (HoaDon_DTO hd : list) {
        try {
            Date date = dateFormat.parse(hd.getDateCreate());
            calendar.setTime(date);
            int year = calendar.get(Calendar.YEAR);
            if (year == currentYear) {
                int month = calendar.get(Calendar.MONTH) + 1;
                String key = year + "-" + month;
                double thanhTien = (double) hd.getTotal();
                if (monthRevenueMap.containsKey(key)) {
                    thanhTien += monthRevenueMap.get(key);
                }
                monthRevenueMap.put(key, thanhTien);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // Create a dataset for the chart using the month revenue map
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    for (Map.Entry<String, Double> entry : monthRevenueMap.entrySet()) {
        String[] parts = entry.getKey().split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        double revenue = entry.getValue();
        dataset.addValue(revenue, "Doanh thu", year + "-" + month);
    }

    // Create the chart
    JFreeChart chart = ChartFactory.createBarChart("Tổng doanh thu theo từng tháng từng năm", "Tháng", "Doanh thu", dataset, PlotOrientation.VERTICAL, true, true, false);
    CategoryPlot plot = chart.getCategoryPlot();
    CategoryAxis categoryAxis = plot.getDomainAxis();
    NumberAxis numberAxis = (NumberAxis) plot.getRangeAxis();

    // Set the range of the y-axis to show more space above the highest value
    numberAxis.setRange(0, numberAxis.getUpperBound() * 1.2);

    // Set the y-axis format to show numbers instead of scientific notation
    NumberFormat format = NumberFormat.getNumberInstance();
    numberAxis.setNumberFormatOverride(format);

    ChartPanel chartPanel = new ChartPanel(chart);
   // chartPanel.setPreferredSize(new Dimension(500, 400));
   chartPanel.setPreferredSize(panel.getSize());
    panel.setLayout(new BorderLayout());
    panel.add(chartPanel, BorderLayout.CENTER);
    panel.revalidate();
}


public void createPieChart3D(ArrayList<ChiTietHoaDon_DTO> list, JPanel panel) {
    // Create a map to store the total quantity for each book type
    Map<String, Integer> bookQuantityMap = new HashMap<>();

    for (ChiTietHoaDon_DTO cthd : list) {
        String bookId = cthd.getID_Book();
        int quantity = cthd.getQuantity();
        if (bookQuantityMap.containsKey(bookId)) {
            quantity += bookQuantityMap.get(bookId);
        }
        bookQuantityMap.put(bookId, quantity);
    }

    // Create a dataset for the chart using the book quantity map
    DefaultPieDataset dataset = new DefaultPieDataset();
    for (Map.Entry<String, Integer> entry : bookQuantityMap.entrySet()) {
        String bookId = entry.getKey();
        int quantity = entry.getValue();
        dataset.setValue(bookId, quantity);
    }

    JFreeChart chart = ChartFactory.createPieChart3D("% Số lượng sách bán ra theo mã", dataset, true, true, false);
PiePlot3D plot = (PiePlot3D) chart.getPlot();
plot.setStartAngle(290);
plot.setDirection(Rotation.CLOCKWISE);
plot.setForegroundAlpha(0.5f);
plot.setNoDataMessage("No data available");
plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} ({2} percent)"));
plot.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0}"));
plot.setInteriorGap(0.04);
plot.setOutlineVisible(false);
plot.setBackgroundPaint(Color.white);
plot.setSectionPaint("A", Color.RED);
plot.setSectionPaint("B", Color.ORANGE);
plot.setSectionPaint("C", Color.YELLOW);
plot.setSectionPaint("D", Color.GREEN);
plot.setSectionPaint("E", Color.BLUE);

ChartPanel chartPanel = new ChartPanel(chart);
chartPanel.setPreferredSize(panel.getSize());
panel.setLayout(new BorderLayout());
panel.add(chartPanel, BorderLayout.CENTER);
panel.revalidate();
}

public void createPieChart3DV2(ArrayList<ChiTietHoaDon_DTO> list, JPanel panel) {
    // Create a map to store the total quantity for each book type
    Map<String, Integer> bookQuantityMap = new HashMap<>();

    for (ChiTietHoaDon_DTO cthd : list) {
        String bookId = cthd.getID_Book();
        int quantity = cthd.getQuantity();
        if (bookQuantityMap.containsKey(bookId)) {
            quantity += bookQuantityMap.get(bookId);
        }
        bookQuantityMap.put(bookId, quantity);
    }

    // Sort the book quantity map by value in descending order
    SortedMap<String, Integer> sortedMap = new TreeMap<>(Comparator.comparingInt(bookQuantityMap::get).reversed());
    sortedMap.putAll(bookQuantityMap);

    // Create a dataset for the chart using the top 3 book quantities
    DefaultPieDataset dataset = new DefaultPieDataset();
    int count = 0;
    int totalOtherQuantity = 0;
    for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
        String bookId = entry.getKey();
        int quantity = entry.getValue();
        if (count < 3) {
            dataset.setValue(bookId, quantity);
        } else {
            totalOtherQuantity += quantity;
        }
        count++;
    }
    dataset.setValue("Số Sách còn lại", totalOtherQuantity);

    // Create the pie chart
    JFreeChart chart = ChartFactory.createPieChart3D("% Top 3 sách bán chạy nhất và các sách còn lạiS", dataset, true, true, false);
    PiePlot3D plot = (PiePlot3D) chart.getPlot();
    // Customize the plot settings...

    // Add the chart to the panel
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(panel.getSize());
    panel.setLayout(new BorderLayout());
    panel.add(chartPanel, BorderLayout.CENTER);
    panel.revalidate();
}

public void showBieuDO(){
    cthd = new ArrayList<>();
    hoaDon = new ArrayList<>();
    cthd = cthd_BUS.getAllCTHD();
    hoaDon = hdBUS.getAllHD();
    createChartCot7(hoaDon, pan_TT);
    createPieChart3DV2(cthd, pan_bieuDoTron);
}

}
