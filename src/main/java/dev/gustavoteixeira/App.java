package dev.gustavoteixeira;

import java.util.Arrays;
import java.util.List;

import dev.gustavoteixeira.transports.Ship;
import dev.gustavoteixeira.transports.Transport;
import dev.gustavoteixeira.transports.Truck;

public class App {
    public static void main( String... args ) {
        List<Transport> transports = Arrays.asList(new Truck(), new Ship(), new Truck(), new Ship(), new Truck());
        
        transports.stream().forEach(Transport::deliver);
    }
}
