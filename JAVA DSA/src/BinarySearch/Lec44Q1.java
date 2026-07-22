//410. EKO (SPOJ)

//Given an array trees where each element represents the height of a tree,
// and an integer m which represents the required amount of wood you need to collect,
// your task is to determine the maximum possible height H at which you can set your sawblade so that when you cut the trees at this height,
// you obtain at least m units of wood.
//When you cut a tree at height H, the wood collected from a tree of height height is:
//max(0, height - H)
//If the tree's height is less than or equal to H, no wood is collected from that tree.
//Your goal is to maximize the height H while ensuring that the total amount of wood collected is at least m.

//Example
//Input:
//trees = [20, 15, 10, 17]
//m = 7
//Output:15
package BinarySearch;

public class Lec44Q1 {

    static boolean isValidAns(int trees[], int m, int maxHeight){
        long totalWoodCollected = 0;

        for(int i=0; i<trees.length; i++){
            if(trees[i] > maxHeight){
                //iska mtlb, sawBlade overall tree height se chhota hai
                //therefore, pakka kuch amonut of wookd dega katne pr
                long currentTreeWoodCollected = trees[i] - maxHeight;
                totalWoodCollected += currentTreeWoodCollected;

            }
        }
        if(totalWoodCollected >= m){
            return true;
        }
        else {
            return false;
        }
    }

    public int maxSawHeight(int[] trees, int m) {
        int n = trees.length;
        int s = 0;

        int maxi = -1;
        for (int i = 0; i < n; i++) {
            if (trees[i] > maxi) {
                maxi = trees[i];
            }
        }

        int ans = -1;
        int e = maxi;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidAns(trees, m,mid)) {
                //ans store
                ans = mid;
                //move to right
                s = mid + 1;
            }
            else{
                //move to left
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] trees = {20, 15, 10, 17};
        int m = 10;

        Lec44Q1 obj = new Lec44Q1();

        int ans = obj.maxSawHeight(trees, m);

        System.out.println("Maximum Saw Height = " + ans);
    }

}
