package com.wenli.dataStructList;

public class TestLinkedList {
    public static void main(String[] args) {
        HeroNode heroNode1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode heroNode2 = new HeroNode(2, "林冲", "豹子头");
        HeroNode heroNode3 = new HeroNode(3, "吴用", "智多星");
        HeroNode heroNode4 = new HeroNode(4, "李逵", "黑旋风");

        // 创建一个单链表
        SingleLinkedList single = new SingleLinkedList();
        single.addByOrder(heroNode1);
        single.addByOrder(heroNode4);
        single.addByOrder(heroNode2);
        single.addByOrder(heroNode3);
        HeroNode heroNode5 = new HeroNode(5, "李逵55", "黑旋风55");
        single.update(heroNode5);
        single.showLinked();

        System.out.println("删除之后");
        single.delete(4);
        single.delete(5);
        single.showLinked();
        System.out.println("添加之后");
        single.addByOrder(heroNode4);
        single.delete(5);
        single.showLinked();
    }
}
