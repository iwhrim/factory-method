package dev.gustavoteixeira.transports;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering the package " + this.hashCode() + " by land...");
    }

}
