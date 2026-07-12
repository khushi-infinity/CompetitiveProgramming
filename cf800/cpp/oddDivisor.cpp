// A. Odd Divisor

#include<iostream>
using namespace std;

int main(){
    int t;
    cin>>t;

    while(t-->0){
        long long n;
        cin>>n;

        if(n%2==1){
            cout<<"YES"<<endl;
        }else{
            while(n%2==0){
                n/=2;
            }
            if(n==1){
                cout<<"NO"<<endl;
            }else{
                cout<<"YES"<<endl;
            }
        }
    }
}