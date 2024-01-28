const str = 'bonjour'
const newStr = str.replace('o', 'a')
const extraStr = str.replace('jour', 'soir')
console.log(newStr) // 'banjour'
console.log(extraStr) // 'bonsoir'

const abc = "ABC ABC ABC"
const newAbc = abc.replace(/ABC/g, 'XYZ')
console.log(newAbc) // 'XYZ XYZ XYZ'