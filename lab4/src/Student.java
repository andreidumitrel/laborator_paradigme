import java.util.*;
public class Student {
    private String nume;
    private String grupa;
    private List<Integer> note;
    public Student(String valoare, String grupa){
        this.nume = valoare;
        this.grupa = grupa;
        note = new ArrayList();
    }
    public String getNume() {
        return nume;
    }
    public String getGrupa() {
        return grupa;
    }
    public void adaugaNota(int nota){
        note.add(nota);
    }
    public boolean esteIntegralist(){
        for(int i=0;i<note.size();i++){
            if(note.get(i)<5)
                return false;
        }
        return true;
    }
    public Integer medie(){
        int suma=0;
        for(int i=0;i<note.size();i++){
            suma+=note.get(i);
        }
        return (suma/note.size());
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void show(){
        System.out.println(nume+' '+grupa+' '+note);
    }

}
