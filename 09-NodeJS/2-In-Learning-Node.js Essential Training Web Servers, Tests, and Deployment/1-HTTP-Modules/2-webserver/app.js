const { createServer } = require("http");

const port = 3000;

createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/html" });
    console.log(req);
    res.end(`
    <!DOCTYPE html>
    <html>
        <body>
            <p> I'm Alive </p>
            <p> ${req.method} req made for ${req.url} </p>
        </body>
    </html>
    `);
}).listen(port)


console.log("web server listen in 3000")