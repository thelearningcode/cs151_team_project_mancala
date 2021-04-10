package MancalaBackend;

public class MancalaBoard {

    private PlayerTypes turn = PlayerTypes.PlayerA;
    private MancalaPit[] playerAPits = new MancalaPit[7];
    private MancalaPit[] playerBPits = new MancalaPit[7];

    public MancalaBoard(PitSize size) {
        startNewGame(size);
    }

    public void startNewGame(PitSize size) {
        int pitSize = 3;
        if (size == PitSize.Four) pitSize = 4;

        for (int i = 0; i < 6; i++) {
            playerAPits[i] = new MancalaPit(pitSize, PlayerTypes.PlayerA, false);
            playerBPits[i] = new MancalaPit(pitSize, PlayerTypes.PlayerB, false);
        }
        playerAPits[6] = new MancalaPit(0, PlayerTypes.PlayerA, true);
        playerBPits[6] = new MancalaPit(0, PlayerTypes.PlayerB, true);

        turn = PlayerTypes.PlayerA;
    }

    public PlayerTypes getTurn() {
        return turn;
    }

    public enum PlayerTypes {
        PlayerA,
        PlayerB
    }

    public enum PitSize {
        Three,
        Four
    }
}
