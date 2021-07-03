package principal;

import metodosDeOrdenacao.InsertionSort;
import metodosDeOrdenacao.QuickSort;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import arquivo.ArqFile;
import javax.swing.JOptionPane;
import sun.applet.Main;
import conversao.Conversao;
import pesquisa.*;


public class TelaPrincipal extends javax.swing.JFrame {

    DefaultComboBoxModel modelo = new DefaultComboBoxModel();
    
    public Conversao FazConversao = new Conversao();
    public ArqFile   aArqFile     = new ArqFile  ();
    public ArrayList<String> dadosArquivo = new ArrayList<>();

    /**
     * Creates new form COR
     */
    public TelaPrincipal() {
        initComponents();
        cbOrdenacao.setModel(modelo);
        AdicionaInformacaoNaComboBox();
        AlteraDesignComboBox();
        setResizable(false);
        
        if (gridTextArquivo != null) 
            txtPesquisaBinaria.setEditable(false);
        else
            txtPesquisaBinaria.setEditable(true);
        
        if  (gridTextArquivo != null && gridTextArquivo.getModel() != null){
            cbOrdenacao.setEnabled(false);
            cbPesquisa.setEnabled(false);
        }else{
            cbOrdenacao.setEnabled(true);  
            cbPesquisa.setEnabled(true);
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        gridTextArquivo = new javax.swing.JTable();
        cbPesquisa = new javax.swing.JComboBox();
        lblPesquisaBinaria = new javax.swing.JLabel();
        lblOrdenacao = new javax.swing.JLabel();
        txtCaminho = new javax.swing.JTextField();
        btnBrowser = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        cbOrdenacao = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        lblCaminho = new javax.swing.JLabel();
        btnBuscaBinaria = new javax.swing.JButton();
        txtPesquisaBinaria = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Índice");
        model.addColumn("Código");
        gridTextArquivo.setBackground(new java.awt.Color(0, 0, 0));
        gridTextArquivo.getTableHeader().setBackground(new Color(0,0,0));
        gridTextArquivo.getTableHeader().setOpaque(false);
        gridTextArquivo.getTableHeader().setForeground(new Color(0,255,0));
        gridTextArquivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        gridTextArquivo.setForeground(new java.awt.Color(0, 255, 0));
        gridTextArquivo.setModel(model);
        gridTextArquivo.setGridColor(new java.awt.Color(0, 0, 0));
        gridTextArquivo.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(gridTextArquivo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 620, 380));

        cbPesquisa.setBackground(new java.awt.Color(0, 0, 0));
        cbPesquisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Índice", "Número" }));
        cbPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        cbPesquisa.setOpaque(false);
        cbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(cbPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 558, 180, 30));

