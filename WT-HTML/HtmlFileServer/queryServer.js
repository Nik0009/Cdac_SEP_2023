const http=require("http");
const url =require("url");

const port=3000;
const host="127.0.0.1";

http.createServer((req,res)=>{
    let parseurl=url.parse(req.url);
    console.log(parseurl.query);

}).listen(port,host,()=>{
    console.log(`server started on http://${host}:${port}`)
})


// http.createServer((req,res)=>{
//     let parseUrl=url.parse(req.url);
//     console.log(parseUrl.query)
// }).listen(3000,"127.0.0.1")