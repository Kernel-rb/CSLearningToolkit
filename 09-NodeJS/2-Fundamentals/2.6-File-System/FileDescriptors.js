const fs = require("fs");
var fileName = "2.6-File-System/assets/kernel.txt";

fs.stat(fileName, (err, stats) => {
    if (err) {
        console.error(err);
        return;
    }

    fs.open(fileName, "r", (err, fd) => {
        var buffer = Buffer.alloc(stats.size);

        fs.read(fd, buffer, 0, buffer.length, null, (err, bytesRead, buffer) => {
            var data = buffer.toString("utf8", 0, buffer.length);

            console.log(data);

            fs.close(fd, (err) => {
                if (err) {
                    console.error(err);
                    return;
                }
            });
        });
    });
});
