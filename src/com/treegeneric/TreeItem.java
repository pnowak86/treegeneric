package com.treegeneric;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by marcin on 24.05.2017.
 */
public class TreeItem<ItemType> {
    private Set<TreeItem> children = new HashSet<>();
    private ItemType data;

    public TreeItem(ItemType data) {
        this.data = data;
    }

    public void addChild(TreeItem child) {
        this.children.add(child);
    }

    public Set<TreeItem> getChildren() {
        return this.children;
    }

    public ItemType getData() {
        return this.data;
    }
}
