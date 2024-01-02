const http = require("http");
const fs=require("fs");
const path=require("path");

const port=3000;
const host="127.0.0.1";


// console.log("path-",__dirname)

http.createServer((req, res) => {

    try{
        if (req.url === "/") {
            res.writeHead(200,{"Content-type":"text/html"});
            const pageData=fs.readFileSync(path.join(__dirname,"pages","index.html"),"utf8");
            res.end(pageData);
        } 
        else if (req.url === "/about") {
            res.writeHead(200,{"Content-type":"text/html"});
            const pageData=fs.readFileSync(path.join(__dirname,"pages","about.html"),"utf8");
            res.end(pageData);
        } 
        else if (req.url === "/contact") {
            res.writeHead(200,{"Content-type":"text/html"});
            const pageData=fs.readFileSync(path.join(__dirname,"pages","contact.html"),"utf8");
            res.end(pageData);
        } 
        else {
            res.writeHead(404,{"Content-type":"text/html"});
            const pageData=fs.readFileSync(path.join(__dirname,"pages","404.html"),"utf8");
            res.end(pageData);
        }
    }
    catch(err){
        console.log(err);
    }
    
}).listen(port,host,()=>{
    console.log(`server started on http://${host}:${port}`)
})