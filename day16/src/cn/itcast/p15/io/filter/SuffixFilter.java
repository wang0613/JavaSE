package cn.itcast.p15.io.filter;

import java.io.File;
import java.io.FilenameFilter;

public class SuffixFilter implements FilenameFilter {

    /**
     * 后缀名过滤器，可以过滤任何类型
     */
    private String suffix;

    //创建对象时，传入需要过滤的类型
    public SuffixFilter(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean accept(File dir, String name) {

        return name.endsWith(suffix); //是否包含 ：contains();
    }
}
