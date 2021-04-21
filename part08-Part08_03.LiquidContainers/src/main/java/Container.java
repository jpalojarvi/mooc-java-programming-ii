/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Productivity
 */
public class Container {

    private int currentCapacity;
    private int maxCapacity = 100;

    public Container(int currentCapacity) {
        this.currentCapacity = currentCapacity;
        this.maxCapacity = 100;
    }

    public void add(int amount) {
        if (amount > 0) {
            if ((this.currentCapacity + amount) <= (this.maxCapacity)) {
                this.currentCapacity += amount;
            } else if (this.currentCapacity + amount > this.maxCapacity) {
                this.currentCapacity = 100;
            }
        }
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }
}
