const express=require("express");
const path=require("path")
const app=express();
const bodyparser=require("body-parser");

app.get("/",(req,res)=>{

    res.sendFile(path.join(__dirname,"namepage.html"));
})

app.use(bodyparser.urlencoded({extended:true}))      // use() to middlewares.... 

app.get("/name",(req,res)=>{
    console.log(req)
    const data=req.body
    console.log("name:",data.petName);
    res.send("<h1>got the petname :"+data.petName+"</h1>");
})

app.post("/name",(req,res)=>{
    const q=req.query;
    console.log("name:",q.petName);
    res.send("<h1>got the petname :"+q.petName+"</h1>");
})

const port=3000
const host="127.0.0.1"

app.listen(port,host,()=>{
    console.log(`servere running at htpp://${host}:${port}`)
})