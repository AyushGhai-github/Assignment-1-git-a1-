arr=[90,70,100,57,40,89,67,76,60,70,66,55,44,11,12,6,8,79,69,72]
for(var i=0;i<arr.length;i++)
{
    document.write("Array elemnts are:"+arr[i]+"<br>")
}
for(var i=0;i<arr.length;i++)
{
    for(var j=i+1;j<arr.length;j++)
    {
        if(arr[i]>arr[j])
        {
            var temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
document.write("Sorted array is:"+arr[i]+"<br>");
for(i=0;i<arr.length;i++)
{
    document.write("<br>"+arr[i]);
}

