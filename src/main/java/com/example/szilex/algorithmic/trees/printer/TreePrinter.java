package com.example.szilex.algorithmic.trees.printer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreePrinter {
    public static List<Integer> getTreeNodesByLevels(Node node) {
        if (node == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        result.add(node.value);

        return result;
    }
}
