// const express=require("express")
// const bodyParser=require("body-parser")
// const cors=require("cors")
// const mysql=require("mysql2")

// const app=express()

// app.use(bodyParser.json())      // client req data convert from json to js object
// app.use(cors())                 // cross origin security implements

// app.get("/",(req,res)=>{
//     res.send("Server root link..")
// })

// const port = 4000
// const host= "127.0.0.1"

// app.post("/register",(req,res)=>{
//     const data=res.body

//     console.log(data);

//     const con=mysql.createConnection({
//         host:"localhost",
//         user:"root",
//         password:"Pass@123",
//         database:"nodedb"
//     })

//     const sql=""

//     con.connect((err)=>{
//         con.query(sql,(err,result=>{

//         }))
//     })

   

// })
// app.listen(port,host,()=>{
//     console.log(`node server started on http://${host}:${port}`)
// })

// // http://127.0.0.1:4000/register




const express=require("express")
const bodyParser=require("body-parser")
const cors=require("cors")
//const mysql=require("mysql")
const mysql=require("mysql2")

const app=express()

app.use(bodyParser.json())      // client req data convert from json to js object
app.use(cors())                 // cross origin security implements

app.get("/",(req,res)=>{
    res.send("Server root link..")
})

const port = 4000
const host= "127.0.0.1"

app.post("/Register",(req,res)=>{
    const data=req.body
    console.log(data)

    
    const con=mysql.createConnection({
        host:"localhost",
        user:"root",
        password:"Pass@123",
        database:"nodedb"
    })

    const sql=`insert into users(name,age,mobile,email,password)
                values ('${data.name}','${data.age}','${data.mobile}','${data.email}','${data.password}');`

    try{
        con.connect((err)=>{
            if(err){
                throw err;
            }
    
            con.query(sql,(err,result=>{
    
                if(err){
                    throw err;
                }
                else{
                    console.log("1 row inserted");
                    res.send("register success...");
                }
    
            }))
        })

    }catch(err){
        console.error(err);
    }
})



app.post("/login",(req,res)=>{
    const data=req.body
    console.log(data)

    
    const con=mysql.createConnection({
        host:"localhost",
        user:"root",
        password:"Pass@123",
        database:"nodedb"
    })

    con.connect((err)=>{
        try{
            if(err){
                throw err;
            }

            const sql=`select * from users where email='${data.email}' and password='${data.password}';`
            con.query(sql,(err,result,fields)=>{
                console.table(result)
                console.table(fields)

                if(result.length>0){
                    res.send("true")
                }else{
                    res.send("false")
                }
            })
        }catch(err){
            console.err(err)
        }
    });

});


app.get("/getusers",(req,res)=>{

    const con=mysql.createConnection({
        host:"localhost",
        user:"root",
        password:"Pass@123",
        database:"nodedb"
    })

    con.connect((err)=>{
        try{
            if(err){
                throw err
            }
            con.query("select * from users where 1",(err,result)=>{
                if(err){
                    throw err
                }

                res.json(result)
            })

        }catch(err){
            console.error(err);
        }
    })

})

app.post("/update",(req,res)=>{
    const data=req.body
    
    const con=mysql.createConnection({
        host:"localhost",
        user:"root",
        password:"Pass@123",
        database:"nodedb"
    })

    const sql=`update users set name='${data.name}' ,age='${data.age}',mobile='${data.mobile}',email='${data.email}' where id='${data.id}';`


    con.connect((err)=>{
        try{
            if(err) throw err

            con.query(sql,(err,result)=>{
                if(err) throw err

                // console.log(result)
                // res.send("update..")

               if(result.affectedRows){
                res.send("true")
               }
               else{
                res.send("false")
               }  
            })

        }catch(err){
            console.error(err)
        }
    })

})


app.post("/deleteuser",(req,res)=>{

    const id=req.body.id;

    const con=mysql.createConnection({
        host:"localhost",
        user:"root",
        password:"Pass@123",
        database:"nodedb"
    })

        try{
        //   if(err) throw err
            con.connect((err)=>{
                if(err) throw err;

                const sql =`delete from users where id='${id}'`;
    
                con.query(sql,(err,result)=>{
                    if(err) throw err;

                    if(result.affectedRows > 0){
                        res.send(true);
                    }
                    else{
                        res.send(false);
                    }
                });
    
            });
    
        }catch(err){
            console.error(err)
        }
    });
    




app.listen(port,host,()=>{
        console.log(`node server started on http://${host}:${port}`)
    })