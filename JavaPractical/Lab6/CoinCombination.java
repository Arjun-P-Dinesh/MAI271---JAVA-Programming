package JavaPractical.Lab6;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CoinCombination {
    private final int[] coins;
    private final int sum;
    private final AtomicInteger combinationCount = new AtomicInteger(0);

    public CoinCombination(int[] coins, int sum) {
        this.coins = coins;
        this.sum = sum;
}

