package Java20151119;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O, ��@ActionListener����
public class practice_blank extends JFrame
                      implements ActionListener {
   private JPopupMenu popup;
   JMenu m;
   private Container con;
   public practice_blank() {    // �غc�l
      super("JPopupMenu����d��");
      con = getContentPane();
      con.setBackground(Color.white);
      popup = ..;   //new popupmenu
      ......("�_��(U)");  //�[�Jpopupmenu
      ......; //���J���j
      ......("�ŤU(T)");  //�[�Jpopupmenu
      ......("�ƻs(C)"); //�[�Jpopupmenu
      ......("�K�W(P)");  //�[�Jpopupmenu
      ......("�R��(D)");  //�[�Jpopupmenu
      ......; //���J���j
      .......("����(A)");  //�[�Jpopupmenu
      ......; //���J���j
      ......("�q�k�쥪��Ū������(R)");//�[�Jpopupmenu
      ......("���Unicode����r��(S)");//�[�Jpopupmenu
      m = ......("���JUnicode����r��(I)");//new Jmenu
      ......("LRM");//�[�J Jmenu
      ......("RLM");//�[�J Jmenu
      popup.add(m);//�NJmenu �[�J popupmenu 
      ......; //���J���j
      ......("�}��IME(O)");//�[�Jpopupmenu
      ......("���s�ഫ(R)");//�[�Jpopupmenu
      addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent evt) {
            if ( evt.isPopupTrigger() ) // ��ܿ��
               popup.show(evt.getComponent(),
                          evt.getX(), evt.getY());
         }
         public void mouseReleased(MouseEvent evt) {
            if ( evt.isPopupTrigger() ) // ��ܿ��
               popup.show(evt.getComponent(),
                          evt.getX(), evt.getY());
         } });
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {}
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      practice_blank app = new practice_blank();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}