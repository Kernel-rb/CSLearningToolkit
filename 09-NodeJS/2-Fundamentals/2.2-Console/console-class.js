const fs = require('fs');
// fs is a built-in module that provides file system-related functionality
// fr est un module intégré qui fournit des fonctionnalités liées au système de fichiers
const { console, Console } = require('console');
// console is a built-in module that provides a simple debugging console similar to the JavaScript console mechanism provided by web browsers
// console est un module intégré qui fournit une console de débogage simple similaire au mécanisme de console JavaScript fourni par les navigateurs Web

const output = fs.createWriteStream('./stdout.log');
const errorOutput = fs.createWriteStream('./stderr.log');

const logger = new Console({
    stdout: output,
    stderr: errorOutput
});
// The Console class is a utility class used to write to any Node.js stream

const number = 5;
logger.log("the number is: %d", number);
// Prints: the number is: 5
const code = 123;
logger.error("error: %d", code);
