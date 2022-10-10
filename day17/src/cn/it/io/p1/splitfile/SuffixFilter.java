package cn.it.io.p1.splitfile;

import java.io.File;
import java.io.FilenameFilter;

public class SuffixFilter implements FilenameFilter {

    //文件后缀名过滤器
    private String suffix;

    public SuffixFilter(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(suffix);
    }
}
