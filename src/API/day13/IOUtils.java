package API.day13;

import java.io.Closeable;
import java.io.IOException;

public class IOUtils {
    //参数Closeable是InputStream和OutputStream的父接口
    //即可以关闭输入流，又可以关闭输出流
    public static void close(Closeable in) {
        //避免空指针异常：java.lang.NullPointerException
        if (in != null) {
            try{
                in.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
