const canvas = document.querySelector("canvas");
const ctx = canvas.getContext("2d");
canvas.width = window.innerWidth;  
canvas.height = window.innerHeight; 

class Player {
    constructor(radius, color) {
        this.x = canvas.width / 2;
        this.y = canvas.height / 2;
        this.radius = radius;
        this.color = color;
    }

    drawPlayer() {
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.radius, 0, Math.PI * 2, false);
        ctx.fillStyle = this.color;
        ctx.fill();
    }
}

class Projectile {
    constructor(radius, color, velocity) {
        this.x = canvas.width / 2;
        this.y = canvas.height / 2;
        this.radius = radius;
        this.color = color;
        this.velocity = velocity;
    }

    drawProjectile() {
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.radius, 0, Math.PI * 2, false);
        ctx.fillStyle = this.color;
        ctx.fill();
    }

    update() {
        this.drawProjectile();
        this.x += this.velocity.x;
        this.y += this.velocity.y;
    }
}

class Enemy {
    constructor(x, y, radius, color, velocity) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
        this.velocity = velocity;
    }

    drawProjectile() {
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.radius, 0, Math.PI * 2, false);
        ctx.fillStyle = this.color;
        ctx.fill();
    }

    update() {
        this.drawProjectile();
        this.x += this.velocity.x;
        this.y += this.velocity.y;
    }
}

const p = new Player(30, 'black');
const projectiles = [];
const enemies = [];

function spawnEnemies() {
    setInterval(() => {
        const radius = Math.random() * 30 < 5 ? 10 : Math.random() * 30; 
        if(Math.random() < 0.5){
          x = Math.random() < 0.5 ? 0 - radius : canvas.width + radius;  
          y = Math.random() * canvas.height;
        }else{
          x =  Math.random() *  canvas.width; 
          y =  Math.random() < 0.5 ? 0 - radius : canvas.height + radius;
        };
        const color = `#${Math.floor(Math.random() * 16777215).toString(16)}`;
        const angle = Math.atan2(canvas.height / 2 - y, canvas.width / 2 - x);
        const velocity = {x: Math.cos(angle), y: Math.sin(angle)};
        enemies.push(new Enemy(x, y, radius, color, velocity));
    }, 1000)
}

function animate() {
    requestAnimationFrame(animate);
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    p.drawPlayer();
    projectiles.forEach(projectile => projectile.update());
    enemies.forEach(enemy => enemy.update());  
}

addEventListener("click", (event) => {
    const angle = Math.atan2(event.clientY - canvas.height / 2, event.clientX - canvas.width / 2);
    const velocity = {x: Math.cos(angle), y: Math.sin(angle)};
    projectiles.push(new Projectile(5, "red", velocity));
});

animate();
spawnEnemies();