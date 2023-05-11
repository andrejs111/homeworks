package io.codelex.myCode;

public class Program {
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar("Gibson", 6, 2011, "Electric");
        System.out.println(myGuitar.getBrand() + myGuitar.getType());
        System.out.println(myGuitar.getOwner());
        Player newPlayer = new Player("Andrejs", "Dorodnovs");
        newPlayer.setGuitar(myGuitar);
        System.out.println(newPlayer.toString());
    }
}
