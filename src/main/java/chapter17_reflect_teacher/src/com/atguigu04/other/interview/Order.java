package chapter17_reflect_teacher.src.com.atguigu04.other.interview;

/**
 * ClassName: Order
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:33
 * @Version 1.0
 */
public class Order {
    static int orderDesc = 1;

    static{
        orderDesc = 2;
        System.out.println("Order static block...");
    }
}
