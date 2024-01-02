const express =require("express")

const contactRoute= express.Router()

contactRoute.get("/:id", (req,res)=>{            // "http://localhost:3000/about/"


    const val=req.params;
    console.log("val="+val.id)
    res.send("<h1>this is </h1>")

    res.send("<h1>about page bolte.... /about/root response </h1>");
})

contactRoute.get("/co", (req,res)=>{            // "http://localhost:3000/about/"
    res.send("<h1>about page bolte.... /about/root response </h1>");
})


module.exports=contactRoute