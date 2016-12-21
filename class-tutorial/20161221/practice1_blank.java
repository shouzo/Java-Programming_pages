package Java20151119;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別, 實作ActionListener介面
public class practice1_blank extends JFrame
                      implements ActionListener {
   private JRadioButtonMenuItem red, green, blue;
   private Container c;
   public practice1_blank() {    // 建構子
      super ("JMenuBar元件範例");
      c = getContentPane();
      c.setBackground(Color.white);
      .... jmb ....;//宣告JMenuBar 並new
      ....(jmb);  // 新增下拉式功能表
      .... file = ....("檔案(F)"); // 第一個選單
      file.setMnemonic(KeyEvent.VK_F);
      .... item;//宣告JMenuItem
      ("開新檔案(N)",KeyEvent.VK_N)); //	在file加入item
      ("開啟舊檔(O)",KeyEvent.VK_O));
      ("儲存檔案(S)",KeyEvent.VK_S));
      ("另存新檔(A)",KeyEvent.VK_A));
      ....;//插入分隔線
      ("版面設定(U)",KeyEvent.VK_U));
      ("列印(P)",KeyEvent.VK_P));
      ....;//插入分隔線
      ("結束(X)",KeyEvent.VK_X));
      ....(file); // 新增file選單到menubar
      .... edit = ....("編輯(E)"); // 第二個選單
      edit.setMnemonic(KeyEvent.VK_E);
      ("復原(U)",KeyEvent.VK_U));
      edit ......; //插入分隔
      ....("剪下(T)",KeyEvent.VK_T));
      ....("複製(C)",KeyEvent.VK_C));
      ....("貼上(P)",KeyEvent.VK_P));
      ....("刪除(L)",KeyEvent.VK_L));
      edit. ......; //插入分隔
      ....("尋找(F)",KeyEvent.VK_F));
      edit. ......; //插入分隔
      ....("找下一個(N)",KeyEvent.VK_N));
      ....("取代(R)",KeyEvent.VK_R));
      ....("移至(G)",KeyEvent.VK_G));
      edit. ......; //插入分隔
      ....("全選(A)",KeyEvent.VK_A));
      ....("日期/時間(D)",KeyEvent.VK_D));
      ....(edit); // 新增edit選單到menubar
      .... format =....("格式(O)"); // 第三個選單
      format.setMnemonic(KeyEvent.VK_O);
      ....("自動換行(W)",KeyEvent.VK_W));
      ....("字型(F)",KeyEvent.VK_F));
      .....add(format);
       view ("檢視(V)"); // 第四個選單
      view.setMnemonic(KeyEvent.VK_V);
      ....("狀態列(S)",KeyEvent.VK_S));
      ....add(view);
      .... explanation = ....("說明(H)"); // 第五個選單
      explanation.setMnemonic(KeyEvent.VK_H);
      ....("檢視說明(H)",KeyEvent.VK_H));
      explanation. ......; //插入分隔
      ....("關於記事本(A)",KeyEvent.VK_A));
      .....add(explanation);
   }
   // 實作事件處理方法
   public void actionPerformed(ActionEvent evt) {}
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      practice1_blank app = new practice1_blank();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}