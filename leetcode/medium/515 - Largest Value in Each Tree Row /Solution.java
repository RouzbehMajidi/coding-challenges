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
    public List<Integer> largestValues(TreeNode root) {
        
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        ArrayList<Integer> outputList = new ArrayList<Integer>();
        
        if(root != null){
            queue.add(root);
        }
        getRowMax(queue, 0, outputList);
        
        return outputList;
    }
    
    private void getRowMax(ArrayDeque<TreeNode> queue, int level, ArrayList<Integer> outputList){
        
        if(queue.size() == 0){
            return;
        }
        
        ArrayDeque<TreeNode> nextLevel = new ArrayDeque<TreeNode>();
        
        int max = Integer.MIN_VALUE;
        
        for(TreeNode node: queue){
            if(node.left != null){
                nextLevel.add(node.left);
            }
            if(node.right != null){
                nextLevel.add(node.right);
            }
            if(node.val > max){
                max = node.val;
            }
        }
        
        outputList.add(max);
        getRowMax(nextLevel, level++, outputList);
        
    }
    
}