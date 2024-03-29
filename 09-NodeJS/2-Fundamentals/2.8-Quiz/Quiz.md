# Questions 1  
- Which of the following does not need to be imported ?
    - [ ] a. fs
    - [ ] b. Buffer
    - [ ] c. events
    - [ ] d. readLine

**Answer:** b. Buffer

# Questions 2
- Whats does **process.argv[1]** return ?
    -[ ] a. Path of Node.js executable
    -[ ] b. The first argument from stdin 
    -[ ] c. Path of the file being run 
    -[ ] d. The second argument from stdin

**Answer:** c. Path of the file being run

# Questions 3
- An errir occured and returned the following : 
    ```bash
    at someFunction (/usercode/index.js:12:7)
    ```
    What does the 12:7 represent ?
    - [ ] a. Line number and column number
    - [ ] b. Line number and character number
    - [ ] c. Column number and character number
    - [ ] d. Line number and index number

**Answer:** a. Line number and column number

# Questions 4
- What will be the output of the following ?
    ```Javascript
    const buffer4 = Buffer.from([255,257]);
    console.log(buffer4);
    ```
    - [ ] a. <Buffer 00 01>
    - [ ] b. <Buffer ff 01>
    - [ ] c. <Buffer ff 00>
    - [ ] d. <Buffer 00 02>

**Answer:** b. <Buffer ff 01> cuz 255 is the max value for a byte and 257 is 1 more than the max value  


# Questions 5
- Once the object emits a specific event , the listner func are called ...
    - [ ] a. Synchronously
    - [ ] b. Asynchronously
    - [ ] c. In a random order
    - [ ] d. In a specific order

**Answer:** a. Synchronously cuz the event loop is synchronous