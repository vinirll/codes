public solution(int N) {
    int rest;
    Stack mStack = new Stack();
    
    if ( N == 1 )
        mStack.push(1);
    else if ( N == 0 )
        mStack.push(0);
    
    while (N >= 2)
    {
        rest = N%2;
        N = (int) N/2;
        if (N <= 1)
        {
            mStack.push(rest);
            mStack.push(N);
        }
        else
            mStack.push(rest);
    }
    
    while (!mStack.empty())
        System.out.print(mStack.pop());
}