const club = {
    team: 'Liverpool',
    country: 'England',
    coach: 'Jurgen Klopp',
}

const value = Object.values(club);
console.log(value); // [ 'Liverpool', 'England', 'Jurgen Klopp' ]

for (const val of Object.values(club)) {
    console.log(val); // Liverpool England Jurgen Klopp
}