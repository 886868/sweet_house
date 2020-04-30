package demo;


import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Demo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = demoBase64Encode2("aaa:bbb");
        System.out.println(str);

        String str2 = demoBase64Decode2(str);
        System.out.println(str2);

        System.out.println(makeStr());
    }

//    public static String demoBase64Decode(String str) throws UnsupportedEncodingException {
//        return new String(Base64.getDecoder().decode(str), "UTF-8");
//    }
//
//    public static String demoBase64Encode(String str) {
//        return Base64Utils.encode(str.getBytes()).toString();
//    }

    public static String makeStr() {

        return new StringBuilder().append("Basic ").append(Base64.getEncoder().encodeToString("smec:smec123456".getBytes())).toString();
    }

    public static String demoBase64Encode2(String str) throws UnsupportedEncodingException {



        return  Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
    }

    public static String demoBase64Decode2(String str) throws UnsupportedEncodingException {
        return  new String(Base64.getDecoder().decode(str), "UTF-8");
    }
}
