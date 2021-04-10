package MancalaBackend;

import java.util.PriorityQueue;

public class MancalaStoneCluster {
    private PriorityQueue<MancalaStone> stones = new PriorityQueue<>();

    public MancalaStoneCluster() { /* do nothing */ }

    public MancalaStoneCluster(int stoneCount) {
        for(int i = 0; i < stoneCount; i++) {
            stones.add(new MancalaStone());
        }
    }

    public MancalaStone releaseStone() {
        return stones.poll();
    }

    public void addStone(MancalaStone stone) {
        stones.add(stone);
    }

    public int getStoneCount() {
        return stones.size();
    }
}
