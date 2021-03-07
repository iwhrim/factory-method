package dev.gustavoteixeira.transports;

public class Truck {
    public void deliver() {
        System.out.println("Delivering the package " + this.hashCode() + "...");
    }
}
