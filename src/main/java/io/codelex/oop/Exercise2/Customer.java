package io.codelex.oop.Exercise2;

public class Customer extends Person {
    private int purchaseCount;
    public Customer(String firstName, String lastName, String id, int purchaseCount) {
        super(firstName, lastName, id, purchaseCount);
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }
    public String getInfo() {
        this.getPurchaseCount();
        System.out.printf("%s %s %s (%d purchases)", firstName, lastName, getId(), getPurchaseCount());
        System.out.println();
        return firstName + lastName + getId() + getPurchaseCount();
    }

}
