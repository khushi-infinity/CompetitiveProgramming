// A. Array Colouring

#include<iostream>
using namespace std;

int main(){

    int t;
    cin>>t;

    while(t-->0){
        int n;
        cin>>n;

        int arr[n];
        bool res[n];
        for(int i=0;i<n;i++){
            cin>>arr[i];
            if(i%2==0){
                int temp = arr[i];
                res[temp-1] = true;
            
            }else{
                int temp = arr[i];
                res[temp-1] = false;
            }
        }

        for(int i=0;i<n-1;i++){
            if(res[i] == res[i+1]){
                cout<<"NO"<<endl;
                break;
            }
            if(i==n-2){
                cout<<"YES"<<endl;
            }
        }

    }
}