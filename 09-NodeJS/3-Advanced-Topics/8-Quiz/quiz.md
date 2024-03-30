# Quiz 

## Question 1
- What will be the output of the following code snippet?

    ```javascript
    process.on('beforeExit', () => {
    console.log('blue');
    });

    process.on('exit', () => {
    console.log('green');
    });

    console.log('red')
    process.exit();
    ```
    - A. red blue 
    - B. red green
    - C. red blue green

**Answer:** B. red green

## Question 2
- Which stream is used by console.info?

    - A. stdout
    - B. stderr
    - C. stdin  

**Answer:** A. stdout

## Question 3

- Which event is fired on a net.Socket object when data arrives?
    
        - A. data
        - B. read
        - C. write
    
**Answer:** A. data

## Question 4

-  When is the listening event fired on a dgram.Socket?

    - A . after the connect() method
    - B . after the bind() method
    - C . after the listen() method

**Answer:** B. after the bind() method

## Question 5

- The .listen() method in the http module is identical to server.listen() used in the net module.

    - A. True
    - B. False

**Answer:** A. True 