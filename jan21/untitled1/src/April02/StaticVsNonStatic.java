package April02;

public class StaticVsNonStatic {

    static int j=0;
    public StaticVsNonStatic(int j){
        this.j=j;
    }
    public int ReturnJ(){
        return j;
    }

    public static void main(String[] args) {
        int j=5;
        System.out.println(j);
        StaticVsNonStatic k=new StaticVsNonStatic(3);
        System.out.println(k.j);
    }


}
