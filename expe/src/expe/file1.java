public static void main1(String[] args) {
              SwingUtilities.invokeLater(new Runnable() {
                  public void run() {
                         JFrame form3 = new JFrame("form2");
                         form3.setTitle("Изменение налоговой ставки");
                         form3.setSize(475, 290);
                         form3.setLocationRelativeTo(null);
                         form3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                         form3.setLayout (new BorderLayout());
                         form3.setVisible(true);
                        JButton calc3,calc4;
                             JPanel panel2,panel3;
                             JLabel label_1,label_n1,label_n2,label_n3,label_n4,
