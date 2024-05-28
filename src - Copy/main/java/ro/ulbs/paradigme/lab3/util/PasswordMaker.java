package ro.ulbs.paradigme.lab3.util;

import java.util.Random;

public class PasswordMaker {
    private static final int MAGIC_NUMBER=69;
    private static final String MAGIC_STRING = new String(RandomStringGenerator(23));

    private String password = new String();
    private String name = new String();
    public PasswordMaker(String name){
        this.name=name;
    }
    public static char selectAChar(String s){

        Random random = new Random();
        int index = random.nextInt(s.length());
        return s.charAt(index);

    }

    private int nameLenght(){
        int a = name.length();
        return a;
    }

    public static String RandomStringGenerator(int lenght){
        String string = new String();
        StringBuilder sb = new StringBuilder(20);
        Random rand = new Random();
        for (int i=0;i<lenght;i++){
            sb.append((char)(rand.nextInt(29)+'f'));
        }
        return sb.toString();
    }

    public String getPassword(){
        String string1= new String(RandomStringGenerator(MAGIC_NUMBER));
        String string2= new String();
        for(int i=0;i<10;i++){
            string2=string2+selectAChar(MAGIC_STRING);
        }
        String string3 = new String(String.valueOf(nameLenght()));
        String string4 = new String(String.valueOf(Math.random()%51));
        password = string1+string2+string3+string4;
        return password;
    }
}
