const http = require("http");
const path=require("path");
const express=require("express");

const port=3000;
const host="127.0.0.1";


const up={
    u:"a@gmail.com",
    p:"123",
}

const app=express();

app.get("/",(req,res)=>{
    res.sendFile(path.join(__dirname,"welcome.html"));
})

