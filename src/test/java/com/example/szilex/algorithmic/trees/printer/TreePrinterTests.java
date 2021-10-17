package com.example.szilex.algorithmic.trees.printer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreePrinterTests {

    @Test
    void testGetTreeNodesByLevelsSingleNodeWithNoChildren() {
        assertEquals(List.of(5), new TreePrinter(new Node(5, null, null)).getTreeNodesByLevels());
    }

    @Test
    void testGetTreeNodesByLevelsSingleNodeWithLeftChild() {
        assertEquals(List.of(7, 9), new TreePrinter(new Node(7, new Node(9, null, null), null)).getTreeNodesByLevels());
    }

    @Test
    void testGetTreeNodesByLevelsSingleNodeWithRightChild() {
        assertEquals(List.of(4, 2), new TreePrinter(new Node(4, null, new Node(2, null, null))).getTreeNodesByLevels());
    }

    @Test
    void testGetTreeNodesByLevelsSingleNodeWithTwoChildren() {
        assertEquals(List.of(1, 2, 3), new TreePrinter(new Node(1, new Node(2, null, null), new Node(3, null, null))).getTreeNodesByLevels());
    }

    @Test
    void testGetTreeNodesByLevelsTreeWithThreeLevels() {
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7), new TreePrinter(new Node(1, new Node(2, new Node(4, null, null), new Node(5, null, null)), new Node(3, new Node(6, null, null), new Node(7, null, null)))).getTreeNodesByLevels());
    }

    @Test
    void testGetTreeNodesByLevelsTreeWithFourLevels() {
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7 ,8 , 9, 10, 11, 12, 13, 14, 15), new TreePrinter(new Node(1, new Node(2, new Node(4, new Node(8, null, null), new Node(9, null, null)), new Node(5, new Node(10, null, null), new Node(11, null, null))), new Node(3, new Node(6, new Node(12, null, null), new Node(13, null, null)), new Node(7, new Node(14, null, null), new Node(15, null, null))))).getTreeNodesByLevels());
    }

    @Test
    void testGetTreeNodesByLevelsUnbalancedTreeOnlyLeftChildren() {
        assertEquals(List.of(1, 2, 3, 4), new TreePrinter(new Node(1, new Node(2, new Node(3, new Node(4, null, null), null), null), null)).getTreeNodesByLevels());
    }

    @Test
    void testGetTreeNodesByLevelsUnbalancedTreeOnlyRightChildren() {
        assertEquals(List.of(1, 2, 3, 4), new TreePrinter(new Node(1,null, new Node(2, null, new Node(3, null, new Node(4, null, null))))).getTreeNodesByLevels());
    }
}
