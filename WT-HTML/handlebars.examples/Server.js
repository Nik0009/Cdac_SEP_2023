const express = require("express")
const path=require("path")
const app = express()     // npm intsall expree
const exphbs = require("express-handlebars") // npm install express-hanlebars


/// common part for every hanlebar code
app.engine("hbs",
    exphbs.engine({
        defaultLayout: "main",
        extname: "hbs"
    })
)
app.set("view engine", "hbs")

const data={
    title:"Handlebars",
    contacts:[
        {name:"ramu",age:23,"mobile":"6746474433"},
        {name:"ramesh",age:56,"mobile":"7746474433"},
        {name:"suresh",age:36,"mobile":"846474433"}
]
}


app.get("/", (req, res) => {
    res.render("index")
})

app.get("/about", (req, res) => {

    res.render("about")
})

app.get("/about/:name", (req, res) => {
    const name=req.params.name
    res.render("about",{name})
})

app.get("/contact", (req, res) => {
    res.render("contact",data)
   // res.render("contact")
})


const port = 4000
const host = "127.0.0.1"

app.listen(port, host, () => {
    console.log(`node server started on http://${host}:${port}`)
})