package com.wenli.dataStructList;

public class SingleLinkedList {
    // 头结点不存放数据
    private HeroNode head = new HeroNode(0,"","");
    //添加方法 -- 没有循序的添加
    public void add(HeroNode heroNode){
        // 构建一个辅助变量遍历temp
        HeroNode temp = head;

        // 需要遍历整个链表找到最后一个，当temp.next == null时候就是最后一个
        while(true){
            if(temp.next == null){// 是最后一个元素了
                break;// 跳出循环
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    // 添加一个元素，按照顺序来添加，如果已经存在那个顺序，则提示已存在不可添加
    public void addByOrder(HeroNode heroNode){
        HeroNode temp = head;
        while(true){
            // 判断是否为空，为空的话则直接加进去
            if(temp.next == null){
                temp.next = heroNode;
                break;
            }
            // 判断是否大于小于等于
            if(temp.next.no == heroNode.no){// 已存在
                System.out.println(heroNode.no+"牌号已经存在。。。");
                break;
            }
            if(temp.next.no > heroNode.no){// 大于了，应该向前退一位
                heroNode.next = temp.next;// temp的下一个节点加到heroNode的下一个
                temp.next = heroNode;// 将heroNode加到temp的下一个
                break;
            }
            // temp向后移动一位
            temp = temp.next;
        }
    }

    // 根据编号来修改
    public void update(HeroNode heroNode){
        HeroNode temp = head;
        while(true){
            if(temp.next == null){
                heroNode.next = temp.next;
                temp.next = heroNode;
                System.out.println("该节点不存在，已添加");
                break;
            }
            if(temp.next.no == heroNode.no){
                temp.next.name = heroNode.name;
                temp.next.nickname = heroNode.nickname;
                System.out.println("已修改。。。");
                break;
            }
            temp = temp.next;
        }
    }

    //删除一个节点
    public void delete(int no){
        HeroNode temp = head;
        if(temp.next == null){
            System.out.println("链表为空。。");
        }
        while(true){
            if(temp.next.no == no){
                temp.next = temp.next.next;
                System.out.println("删除成功。。");
                break;
            }
            temp = temp.next;
        }
    }


    //遍历显示所有的元素
    public void showLinked(){
        // 判断是否为空
        if(head.next == null){
            System.out.println("链表为空。。");
            return;// 为空直接结束
        }
        HeroNode temp = head.next;
        while(true){
            if(temp == null){// 为空，为最后一位
                break;
            }
            System.out.println(temp);// 打印节点
            temp = temp.next;// 向后移一位
        }
    }
}
