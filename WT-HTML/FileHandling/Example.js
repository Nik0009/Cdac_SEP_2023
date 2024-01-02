const fileSystem=require("fs");

const data="hello this is a content";

fileSystem.writeFile("myfile.txt",data,"utf8",(err)=>{
    if(err){
        console.log(err);
        return
    }
    else
    {
        console.log("file write successfully....");
    }
});