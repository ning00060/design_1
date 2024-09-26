package builder;

public class Browser {

    public static void main(String[] args) {
        
        Chrome chrome1=new Chrome.ChomeDLC("dlc1",  "dlc2", "dlc3")
        .addAdblock()
        .addAdblock()
        .builder();

        System.out.println(chrome1);
    }
}
