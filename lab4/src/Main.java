import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d

        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            x.add(rnd.nextInt(11) );
            y.add(rnd.nextInt(11) );
        }
        y.add(rnd.nextInt(11) );
        y.add(rnd.nextInt(11) );

        Collections.sort(x);
        Collections.sort(y);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);


        for (int i = 0; i < x.size(); i++) {
            xPlusY.add(x.get(i));
        }
        for (int i = 0; i < y.size(); i++) {
            xPlusY.add(y.get(i));
        }

        System.out.println("xPlusY: " + xPlusY);


        for (int i = 0; i < x.size(); i++) {
            int t = x.get(i);
            boolean found = false;
            for (int j = 0; j < y.size(); j++) {
                if (t == y.get(j)) {
                    found = true;
                }
            }
            if (found) {
                zSet.add(t);
            }
        }
        System.out.println("zSet: " + zSet);

        for (int i = 0; i < x.size(); i++) {
            int t = x.get(i);
            boolean seAflainY = false;
            for (int j = 0; j < y.size(); j++) {
                if (t == y.get(j))
                    seAflainY = true;
            }
            if (!seAflainY)
                xMinusY.add(t);
        }
        System.out.println("xMinusY: " + xMinusY);

        for(int i=0;i<xPlusY.size();i++){
            if(xPlusY.get(i)<p){
                xPlusYLimitedByP.add(xPlusY.get(i));
            }
        }
        System.out.println("xPlusYLimitedByP: "+xPlusYLimitedByP);

        List<Student> studentList= new ArrayList();
        Student a=new Student("Ion Ionescu","223");
        for(int i=0;i<5;i++)
            a.adaugaNota((rnd.nextInt(6)+4));
        Student b=new Student("Florin Florinescu","222");
        for(int i=0;i<5;i++)
            b.adaugaNota((rnd.nextInt(6)+4));
        Student c=new Student("Nicusor Guta","223");
        for(int i=0;i<5;i++)
            c.adaugaNota((rnd.nextInt(6)+4));
        Student d=new Student("Vali Vijelie","221");
        for(int i=0;i<5;i++)
            d.adaugaNota((rnd.nextInt(6)+4));

        studentList.add(a);
        studentList.add(b);
        studentList.add(c);
        studentList.add(d);

        System.out.println(studentList);

        List<Student> integralisti = new ArrayList();
        for(int i=0;i<studentList.size();i++){
            Student t= studentList.get(i);
            if(t.esteIntegralist()){
                integralisti.add(t);
            }
        }

        Collections.sort(integralisti, new ByGradesComparator());
        System.out.println(integralisti);

    }
}
