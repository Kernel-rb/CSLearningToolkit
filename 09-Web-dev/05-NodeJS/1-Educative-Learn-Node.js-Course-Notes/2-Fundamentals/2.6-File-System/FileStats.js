const fs = require('fs'); 

fs.stat('2.6-File-System/assets/kernel.txt', (err, stats) => {
    if (err) {
        console.log(err);
        return err;
    }
    console.log(stats);
});