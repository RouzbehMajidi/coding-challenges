/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode convertBST(TreeNode root) {
        
        ArrayList<TreeNode> sortedValues = new ArrayList<TreeNode>();
        
        
        if (root != null){
            inOrder(root,sortedValues);
        }
        
        for(int i = 0; i < sortedValues.size(); i ++ ){
            int sum = 0;
            
            for(int j = i; j < sortedValues.size(); j ++ ){
                sum += sortedValues.get(j).val;
            }
            
            sortedValues.get(i).val = sum;
        }
        
        
        return root;
    }
    
    private void inOrder(TreeNode root, ArrayList<TreeNode> sortedValues) {
        
        if(root.left != null) {
            inOrder(root.left, sortedValues);
        }
        
        sortedValues.add(root);
        
        if(root.right != null) {
            inOrder(root.right, sortedValues);
        }
        
        
    }
}