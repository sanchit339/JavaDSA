#include<bits/stdc++.h>
using namespace std;

bool check_palindrome(string temp){
    int start = 0 , end = temp.size() - 1;
    while (start < end){
        if(temp[start] != temp[end]){
            return false;
        }
        start++ , end--;
    }
    // cout << "true" << endl;
    return true;
}

void solve(int idx , string s, string temp){
    if(idx == s.size()){
        if(check_palindrome(temp)){
            cout << temp << " ";
        }
        cout << endl;
        return;
    }

    temp.push_back(s[idx]);
    // cout << temp << " , ";
    solve(idx + 1 , s , temp);
    temp.pop_back();
    solve(idx + 1 , s , temp);
}

int main(){
    string s = "aab";
    solve(0 , s , "");
}