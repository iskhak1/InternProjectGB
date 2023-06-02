package org.example;

import org.example.POJO.Toy;

import java.io.FileWriter;
import java.io.IOException;

public class Basket {
    private ToysStock toysStock;
    public Basket(ToysStock toysStock){
        this.toysStock = toysStock;
    }
    public void add(Toy o) {
        toysStock.getToys().remove(o);
        try {
            writeToFile(o);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeToFile(Toy toy) throws IOException {
        System.out.println("add file");
        FileWriter writer = new FileWriter(toy.getName(),true);
        writer.write(toy.toString());
    }

}
