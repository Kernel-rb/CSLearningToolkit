const parentEelement = document.getElementById('parent');
const currentElement = document.getElementById('current');
const childrenElement = parentEelement.children;
console.log(childrenElement);

const childNodes = parentEelement.childNodes;
console.log(childNodes);

const childElement = document.getElementById('child');
const parentElement = childElement.parentElement;
console.log(parentElement);

const nextElement = currentElement.nextElementSibling;// nextElementSibling est un noeud 
console.log(nextElement);

const previexElement = currentElement.previousElementSibling;
console.log(previexElement);