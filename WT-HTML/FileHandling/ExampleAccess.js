const { constants } = require("buffer");
const f=require("fs") ;

const data="This is data for access function file...";

f.access("accessFile.txt",f.constants.F_ok,(err)=>{
    if(!err){
        f.writeFile("accessFile.txt",data,(err)=>{
            if(!err){
                console.log("File write Successfully...");
            }
            else{
                console.log(err);
                return
            }
        });
    }
    else{
        console.log(err);
    }
});