package io.codelex.enums.practice.Exercise1;

enum CardinalPoint {
    NORTH("North", "up", 0),
    SOUTH("South", "down", 1),
    EAST("East", "right", 2),
    WEST("West", "left", 3);

    private String text;
    private String name;
    private int i;

    CardinalPoint(String name, String text, int i) {
        this.name = name;
        this.text = text;
        this.i = i;
    }

    public static String getDirection(CardinalPoint cardinalPoint) {
        switch (cardinalPoint) {
            case EAST -> System.out.println(EAST);
            case WEST -> System.out.println(WEST);
            case NORTH -> System.out.println(NORTH);
            case SOUTH -> System.out.println(SOUTH);
        }
        return null;
    }
    @Override
    public String toString() {
        return name + ":" + text + ":" + i;
    }
}