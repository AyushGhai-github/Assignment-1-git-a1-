var arr1 = Array(100).fill().map((_, index) => index + 1);
document.write(arr1+"<br>");
console.log(arr1);
document.write("Largest no among the 100 is:",Math.max(...arr1)+"<br>");
document.write("Smallest no among the 100 is:",Math.min(...arr1)+"<br>");
var count_odd =0;
var count_even = 0;
for(var i = 0; i < 101; i++)
{
    if(arr1[i] % 2 == 1)
    {
        count_odd++;
    }

else
    {
        count_even++;
    }
}
document.write("Odd count is:" + count_odd+"<br>");
document.write("Even count is:" + count_even+"<br>");

sum1=0;
for(i=0;i<arr1.length;i++)
{
    sum1=sum1+arr1[i];

}

//to calculate sum
document.write("sum is:"+sum1+"<br>");
//to calculate average
var average=sum1/arr1.length;
document.write("average is:"+average);
