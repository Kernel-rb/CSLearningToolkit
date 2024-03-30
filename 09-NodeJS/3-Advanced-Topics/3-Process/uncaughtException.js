// process.on('uncaughtException', (err, origin) => {
//   console.error('This caused a problem:', origin);
//   console.error(err.stack);
// });

setTimeout(() => {
    console.log('This will also work');
  }, 1000);
  
  console.log('This will work');
  
  thisDoesNotExist();
  
  console.log('This will not work');