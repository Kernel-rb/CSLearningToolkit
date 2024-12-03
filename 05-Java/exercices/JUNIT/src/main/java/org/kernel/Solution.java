package org.kernel;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] n, int k) {
        Hashtable<Integer, Integer> dict = new Hashtable<Integer, Integer>();
        for (int i : n) {
            dict.put(i, dict.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(dict.entrySet());
        sortedEntries.sort((a, b) -> b.getValue() - a.getValue());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sortedEntries.get(i).getKey();
        }

        return result;
    }
}
