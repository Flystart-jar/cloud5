package dry;


import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.SecureRandom;
import java.util.*;

@RunWith(SpringRunner.class)
public class Test extends Thread{

    @org.junit.Test
    public void print(){
//        String s="123456789";
//        byte[] bytes;
//        bytes=s.getBytes();
//        byte[] bytes2={48,55,59};
//        String s1=new String(bytes2);
//        System.out.println(s1);
//        System.out.println(bytes[0]);
//        System.out.println(Arrays.toString(bytes));

//        System.out.println((new StringBuilder(Long.toString(System.currentTimeMillis()))).toString());
//        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
//        SecureRandom  srandom = new SecureRandom();
//        ;int len=17;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < len; i++) {
//            sb.append(chars[srandom.nextInt(62)]);
//        }
//        System.out.println(sb.toString());
        List<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        Map<String,List<Integer>> map=new HashMap<>();
        map.put("a",a);
        List<Integer> b=map.get("a");
        System.out.println(a);
        b.add(4);
        System.out.println(a);
        System.out.println(b);
        a.add(8);
        System.out.println(a);
        System.out.println(b);

    }

}
