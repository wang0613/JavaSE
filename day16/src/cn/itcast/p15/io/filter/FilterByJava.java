package cn.itcast.p15.io.filter;

import java.io.File;
import java.io.FilenameFilter;

//【文件名】过滤器
public class FilterByJava implements FilenameFilter {

    /**
     *  FilenameFilter 文件名过滤接口，用于过滤类 File的list方法中的目录列表。
     */

    @Override
    public boolean accept(File dir, String name) {

        return name.endsWith(".java"); //判断文件名后缀
    }


}
