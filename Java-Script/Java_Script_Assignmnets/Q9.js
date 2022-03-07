var arr1 = ["a","b","c"];
var arr2 = [1,2,3];

let i= 0, first = 0, second = 0;
var newArr = [];
while(i < arr1.length + arr2.length){
   if(first > second){
      newArr[i] = arr2[second];
      second++;
   }else{
      newArr[i] = arr1[first];
      first++;
   }
   i++;
};

document.write(newArr);