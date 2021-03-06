package com.algorithm.tree;

/**
 * Created by GD on 2019/4/11.
 */

/**
 *1．先（根）序遍历的递归算法定义：
 * 若二叉树非空，则依次执行如下操作：
 * ⑴ 访问根结点；
 * ⑵ 遍历左子树；
 * ⑶ 遍历右子树。
 * 2．中（根）序遍历的递归算法定义：
 * 若二叉树非空，则依次执行如下操作：
 * ⑴遍历左子树；
 * ⑵访问根结点；
 * ⑶遍历右子树。
 * 3．后（根）序遍历得递归算法定义：
 * 若二叉树非空，则依次执行如下操作：
 * ⑴遍历左子树；
 * ⑵遍历右子树；
 * ⑶访问根结点。
 * @Description TODO
 * @Author GD
 * @Date 2019/4/11 22:55
 * @Version 1.0V
 */

public interface Tree {

    void addNode(Tree t);
}
