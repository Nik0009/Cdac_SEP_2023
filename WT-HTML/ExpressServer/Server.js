const express=require("express");

const aboutRoute=require("./aboutRoute")
const homeRoute=require("./homeRoute")
const contactRoute=require("./contactRoute")

const app= express();


// middleware :- firstly middleware hit the request then other request hit
const middleware1=(req,res,next)=>{
    console.log("middleware 1")
    next()
}

const middleware2=(req,res,next)=>{
    console.log("middleware 2")
    next()
}



//app.use("/about",middleware1)

app.use("/about",aboutRoute)
app.use("/home",homeRoute)
app.use("/contact",contactRoute)

app.use(middleware1)
app.use(middleware2)


app.get("/",(req,res)=>{            // root link
    console.log("root")
    res.send("<h1>This is a express root response....!!!!</h1>");
})

// app.get("/home",(req,res)=>{
//     res.send("<h1>home</h1>");
// })

// app.get("/about",(req,res)=>{
//     res.send("<h1>about</h1>");
// })

// app.get("/contact",(req,res)=>{
//     res.send("<h1>about</h1>");
// })


const port=3000;
const host="127.0.0.1";

app.listen(port,host,()=>{
    console.log(`server started on http://${host}:${port} `);
})