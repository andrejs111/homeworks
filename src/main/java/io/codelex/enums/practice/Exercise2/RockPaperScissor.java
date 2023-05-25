package io.codelex.enums.practice.Exercise2;

import java.util.Random;

public class RockPaperScissor {
    enum Moves {
        ROCK("ROCK", "r", false, false, true),
        PAPER("PAPER", "p", true, false, true),
        SCISSORS("SCISSORS", "s", false, true, false);

        private final String fullName;
        private final String name;
        private final boolean beatsRock;
        private final boolean beatsPaper;
        private final boolean beatsScissor;

        Moves(String fullName, String name, boolean beatsRock, boolean beatsPaper, boolean beatsScissor) {
            this.fullName = fullName;
            this.name = name;
            this.beatsRock = beatsRock;
            this.beatsPaper = beatsPaper;
            this.beatsScissor = beatsScissor;
        }

        public boolean beats(Moves oppMove) {
            if (oppMove == ROCK)
                return beatsRock;
            else if (oppMove == PAPER)
                return beatsPaper;
            else if (oppMove == SCISSORS)
                return beatsScissor;
            return false;
        }
        public String getFullName() {
            return fullName;
        }

        @Override
        public String toString() {
            return fullName.toUpperCase();
        }
    }
    public static Moves getRandomMove(Random random) {
        Moves[] moves = Moves.values();
        return moves[random.nextInt(3)];
    }

    public static double calculateWinPercentage(int wins, int totalGames) {
        if (totalGames == 0)
            return 0;
        return (wins / (double) totalGames) * 100;
    }
    }
