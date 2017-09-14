package com.niuniu.work25;

public class AVLTree {

	Node root = null;

	public AVLTree() {

	}

	public boolean isEmpty() {
		return root == null;

	}

	public boolean add(int data) {

		Node t = root;

		if (t == null) {
			root = new Node(data);
			return true;
		}

		Node p = root;
		while (t != null) {
			p = t;
			if (data > p.data) {
				t = t.right;
			} else if(data < p.data){
				t = t.left;
			}else{
				return false;
			}
		}

		Node p2 = new Node(data);
		if (data > p.data) {
			p.right = p2;
		} else {
			p.left = p2;
		}
		return true;
	}

	public Node remove(Node p) {

		return remove(root,p);
	}

	public Node remove(Node root, Node p) {

		Node t = root;
		if(t == null || p == null){
			return null;
		}
		
		//定位
		while(t!=null){
			if(p.data < t.data){
				t = t.left;
			}else if(p.data > t.data){
				t = t.right;
			}else{
				break;
			}
		}
		
		//删除
		if(t == null){
			return null;
		}
		
		//t为要删除的节点
		if(t.right!=null && t.left != null){
			//找左边最大的值代替s
			Node tmp = t.left;
			Node tmp2 = tmp;
			while(tmp != null){
				tmp2 = tmp;
				tmp = tmp.right; 
			}
			
			t = tmp2;
			tmp = null;
		}else{
			//左或右子树为空
			Node tmp = t;
			t = (t.left == null)? t.right: t.left;
			tmp = null;
		}
		return t;
	}

	/**
	 * 修复
	 * 
	 * @param p
	 */
	public void fix(Node p) {

	}

	/**
	 * 右右型（左旋）
	 * 
	 *       P               R
	 *      / \             /  \
	 *     L   R    ==>    P    RR
	 *        / \         / \    \
	 *       RL RR       L   RL   RRR
	 *           \
	 *           RRR
	 * 
	 * @param p
	 */
	public Node leftRotate(Node p) {

		Node R = p.right;
		Node RL = R.left;
		
		p.right = RL;
		R.left = p;
		
		return R;
	}

	/**
	 * 左左型（右旋）
	 * 
	 *       P                   L
	 *      / \                 / \ 
	 *     L  R      ==>       LL  p 
	 *    / \                  /  / \
	 *   LL LR               LLL LR RR
	 *  / 
	 * LLL
	 * 
	 * @param p
	 */
	public Node rightRotate(Node p) {

			Node L = p.left;
			Node LR = L.right;
			p.left = LR;

			root = L;
			L.right = p;
			
			return L;

	}
	
	/**
	 * 左右型(先左旋后右旋)
	 *         P                 P                      LR
	 *        / \       左旋          / \     右旋                        /   \
	 *       L   R      ==>    LR  R     ==>          L      P
	 *      / \                / \                   / \    / \
	 *     LL  LR             L  LRR                LL LRL LRR R
	 *         / \           / \             
	 *        LRL LRR       LL  LRL
	 * 
	 * @param p
	 * @return
	 */
	public Node left_R_Rotate(Node p){
		
		p.left = leftRotate(p.left);
		
		Node LR = rightRotate(p);
		
		return LR;
	}
	
	/**
	 * 右左型（先右旋再左旋）
	 * 
	 *              P                P                   RL
	 *             / \              / \                /    \
	 *            L   R   ==>      L   RL    ==>      P      R
	 *               / \               / \           / \    / \
	 *              RL  RR            PLL R         L  RLL RLR RR
	 *             / \                   /  \
	 *           RLL  RLR               RLR  RR 
	 * @param p
	 * @return
	 */
	public Node Right_L_Rotate(Node p){
		
		p.right = rightRotate(p.right);
		
		Node RL  = leftRotate(p) ;
		
		return RL;
	}

	/**
	 * 中序输出
	 * 
	 * @param p
	 */
	public void inOrder(Node p) {

		if (p != null) {
			inOrder(p.left);
			print(p);
			inOrder(p.right);
		}
	}
	
	/**
	 * 后序输出
	 */
	public void postOrder(Node p){
		if (p != null) {
			postOrder(p.left);
			postOrder(p.right);
			print(p);
		}
	}

	/**
	 * 输出
	 * 
	 * @param p
	 */
	public void print(Node p) {

		System.out.print(p.data +"-");
	}
}
