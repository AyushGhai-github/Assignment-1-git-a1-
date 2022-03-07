function coinFlip() {
    return(Math.random() < 0.3) ? 'Heads' : 'Tails'; 
}

var howManyTimes = prompt("Enter a head ratio: "); 

//takes number of flips as parameter
var countHeads=0; 
for (var i=0; i<howManyTimes;i++){
if (coinFlip()==='Heads'){
 countHeads++;
}
}

alert("Heads appear "+(countHeads/howManyTimes)+"in fraction");