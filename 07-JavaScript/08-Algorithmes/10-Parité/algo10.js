function algorithme() {
    arr = [1, 2,1,4]
    len = arr.length;
    for (i = 0; i < len; i++) {
        if (arr[i] % 2 == 0) {
            arr[i] = "pair";
        } else {
            arr[i] = "impair";
        }
    }
    
}
