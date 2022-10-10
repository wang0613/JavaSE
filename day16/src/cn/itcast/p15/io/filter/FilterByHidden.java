package cn.itcast.p15.io.filter;

import java.io.File;
import java.io.FileFilter;

//隐藏【文件过滤】器
public class FilterByHidden implements FileFilter {

    /**
     * FileFilter：过滤文件
     * 抽象路径名的过滤器。
     * 可以将此接口的实例传递给File类的listFiles(FileFilter)方法。
     */
    @Override
    public boolean accept(File pathname) {

        return !pathname.isHidden(); //返回文件是否隐藏
    }
}
