const { createServer } = require("http");
const { createReadStream } = require("fs");
const path = require("path"); 

const sendFile = (res, status, type, file) => {
    res.writeHead(status, { "Content-Type": type });
    const filePath = path.join(__dirname, file); 
    createReadStream(filePath).pipe(res);
};

createServer((req, res) => {
    switch (req.url) {
        case "/":
            return sendFile(res, 200, "text/html", "index.html");
        case "/rust":
            return sendFile(res, 200, "image/png", "rust_oi.png"); 
        case "/styles.css":
            return sendFile(res, 200, "text/css", "styles.css");
        default:
            return sendFile(res, 404, "text/html", "404.html");
    }
}).listen(3000);

console.log("Server is running at 3000");
