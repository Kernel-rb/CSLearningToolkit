const fs =  require('fs');
fs.readFile('2.6-File-System/assets/kernel.txt' , 'utf-8' , (err , data) => {
    if(err){
        console.log(err);
        return err
    }
    console.log(`the data found  : \n${data}`);
});

console.log('Reading file...');