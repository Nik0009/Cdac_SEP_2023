
const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const port = 3000;


app.use(bodyParser.urlencoded({ extended: true }));


const hardcodedCredentials = {
    email: 'user@example.com',
    password: 'password123',
};

app.get('/', (req, res) => {
    res.sendFile(__dirname + '/login.html');
});


app.post('/login', (req, res) => {
    const { email, password } = req.body;

    
    if (email === hardcodedCredentials.email && password === hardcodedCredentials.password) {
        res.sendFile(__dirname + '/welcome.html');
    } else {
        res.redirect('/');
    }
});


app.listen(port, () => {
    console.log(`Server is running at http://localhost:${port}`);
});
