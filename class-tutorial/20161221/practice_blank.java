package Java20151119;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別, 實作ActionListener介面
public class practice_blank extends JFrame
                      implements ActionListener {
   private JPopupMenu popup;
   JMenu m;
   private Container con;
   public practice_blank() {    // 建構子
      super("JPopupMenu元件範例");
      con = getContentPane();
      con.setBackground(Color.white);
      popup = ..;   //new popupmenu
      ......("復原(U)");  //加入popupmenu
      ......; //插入分隔
      ......("剪下(T)");  //加入popupmenu
      ......("複製(C)"); //加入popupmenu
      ......("貼上(P)");  //加入popupmenu
      ......("刪除(D)");  //加入popupmenu
      ......; //插入分隔
      .......("全選(A)");  //加入popupmenu
      ......; //插入分隔
      ......("從右到左的讀取順序(R)");//加入popupmenu
      ......("顯示Unicode控制字元(S)");//加入popupmenu
      m = ......("插入Unicode控制字元(I)");//new Jmenu
      ......("LRM");//加入 Jmenu
      ......("RLM");//加入 Jmenu
      popup.add(m);//將Jmenu 加入 popupmenu 
      ......; //插入分隔
      ......("開啟IME(O)");//加入popupmenu
      ......("重新轉換(R)");//加入popupmenu
      addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent evt) {
            if ( evt.isPopupTrigger() ) // 顯示選單
               popup.show(evt.getComponent(),
                          evt.getX(), evt.getY());
         }
         public void mouseReleased(MouseEvent evt) {
            if ( evt.isPopupTrigger() ) // 顯示選單
               popup.show(evt.getComponent(),
                          evt.getX(), evt.getY());
         } });
   }
   // 實作事件處理方法
   public void actionPerformed(ActionEvent evt) {}
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      practice_blank app = new practice_blank();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}