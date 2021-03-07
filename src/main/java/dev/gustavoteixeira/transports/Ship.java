package dev.gustavoteixeira.transports;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering the package " + this.hashCode() + " by sea...");
    }

}
