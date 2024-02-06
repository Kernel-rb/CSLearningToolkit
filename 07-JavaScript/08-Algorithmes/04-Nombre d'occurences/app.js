function occurence(arr) {
    let objet = {}

    for (let i = 0; i < arr.length; i++){
        const el = arr[i];
        if (!objet(el)) {
            objet[el] = 1
        } else {
            objet[el]++
        }
    }

}