package cn.itcastday13.demo11;
/*
Jar :Java中的压缩包
是一个dos命令

示例 1: 将两个类文件归档到一个名为 classes.jar 的档案中:
       jar cvf classes.jar Foo.class Bar.class
示例 2: 使用现有的清单文件 'mymanifest' 并
           将 foo/ 目录中的所有文件归档到 'classes.jar' 中:
       jar cvfm classes.jar mymanifest -C foo/ .
表达式A && 表达式B ，表达式A一旦为false，短路，表达式B无所谓。
 */
public class JarDemo {
    public static void main(String[] args) {
        System.out.println("Hello,world!");
    }
}
