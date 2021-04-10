package MancalaBackend;

public class MancalaPit {

    private boolean isMancala;
    private MancalaStoneCluster stones;
    private MancalaBoard.PlayerTypes playerType;

    public MancalaPit(int stoneCount, MancalaBoard.PlayerTypes playerType, boolean isMancala) {
        this.isMancala = isMancala;
        this.stones = new MancalaStoneCluster(stoneCount);
        this.playerType = playerType;
    }

    public MancalaStoneCluster pullStones() {
        MancalaStoneCluster cluster = stones;
        stones = new MancalaStoneCluster(0);
        return cluster;
    }

    public boolean passStones(MancalaStoneCluster cluster) {
        MancalaStone stone = cluster.releaseStone();
        if (stone == null) return false;

        stones.addStone(stone);
        return true;
    }
}
