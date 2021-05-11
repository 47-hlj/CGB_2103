package API.day12;

import java.io.File;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //1.创建对象-参数是文件所在的路径
        File file=new File("D:\\iotest\\1.txt");
        //2.调用方法
        /**
         * length()：文件的字节量
         * exists()：是否存在，存在返回true
         * isFile()：是否为文件，是文件返回true
         * isDirectory()：是否为文件夹，是文件夹返回true
         * getName()：获取文件/文件夹名
         * getParent()：获取父文件夹的路径
         * getAbsolutePath()：获取文件的完整路径
         */
//        System.out.println(file.length());
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.getAbsolutePath());

        /**
         * createNewFile()：新建文件，文件夹不存在会异常，文件已经存在返回false
         * mkdirs()：新建多层不存在的文件夹\a\b\c
         * mkdir()：新建单层不存在的文件夹\a
         * delete()：删除文件，删除空文件夹
         */
//        File file1=new File("D:\\iotest\\2.txt");
//        File file2=new File("D:\\iotest\\a\\b\\c");
//        File file3=new File("D:\\iotest\\d");
//        System.out.println(file1.createNewFile());
//        System.out.println(file2.mkdirs());
//        System.out.println(file3.mkdir());
//        System.out.println(file2.delete());

        //TODO 文件夹
        File file4=new File("D:\\iotest");
        String[] s=file4.list();
        System.out.println(Arrays.toString(s));

        File[] files=file4.listFiles();
        System.out.println(Arrays.toString(files));

    }

    public static int sum(File file){
        File[] files=file.listFiles();
        int sum=0;
        for (File file1:files) {
            if (file1.isFile()) {//文件，文件大小求和
                sum += file1.length();
            } else if (file1.isDirectory()) {//文件夹  打印名字
                System.out.println(file1.getName());
            }
        }
        return sum;
    }
}


