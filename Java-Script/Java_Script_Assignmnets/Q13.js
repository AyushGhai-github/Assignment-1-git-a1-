var arr=[5,7,11,90,56]
function for_loop()
{
    var sum1=0;
    for(var i=0;i<arr.length;i++)
    {
        sum1=sum1+arr[i];
    }
    document.write("sum of an array using for loop is:"+sum1+"<br>");
}
for_loop();
var arr=[5,7,11,90,56]
function while_loop()
{
    var sum1=0;
    var i=1;
    while(i<=arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5])
    {
        sum1=sum1+i;
        i++;
    }
    document.write("sum of an array using for loop is:"+sum1+"<br>");
}
while_loop();