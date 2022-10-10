package demo12;

public class Test04 {
    public static void main(String[] args) {


        for(int i=9;i>0;i--){
            for(int j=0;j<9-i;j++){
                System.out.print("\t");
            }
            for(int j=i;j>0;j--){
                if((i*j)<10)
                    System.out.print(" "+j+"*"+i+"="+(i*j)+"\t");
                else
                    System.out.print(+j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }

    }
}
