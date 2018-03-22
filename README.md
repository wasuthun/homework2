# homework2
Wasuthun Wanaphongthipakorn (5910545841)
4.1
int fibonacci(int n)
{
    if (n <= 1)
        return n;
    else
        return Fibonacci(n - 1) + Fibonacci(n - 2);
}
from this code i will calculate a big oh
we assume that
T(n<=1) = O(1)
T(n) = T(n-1) + T(n-2) + O(1)
if you can draw the recursion tree, which will have depth n and intuitively figure out that this function is asymptotically O(2n). You can then prove your conjecture by induction.
And you will get 
T(n-1) = O(2^(n-1)), therefore

T(n) = T(n-1) + T(n-2) + O(1) which is equal to

T(n) = O(2^(n-1)) + O(2^(n-2)) + O(1) = O(2^n)
Conclude from this calculation big oh of this reucursion is 2^n
that why fibonacci(45) and fibonacci(50) and large value of parameter is so slow.
