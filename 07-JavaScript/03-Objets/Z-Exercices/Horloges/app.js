const horloge = document.querySelector('.clock');

horloge.addEventListener('onload', time);

function time() {
    let date = new Date();
    let hours = date.getHours();
    let minutes = date.getMinutes();
    let seconds = date.getSeconds();
    if (hours == 0) {
            h = 24;
    }

    hours = (hours < 10) ? "0" + hours : hours;
    minutes = (minutes < 10) ? "0" + minutes : minutes;
    seconds = (seconds  < 10) ? "0" + seconds : seconds;
    let time = `${hours}:${minutes}:${seconds}`;
    horloge.innerText = time;
}

setInterval(time, 1000);

res = time();