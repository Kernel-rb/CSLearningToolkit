const fs = require('fs');
console.log('Reading file...');

try {
    const data = fs.readFileSync('2.6-File-System/assets/kernel.txt', 'utf-8');
    console.log(`the data found  : \n${data}`);
} catch (err) {
    console.log(err);
    return err;
}
