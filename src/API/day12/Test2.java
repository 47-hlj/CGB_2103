package API.day12;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file=new File("D:\\CGB_2103");
        System.out.println(sizeof(file));
        File file1=new File("D:\\iotest1");
        delete(file1);
    }

    //递归遍历
    public static long sizeof(File file){
        File[] files=file.listFiles();
        long sum=0;
        for (File file1:files) {
            if (file1.isFile()) {//文件，文件大小求和
                sum += file1.length();
            } else if (file1.isDirectory()) {//文件夹  递归调用
                sum+=sizeof(file1);
            }
        }
        return sum;
    }
    //递归删除
    public static void delete(File file){
        File[] files=file.listFiles();
        for (File file1:files) {
            if (file1.isFile()) {//文件，文件大小求和
                file1.delete();
            } else if (file1.isDirectory()) {//文件夹  递归调用
                delete(file1);
            }
        }
    }
}
