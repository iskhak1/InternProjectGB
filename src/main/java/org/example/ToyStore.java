package org.example;

import org.example.POJO.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToyStore {

    private ToysStock toysStock;
    private Basket basket;
    private Scanner scanner;

    public ToyStore(){
        toysStock = new ToysStock();
        basket = new Basket(toysStock);
        scanner = new Scanner(System.in);
        startGame();
    }

    public void startGame(){
        System.out.println("Wellcome to game!!!");
        ArrayList<Toy> toys = (ArrayList<Toy>) toysStock.getToys();
        int n = randomizer(toys).getId();
        while(true) {
            System.out.println("Guess the id from 1 to " +(toys.size()+1));
            int gueessN = scanner.nextInt();
            if (gueessN == n) {
                System.out.println("You win");
                n = randomizer(toys).getId();
                basket.add(toys.get(gueessN));
            }else {
                System.out.print("You loose ");
            }
            System.out.println("One more? Y/N");
            String value = scanner.next();
            if (!value.equalsIgnoreCase("Y")) {
                break;
            }
        }

    }
   private Toy randomizer(List list){
        int randomNumber = (int)Math.random() * list.size();
        return (Toy) list.get(randomNumber);
   }

}
