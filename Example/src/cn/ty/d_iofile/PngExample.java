package cn.ty.d_iofile;
//演示：打印G盘下面，所有目录中的png图片信息。
import java.io.File;
import java.io.FileFilter;
//本程序实现了深度优先遍历
/*
1. 列出G盘下的所有文件信息（文件夹、文件）
	1.1 遍历这个结果，如果它是文件，判断是否是png文件，如果是则打印。
	1.2 如果它是文件夹
		1.2.1 列出该文件夹下的所有文件信息（文件夹、文件）
		1.2.1.1 遍历这个结果，如果它是.....
 */
public class PngExample {
    public static void main(String[] args) {
        File file = new File("e:\\");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //isDirectory()判断此抽象路径名表示的文件是否是一个目录
                return pathname.isDirectory()||(pathname.getName().endsWith(".png") &&(pathname.isFile()));
                //若是文件夹或者是以.png结尾文件，则返回
            }
        });
        print(files);
    }
    private static void print(File[] files){
        if (files==null)return;
        for (File value : files) {
            if (value.isFile()) {
                System.out.println(value);
            } else {
                File[] file = value.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        return pathname.isDirectory() || (pathname.getName().endsWith(".png") && (pathname.isFile()));
                    }
                });
                print(file);
            }
        }
    }
}
