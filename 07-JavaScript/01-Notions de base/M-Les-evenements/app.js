const btn = document.querySelector('button');

function handleClick() {
    console.log('click');
}   

btn.addEventListener('click', handleClick);

// une autre facon de faire

btn.addEventListener('click', function() {
    console.log('click');
});

// il existe bcp d'evenements, on peut les trouver sur le site de mozilla
