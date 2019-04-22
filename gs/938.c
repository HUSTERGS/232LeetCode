/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
#include <queue>
class Solution {
public:
    queue<TreeNode *> Queue;
    int rangeSumBST(TreeNode* root, int L, int R) {
        int sum = 0;
        if (root){
            Queue.push(root);
            while(!Queue.empty()){
                TreeNode * localPtr = Queue.front();
                int localVal = localPtr->val;
                if (localVal >= L && localVal <= R){
                    sum += localVal;
                }
                if (localPtr->right){
                    Queue.push(localPtr->right);
                }
                if (localPtr->left){
                    Queue.push(localPtr->left);
                }
                Queue.pop();
            }
        }
        return sum;
    }
};