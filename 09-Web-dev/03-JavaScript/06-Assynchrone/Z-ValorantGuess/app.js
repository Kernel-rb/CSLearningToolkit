const agentCard = document.querySelectorAll('.card');
const agentName = document.querySelectorAll('.agent-name');
const agentImg = document.querySelectorAll('.card-img');
const displayName = document.querySelectorAll('.displayName');
const developerName = document.querySelectorAll('.developerName');
const agentDescription = document.querySelectorAll('.description');




const rechercheAgent = event => {
    event.preventDefault();
    const { value } = event.target.agent;
    fetch(`https://valorant-api.com/v1/agents`)
        .then(data => data.json())
        .then(response => agentData(response))
}
 

