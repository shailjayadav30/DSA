let str='pop'
 
// console.log(str.search("is"))

// console.log(str.match(/is/g))
// let reverseorder=str.split('').reverse()
// console.log(reverseorder)



// let words =str.split(" ")
// let reversewords=words.map(word =>word.split("").reverse().join(''))

// console.log(reversewords.join(' '))
// console.log(words)


// let rev=str.split("").reverse().join("")
//     console.log(rev)

// if(str==rev){
//     console.log(true)
// }
// else{
//     console.log(false)
// }


// let arr1=[900,200,400]
// let arr2=[900,400,200]


// if(JSON.stringify(arr1) === JSON.stringify(arr2)){
//     console.log(true);  
// }

// else{
//     console.log(false)
// }





// const obj={names:"shailja",age:"20"}
// const a =JSON.stringify(obj)

// console.log(typeof(a));
 
//!infinite currying

// function add(a){
//     // for(let i=1;i<4;i++){
//     return function(b){
//         if(b) return add(a+b)
//             return a
//     }
  
// }
// console.log(add(2)(4)(3)(6)(8)())


// let arr=new Array(100)

// console.log(arr.length);
let a=7;


let promise=new Promise(function(resolve,reject){
if(a>10){
    console.log("a is greate then 10")
    resolve(onfullfill)
}
else{
    console.log("a is less then 10")
    reject(onreject)
}
})

let onfullfill=(result)=>{
    console.log(result)
} 
let onreject=(error)=>{
    console.log(error)
} 

promise.then(onfullfill)
promise.catch(onreject)

