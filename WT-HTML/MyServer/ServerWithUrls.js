const { createServer } = require("http");

const http = createServer((req, res) => {

    console.log("url:",req.url)

    if(req.url==="/"){
        res.end("this is root utl res...")
    }else if(req.url==="/about")
    {
        res.end("this is /about  utl res...")
    }else if(req.url==="/contact")
    {
        res.end("this is /contact  utl res...")
    }
}
)



http.listen(3000,"127.0.0.1",()=>{
    console.log(`Server started on http://127.0.0,1:3000`)
})