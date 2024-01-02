const express =require("express")

const aboutRoute= express.Router()

aboutRoute.get("/", (req,res)=>{            // "http://localhost:3000/about/"


    const q=req.query;
    console.log(q.name)
    console.log(q.age)

    res.send("<h1>about page bolte.... /about/root response </h1>");
})

aboutRoute.get("/ab", (req,res)=>{            // "http://localhost:3000/about/"
    res.send("<h1>about page bolte.... /about/ab response</h1>");
})

aboutRoute.get("/ab1", (req,res)=>{            // "http://localhost:3000/about/"
    res.send("<h1>about page bolte.... /about/ab1 response </h1>");
})


module.exports=aboutRoute