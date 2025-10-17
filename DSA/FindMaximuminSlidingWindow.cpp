// ## Problem Statement
// Find the maximum element in each sliding window of size k in an array.

// ## Task
// - Use deque for optimal solution
// - Time Complexity: O(n)
// - Handle edge cases

// ## Example
// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]


#include <iostream>
#include <vector>
#include <deque>
using namespace std;

// Function to find maximum in each sliding window
vector<int> maxSlidingWindow(vector<int>& nums, int k) {
    deque<int> dq; // Stores indices of useful elements
    vector<int> result;
    for (int i = 0; i < nums.size(); i++) {
        // Remove indices out of current window
        if (!dq.empty() && dq.front() == i - k)
            dq.pop_front();
        // Remove smaller elements from back
        while (!dq.empty() && nums[dq.back()] < nums[i])
            dq.pop_back();
        dq.push_back(i); // Add current index
        // Add max for current window to result
        if (i >= k - 1)
            result.push_back(nums[dq.front()]);
    }
    return result;
}

int main() {
    vector<int> nums = {1,3,-1,-3,5,3,6,7};
    int k = 3;
    vector<int> res = maxSlidingWindow(nums, k);
    for (int x : res)
        cout << x << " ";
    cout << endl;
    return 0;
}
