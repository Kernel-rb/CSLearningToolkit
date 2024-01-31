function myfunc(param1,param2 = "default value"){
    console.log(param1);
    console.log(param2);
}
myfunc(1);
myfunc(1, 2);


function add(a,b=1){
    return a+b;
}

console.log(add(1));
console.log(add(1, 2));