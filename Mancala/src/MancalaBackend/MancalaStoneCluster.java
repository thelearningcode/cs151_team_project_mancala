package MancalaBackend;

import java.util.PriorityQueue;

/***
 * MancalaStoneCluster represents a cluster of MancalaStones
 */
public class MancalaStoneCluster {
    private PriorityQueue<MancalaStone> stones = new PriorityQueue<>();

    /***
     * Creates a new MancalaStoneCluster
     * @param stoneCount the numer of new stones to put in the cluster
     */
    public MancalaStoneCluster(int stoneCount) {
        for(int i = 0; i < stoneCount; i++) {
            stones.add(new MancalaStone());
        }
    }

    /***
     * removes one MancalaStone from the cluster
     * @return the removed MancalaStone
     */
    public MancalaStone releaseStone() {
        return stones.poll();
    }

    /***
     * adds a MancalaStone to the cluster
     * @param stone stone to add to the cluster
     */
    public void addStone(MancalaStone stone) {
        stones.add(stone);
    }

    /***
     * gets the number of stones in the cluster
     * @return the number of stones in the cluster
     */
    public int getStoneCount() {
        return stones.size();
    }
}
