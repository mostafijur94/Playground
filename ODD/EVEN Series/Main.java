#include <iostream>
using namespace std;

int main() 
{
   	int n,a,d,term,res;
  	cin>>n;
  	if(n%2==1) {
    	a = 0;
      	d = 2;
      	term = (n+1)/2;
      	res = a + (term - 1)*d;
    }
  	else {
    	a = 0;
      	d = 1;
      	term = n/2;
      	res = a + (term - 1)*d;
    }
  cout<<res;
    return 0;
}