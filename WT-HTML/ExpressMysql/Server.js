const express = require("express");
const path = require("path")
const app = express();
const bodyparser = require("body-parser");
const mysql = require("mysql2");

app.use(bodyparser.urlencoded({ extended: true }))     // apply urlencode middleware to parse req body
// middlewares are special functions to process request/request header before hit links in express

app.get("/", (req, res) => {

    res.sendFile(path.join(__dirname, "register.html"));
})

app.get("/login", (req, res) => {
    res.sendFile(path.join(__dirname, "login.html"))
})

app.post("/saveRegister", (req, res) => {
    const formData = req.body

    const name = formData.name
    const age = formData.age
    const mobile = formData.mobile
    const email = formData.username
    const password = formData.password

    const con = mysql.createConnection({
        host: "localhost",
        user: "root",
        password: "Pass@123",
        database: "personDB",
    })

    con.connect((err) => {

        try {
            if (err) {
                console.log(err)
                throw err
            }

            const sql = `insert into person (name,age,mobile,email,password) values ('${name}','${age}','${mobile}','${email}','${password}')`

            con.query(sql, (err, result) => {
                if (err) {
                    console.log(err)
                    throw err
                }
                console.log("Register successful...")
            });

            con.commit();
        }
        catch (err) {
            console.log(err);
        }

    })

    //console.log(email, password)

    res.sendFile(path.join(__dirname, "login.html"))

})

app.post("/checkLogin", (req, res) => {

    const loginData = req.body

    const email = loginData.email
    const password = loginData.password

    res.send("<h1>login success..</h1>")

})

const port = 3000
const host = "127.0.0.1"

app.listen(port, host, () => {
    console.log(`servere running at htpp://${host}:${port}`)
})