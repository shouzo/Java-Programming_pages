package Java20151112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別, 實作ActionListener介面
public class Example2 extends JFrame
                      implements ActionListener {
   private JLabel lbl;
   private JTextField txt;
   public Example2() {   // 建構子
      super ("JTextField元件範例");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.white);
      txt = new JTextField(12);// 建立文字方塊
      // 建立標籤
      JLabel tLbl = new JLabel("使用者名稱: ");
      tLbl.setLabelFor(txt);  // 屬於文字方塊的標籤
      // 顯示輸入文字內容的標籤
      lbl = new JLabel("顯示欄位輸入的資料");
      JButton btn1 = new JButton("確定");
      btn1.addActionListener(this); // 註冊事件處理
      JPanel jpane = new JPanel(); // 建立JPanel物件
      jpane.add(tLbl); jpane.add(txt); jpane.add(btn1);
      c.add(jpane);    c.add(lbl);
   }
   // 實作事件處理方法
   public void actionPerformed(ActionEvent evt) {
      lbl.setText("輸入資料 : " + txt.getText());
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      Example2 app = new Example2();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,150);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}