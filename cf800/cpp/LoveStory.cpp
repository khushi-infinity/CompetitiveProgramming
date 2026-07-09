// A. Love story

#include<iostream>
#include<string>
using namespace std;

int main(){


    string codeforces = "codeforces";
    int t;
    cin>>t;
    
    while(t-->0){

    
    string s;
    cin >> s;

    int count = 0;
    for(int i=0;i<s.length();i++){
        if(s[i] != codeforces[i]){
            count++;
        }
    }

    cout << count << endl;
}
}