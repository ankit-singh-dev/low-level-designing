package tictactoe.models;

public enum PlayerPiece {
    X("X"),
    O("O");

    private final String value;

    PlayerPiece(String value) {
        this.value = value;
    }
}
