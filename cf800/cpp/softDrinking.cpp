// A. Soft Drinking

#include<iostream>
using namespace std;

int main() {
    int n, k, l, c, d, p, nl, np;
    cin >> n >> k >> l >> c >> d >> p >> nl >> np;

    int total_drink = (k * l) / nl; // Total number of drinks available
    int total_limes = c * d; // Total number of lime slices available
    int total_salt = p / np; // Total amount of salt available

    // The maximum number of toasts is limited by the minimum of the three resources
    int max_toasts = min(total_drink, min(total_limes, total_salt)) / n;

    cout << max_toasts << endl;

    return 0;
}