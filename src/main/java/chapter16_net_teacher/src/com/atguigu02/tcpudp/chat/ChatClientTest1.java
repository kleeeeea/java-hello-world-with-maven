package chapter16_net_teacher.src.com.atguigu02.tcpudp.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 案例：聊天室的实现 （客户端）
 *
 * @author 尚硅谷-宋红康
 * @create 16:42
 */
public class ChatClientTest1 {
	public static void main(String[] args)throws Exception {
		//1、连接服务器
		Socket socket = new Socket("127.0.0.1",8989);
		
		//2、开启两个线程
		//(1)一个线程负责看别人聊，即接收服务器转发的消息
		Receive receive = new Receive(socket);
		receive.start();
		
		//(2)一个线程负责发送自己的话
		Send send = new Send(socket);
		send.start();
		
		send.join();//等我发送线程结束了，才结束整个程序
		
		socket.close();
	}
}
