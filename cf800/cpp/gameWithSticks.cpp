// A. Game With Stickes

#include<iostream>
using namespace std;

int main(){

    int n,m;
    cin>>n>>m;

    if(n<m && n%2==0 || n>m && m%2==0){
        cout<<"Malvika"<<endl;
    }
    else{
        cout<<"Akshat"<<endl;
    }
}