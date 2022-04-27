package ie.tudublin;

import processing.data.Table;
import processing.data.TableRow;

public class Nematode {

    private String name;
    private int length;
    private int limbs;
    private String gender;
    private int eyes;

    public Nematode(TableRow tr) {
        this.name = tr.getString("name");
        this.length = tr.getInt("length");
        this.limbs = tr.getInt("limbs");
        this.gender = tr.getString("gender");
        this.eyes = tr.getInt("eyes");
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getLength() {
        return length;
    }



    public void setLength(int length) {
        this.length = length;
    }



    public int getLimbs() {
        return limbs;
    }



    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }



    public String getGender() {
        return gender;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }



    public int getEyes() {
        return eyes;
    }



    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Nematode [name=" + name + "]" + " [length=" + length + "]" + " [limbs=" + limbs + "]" + " [gender=" + gender + "]" + " [eyes=" + eyes + "]";
    }

}
