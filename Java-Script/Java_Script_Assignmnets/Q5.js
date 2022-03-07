var i = 0;
var currentYear = 2022; 

function leapYears() {
    while (i < 20) { 
        if ((currentYear % 4 === 0) && (!currentYear % 100===0) && (!currentYear % 400== 0))
         {
            document.write(currentYear + "<br>");
            console.log(currentYear + "<br>");
            i++;
            currentYear++;
        } 
        else {
            currentYear++;
        }
    }       
}

leapYears();