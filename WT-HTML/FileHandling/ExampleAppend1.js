const fs=require("fs")

const data="append datta by appendfile()...!!!"

fs.appendFile("myfile.txt",data,"utf8",(err)=>{
    if(err){
        console.log(err);
        return
    }
    else
    {
        console.log("file save..")
    }
})

