/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

/**
 *
 * @author DELL
 */
public class Ractengle {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Ractengle() {
        this.height=0;
        this.width=0;
    }

    public Ractengle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public int area(){
        return height*width;
    }
    
    
}
