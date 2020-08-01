/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fulib.view;

import fulib.model.Book;
import fulib.model.BookDB;
import fulib.model.Category;
import fulib.model.CategoryDB;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author nguye
 */
public class Workshop02 extends javax.swing.JFrame {

    private ArrayList<Category> listCat;
    /**
     * Creates new form Workshop02
     */
    public Workshop02() {
        initComponents();
        listCat = CategoryDB.getAllCategory();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtreeCategory = new javax.swing.JTree();
        jbtnLoad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfBookId = new javax.swing.JTextField();
        jtfBookTitle = new javax.swing.JTextField();
        jtfBookAu = new javax.swing.JTextField();
        jtfBookCat = new javax.swing.JTextField();
        jtfBookKey = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Category");
        jtreeCategory.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtreeCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtreeCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtreeCategory);

        jbtnLoad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtnLoad.setText("Load Tree Category");
        jbtnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoadActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("BookID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Book Title");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Author");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Category");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Key");

        jtfBookId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfBookId.setMargin(new java.awt.Insets(1, 5, 1, 2));

        jtfBookTitle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfBookTitle.setMargin(new java.awt.Insets(1, 5, 1, 2));

        jtfBookAu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfBookAu.setMargin(new java.awt.Insets(1, 5, 1, 2));

        jtfBookCat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfBookCat.setMargin(new java.awt.Insets(1, 5, 1, 2));

        jtfBookKey.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfBookKey.setMargin(new java.awt.Insets(1, 5, 1, 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBookAu, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBookCat, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBookKey, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 71, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBookAu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBookCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBookKey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jbtnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoadActionPerformed
        DefaultTreeModel treeModel = (DefaultTreeModel) jtreeCategory.getModel();
        DefaultMutableTreeNode nodeRoot = (DefaultMutableTreeNode) treeModel.getRoot();
        ArrayList<Book> listBook = BookDB.getAll();
        ArrayList<String> categoryList = new ArrayList<>();
        for (Book b : listBook) {
            String subNode = b.getCategory() + " - "
                    + getNameCategory(b.getCategory());
            //check is exist that category in tree?
            if (!categoryList.contains(subNode)) {
                categoryList.add(subNode);
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(subNode);
                nodeRoot.add(node);
                //find sub book of category and add
                for (Book book : listBook) {
                    if (book.getCategory().equals(b.getCategory())) {
                        node.add(new DefaultMutableTreeNode(book));
                    }
                }
            }
        }
        treeModel.reload();
    }//GEN-LAST:event_jbtnLoadActionPerformed

    private String getNameCategory(String cat) {
        for (Category category : listCat) {
            if (cat.equalsIgnoreCase(category.getCatId())) {
                return category.getCatName();
            }
        }
        return null;
    }
    
    private void jtreeCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtreeCategoryMouseClicked
        TreePath path = jtreeCategory.getSelectionPath();
        if (path == null) {
            return;
        }
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path.getLastPathComponent();
        Object selectedBook = selectedNode.getUserObject();
        if (selectedBook instanceof Book) {
            Book b = (Book) selectedBook;
            jtfBookId.setText(b.getBookID());
            jtfBookTitle.setText(b.getTitle());
            jtfBookAu.setText(b.getAuthor());
            jtfBookCat.setText(getNameCategory(b.getCategory()));
            jtfBookKey.setText(b.getKeyword());
        }
    }//GEN-LAST:event_jtreeCategoryMouseClicked


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
            java.util.logging.Logger.getLogger(Workshop02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Workshop02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Workshop02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workshop02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Workshop02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnLoad;
    private javax.swing.JTextField jtfBookAu;
    private javax.swing.JTextField jtfBookCat;
    private javax.swing.JTextField jtfBookId;
    private javax.swing.JTextField jtfBookKey;
    private javax.swing.JTextField jtfBookTitle;
    private javax.swing.JTree jtreeCategory;
    // End of variables declaration//GEN-END:variables
}
