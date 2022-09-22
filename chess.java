package coursework;

import static java.lang.Math.abs;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer; 
import javax.swing.JLabel;

public class chess extends javax.swing.JFrame {
    public static TicTacToe INSTANCE = null;
    public chess() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        chesstable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        play = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rearrange the chess figures");

        chesstable.setFont(chesstable.getFont().deriveFont(chesstable.getFont().getSize()+13f));
        chesstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "♝", "♝", "♝"},
                {"2", "", "", ""},
                {"3", "♖", "♖", "♖"}
            },
            new String [] {
                "", "A", "B", "C"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        chesstable.setColumnSelectionAllowed(true);
        chesstable.setPreferredSize(new java.awt.Dimension(300, 210));
        chesstable.setRowHeight(70);
        chesstable.getTableHeader().setReorderingAllowed(false);
        chesstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chesstableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(chesstable);
        chesstable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (chesstable.getColumnModel().getColumnCount() > 0) {
            chesstable.getColumnModel().getColumn(0).setMinWidth(18);
            chesstable.getColumnModel().getColumn(0).setPreferredWidth(18);
            chesstable.getColumnModel().getColumn(0).setMaxWidth(18);
        }
        DefaultTableCellRenderer r = (DefaultTableCellRenderer)
        chesstable.getDefaultRenderer(String.class);
        r.setHorizontalAlignment(JLabel.CENTER);

        output.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Figure", "Cell n-1", "Cell"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(output);

        jButton1.setText("Вернуться в главное меню");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Игровое поле");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Таблица ходов");

        play.setText("Начать игру");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(play)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(play))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Rearrange the chess figures", jPanel1);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to the game \"Rearrange the chess figures\"\n\n.\n\nPress button \"start\" for continue\nPress left mouse button to choose figure\n.\nThen press again to choose free cell which your figure will moving\nFigures move like in Chess game\nGood luck!");
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Справка", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int a, b, al, bl;
    int ctrl=0;
    char[][]turn_array=new char[3][3];
    int strings=0;
    int flagturn=1;
    int chessgame=0;
    private void chesstableMouseClicked(java.awt.event.MouseEvent evt) {
        if(chessgame==1)startgame();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (main.INSTANCE == null)
        {
            
            kursovaya.main.draw();
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        chessgame=1;//1- игра начата
        
        int position=0;
        String[] figure = {"♝", "", "♖"};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                chesstable.setValueAt(figure[position], i, j+1);
            }
            position++;
        }
        position=0;

 
        for (int i = 0; i < output.getRowCount(); i++)
        for(int j = 0; j < output.getColumnCount(); j++) {
            output.setValueAt("", i, j);
            strings=0;
            ctrl=0;
            flagturn=1;
        }
    }//GEN-LAST:event_playActionPerformed
   private void startgame(){
        int y=chesstable.getSelectedRow(), x=chesstable.getSelectedColumn()-1;
        if (ctrl==0) turn_array=turn_table(); 
        ctrl=1;
        
            if (flagturn == 1) 
            {
                a=y; b=x;
            }
            else if (flagturn==-1) 
            {
         
                al=a;bl=b;
                a=y;b=x;
                
              
                if (turn_array[al][bl]=='1' && turn_array[a][b]=='0') bishop();
                else if (turn_array[al][bl]=='2'&& turn_array[a][b]=='0') rook();
            }
    flagturn=flagturn*(-1);
    }
   
    private char[][] turn_table(){
     String str="";
        for (int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                if(null!=chesstable.getValueAt(i,j+1).toString())
                    switch (chesstable.getValueAt(i,j+1).toString()) {
             case "":
                 str=str+0;
                 break;
             case "♝":
                 str=str+1;
                 break;
             case "♖":
                 str=str+2;
                 break;
             default:
                 break;
         }         
            }
    char[] mass=str.toCharArray();
    int K=0;
    System.out.println("");
    char[][] turn_table=new char[3][3];
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
            {
             turn_table[i][j]=mass[K];
             K++;
            }
    }
    return turn_table;
    }  
    //алгоритм хода слона
    private void bishop(){
        int check=0;
     
        if(abs(b - bl) == abs(a - al)) check=1;
       turn(check, "♝");
    }   
    //алгоритм хода ладьи
    private void rook(){
        int check=1;
        int dA=0,dB =0;
     
      
         if (dA ==abs(a-al)|| dB == abs(b-bl)) 
         {check = 1;
         turn(check, "♖");}

        
    } 
    

    private void turn(int check,String no){
        if (check!=0)
        {
            String crossa="";
            String crossb="";
            turn_array[a][b]=turn_array[al][bl];
            turn_array[al][bl]='0';
            
            crossa=crossa+to_output_table(bl)+(al+1);
            crossb=crossb+to_output_table(b)+(a+1);
            
            output.setValueAt(no, strings, 0);
            output.setValueAt(crossa, strings, 1);
            output.setValueAt(crossb, strings, 2);
            crossa="";
            crossb="";
            strings++;
        }
        is_it_end();

    }

    private String to_output_table(int x){
        String st=" ";
        switch(x) 
            {
            case 0: 
	    st=st+"A";
            break;
            case 1: 
	    st=st+"B";
            break;
            case 2: 
	    st=st+"C";
            break;
            }
        return st;
    }
    
    private void chess_out(){
        for(int i=0;i<3;i++)
                    {
                        for(int j=0;j<3;j++)
                        {
                            if (turn_array[i][j]=='0')
                            {
                            chesstable.setValueAt(null, i, j+1);
                            
                            }

                            if (turn_array[i][j]=='1')
                            {
                                
                            chesstable.setValueAt('♝', i, j+1);
                            
                            }

                            if (turn_array[i][j]=='2')
                            {
                            chesstable.setValueAt('♖', i, j+1);
                            }

                        } 
                    }
    }
    

    private void is_it_end(){
        int end=1;
        char[] example = {'2','0','1'};
        int position=0;
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if (turn_array[i][j]!=example[position]) end=0;
            }
        position++;
        }
        if (end == 1)
        {
             JOptionPane.showMessageDialog(rootPane, "All figures has been set, Game over", "You win!", 1);
             strings=0;
             ctrl=0;
             flagturn=1;
             chessgame=0;
        }

    }
    
    
    public static void draw(){
        
        java.awt.EventQueue.invokeLater(() -> {
            chess sframe = new chess();
            sframe.setLocationRelativeTo(null);
            sframe.setVisible(true);
        });
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable chesstable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable output;
    private javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables
}
