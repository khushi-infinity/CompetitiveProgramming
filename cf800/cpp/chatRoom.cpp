// A Chat Room

#include<iostream>
using namespace std;

int main(){
    string s;
    string hello = "hello";
    cin>>s;

    int i=0;
    int j=0;
    while(i<s.length() && j<hello.length()){

        if(s[i]== hello[j]){
            j++;
        }
        i++;
    }
    if(j==hello.length()){
        
        cout<<"YES"<<endl;
    }
    else{
        cout<<"NO"<<endl;
    }
}