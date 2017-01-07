package Java20151105;

import java.io.*;
import java.net.*;

public class Example1_client {
	static final String IP = "127.0.0.1";
	static final int PORT = 8888;

	public static void main(String[] args) {
		try {
			// �s��Server��
			Socket s = new Socket(IP, PORT);

			// �إ߿�J/��X��y
			DataInputStream in = new DataInputStream(s.getInputStream());
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			// �إߨ��Thread
			Thread rt = new ClientReaderThread(in);
			Thread wt = new ClientWriterThread(out);
			// �Ұʨ��Thread
			rt.start();
			wt.start();

		} catch (SocketException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

// �إߤ@��Thread�Ӷi�汵��
class ClientReaderThread extends Thread {
	private DataInputStream dis;

	public ClientReaderThread(DataInputStream dis) {
		this.dis = dis;
	}

	@Override
	public void run() {
		String msg;
		try {
			while (true) {
				msg = dis.readUTF();
				System.out.println("��軡:" + msg);
				if (msg.equals("bye")) {
					System.out.println("���h�X!");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

// �إߤ@��Thread�Ӷi��o�e
class ClientWriterThread extends Thread {
	private DataOutputStream dos;

	public ClientWriterThread(DataOutputStream dos) {
		this.dos = dos;
	}

	@Override
	public void run() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String msg;
		try {
			while (true) {
				msg = br.readLine();
				dos.writeUTF(msg);
				if (msg.equals("bye")) {
					System.out.println("�ۤv�h�X!");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}