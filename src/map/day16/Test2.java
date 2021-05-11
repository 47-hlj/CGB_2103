package map.day16;

import java.io.File;
import java.util.HashMap;

/**
 * 需求：列出文件夹里的所有资源
 * 并把资源存入map中{文件名，文件类型}
 *
 */

public class Test2 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        File file=new File("D:\\iotest");
        File[] files=file.listFiles();
        for (File file1:files){
            String fileName=file1.getName();
//            String[] a=fileName.split("\\.");
            if(file1.isFile()){
                hashMap.put(fileName.substring(0,fileName.lastIndexOf('.')),fileName.substring(fileName.lastIndexOf('.')+1));
            }
            if(file1.isDirectory()){
                hashMap.put(file1.getName(),null);
            }
        }
        System.out.println(hashMap);
    }
}
