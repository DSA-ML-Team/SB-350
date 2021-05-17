package de.unistuttgart.vis.dsass2021.ex03.p3;


public class BinarySearchTree<T extends Comparable<T>> implements IBinarySearchTree<T> {
	
	IBinaryTreeNode<T> head = new BinaryTreeNode<T>();
	    
	    public BinaryTreeNode<T> root;

		private BinaryTreeNode<T> nullNode;
	
		public BinarySearchTree() 
		{
			head = new BinaryTreeNode<T>();
			nullNode = new BinaryTreeNode<T>();
			nullNode.setLeftChild(nullNode);
			nullNode.setRightChild(nullNode);
			head.setRightChild(nullNode);
		}


		public void insert(T t) {
		
			BinaryTreeNode<T> newNode = new BinaryTreeNode<T>();
			
			if (root == null) {
		        root = newNode;
		        root.setLeftChild(null);
		        root.setRightChild(null);
		    } 
			else {
		    	IBinaryTreeNode<T> currentNode = root;
		    	IBinaryTreeNode<T> parentNode;
		    	
		    	while (true) {
		            parentNode = currentNode;
		            
		            if (newNode.getValue().compareTo(currentNode.getValue()) == 1) {
		                currentNode = currentNode.getRightChild();
		                
		                if (currentNode == null) {
		                    parentNode.setRightChild(newNode);
		                    return;
		                    
		                } else {
		                    currentNode = currentNode.getLeftChild();
		                    if (currentNode == null) {
		                        parentNode.setLeftChild(newNode);
		                        return;
		                    }
		                }
		           }
			   }
			}
		}
		

		
		public IBinaryTreeNode<T> getRootNode(){
			IBinaryTreeNode<T> root = head.getRightChild();
			return root;
		}
		
		
		
		
		int deep(IBinaryTreeNode<T> d33p){
		    if(d33p==null){
		        return 0;
		    }
		    int leftDepth = deep(d33p.getLeftChild());
		    int rightDepth = deep(d33p.getRightChild());
		    return rightDepth>leftDepth?rightDepth+1:leftDepth+1;
		}
		
	
		public boolean isFull() {
			
	    if(root==null){
		         return false;
		      }
		      if(root.getLeftChild()==null&&root.getRightChild()==null){
		          return true;
		      }
		     int leftDepth = deep(root.getLeftChild());
		     int rightDepth = deep(root.getRightChild());
		     if(leftDepth!=rightDepth){
		        return false;
		     }
		     IBinaryTreeNode<T> rgL = root.getLeftChild();
		     IBinaryTreeNode<T> rgR = root.getRightChild();
		     
		    if(((IBinarySearchTree<T>) rgR).isFull()&& ((IBinarySearchTree<T>) rgR).isFull()){
		       return true;
		    }else{
		       return false;
		    }
		     
		}

	}