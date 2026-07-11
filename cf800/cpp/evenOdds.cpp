// A. Even Odds

#include<iostream>
using namespace std;


int main() {
	// your code goes here
   long long n,k;
    cin>>n>>k;

   long long ans[n];

   for(int i=1,j=0;i<=n;i++){
    if(i%2 !=0){
        ans[j] = i;
        j++;
        
    }

   }

   int odd = (n+1)/2;

   for(int i=2;i<=n;i++){
    if(i%2 ==0){
        ans[odd + (i/2)-1] = i;
       
    }
   }
   
  
    cout<<ans[k-1]<<endl;
}
