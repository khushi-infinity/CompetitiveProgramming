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