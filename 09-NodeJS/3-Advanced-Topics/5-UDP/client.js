const dgram = require("dgram");
const readline = require("readline");

var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  prompt: "",
});

const client = dgram.createSocket("udp4");

message = Buffer.from("Hello from client");
client.send(message, 3500, "localhost", (err) => {
  console.log("Message sent to server");
});

client.on("message", (data) => {
  console.log("Msg from server:", data.toString());
});

client.on("end", () => {
  console.log("disconnected from server");
});

rl.prompt();
rl.on("line", function (line) {
  client.send(line, 3500, "localhost");
  rl.prompt();
});
