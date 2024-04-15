require('dotenv').config();

let express = require('express');
let app = express();

app.use((req , res, next) => {
    console.log(req.method ,req.path ,"-" + req.ip);
    next();
});

app.use(express.static(__dirname + '/views'));
app.use('/public', express.static(__dirname + '/public/style.css'));


app.get('/json', (req, res) => {
    let response;
    if (process.env.MESSAGE_STYLE === "uppercase") {
        response = "HELLO JSON";
    } else {
        response = "Hello json";
    }
    res.json({ message: response });
});




module.exports = app;
