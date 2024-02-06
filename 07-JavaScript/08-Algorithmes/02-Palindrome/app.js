function palandrome(mot) {
    const motMuicule = mot.toLowerCase();
    const motInvers = mot.split("").reverse().join("")

    return motMuicule === motInvers
}

console.log(palandrome("saif"))
console.log(palandrome("radar"))

