package com.awei.test.practice;

import com.awei.test.domin.ListNode;

/**
 * @author Cw
 * @version 1.0.0
 * @Description 参考资料：https://www.cnblogs.com/easyidea/p/13371863.html
 * @createTime 2022年03月01日 23:26:00
 */
public class Practice001 {

    public static void main(String[] args) {
        //创建首节点
        ListNode nodeSta = new ListNode(0);
        //声明一个变量用来在移动过程中指向当前节点
        ListNode nextNode;
        //指向首节点
        nextNode = nodeSta;

        //创建链表
        for (int i = 1; i < 10; i++) {
            //生成新的节点
            ListNode node = new ListNode(i);
            //把新节点连起来
            nextNode.next = node;
            //当前节点往后移动
            nextNode = nextNode.next;
        } //当for循环完成之后 nextNode指向最后一个节点，

        //重新赋值让它指向首节点
        nextNode = nodeSta;

        ListNode listNode = reverseList(nextNode);
        System.out.println("listNode = " + listNode);
    }

    /**
     * @throws
     * @title reverseList
     * @description 单链表反转方式一（）；https://leetcode-cn.com/problems/reverse-linked-list/
     * @author Cw
     * @param: head
     * @updateTime 2022/3/2 0:02
     * @return: com.awei.test.domin.ListNode
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


}
