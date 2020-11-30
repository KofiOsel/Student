/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Random;

/**
 *
 * @author kofi3
 */
public class Rectanguler {
    private int width;
    private int lenght;
    private String color;

    public Rectanguler() {
        Random rand = new Random();
        this.width = rand.nextInt(10)+1;
        this.lenght = rand.nextInt(10)+1;
        this.color = "black";
    }
    /**
     * To the area of a rectangular
     * @return the area of a rectangular
     */
    public int calcArea(){
        return width * lenght;
    }
    /**
     * To the perimeter of a rectangular
     * @return the perimeter of a rectangular
     */
    public int calcPrerime(){
        return (width + lenght) * 2;
    }
    public Rectanguler(int width, int lenght, String color) {
        this.width = width;
        this.lenght = lenght;
        this.color = color;
    }
    public Rectanguler(Rectanguler rectanguler){
        this.width = rectanguler.width;
        this.lenght = rectanguler.lenght;
        this.color = rectanguler.color;   
    }
    public boolean equals(Rectanguler rectanguler){
        return this.width == rectanguler.width &&
                this.lenght == rectanguler.lenght &&
                this.color.equals(rectanguler.color);
                
    }
    @Override
    public String toString() {
        String str = "";
        str += String.format("%-10s: %d\n","Widht",width);
        str += String.format("%-10s: %d\n","lenght",lenght);
        str += String.format("%-10s: %s\n","Color",color);
        str += String.format("%-10s: %s\n","Area",calcArea());
        str += String.format("%-10s: %s\n","Perimeter",calcPrerime());
        return str;
        
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


