#include<iostream>
#include<math.h>
using namespace std;

int main() {
	int n,a,r,res,term;
  	cin>>n;
  	if(n % 2 == 1) {
    	a = 1, r = 2;
      	term = (n + 1)/2;
      	res = a * pow(2, (term - 1));
    }
  	else {
    	a = 1, r = 3;
      	term = n/2;
      	res = a * pow(3, (term - 1));
    }
  	cout<<res;
}