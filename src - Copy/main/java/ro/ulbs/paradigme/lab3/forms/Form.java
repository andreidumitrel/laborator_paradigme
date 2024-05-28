package ro.ulbs.paradigme.lab3.forms;

public class Form {
    private String color;
    static private int counter=0;

    public Form() {
        color = "white";
        counter++;
    }

    public Form(String color) {
        this.color = color;
        counter++;
    }

    public float getArea() {
        return 0;
    }

    public int getCounter(){
        return counter;
    }
    public String toString() {
        return "This form has the color "+color;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Form) {
            Form f = (Form) obj;
            if (this.color == null && f.color == null) {
                return true;
            }
            else if (this.color != null && f.color != null && this.color.compareTo(f.color) == 0) {
                return true;
            }
        }
        return false;
    }
}
