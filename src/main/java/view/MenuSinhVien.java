/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.MonHocDAO;
import DAO.TkbSVDAO;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import pojo.MonHoc;
import pojo.TkbSV;

/**
 *
 * @author toanm
 */
public class MenuSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form MenuSinhVien
     */
    public MenuSinhVien() {
        initComponents();
        current_panel = helloPanel;
        xemDiemPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helloPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        xemDiemPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        xemDiemTable = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        xemDiem = new javax.swing.JMenu();
        phucKhao = new javax.swing.JMenu();
        doiMK = new javax.swing.JMenu();
        dangXuat = new javax.swing.JMenu();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Xin chào");

        javax.swing.GroupLayout helloPanelLayout = new javax.swing.GroupLayout(helloPanel);
        helloPanel.setLayout(helloPanelLayout);
        helloPanelLayout.setHorizontalGroup(
            helloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helloPanelLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        helloPanelLayout.setVerticalGroup(
            helloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helloPanelLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Xem điểm");

        xemDiemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã môn", "Tên môn", "Lớp", "Điểm GK", "Điểm CK", "Điểm khác", "Điểm tổng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(xemDiemTable);
        if (xemDiemTable.getColumnModel().getColumnCount() > 0) {
            xemDiemTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout xemDiemPanelLayout = new javax.swing.GroupLayout(xemDiemPanel);
        xemDiemPanel.setLayout(xemDiemPanelLayout);
        xemDiemPanelLayout.setHorizontalGroup(
            xemDiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(xemDiemPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        xemDiemPanelLayout.setVerticalGroup(
            xemDiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xemDiemPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        xemDiem.setText("Xem điểm");
        xemDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xemDiemMouseClicked(evt);
            }
        });
        jMenuBar2.add(xemDiem);

        phucKhao.setText("Phúc khảo");
        phucKhao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phucKhaoMouseClicked(evt);
            }
        });
        jMenuBar2.add(phucKhao);

        doiMK.setText("Đổi mật khẩu");
        jMenuBar2.add(doiMK);

        dangXuat.setText("Đăng xuất");
        jMenuBar2.add(dangXuat);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(xemDiemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(xemDiemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xemDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xemDiemMouseClicked
        current_panel.setVisible(false);
        xemDiemPanel.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) xemDiemTable.getModel();
        model.setRowCount(0);
        List<TkbSV> ds = TkbSVDAO.layDanhSachTkbTheoSV(Username);
        ds.forEach(tkb ->{
            MonHoc mh = MonHocDAO.layMonHoc(tkb.getMaMon());
            model.addRow(new Object[]{mh.getMaMon(),mh.getTenMon(),tkb.getMaLop(),
                tkb.getDiemGK(),tkb.getDiemCK(),tkb.getDiemKhac(),tkb.getDiemTong()});
        });
    }//GEN-LAST:event_xemDiemMouseClicked

    private void phucKhaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phucKhaoMouseClicked
        
    }//GEN-LAST:event_phucKhaoMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //Username = args[0];
        Username = "1712001";
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuSinhVien frame = new MenuSinhVien();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
    
    private static JPanel current_panel = null;
    private static String Username = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu dangXuat;
    private javax.swing.JMenu doiMK;
    private javax.swing.JPanel helloPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu phucKhao;
    private javax.swing.JMenu xemDiem;
    private javax.swing.JPanel xemDiemPanel;
    private javax.swing.JTable xemDiemTable;
    // End of variables declaration//GEN-END:variables
}
