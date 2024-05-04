// index.js
// where your node app starts

// init project
var express = require('express');
var app = express();

// enable CORS (https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)
// so that your API is remotely testable by FCC 
var cors = require('cors');
app.use(cors({ optionsSuccessStatus: 200 }));  // some legacy browsers choke on 204

// http://expressjs.com/en/starter/static-files.html
app.use(express.static('public'));

// http://expressjs.com/en/starter/basic-routing.html
app.get("/", function (req, res) {
  res.sendFile(__dirname + '/views/index.html');
});


// your first API endpoint... 
app.get("/api/hello", function (req, res) {
  res.json({ greeting: 'hello API' });
});

app.get('/api/:date?', (req, res) => {
  const { date } = req.params;

  // Check if date is provided
  if (!date) {
    // If date is not provided, return current time
    const currentTimeUnix = new Date().getTime();
    const currentTimeUtc = new Date().toUTCString();
    return res.json({ unix: currentTimeUnix, utc: currentTimeUtc });
  }

  // Attempt to parse the provided date
  const parsedDate = new Date(date);

  // Check if the parsed date is valid
  if (!isNaN(parsedDate.getTime())) {
    // If date is valid, return Unix timestamp and UTC string
    const unixTimestamp = parsedDate.getTime();
    const utcString = parsedDate.toUTCString();
    return res.json({ unix: unixTimestamp, utc: utcString });
  } else {
    // If date is invalid, return error message
    return res.json({ error: "Invalid Date" });
  }
});


// Listen on port set in environment variable or default to 3000
var listener = app.listen(process.env.PORT || 3000, function () {
  console.log('Your app is listening on port ' + listener.address().port);
});



