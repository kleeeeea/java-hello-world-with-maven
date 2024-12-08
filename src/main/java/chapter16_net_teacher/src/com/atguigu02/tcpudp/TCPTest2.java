package chapter16_net_teacher.src.com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest2
 * Description:
 *      例题2：客户端发送文件给服务端，服务端将文件保存在本地。
 * @Author 尚硅谷-宋红康
 * @Create 10:10
 * @Version 1.0
 */
public class TCPTest2 {
    /*
    * 注意：因为涉及到相关资源的关闭，需要使用try-catch-finally处理异常
    * */
    //客户端
//    @Test
//    public void client() throws IOException {
    public static void main(String[] args) throws IOException {
        //1. 创建Socket
        //指明对方（即为服务器端）的ip地址和端口号
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        Socket socket = new Socket(inetAddress,port);

        //2. 创建File的实例、FileInputStream的实例
//        File file = new File("pic.jpg");
        File file = new File("src/main/java/chapter16_net_teacher/pic.jpg");
        FileInputStream fis = new FileInputStream(file);
        //3. 通过Socket，获取输出流
        OutputStream os = socket.getOutputStream();

        //4. 读写数据
        byte[] buffer = new byte[1024];
        int len;
        while((len = fis.read(buffer)) != -1){
            os.write(buffer,0,len);
        }
        System.out.println("数据发送完毕");

        //5. 关闭Socket和相关的流
        os.close();
        fis.close();
        socket.close();

    }

    //服务端
}
