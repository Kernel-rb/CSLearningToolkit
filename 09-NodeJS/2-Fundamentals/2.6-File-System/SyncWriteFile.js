const fs = require('fs');
try {
    const content = 'This is what will be written to the file';
    fs.writeFileSync('2.6-File-System/assets/kernel.txt', content);
} catch (err) {
    console.log(err);
    return err
}

console.log('File written successfully');

try {
    const data = fs.readFileSync('2.6-File-System/assets/kernel.txt', 'utf-8');
    console.log(`the data found  : \n${data}`);
} catch (err) {
    console.log(err)
    return err
}