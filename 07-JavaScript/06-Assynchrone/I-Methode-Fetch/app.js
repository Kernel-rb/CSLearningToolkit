// fetch est souvent utliser pour recuperer des données depuis un serveur ou une api



fetch("https://jsonplaceholder.typicode.com/posts")
    .then(response => response.json())
    .then(data => {
        const cardsContainer = document.getElementById("cards-container")
        data.forEach(el => {
            const card = createCard(el);
            cardsContainer.appendChild(card)
            
        })
    }).catch(err => console.log(err))


function createCard(el) {
    const card = document.createElement("div");
    card.className = "card";
    const title = document.createElement("h2");
    title.textContent = el.title;
    const body = document.createElement("p");
    body.textContent = el.body;

    card.appendChild(title);
    card.appendChild(body);
    console.log(el);
    return card;
}
