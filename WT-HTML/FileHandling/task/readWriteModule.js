const fs=require("fs");

const writeData=(data)=>{
    try{
        fs.appendFileSync("fetchedData.txt",data,"utf8")
    }
    catch(err){
        console.log(err)
    }
    
}


const readData=()=>{
    let data;
    try{
        data=fs.readFileSync("fetchedData.txt","utf8");
        console.log(data);
    }
    catch(err){
        console.log(err)
    }
    
}


module.exports={
    writeData,readData
}