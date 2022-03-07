function Sum_Of_Numbers(num)
{   
    var sum1=0;
    
    for(var i=0;i<=num;i++)
    {
        if(i%3==0 || i%5==0)
        {
            sum1=sum1+i;
            console.log("Sum of numbers before returning is",i);

        }
    }
    return sum1;
}
console.log(Sum_Of_Numbers(17));
document.write(Sum_Of_Numbers(17));