const { error } = require("console");
const fs=require("fs");

try{
    fs.writeFileSync("myfile.txt","new data for writeFileSync() ......","utf8");
}
catch(err){
    console.log(err);
}

console.log("rest of file...");