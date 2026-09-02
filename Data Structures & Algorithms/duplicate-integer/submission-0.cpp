#include <vector>
#include <map>
using namespace std;

class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        map<int,int> sol;

        for (int i = 0; i < nums.size(); ++i) {
            if (sol.find(nums[i]) != sol.end()) {
                return true; // duplicate found
            }
            sol[nums[i]] = 1; // insert into map
        }

        return false; // no duplicates
    }
    
};