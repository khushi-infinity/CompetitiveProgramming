// A. Word

#include<iostream>
#include<string>
using namespace std;

int main(){
    string s;
    cin>>s;

    int lcount=0;
    int ucount=0;
    for(int i=0;i<s.length();i++){
       
        if(s[i].isupper()){
            ucount++;
        }else{
            lcount++;
        }

    }

    if(lcount>=ucount){
        for(int i=0;i<s.length();i++){
            s[i]=tolower(s[i]);
        }
    }else{
        for(int i=0;i<s.length();i++){
            s[i]=toupper(s[i]);
        }
    }
    cout<<s<<endl;
    return 0;
}
