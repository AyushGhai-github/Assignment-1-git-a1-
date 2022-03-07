
function Sum_Of_Numbers(num)
{   
    var sum1=0;
    
    for(var i=0;i<=num;i++)
    {
        sum1=sum1+i;
        console.log("Sum before returning a value is",sum1)
       
    }
    return sum1;
    
}
console.log(Sum_Of_Numbers(5));
document.write(Sum_Of_Numbers(5));