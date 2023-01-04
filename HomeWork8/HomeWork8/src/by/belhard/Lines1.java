package by.belhard;

public class Lines1 {
    public static void main(String[] str){
        int a=20;
        int b=30;
        StringBuilder builder=new StringBuilder();
        String sng=builder.append(a).append("+").append(b).append("=").append(a+b).append("\n")
                .append(a).append("-").append(b).append("=").append(a-b).append("\n")
                .append(a).append("*").append(b).append("=").append(a*b).append("\n").toString();
        System.out.println(sng);
        StringBuilder builder1=new StringBuilder(sng);
        builder1.replace(5,6," equals ");
        builder1.replace(21,22," equals ");
        builder1.replace(38,39," equals ");
        System.out.println(builder1.toString());
    }

}
