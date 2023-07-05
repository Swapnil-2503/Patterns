#include <iostream>
using namespace std;

int main()
{
	int row = 5;
    int i = 0, j = 0, k = 0;
    
	while (i < row) {
		while (k <= row - i - 2) {
			cout << " ";
			k++;
		}
		k = 0;

		while (j <= i) {
			cout << "* ";
			j++;
		}
		j = 0;
		i++;
		cout << endl;
	}
	
	return 0;
}
