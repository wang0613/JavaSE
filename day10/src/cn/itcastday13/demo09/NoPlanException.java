package cn.itcastday13.demo09;
/*
教学计划无法完成的异常
 */
public class NoPlanException extends Exception {

    NoPlanException(String msg ) {
        super(msg);
    }
}
