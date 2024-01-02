const fs=require("fs")

let data="no data";
try{
 data=fs.readFileSync("accessFile.txt","utf8")
  console.log(data);
}
catch(err){
    console.log(err)
}
// console.log(data);