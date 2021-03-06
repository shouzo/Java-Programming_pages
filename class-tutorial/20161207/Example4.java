package Java20151112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別, 實作ActionListener介面
public class Example4 extends JFrame
                       implements ActionListener {
   private JLabel lbl;
   private JComboBox<String> jcb;
   public Example4() {   // 建構子
      super("JComboBox元件範例");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.white);
      String[] items = { "程式設計", "資料庫系統",
                         "作業系統", "網頁設計"};
      jcb = new JComboBox<>(items);
      jcb.setSelectedIndex(3); // 指定預設選擇
      JButton btn1 = new JButton("選擇");
      btn1.addActionListener(this); // 註冊事件處理
      lbl = new JLabel(items[3]);
      c.add(jcb);  c.add(btn1);  c.add(lbl);
   }
   // 實作事件處理方法
   public void actionPerformed(ActionEvent evt) {
      String name = (String)jcb.getSelectedItem();
      lbl.setText(name);
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      Example4 app = new Example4();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}