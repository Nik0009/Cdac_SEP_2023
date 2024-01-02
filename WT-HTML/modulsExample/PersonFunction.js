
const printPerson=(persons)=>{
   persons.forEach(p => {
    console.log(`${p.name} ${p.age} ${p.mobile}`)
   });
    
}


module.exports={
    printPerson
}

console.log(module)