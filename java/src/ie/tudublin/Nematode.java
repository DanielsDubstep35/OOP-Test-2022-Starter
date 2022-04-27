package ie.tudublin;

import processing.data.TableRow;

public class Nematode {

    private String name;
    private int length;
    private int limbs;
    private Character gender;
    private int eyes;

    public Nematode(TableRow row) {
        this.name = getName();
        this.length = getLength();
        this.limbs = getLimbs();
        this.gender = getGender();
        this.eyes = getEyes();
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



    public Character getGender() {
        return gender;
    }



    public void setGender(Character gender) {
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
