public class StringMethods {
    public static void main(String[]args) {


        System.out.println("backpack".substring(4));
        String newWord=new String("ceiling");
        System.out.println("New Word: "+newWord);
        System.out.println("backpack".substring(0,4));
        System.out.println("backpack".charAt(5));
        System.out.println(newWord.compareTo("backpaCK"));
        System.out.println(newWord.concat(", on the floor"));
        System.out.println("backpack".equals("swim"));
        System.out.println("backpack".equalsIgnoreCase("backpack"));
        System.out.println("backpack".indexOf("ack"));
        System.out.println("back".lastIndexOf("a"));
        System.out.println(newWord.toLowerCase());
        System.out.println("run, Java! run!".toUpperCase());
        System.out.println("reflection".replace("e","x"));
        System.out.println(String.valueOf(newWord));
        System.out.println("    Help me     ".trim());

        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.insert(0,"Light");
        System.out.println("String Capacity: "+stringBuffer.capacity());
        System.out.println("String Length: "+stringBuffer.length());
        System.out.println("String: "+stringBuffer);
        stringBuffer.replace(2,4,"XY");
        System.out.println("String: "+stringBuffer);
        stringBuffer.append(" is bright!");
        stringBuffer.replace(2,4,"gh");
        System.out.println(stringBuffer);


    }
}