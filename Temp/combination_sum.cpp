#include<bits/stdc++.h>
using namespace std;

void rec_function(int idx , vector<int> &nums , int total , vector<pair<int , int>> temp , vector<vector<pair<int , int>>> &ans){
    if(total == 0){
        ans.push_back(temp);
        return;
    }

    for(int i = idx ; i < nums.size() ; i++){
        if(i > idx && nums[i] == nums[i - 1]) continue;

        if(nums[i] > total) break;

        temp.push_back({nums[i] , idx});
        
        for(auto it : temp) cout << it.first << " " << it.second << " - ";
        cout << endl;

        rec_function(i + 1 , nums , total - nums[i] , temp , ans);
        temp.pop_back();
    }
}

int main(){
    vector<int> v = {1 , 1 , 2 , 5 , 6 , 7 , 10};
    vector<vector<pair<int , int>>> ans;

    vector<pair<int , int>> temp;
    int total = 8;

    rec_function(0 , v , total , temp , ans);

    cout << endl;
    cout << endl;
    cout << endl;

    for(auto vec : ans){
        for(auto it : vec){
            cout << it.first << " ";
        }
        cout << endl;
    }
}