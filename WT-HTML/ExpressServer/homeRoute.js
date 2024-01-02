const express =require("express")

const homeRoute= express.Router()

homeRoute.get("/", (req,res)=>{            // "http://localhost:3000/about/"
    res.send("<h1>about page bolte.... /about/root response </h1>");
})

homeRoute.get("/home", (req,res)=>{            // "http://localhost:3000/about/"
    res.send("<h1>about page bolte.... /about/root response </h1>");
})


module.exports=homeRoute