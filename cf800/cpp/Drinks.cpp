// B. Drinks

#include<iostream>
#include<iomanip>
using namespace std;

int main(){

	// your code goes here
   int n;
    cin>>n;

    int sum=0;
    for(int i=0;i<n;i++){
        int p;
        cin>>p;
        sum+=p;
    }

   double ans = sum/(double)n;
   cout<<fixed<<setprecision(12)<<ans<<endl;


}