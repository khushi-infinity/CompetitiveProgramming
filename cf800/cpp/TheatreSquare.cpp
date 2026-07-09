// A. Theatre Square

#include<iostream>
using namespace std;


int main(){

    long long n,m,a;
    cin>>n>>m>>a;

    long long num1 = n/a;
    if(n%a != 0){
        num1++;
    }

    long long num2 = m/a;
    if(m%a != 0){
        num2++;
    }

    cout<<num1*num2<<endl;

}

/* Approach -2 :
there is other approach, instead of this we can use the ceil() function but again we need  to consider the floating point precision issue 
*/

/*
Approach -3 :
We can also use the formula (n+a-1)/a to calculate the number of tiles
this just works like the ceil() function but without any floating point precision issue
*/