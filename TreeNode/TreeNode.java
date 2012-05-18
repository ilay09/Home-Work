import java.util.*;

public class TreeNode<T> {

    public T data;
    public TreeNode left;
    public TreeNode right;

    TreeNode(T data, TreeNode left, TreeNode right) {     //конструктор
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void setData(T a) {     //методы
        data = a;
    }

    public T getData() {

        return data;
    }

    public void bypass(TreeNode<T> root) {   //обход
        Stack a = new Stack();        //создаем стека
        a.push(root);                          //добавляем
        TreeNode b = null;            //новый элемент b 
        while (!a.empty()) {             //пока а не ноль
            b = (TreeNode) a.pop();     //достаем из стека последний эл-т и присваиваем ему зн-е       
        }
        if (b.left != null) {
            a.push(b.left);
        }
        if (b.right != null) {
            a.push(b.right);
        }
    }
}