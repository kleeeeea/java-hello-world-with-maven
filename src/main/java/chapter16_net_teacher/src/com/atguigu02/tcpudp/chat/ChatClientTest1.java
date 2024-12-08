package chapter16_net_teacher.src.com.atguigu02.tcpudp.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����������ҵ�ʵ�� ���ͻ��ˣ�
 *
 * @author �й��-�κ쿵
 * @create 16:42
 */
public class ChatClientTest1 {
	public static void main(String[] args)throws Exception {
		//1�����ӷ�����
		Socket socket = new Socket("127.0.0.1",8989);
		
		//2�����������߳�
		//(1)һ���̸߳��𿴱����ģ������շ�����ת������Ϣ
		Receive receive = new Receive(socket);
		receive.start();
		
		//(2)һ���̸߳������Լ��Ļ�
		Send send = new Send(socket);
		send.start();
		
		send.join();//���ҷ����߳̽����ˣ��Ž�����������
		
		socket.close();
	}
}
