package cn.itcast.day15.demo04;
/*
两个字符串中最大的相同子串：
    获取最大的子串

 */
public class StringTest03 {
    public static void main(String[] args) {
        String s1 = "bhgkjdvfierjkffjdffdlf";
        String s2 = "fdkjsfierjsddf";

        String s = getMaxSubString(s1, s2);
        System.out.println("s = " + s);


    }
    public static String getMaxSubString (String s1,String s2) {

        //bhgkjdvfierjkffjdffdlf
        // hgkjdvfierjkffjdffdlf
        //  gkjdvfierjkffjdffdlf
        for (int i = 0; i < s2.length(); i++) {

            for (int a = 0, b= s2.length()-i; b != s2.length()+1 ; a++, b++) {

                //从第一位和最后一位开始截取
                String sub = s2.substring(a,b);


                if (s1.contains(sub)){
                    return sub;
                }
            }
        }
        return null;
    }

}
