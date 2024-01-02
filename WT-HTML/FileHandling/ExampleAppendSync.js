const fs=require("fs");

try{
    fs.appendFileSync("myfile.txt","append data....","utf8");
}
catch(err){
    console.log(err);
}
