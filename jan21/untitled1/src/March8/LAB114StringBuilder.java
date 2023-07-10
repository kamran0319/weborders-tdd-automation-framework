package March8;

public class LAB114StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Talk is cheap.");
        sb.append(" Show me the code.").deleteCharAt(0).insert(0,'t').insert(0,"Empty ").
                replace(sb.indexOf("cheap"),sb.indexOf("cheap")+"cheap".length(),"useless").
                insert(sb.indexOf("useless")+"useless".length()," and no good").
                delete(sb.indexOf("useless"),sb.indexOf("useless")+"useless and ".length()).
                replace(sb.indexOf("Empty"),sb.indexOf("Empty")+"Empty talk is no good".length(),"Talk less").
                replace(sb.indexOf("Show"),sb.indexOf("Show me the")+"Show me the c".length(),"C").
                insert(sb.length()-1," more").reverse();



        System.out.println(sb);
    }

}
