const fs = require('fs');

let content = 'This is what will be written to the file';

fs.writeFile('2.6-File-System/assets/kernel.txt', content, (err) => {
    if (err) {
        console.log(err);
        return err;
    }
    console.log('File written successfully');
});

fs.readFile('2.6-File-System/assets/kernel.txt', 'utf-8', (err, data) => {
    if (err) {
        console.log(err);
        return err;
    }
    console.log(`the data found  : \n${data}`);
});
