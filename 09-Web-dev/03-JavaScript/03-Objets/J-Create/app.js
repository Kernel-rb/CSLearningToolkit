const movieList = {
    movielist: function () {
        console.log('Movie List :')
    }
}

const movie = Object.create(movieList);

movie.name = '1 - The Matrix';
movie.movielist(); // Movie List
console.log(movie.name); // The Matrix


const movieList2 = {
    movielist: function () {
        console.log('Movie List :')
    }
}

const movie2 = Object.create(movieList2, {
    name: {
        value: '2 - Jumanji',
    }
});

movie2.movielist(); // Movie Lista
console.log(movie2.name); // Jumanji