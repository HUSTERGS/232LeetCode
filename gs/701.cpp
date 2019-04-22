/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* insertIntoBST(TreeNode* root, int val) {
        TreeNode * temp = root;
        while(1){
            if (root->val > val){
                if (root->left){
                    root = root->left;
                }else{
                    root->left = new TreeNode(val);
                    break;
                }
            }else {
                if (root->right){
                    root = root->right;
                }else {
                    root->right = new TreeNode(val);
                    break;
                }
            }
        }
        return temp;
    }
};