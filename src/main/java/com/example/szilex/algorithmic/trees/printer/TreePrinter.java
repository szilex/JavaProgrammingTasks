package com.example.szilex.algorithmic.trees.printer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreePrinter {
    
    private final Node treeRoot;

    public TreePrinter(Node treeRoot) {
        this.treeRoot = treeRoot;
    }

    public List<Integer> getTreeNodesByLevels() {
        if (treeRoot == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        result.add(treeRoot.getValue());
        
        List<Node> childrenNodes = getChildrenNodes(treeRoot);
        while (!childrenNodes.isEmpty()) {
            List<Node> grandchildrenNodes = new ArrayList<>();
            for (Node child: childrenNodes) {
                result.add(child.getValue());
                grandchildrenNodes.addAll(getChildrenNodes(child));
            }
            childrenNodes = grandchildrenNodes;
        }

        return result;
    }

    private List<Node> getChildrenNodes(Node node) {
        if (node == null) {
            return Collections.emptyList();
        }

        List<Node> result = new ArrayList<>();
        if (node.getLeftChild() != null) {
            result.add(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            result.add(node.getRightChild());
        }

        return result;
    }
}
