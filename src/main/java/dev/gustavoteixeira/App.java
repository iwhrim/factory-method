package dev.gustavoteixeira;

import java.util.Arrays;
import java.util.List;

import dev.gustavoteixeira.transports.Truck;

public class App {
    public static void main( String... args ) {
        List<Truck> transports = Arrays.asList(new Truck(), new Truck(), new Truck());
        
        transports.stream().forEach(Truck::deliver);
    }
}
