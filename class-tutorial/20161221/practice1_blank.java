package Java20151119;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O, ��@ActionListener����
public class practice1_blank extends JFrame
                      implements ActionListener {
   private JRadioButtonMenuItem red, green, blue;
   private Container c;
   public practice1_blank() {    // �غc�l
      super ("JMenuBar����d��");
      c = getContentPane();
      c.setBackground(Color.white);
      .... jmb ....;//�ŧiJMenuBar ��new
      ....(jmb);  // �s�W�U�Ԧ��\���
      .... file = ....("�ɮ�(F)"); // �Ĥ@�ӿ��
      file.setMnemonic(KeyEvent.VK_F);
      .... item;//�ŧiJMenuItem
      ("�}�s�ɮ�(N)",KeyEvent.VK_N)); //	�bfile�[�Jitem
      ("�}������(O)",KeyEvent.VK_O));
      ("�x�s�ɮ�(S)",KeyEvent.VK_S));
      ("�t�s�s��(A)",KeyEvent.VK_A));
      ....;//���J���j�u
      ("�����]�w(U)",KeyEvent.VK_U));
      ("�C�L(P)",KeyEvent.VK_P));
      ....;//���J���j�u
      ("����(X)",KeyEvent.VK_X));
      ....(file); // �s�Wfile����menubar
      .... edit = ....("�s��(E)"); // �ĤG�ӿ��
      edit.setMnemonic(KeyEvent.VK_E);
      ("�_��(U)",KeyEvent.VK_U));
      edit ......; //���J���j
      ....("�ŤU(T)",KeyEvent.VK_T));
      ....("�ƻs(C)",KeyEvent.VK_C));
      ....("�K�W(P)",KeyEvent.VK_P));
      ....("�R��(L)",KeyEvent.VK_L));
      edit. ......; //���J���j
      ....("�M��(F)",KeyEvent.VK_F));
      edit. ......; //���J���j
      ....("��U�@��(N)",KeyEvent.VK_N));
      ....("���N(R)",KeyEvent.VK_R));
      ....("����(G)",KeyEvent.VK_G));
      edit. ......; //���J���j
      ....("����(A)",KeyEvent.VK_A));
      ....("���/�ɶ�(D)",KeyEvent.VK_D));
      ....(edit); // �s�Wedit����menubar
      .... format =....("�榡(O)"); // �ĤT�ӿ��
      format.setMnemonic(KeyEvent.VK_O);
      ....("�۰ʴ���(W)",KeyEvent.VK_W));
      ....("�r��(F)",KeyEvent.VK_F));
      .....add(format);
       view ("�˵�(V)"); // �ĥ|�ӿ��
      view.setMnemonic(KeyEvent.VK_V);
      ....("���A�C(S)",KeyEvent.VK_S));
      ....add(view);
      .... explanation = ....("����(H)"); // �Ĥ��ӿ��
      explanation.setMnemonic(KeyEvent.VK_H);
      ....("�˵�����(H)",KeyEvent.VK_H));
      explanation. ......; //���J���j
      ....("����O�ƥ�(A)",KeyEvent.VK_A));
      .....add(explanation);
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {}
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      practice1_blank app = new practice1_blank();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}