        lblPesquisaBinaria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPesquisaBinaria.setForeground(new java.awt.Color(0, 255, 0));
        lblPesquisaBinaria.setText("Pesquisa binária:");
        getContentPane().add(lblPesquisaBinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, -1, -1));

        lblOrdenacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblOrdenacao.setForeground(new java.awt.Color(0, 255, 0));
        lblOrdenacao.setText("Método de ordenação:");
        getContentPane().add(lblOrdenacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, -1, -1));

        txtCaminho.setBackground(new java.awt.Color(0, 0, 0));
        txtCaminho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCaminho.setForeground(new java.awt.Color(0, 255, 0));
        txtCaminho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        txtCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaminhoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCaminho, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 376, 30));

        btnBrowser.setContentAreaFilled(false);
        btnBrowser.setOpaque(true);
        btnBrowser.setBackground(new java.awt.Color(0, 0, 0));
        btnBrowser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBrowser.setForeground(new java.awt.Color(255, 255, 255));
        btnBrowser.setText("Browser");
        btnBrowser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });
        getContentPane().add(btnBrowser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 80, 30));

        btnOrdenar.setContentAreaFilled(false);
        btnOrdenar.setOpaque(true);
        btnOrdenar.setBackground(new java.awt.Color(0, 0, 0));
        btnOrdenar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 78, 30));

        cbOrdenacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbOrdenacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Quick Sort", "Insertion Sort", "Selection Sort" }));
        cbOrdenacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        cbOrdenacao.setOpaque(false);
        cbOrdenacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenacaoActionPerformed(evt);
            }
        });
        getContentPane().add(cbOrdenacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 377, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        lblCaminho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCaminho.setForeground(new java.awt.Color(0, 255, 0));
        lblCaminho.setText("Caminho do Arquivo:");
        getContentPane().add(lblCaminho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        btnBuscaBinaria.setContentAreaFilled(false);
        btnBuscaBinaria.setOpaque(true);
        btnBuscaBinaria.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscaBinaria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscaBinaria.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscaBinaria.setText("Pesquisa");
        btnBuscaBinaria.setActionCommand("");
        btnBuscaBinaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        btnBuscaBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaBinariaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaBinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 78, 30));

        txtPesquisaBinaria.setBackground(new java.awt.Color(0, 0, 0));
        txtPesquisaBinaria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPesquisaBinaria.setForeground(new java.awt.Color(0, 255, 0));
        txtPesquisaBinaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        txtPesquisaBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaBinariaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisaBinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 560, 220, 30));

        btnLimpar.setContentAreaFilled(false);
        btnLimpar.setOpaque(true);
        btnLimpar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("");
        btnLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 675, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtPesquisaBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaBinariaActionPerformed
        
    }//GEN-LAST:event_txtPesquisaBinariaActionPerformed

    private void txtCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaminhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaminhoActionPerformed

    private void cbOrdenacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenacaoActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        String texto = cbOrdenacao.getItemAt(cbOrdenacao.getSelectedIndex()).toString();
        ArrayList<Long> dadosArquivoNumero = FazConversao.StringToLong(this.dadosArquivo);
        
        try {
            switch (texto)
        {
            case "Insertion Sort": 
            {
                InsertionSort OrdenacaoInsertion = new InsertionSort();
                OrdenacaoInsertion.InsertionSort(dadosArquivoNumero);
                
                long tempoInicial = System.currentTimeMillis();
                
                long tempoFinal = System.currentTimeMillis();

                JOptionPane.showMessageDialog(this, "Executado em:" + (tempoFinal - tempoInicial) + " ms");
                //System.out.println(dadosArquivoNumero);
            }
            break;
            
            case "Quick Sort"    : 
            {
                QuickSort OrdenacaoQuick = new QuickSort();
                OrdenacaoQuick.QuickSort(dadosArquivoNumero, 0, dadosArquivoNumero.size() - 1);
                
                long tempoInicial = System.currentTimeMillis();
                
                long tempoFinal = System.currentTimeMillis();

                JOptionPane.showMessageDialog(this, "Executado em:" + (tempoFinal - tempoInicial) + " ms");
            } 
            break;
            
            case "Selection Sort": 
            {
                InsertionSort OrdenacaoInsertion = new InsertionSort();
                OrdenacaoInsertion.InsertionSort(dadosArquivoNumero);
                
                long tempoInicial = System.currentTimeMillis();
                
                long tempoFinal = System.currentTimeMillis();

                JOptionPane.showMessageDialog(this, "Executado em:" + (tempoFinal - tempoInicial) + " ms");
            }
            break;
            
           
        }
        
        if (!dadosArquivoNumero.isEmpty() || !texto.equals("Selecione"))
        {
            this.dadosArquivo = FazConversao.LongToString(dadosArquivoNumero);
            gridTextArquivo.setModel(AtualizaRegistro(this.dadosArquivo));
            
        }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Para realizar a ordenação, selecione as opções na lista de Métodos de Ordenação!!");
        }
        
       
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        this.dadosArquivo.clear();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Código");
        gridTextArquivo.setModel(AtualizaRegistro(this.dadosArquivo));
        txtCaminho.setText(null);
        txtPesquisaBinaria.setText(null);  
        
        if (gridTextArquivo != null) 
            txtPesquisaBinaria.setEditable(false);
        else
            txtPesquisaBinaria.setEditable(true);

        if  (gridTextArquivo != null && gridTextArquivo.getModel() != null){
            cbOrdenacao.setEnabled(false);
            cbPesquisa.setEnabled(false);
        }else{
            cbOrdenacao.setEnabled(true);  
            cbPesquisa.setEnabled(true);
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowserActionPerformed
       
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        fileChooser.setDialogTitle("Procurar arquivo");

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Texto", "txt");

        fileChooser.setFileFilter(filter);
        int retorno = fileChooser.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) 
        {  
            this.dadosArquivo.clear();
            
            File file = fileChooser.getSelectedFile();
            txtCaminho.setText(file.getPath());
            
            aArqFile.setPath(Paths.get(file.getPath()).toString());

            try 
            {
                aArqFile.LerArquivo(this.dadosArquivo);
        
                if (this.dadosArquivo.isEmpty())
                {
                   JOptionPane.showMessageDialog(this,"Não foi possível encontrar nenhum registro dentro do arquivo.");
                   return;
                }
                
                gridTextArquivo.setModel(AtualizaRegistro(this.dadosArquivo));
                
                txtPesquisaBinaria.setEditable(true);
                cbOrdenacao.setEnabled(true);
                cbPesquisa.setEnabled(true);
                gridTextArquivo.setEnabled(false);
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBrowserActionPerformed

    private void btnBuscaBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaBinariaActionPerformed
      
        if (txtPesquisaBinaria.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Para realizar a pesquisa binária, é necessário preencher o campo Pesquisa binária");
        } 
        else 
        {
            String texto = cbPesquisa.getItemAt(cbPesquisa.getSelectedIndex()).toString();
             
            try 
            {
                switch (texto)
                {
                    case "Índice": 
                    {
                        PesquisaPorIndex PesquisaIndex = new PesquisaPorIndex();                   
                        
                        int idxRetorno = PesquisaIndex.PesquisaPorIndex(this.dadosArquivo, txtPesquisaBinaria.getText());
                        if (idxRetorno != -1)
                        {
                            DefaultTableModel model = new DefaultTableModel();
                            model.addColumn("Índice");
                            model.addColumn("Código");
                            
                            model.addRow(new Object[] {txtPesquisaBinaria.getText(), idxRetorno});
                            
                            gridTextArquivo.setModel(model);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Index informado não existe dentro do Arquivo!!");
                        }
                        
                    }
                    break;
            
                    case "Número": 
                    {
                        PesquisaBinariaIterativa pesquisaBinaria = new PesquisaBinariaIterativa();
                        
                        String sNumeroPesquisa = txtPesquisaBinaria.getText();
                        int idxRetorno = pesquisaBinaria.PesquisaBinariaNumero(this.dadosArquivo, sNumeroPesquisa);
                        
                        if (idxRetorno != -1)
                        {
                            DefaultTableModel model = new DefaultTableModel();
                            model.addColumn("Índice");
                            model.addColumn("Código");
                            
                            model.addRow(new Object[] {idxRetorno, this.dadosArquivo.get(idxRetorno)});
                            
                            gridTextArquivo.setModel(model);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Número informado não existe dentro do Arquivo!!");
                        }
                 
                    } 
                    break;
            
                    case "Selecione": 
                    {
                        JOptionPane.showMessageDialog(this, "Para realizar a pesquisa, selecione um tipo de dado!!");
                    }
                    break;
                }
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(this, "Erro ao realizar pesquisa.");
            }     
        }      
    }//GEN-LAST:event_btnBuscaBinariaActionPerformed

    private void cbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPesquisaActionPerformed

    public static DefaultTableModel AtualizaRegistro(ArrayList<String> dadosArquivo)
    {  
         DefaultTableModel model = new DefaultTableModel();
         model.addColumn("Índice");
         model.addColumn("Código");
               
        for (int idxArray = 0; idxArray < dadosArquivo.size(); ++idxArray)
        {
            model.addRow(new Object[] {idxArray, dadosArquivo.get(idxArray)});
        }
                
         return model;
    }
    
    
   private static DefaultTableModel limparTabela(ArrayList<String> dadosArquivos) {
        
       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Código");
        model.addRow(new Object[] {null});
        
        return model;
}   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {

            public void run() 
            {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowser;
    private javax.swing.JButton btnBuscaBinaria;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JComboBox cbOrdenacao;
    private javax.swing.JComboBox cbPesquisa;
    private javax.swing.JTable gridTextArquivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaminho;
    private javax.swing.JLabel lblOrdenacao;
    private javax.swing.JLabel lblPesquisaBinaria;
    private javax.swing.JTextField txtCaminho;
    private javax.swing.JTextField txtPesquisaBinaria;
    // End of variables declaration//GEN-END:variables

    private void AdicionaInformacaoNaComboBox() 
    {
        String[] metodosOrdenacao = {
            "Selecione"     ,
            "Insertion Sort",
            "Quick Sort"    ,
            "Selection Sort"};
        
        for (String M : metodosOrdenacao) 
        {
            modelo.addElement(M);
        }
    }

    private void AlteraDesignComboBox() 
    {
        try 
        {
            cbOrdenacao.setRenderer(new Colorir<String>());
            cbOrdenacao.setBackground(Color.black);
            cbOrdenacao.setForeground(Color.GREEN);
            cbPesquisa.setRenderer(new Colorir<String>());
            cbPesquisa.setForeground(Color.GREEN);
            cbPesquisa.setBackground(Color.black);
      
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    

    class Colorir<String> extends JLabel implements ListCellRenderer 
    {
        int conta = 5;

        public Colorir() 
        {
            super();
            setOpaque(true);
        }

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) 
        {
            setText(value.toString());

            String texto = (String) cbOrdenacao.getItemAt(index);

            if (texto != null && conta == (texto.toString().length())) 
            {
                setBackground(Color.BLACK);
            } 
            else 
            {
                setBackground(Color.BLACK);
            }
            setBorder(null);

            setBackground(Color.WHITE);
            if (texto != null && (texto.toString()) == "Selecione") 
            {
                setBackground(Color.BLACK);
            }
            if (texto != null && (texto.toString()) == "Insertion Sort") 
            {
                setBackground(Color.BLACK);
            }
            if (texto != null && (texto.toString()) == "Selection Sort") 
            {
                setBackground(Color.BLACK);
            }
            if (texto != null && (texto.toString()) == "Quick Sort") 
            {
                setBackground(Color.BLACK);
            }

            if (isSelected)
            {
                setBackground(new java.awt.Color(54, 54, 54));
            }

            return this;
        }
    }
}
