const { createServer } = require("http");
const data = require("./data.json");

createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/json" });
    if (req.url.toLocaleLowerCase() === "/python") {
        let python = data.filter((item) => item.language === "Python");
        res.end(JSON.stringify(python));
    } else if (req.url.toLocaleLowerCase() === "/javascript") {
        let javascript = data.filter((item) => item.language === "JavaScript");
        res.end(JSON.stringify(javascript));
    } else {
        res.end("Invalid request");
    }
    res.end(JSON.stringify(data));
}).listen(3000);