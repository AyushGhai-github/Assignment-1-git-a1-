"use strict";
const number = 40;
try {
    number = 99;
}
catch (err) {
    console.log(err);
}
console.log(number);
// expected output: 42
//Assigning Object
const obj = {
    name: "ayush"
};
console.log(obj.name); //op will be ayush
obj.name = "Atharv";
console.log(obj.name); //op will be atharv
//Note with the help of consatnt we can assign a new value but not a new obj with sam name
//Trying to creating obj with same name
// const obj={//it will produce an error Identifier 'obj' has al}
//     name:"gopu"
// };
