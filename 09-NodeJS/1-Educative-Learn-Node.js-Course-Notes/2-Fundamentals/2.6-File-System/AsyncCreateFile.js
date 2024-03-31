const fs = require('fs');

const content = "this file is created by Node js";

fs.open('2.6-File-System/assets/CreatedByNodeJs.txt', 'w+', (err) => {
    if (err) {
        console.log(err);
        return err;
    }
    console.log('file created  by node js')
});

fs.writeFile('2.6-File-System/assets/CreatedByNodeJs.txt', content, (err) => {
    if (err) {
        console.log(err);
        return err;
    }
    console.log("file written by Node js");
});

fs.readFile('2.6-File-System/assets/CreatedByNodeJs.txt', 'utf-8', (err, data) => {
    if (err) {
        console.log(err);
        return err;
    }
    console.log(`the data found on the file : ${data}`)
});
