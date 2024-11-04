package chapter15_io_teacher.src.com.atguigu01.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer03
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:08
 * @Version 1.0
 */
public class Exer03 {
    //public void printFileName(File file)  //file可能是文件，也可能是文件目录
    @Test
    public void test1(){
        File file = new File("与IO流");
        printFileName(file);
    }

    public void printFileName(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        }else if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f : files){
                printFileName(f);
            }
        }
    }
}
