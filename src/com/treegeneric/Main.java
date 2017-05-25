package com.treegeneric;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        TreeItem<NobleMan> mieszko = new TreeItem<>(new NobleMan("Mieszko I", 950));
        TreeItem<NobleMan> bolek = new TreeItem<>(new NobleMan("Bolesław Chrobry", 980));
        TreeItem<NobleMan> sygryda = new TreeItem<>(new NobleMan("Sygryda Storråda", 990));

        TreeItem<NobleMan> bezprym = new TreeItem<>(new NobleMan("bezprym", 1000));
        TreeItem<NobleMan> regelinda = new TreeItem<>(new NobleMan("Regelinda", 1023));
        TreeItem<NobleMan> mieszko2 = new TreeItem<>(new NobleMan("Mieszko II Lambert", 1044));

        TreeItem<NobleMan> kazik = new TreeItem<>(new NobleMan("Kazimierz Odnowiciel", 1055));
        TreeItem<NobleMan> gertruda = new TreeItem<>(new NobleMan("Gertruda", 1060));

        mieszko.addChild(bolek);
        mieszko.addChild(sygryda);

        bolek.addChild(mieszko2);
        bolek.addChild(regelinda);
        bolek.addChild(bezprym);

        bolek.addChild(kazik);
        bolek.addChild(gertruda);

        printTree(mieszko);
    }

    private static void printTree(TreeItem<NobleMan> item) {
        NobleMan nobleMan = item.getData();

        System.out.println(nobleMan.getName());

        Iterator iterator = item.getChildren().iterator();
        while(iterator.hasNext()) {
            printTree((TreeItem) iterator.next());
        }
    }
}
