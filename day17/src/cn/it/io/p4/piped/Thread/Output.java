package cn.it.io.p4.piped.Thread;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Output implements Runnable {

    private PipedOutputStream out;

    public Output(PipedOutputStream out) {
        this.out = out;
    }

    @Override
    public void run() {
        try{
            out.write("hei,管道来了！！".getBytes());

        } catch (IOException e) {

        }
    }
}
